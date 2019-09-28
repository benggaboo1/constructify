package com.uhack.constructify.service;

import com.uhack.constructify.gateway.UserGateway;
import com.uhack.constructify.mapper.UserMapper;
import com.uhack.constructify.model.domain.User;
import com.uhack.constructify.model.dto.LoginRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserGateway userGateway;
    private final UserMapper userMapper;

    @Override
    public User getUser(LoginRequest request) {
        return userGateway.findByUser(userMapper.toDomain(request));
    }
}
