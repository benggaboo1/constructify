package com.uhack.constructify.service;

import com.uhack.constructify.gateway.ProjectGateway;
import com.uhack.constructify.gateway.UserGateway;
import com.uhack.constructify.mapper.UserMapper;
import com.uhack.constructify.model.domain.Project;
import com.uhack.constructify.model.domain.User;
import com.uhack.constructify.model.dto.LoginRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserGateway userGateway;
    private final UserMapper userMapper;
    private final ProjectGateway projectGateway;

    @Override
    public List<Project> getUserProjects(LoginRequest request) {
        User user =  userGateway.findByUser(userMapper.toDomain(request));
        return projectGateway.findAllByUser(user);
    }
}
