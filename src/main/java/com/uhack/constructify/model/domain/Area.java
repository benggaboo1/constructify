package com.uhack.constructify.model.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.uhack.constructify.model.entity.ProjectEntity;
import lombok.Data;

@Data
public class Area {

    private Long id;
    private String name;

    @JsonIgnore
    private ProjectEntity project;
}
