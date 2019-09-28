package com.uhack.constructify.service;

import com.uhack.constructify.gateway.AreaGateway;
import com.uhack.constructify.gateway.MaterialClassGateway;
import com.uhack.constructify.gateway.ProjectGateway;
import com.uhack.constructify.model.domain.Area;
import com.uhack.constructify.model.domain.MaterialClass;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContentServiceImpl implements ContentService {

    private final AreaGateway areaGateway;
    private final ProjectGateway projectGateway;
    private final MaterialClassGateway materialClassGateway;

    @Override
    public List<Area> getAreas(Long projectId) {
        return areaGateway.getAllByProject(projectGateway.findById(projectId));
    }

    @Override
    public List<MaterialClass> getMaterialClasses() {
        return materialClassGateway.findAll();
    }
}
