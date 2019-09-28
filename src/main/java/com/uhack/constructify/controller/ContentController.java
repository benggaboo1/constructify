package com.uhack.constructify.controller;

import com.uhack.constructify.model.domain.Area;
import com.uhack.constructify.model.domain.MaterialClass;
import com.uhack.constructify.service.ContentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequiredArgsConstructor
public class ContentController {

    private final ContentService contentService;

    @GetMapping("/projects/{id:[\\d]+}/areas")
    public List<Area> getAll(@PathVariable("id") Long projectId) {
        return contentService.getAreas(projectId);
    }

    @GetMapping("/material-classes")
    public List<MaterialClass> getAll() {
        return contentService.getMaterialClasses();
    }


}
