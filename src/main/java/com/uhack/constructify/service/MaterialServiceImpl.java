package com.uhack.constructify.service;

import com.uhack.constructify.gateway.AreaGateway;
import com.uhack.constructify.gateway.MaterialGateway;
import com.uhack.constructify.gateway.MaterialHistoryGateway;
import com.uhack.constructify.mapper.MaterialMapper;
import com.uhack.constructify.model.domain.Material;
import com.uhack.constructify.model.domain.MaterialHistory;
import com.uhack.constructify.model.dto.MaterialUpdateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class MaterialServiceImpl implements MaterialService {

    private final MaterialGateway materialGateway;
    private final MaterialHistoryGateway materialHistoryGateway;
    private final AreaGateway areaGateway;

    @Override
    public Material updateRecord(Long materialId, MaterialUpdateRequest updateRequest) {
        Material toUpdate = materialGateway.findById(materialId);

        toUpdate = materialGateway.save(updateQuantity(updateRequest.getAction(), updateRequest.getQuantity(),
                toUpdate));

        saveUpdateLog(updateRequest.getAreaId(), updateRequest.getQuantity(), updateRequest.getAction(), toUpdate);

        return toUpdate;
    }

    private Material updateQuantity(String action, int quantity, Material material) {
        switch (action) {
            case "replenish": {
                material.setCurrentQuantity(material.getCurrentQuantity() + quantity);
                break;
            }
            case "use": {
                material.setCurrentQuantity(material.getCurrentQuantity() - quantity);
            }
        }

        return material;
    }

    private MaterialHistory saveUpdateLog(Long areaId, int quantity, String action, Material material) {
        return materialHistoryGateway.save(new MaterialHistory(null, action,
                areaGateway.findById(areaId), quantity, LocalDateTime.now()), material);
    }
}
