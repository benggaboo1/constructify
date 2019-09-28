package com.uhack.constructify.service;

import com.uhack.constructify.model.domain.Area;
import com.uhack.constructify.model.domain.MaterialClass;

import java.util.List;

public interface ContentService {

    List<Area> getAreas(Long projectId);
    List<MaterialClass> getMaterialClasses();
}
