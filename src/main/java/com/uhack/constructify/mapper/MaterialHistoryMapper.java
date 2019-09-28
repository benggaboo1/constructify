package com.uhack.constructify.mapper;

import com.uhack.constructify.model.domain.MaterialHistory;
import com.uhack.constructify.model.entity.MaterialHistoryEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {AreaMapper.class})
public interface MaterialHistoryMapper {

    MaterialHistory toDomain(MaterialHistoryEntity entity);

    MaterialHistoryEntity toEntity(MaterialHistory materialHistory);

    List<MaterialHistory> toDomainList(List<MaterialHistoryEntity> entityList);
}
