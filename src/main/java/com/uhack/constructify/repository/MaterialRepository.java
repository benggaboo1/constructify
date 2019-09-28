package com.uhack.constructify.repository;

import com.uhack.constructify.model.entity.MaterialEntity;
import com.uhack.constructify.model.entity.OrderRequestEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface MaterialRepository extends Repository<MaterialEntity, Long> {
    List<MaterialEntity> getAllByRequest(OrderRequestEntity orderRequest);

    MaterialEntity save(MaterialEntity materialEntity);

    MaterialEntity findById(Long id);
}
