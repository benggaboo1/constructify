package com.uhack.constructify.gateway;

import com.uhack.constructify.model.domain.OrderRequest;
import com.uhack.constructify.model.domain.Project;

import java.util.List;

public interface OrderRequestGateway {

    List<OrderRequest> findAllByProjectOrderByRequestedDateDesc(Project project);
}
