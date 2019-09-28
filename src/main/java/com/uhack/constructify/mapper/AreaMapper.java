package com.uhack.constructify.mapper;

import com.uhack.constructify.model.domain.Area;
import com.uhack.constructify.model.entity.AreaEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AreaMapper {

    AreaEntity toEntity(Area domain);
    Area toDomain(AreaEntity entity);
    List<AreaEntity> toEntityList(List<Area> domainList);
    List<Area> toDomainList(List<AreaEntity> entityList);
}
