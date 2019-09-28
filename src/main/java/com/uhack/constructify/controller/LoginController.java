package com.uhack.constructify.controller;

import com.uhack.constructify.model.domain.User;
import com.uhack.constructify.model.dto.LoginRequest;
import com.uhack.constructify.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/login")
@RestController
@RequiredArgsConstructor
public class LoginController {

    private final UserService userService;

    @PostMapping
    public User login(@RequestBody LoginRequest request) {
        return userService.getUser(request);
    }
}
