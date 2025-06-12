package com.blog.backend.controller;

import com.blog.backend.dto.UserDto;
import com.blog.backend.entity.User;
import com.blog.backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserDto.Response> register(@RequestBody UserDto.Request requestDto) {
        User user = requestDto.toEntity();               // DTO -> Entity 변환
        User savedUser = userService.register(user);     // 저장
        UserDto.Response responseDto = UserDto.fromEntity(savedUser);  // Entity -> DTO 변환
        return ResponseEntity.ok(responseDto);
    }
}
