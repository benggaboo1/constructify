package com.uhack.constructify.gateway;

import com.uhack.constructify.model.domain.Material;
import com.uhack.constructify.model.domain.OrderRequest;

import java.util.List;

public interface MaterialGateway {
    List<Material> findAllByRequest(OrderRequest orderRequest);
}
