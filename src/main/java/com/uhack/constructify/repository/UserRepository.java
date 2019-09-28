package com.uhack.constructify.repository;

import com.uhack.constructify.model.entity.UserEntity;
import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<UserEntity, Long> {

    UserEntity findByUsernameAndPassword(String username, String password);
}
