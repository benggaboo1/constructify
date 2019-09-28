package com.uhack.constructify.gateway;

import com.uhack.constructify.annotation.Gateway;
import com.uhack.constructify.mapper.MaterialHistoryMapper;
import com.uhack.constructify.mapper.MaterialMapper;
import com.uhack.constructify.model.domain.Material;
import com.uhack.constructify.model.domain.MaterialHistory;
import com.uhack.constructify.model.entity.MaterialHistoryEntity;
import com.uhack.constructify.repository.MaterialHistoryRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Gateway
@RequiredArgsConstructor
public class MaterialHistoryGatewayImpl implements MaterialHistoryGateway {

    private final MaterialHistoryRepository materialHistoryRepository;
    private final MaterialHistoryMapper materialHistoryMapper;
    private final MaterialMapper materialMapper;

    @Override
    public List<MaterialHistory> findAllByMaterial(Material material) {
        return materialHistoryMapper.toDomainList(
                materialHistoryRepository.findAllByMaterialOrderByDateUpdatedDesc(
                        materialMapper.toEntity(material)));
    }

    @Override
    public MaterialHistory save(MaterialHistory materialHistory, Material material) {
        MaterialHistoryEntity entity = materialHistoryMapper.toEntity(materialHistory);
        entity.setMaterial(materialMapper.toEntity(material));
        return materialHistoryMapper.toDomain(materialHistoryRepository.save(entity)      );
    }
}
