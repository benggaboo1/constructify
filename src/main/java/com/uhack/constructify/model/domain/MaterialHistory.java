package com.uhack.constructify.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MaterialHistory {

    private Long id;
    private String action;
    private Area area;
    private int quantity;
    private LocalDateTime dateUpdated;

}
