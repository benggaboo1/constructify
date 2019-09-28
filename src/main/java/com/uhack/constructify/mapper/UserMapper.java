package com.uhack.constructify.mapper;

import com.uhack.constructify.model.domain.User;
import com.uhack.constructify.model.dto.LoginRequest;
import com.uhack.constructify.model.entity.UserEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserEntity toEntity(User domain);

    User toDomain(UserEntity entity);

    List<UserEntity> toEntityList(List<User> domainList);

    List<User> toDomainList(List<UserEntity> entityList);

    User toDomain(LoginRequest request);
}
