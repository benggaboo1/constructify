package com.uhack.constructify.model.domain;

import com.uhack.constructify.model.entity.MaterialClassEntity;
import lombok.Data;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
public class Material {

    private Long id;
    private String name;
    private String initialQuantity;
    private String currentQuantity;
    private MaterialClassEntity materialClass;
}
