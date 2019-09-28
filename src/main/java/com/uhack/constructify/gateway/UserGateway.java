package com.uhack.constructify.gateway;

import com.uhack.constructify.model.domain.User;

public interface UserGateway {

    User findByUser(User user);
}
