package com.uhack.constructify.service;

import com.uhack.constructify.gateway.OrderRequestGateway;
import com.uhack.constructify.gateway.ProjectGateway;
import com.uhack.constructify.model.domain.OrderRequest;
import com.uhack.constructify.model.domain.Project;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderRequestServiceImpl implements OrderRequestService {

    private final ProjectGateway projectGateway;
    private final OrderRequestGateway orderRequestGateway;

    @Override
    public List<OrderRequest> getAllOrderRequests(Long projectId) {
        Project project = projectGateway.findById(projectId);
        return orderRequestGateway.findAllByProjectOrderByRequestedDateDesc(project);
    }
}
