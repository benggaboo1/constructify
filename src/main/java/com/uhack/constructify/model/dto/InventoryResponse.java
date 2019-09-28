package com.uhack.constructify.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class InventoryResponse {

    private List<PendingRequestResponse> pendingRequests;
    private List<MaterialsByClassResponse> currentInventory;
}
