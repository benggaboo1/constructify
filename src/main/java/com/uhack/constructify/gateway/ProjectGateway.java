package com.uhack.constructify.gateway;

import com.uhack.constructify.model.domain.Project;
import com.uhack.constructify.model.domain.User;

import java.util.List;

public interface ProjectGateway {

    Project findById(Long id);

    List<Project> findAllByUser(User user);
}
