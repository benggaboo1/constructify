package com.uhack.constructify.model.dto;

import com.uhack.constructify.model.domain.Material;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class MaterialsByClassResponse {
    private String className;
    private List<Material> materials;
    private Long areaId;
}
