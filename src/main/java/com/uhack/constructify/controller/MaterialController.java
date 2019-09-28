package com.uhack.constructify.controller;

import com.uhack.constructify.model.domain.Material;
import com.uhack.constructify.model.dto.MaterialUpdateRequest;
import com.uhack.constructify.service.MaterialService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/materials")
public class MaterialController {

    private final MaterialService materialService;

    @PutMapping("/{id:[\\d]+}")
    public Material update(@RequestBody MaterialUpdateRequest materialUpdateRequest,
            @PathVariable("id") Long materialId) {
        return materialService.updateRecord(materialId, materialUpdateRequest);
    }
}
