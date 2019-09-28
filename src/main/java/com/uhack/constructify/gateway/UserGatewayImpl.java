package com.uhack.constructify.gateway;

import com.uhack.constructify.annotation.Gateway;
import com.uhack.constructify.mapper.UserMapper;
import com.uhack.constructify.model.domain.User;
import com.uhack.constructify.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@Gateway
@RequiredArgsConstructor
public class UserGatewayImpl implements UserGateway {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public User findByUser(User user) {
        return userMapper.toDomain(
                userRepository.findByUsernameAndPassword(user.getUsername(),
                        user.getPassword()));
    }
}
