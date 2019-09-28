package com.uhack.constructify.model.dto;

import lombok.Getter;

@Getter
public class MaterialUpdateRequest {

    private int quantity;
    private String action;
    private Long areaId;
}
