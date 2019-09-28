package com.uhack.constructify.service;

import com.uhack.constructify.model.domain.Project;
import com.uhack.constructify.model.domain.User;
import com.uhack.constructify.model.dto.LoginRequest;

import java.util.List;

public interface UserService {

    List<Project> getUserProjects(LoginRequest request);
}
