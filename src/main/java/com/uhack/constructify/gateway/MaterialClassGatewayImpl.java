package com.uhack.constructify.gateway;

import com.uhack.constructify.annotation.Gateway;
import com.uhack.constructify.mapper.MaterialClassMapper;
import com.uhack.constructify.model.domain.MaterialClass;
import com.uhack.constructify.repository.MaterialClassRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Gateway
@RequiredArgsConstructor
public class MaterialClassGatewayImpl implements MaterialClassGateway {

    private final MaterialClassRepository materialClassRepository;
    private final MaterialClassMapper materialClassMapper;

    @Override
    public List<MaterialClass> findAll() {
        return materialClassMapper.toDomainList(materialClassRepository.findAll());
    }
}
