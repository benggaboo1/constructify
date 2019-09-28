package com.uhack.constructify.model.domain;

import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Data
public class OrderRequest {

    private Long id;
    private Project project;
    private Double totalPrice;
    private Area area;
    private LocalDateTime requestedDate;
    private int status;

    @Getter
    public enum Status {
        PENDING(0),
        RECEIVED(1),
        DELIVERY_TO_WAREHOUSE(2),
        MATERIAL_TURNOVER(3),
        MATERIAL_INSTALLATION(4),;

        private int type;

        Status(int type) {
            this.type = type;
        }
    }
}
