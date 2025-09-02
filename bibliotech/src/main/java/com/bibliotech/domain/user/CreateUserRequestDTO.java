package com.bibliotech.domain.user;

public record CreateUserRequestDTO(
    String name,
    String email,
    String password
){}
