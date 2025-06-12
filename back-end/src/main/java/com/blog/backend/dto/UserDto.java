package com.blog.backend.dto;

import com.blog.backend.entity.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class UserDto {

    /**
     * 회원가입 등 사용자 정보 입력 시 사용하는 요청 DTO
     */
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Request {
        private String username;
        private String nickname;
        private String email;
        private String password;

        public User toEntity() {
            return User.builder()
                    .username(username)
                    .nickname(nickname)
                    .email(email)
                    .password(password)
                    .build();
        }
    }

    /**
     * 사용자 정보 응답 시 사용하는 응답 DTO
     */
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    public static class Response {
        private Long id;
        private String username;
        private String nickname;
        private String email;
    }

    public static Response fromEntity(User user) {
        return Response.builder()
                .id(user.getId())
                .username(user.getUsername())
                .nickname(user.getNickname())
                .email(user.getEmail())
                .build();
    }
}
