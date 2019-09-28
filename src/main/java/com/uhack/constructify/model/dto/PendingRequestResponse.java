package com.uhack.constructify.model.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PendingRequestResponse {
    private Long id;
    private String areaName;
    private LocalDateTime requestedDate;
}
