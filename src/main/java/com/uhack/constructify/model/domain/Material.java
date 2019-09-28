package com.uhack.constructify.model.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.uhack.constructify.model.entity.MaterialClassEntity;
import lombok.Data;

@Data
public class Material {

    private Long id;
    private String name;
    private int initialQuantity;
    private int currentQuantity;
    private MaterialClassEntity materialClass;
    private int status;
    private Double price;

    @JsonIgnore
    private OrderRequest request;
}
