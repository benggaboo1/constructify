package com.uhack.constructify.mapper;

import com.uhack.constructify.model.domain.OrderRequest;
import com.uhack.constructify.model.entity.OrderRequestEntity;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring", uses = {AreaMapper.class, MaterialMapper.class, ProjectMapper.class})
public interface OrderRequestMapper {

    OrderRequest toDomain(OrderRequestEntity entity);
    OrderRequestEntity toEntity(OrderRequest domain);
    List<OrderRequest> toDomainList(List<OrderRequestEntity> entityList);

    @AfterMapping
    default void removeParent(OrderRequestEntity entity, @MappingTarget OrderRequest domain) {
        entity.getArea().setProject(null);
        entity.getMaterialList().forEach(material -> material.setRequest(null));
        entity.setProject(null);
    }
}
