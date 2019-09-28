package com.uhack.constructify.service;

import com.uhack.constructify.model.dto.InventoryResponse;

public interface OrderRequestService {
    InventoryResponse getAllOrderRequests(Long projectId);
}
