package com.uhack.constructify.mapper;

import com.uhack.constructify.model.domain.MaterialClass;
import com.uhack.constructify.model.entity.MaterialClassEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MaterialClassMapper {

    MaterialClass toDomain(MaterialClassEntity entity);

    MaterialClassEntity toEntity(MaterialClass domain);

    List<MaterialClass> toDomainList(List<MaterialClassEntity> entityList);

    List<MaterialClassEntity> toEntityList(List<MaterialClass> materialClassList);
}
