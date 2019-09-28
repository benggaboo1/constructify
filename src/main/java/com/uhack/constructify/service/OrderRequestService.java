package com.uhack.constructify.service;

import com.uhack.constructify.model.domain.OrderRequest;

import java.util.List;

public interface OrderRequestService {
    List<OrderRequest> getAllOrderRequests(Long projectId);
}
