package com.uhack.constructify.gateway;

import com.uhack.constructify.model.domain.Area;
import com.uhack.constructify.model.domain.Project;

import java.util.List;

public interface AreaGateway {

    List<Area> getAllByProject(Project project);
}
