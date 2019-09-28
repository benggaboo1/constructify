package com.uhack.constructify.gateway;

import com.uhack.constructify.annotation.Gateway;
import com.uhack.constructify.mapper.MaterialMapper;
import com.uhack.constructify.mapper.OrderRequestMapper;
import com.uhack.constructify.model.domain.Material;
import com.uhack.constructify.model.domain.OrderRequest;
import com.uhack.constructify.repository.MaterialRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Gateway
@RequiredArgsConstructor
public class MaterialGatewayImpl implements MaterialGateway {

    private final MaterialRepository materialRepository;
    private final MaterialMapper materialMapper;
    private final OrderRequestMapper orderRequestMapper;


    @Override
    public List<Material> findAllByRequest(OrderRequest orderRequest) {
        return materialMapper.toDomainList(
                materialRepository.getAllByRequest(
                        orderRequestMapper.toEntity(orderRequest)));
    }

    @Override
    public Material save(Material material) {
        return materialMapper.toDomain(
                materialRepository.save(
                        materialMapper.toEntity(material)));
    }

    @Override
    public Material findById(Long id) {
        return materialMapper.toDomain(
                materialRepository.findById(id));
    }
}
