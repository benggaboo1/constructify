package com.uhack.constructify.gateway;

import com.uhack.constructify.annotation.Gateway;
import com.uhack.constructify.mapper.AreaMapper;
import com.uhack.constructify.mapper.ProjectMapper;
import com.uhack.constructify.model.domain.Area;
import com.uhack.constructify.model.domain.Project;
import com.uhack.constructify.repository.AreaRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Gateway
@RequiredArgsConstructor
public class AreaGatewayImpl implements AreaGateway {

    private final AreaRepository areaRepository;
    private final AreaMapper areaMapper;
    private final ProjectMapper projectMapper;

    @Override
    public List<Area> getAllByProject(Project project) {
        return areaMapper.toDomainList(
                areaRepository.getAllByProject(
                        projectMapper.toEntity(project)));
    }
}
