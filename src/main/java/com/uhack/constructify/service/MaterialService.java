package com.uhack.constructify.service;

import com.uhack.constructify.model.domain.Material;
import com.uhack.constructify.model.dto.MaterialUpdateRequest;

public interface MaterialService {
    Material updateRecord(Long materialId, MaterialUpdateRequest materialUpdateRequest);
}
