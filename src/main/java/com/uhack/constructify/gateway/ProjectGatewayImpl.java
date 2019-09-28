package com.uhack.constructify.gateway;

import com.uhack.constructify.annotation.Gateway;
import com.uhack.constructify.mapper.ProjectMapper;
import com.uhack.constructify.mapper.UserMapper;
import com.uhack.constructify.model.domain.Project;
import com.uhack.constructify.model.domain.User;
import com.uhack.constructify.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Gateway
@RequiredArgsConstructor
public class ProjectGatewayImpl implements ProjectGateway {

    private final ProjectRepository projectRepository;
    private final ProjectMapper projectMapper;
    private final UserMapper userMapper;

    @Override
    public Project findById(Long id) {
        return projectMapper.toDomain(projectRepository.findById(id));
    }

    @Override
    public List<Project> findAllByUser(User user) {
        return projectMapper.toDomainList(
                projectRepository.findAllByUser(userMapper.toEntity(user)));
    }
}
