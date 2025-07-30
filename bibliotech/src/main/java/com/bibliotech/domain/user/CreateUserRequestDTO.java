package com.bibliotech.domain.user;

public record CreateUserRequestDTO(
    Long userId,
    String name,
    String email,
    String password,
    UserType userType,
    Status status
){}
