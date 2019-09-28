package com.uhack.constructify.repository;

import com.uhack.constructify.model.entity.OrderRequestEntity;
import com.uhack.constructify.model.entity.ProjectEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface OrderRequestRepository extends Repository<OrderRequestEntity, Long> {

    List<OrderRequestEntity> findAllByProjectOrderByRequestedDateDesc(ProjectEntity project);
}
