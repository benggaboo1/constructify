package com.uhack.constructify.repository;

import com.uhack.constructify.model.entity.ProjectEntity;
import com.uhack.constructify.model.entity.UserEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface ProjectRepository extends Repository<ProjectEntity, Long> {
    ProjectEntity findById(Long id);

    List<ProjectEntity> findAllByUser(UserEntity userEntity);
}
