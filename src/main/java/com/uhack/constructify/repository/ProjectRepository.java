package com.uhack.constructify.repository;

import com.uhack.constructify.model.entity.ProjectEntity;
import org.springframework.data.repository.Repository;

public interface ProjectRepository extends Repository<ProjectEntity, Long> {
    ProjectEntity findById(Long id);
}
