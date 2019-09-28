package com.uhack.constructify.service;

import com.uhack.constructify.gateway.MaterialClassGateway;
import com.uhack.constructify.gateway.MaterialGateway;
import com.uhack.constructify.gateway.OrderRequestGateway;
import com.uhack.constructify.gateway.ProjectGateway;
import com.uhack.constructify.mapper.OrderRequestMapper;
import com.uhack.constructify.model.domain.Material;
import com.uhack.constructify.model.domain.MaterialClass;
import com.uhack.constructify.model.domain.OrderRequest;
import com.uhack.constructify.model.domain.Project;
import com.uhack.constructify.model.dto.InventoryResponse;
import com.uhack.constructify.model.dto.MaterialsByClassResponse;
import com.uhack.constructify.model.dto.PendingRequestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderRequestServiceImpl implements OrderRequestService {

    private final ProjectGateway projectGateway;
    private final OrderRequestGateway orderRequestGateway;
    private final OrderRequestMapper orderRequestMapper;
    private final MaterialClassGateway materialClassGateway;
    private final MaterialGateway materialGateway;

    @Override
    public InventoryResponse getAllOrderRequests(Long projectId) {
        Project project = projectGateway.findById(projectId);
        List<OrderRequest> orderRequests =
                orderRequestGateway.findAllByProjectOrderByRequestedDateDesc(project);

        List<OrderRequest> pendingRequests = orderRequests.stream().filter(
                orderRequest -> orderRequest.getStatus() == OrderRequest.Status.PENDING.getType())
                .collect(Collectors.toList());

        List<PendingRequestResponse> pendingRequestsDto = new ArrayList<>();

        pendingRequests.forEach(pendingRequest ->
                pendingRequestsDto.add(orderRequestMapper.map(pendingRequest)));

        List<MaterialClass> materialClasses = materialClassGateway.findAll();

        List<OrderRequest> completedRequests = orderRequests.stream().filter(
                orderRequest -> orderRequest.getStatus() == OrderRequest.Status.RECEIVED.getType())
                .collect(Collectors.toList());

        List<MaterialsByClassResponse> materialsByClasses = new ArrayList<>();

        for (MaterialClass materialClass : materialClasses) {
            List<Material> toAdd = new ArrayList<>();
            String className = null;
            Long areaId = 0L;
            for (OrderRequest completedRequest : completedRequests) {
                for (Material material : materialGateway.findAllByRequest(completedRequest)) {
                    if (materialClass.getId() == material.getMaterialClass().getId()) {
                        toAdd.add(material);
                        className = materialClass.getName();
                        areaId = completedRequest.getArea().getId();
                    }
                }
            }
            if (!CollectionUtils.isEmpty(toAdd)) {
                materialsByClasses.add(new MaterialsByClassResponse(className, toAdd, areaId));
            }
        }


        return new InventoryResponse(pendingRequestsDto, materialsByClasses);
    }
}
