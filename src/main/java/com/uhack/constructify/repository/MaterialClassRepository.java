package com.uhack.constructify.repository;

import com.uhack.constructify.model.entity.MaterialClassEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface MaterialClassRepository extends Repository<MaterialClassEntity, Long> {

    List<MaterialClassEntity> findAll();
}
