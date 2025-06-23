package com.bibliotech.domain.user;

import com.bibliotech.domain.book.Book;

import java.util.List;
import java.util.UUID;

public record UserDTO(
        Long UserId,
    String name,
    String email,
    UserType userType,
    Status status
){}

