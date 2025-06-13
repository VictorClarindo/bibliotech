package com.bibliotech.domain.user;

import com.bibliotech.domain.book.Book;

import java.util.List;
import java.util.UUID;

public record UserDTO(
    UUID UserId,
    String name,
    String email,
    UserType userType,
    Status status,
    List<Book> borrowedBooks
){
    public List<Book> borrowedBooks(){
        return List.copyOf(borrowedBooks);
    }
}

