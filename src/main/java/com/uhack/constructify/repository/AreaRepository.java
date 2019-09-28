package com.uhack.constructify.repository;

import com.uhack.constructify.model.domain.Project;
import com.uhack.constructify.model.entity.AreaEntity;
import com.uhack.constructify.model.entity.ProjectEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface AreaRepository extends Repository<AreaEntity, Long> {

    List<AreaEntity> getAllByProject(ProjectEntity projectEntity);
}
