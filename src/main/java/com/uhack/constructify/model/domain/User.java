package com.uhack.constructify.model.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class User {

    private Long id;
    private String username;
    private String password;
    private List<Project> projects;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
