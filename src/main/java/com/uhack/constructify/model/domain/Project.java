package com.uhack.constructify.model.domain;

import lombok.Data;

import java.util.List;

@Data
public class Project {

    private Long id;
    private String name;
    private String owner;
    private List<User> users;
}
