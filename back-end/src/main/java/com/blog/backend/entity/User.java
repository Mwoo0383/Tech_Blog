package com.blog.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true,  length = 50)
    private String username;    // 유저 이름

    @Column(nullable = false, unique = true, length = 10)
    private String nickname;    // 유저 별명

    @Column(nullable = false, unique = true, length = 100)
    private String email;       // 이메일

    @Column(nullable = false)
    private String password;    // 비밀번호
}
