package com.uhack.constructify.gateway;

import com.uhack.constructify.annotation.Gateway;
import com.uhack.constructify.mapper.ProjectMapper;
import com.uhack.constructify.model.domain.Project;
import com.uhack.constructify.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;

@Gateway
@RequiredArgsConstructor
public class ProjectGatewayImpl implements ProjectGateway {

    private final ProjectRepository projectRepository;
    private final ProjectMapper projectMapper;

    @Override
    public Project findById(Long id) {
        return projectMapper.toDomain(projectRepository.findById(id));
    }
}
