package com.uhack.constructify.controller;

import com.uhack.constructify.model.dto.InventoryResponse;
import com.uhack.constructify.service.OrderRequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderRequestController {

    private final OrderRequestService orderRequestService;

    @GetMapping("/projects/{projectId:[\\d]+}/orders")
    public InventoryResponse getOrderRequest(@PathVariable("projectId") Long projectId) {
        return orderRequestService.getAllOrderRequests(projectId);
    }
}
