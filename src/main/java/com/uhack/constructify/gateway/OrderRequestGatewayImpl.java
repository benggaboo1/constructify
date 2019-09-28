package com.uhack.constructify.gateway;

import com.uhack.constructify.annotation.Gateway;
import com.uhack.constructify.mapper.OrderRequestMapper;
import com.uhack.constructify.mapper.ProjectMapper;
import com.uhack.constructify.model.domain.OrderRequest;
import com.uhack.constructify.model.domain.Project;
import com.uhack.constructify.repository.OrderRequestRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Gateway
@RequiredArgsConstructor
public class OrderRequestGatewayImpl implements OrderRequestGateway {

    private final OrderRequestRepository orderRequestRepository;
    private final ProjectMapper projectMapper;
    private final OrderRequestMapper orderRequestMapper;


    @Override
    public List<OrderRequest> findAllByProjectOrderByRequestedDateDesc(Project project) {
        return orderRequestMapper.toDomainList(orderRequestRepository.findAllByProjectOrderByRequestedDateDesc(
                projectMapper.toEntity(project)));
    }
}
