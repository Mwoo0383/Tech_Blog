package com.blog.backend.controller;

import com.blog.backend.dto.LoginDto;
import com.blog.backend.dto.UserDto;
import com.blog.backend.entity.User;
import com.blog.backend.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<UserDto.Response> login(@RequestBody LoginDto.Request loginRequest) {
        User user = authService.login(loginRequest.getUsername(), loginRequest.getPassword());
        UserDto.Response responseDto = UserDto.fromEntity(user);
        return ResponseEntity.ok(responseDto);
    }
}
