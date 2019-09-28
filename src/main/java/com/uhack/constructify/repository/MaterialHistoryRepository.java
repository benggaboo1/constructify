package com.uhack.constructify.repository;

import com.uhack.constructify.model.entity.MaterialEntity;
import com.uhack.constructify.model.entity.MaterialHistoryEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface MaterialHistoryRepository extends Repository<MaterialHistoryEntity, Long> {

    MaterialHistoryEntity save(MaterialHistoryEntity entity);

    List<MaterialHistoryEntity> findAllByMaterialOrderByDateUpdatedDesc(MaterialEntity materialEntity);
}
