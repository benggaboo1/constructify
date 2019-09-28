package com.uhack.constructify.mapper;

import com.uhack.constructify.model.domain.Project;
import com.uhack.constructify.model.entity.ProjectEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectEntity toEntity(Project domain);

    Project toDomain(ProjectEntity entity);

    List<ProjectEntity> toEntityList(List<Project> domainList);

    List<Project> toDomainList(List<ProjectEntity> entityList);
}
