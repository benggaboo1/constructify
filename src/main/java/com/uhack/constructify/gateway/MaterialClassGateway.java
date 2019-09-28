package com.uhack.constructify.gateway;

import com.uhack.constructify.model.domain.MaterialClass;

import java.util.List;

public interface MaterialClassGateway {

    List<MaterialClass> findAll();
}
