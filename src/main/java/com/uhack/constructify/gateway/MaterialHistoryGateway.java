package com.uhack.constructify.gateway;

import com.uhack.constructify.model.domain.Material;
import com.uhack.constructify.model.domain.MaterialHistory;

import java.util.List;

public interface MaterialHistoryGateway {

    List<MaterialHistory> findAllByMaterial(Material material);
    MaterialHistory save(MaterialHistory materialHistory, Material material);
}
