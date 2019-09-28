package com.uhack.constructify.mapper;

import com.uhack.constructify.model.domain.Material;
import com.uhack.constructify.model.entity.MaterialEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MaterialMapper {
    Material toDomain(MaterialEntity entity);

    MaterialEntity toEntity(Material domain);

    List<Material> toDomainList(List<MaterialEntity> entityList);

    List<MaterialEntity> toEntityList(List<Material> domainList);
}
