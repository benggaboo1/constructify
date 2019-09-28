package com.uhack.constructify.gateway;

import com.uhack.constructify.model.domain.Project;

public interface ProjectGateway {

    Project findById(Long id);
}
