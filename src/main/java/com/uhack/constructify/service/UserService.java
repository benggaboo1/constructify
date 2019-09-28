package com.uhack.constructify.service;

import com.uhack.constructify.model.domain.User;
import com.uhack.constructify.model.dto.LoginRequest;

public interface UserService {

    User getUser(LoginRequest request);
}
