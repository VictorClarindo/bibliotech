package com.bibliotech.domain.user;

import com.bibliotech.domain.book.Book;

import java.util.List;
import java.util.UUID;

public class User {
    private UUID UserId;
    private String name;
    private String email;
    private String password;
    private UserType userType;
    private Status status;

    public User(UUID UserId, String name, String email, String password, UserType userType, Status status) {
        this.UserId = UserId;
        this.name = name;
        this.email = email;
        this.password = password;
        this.userType = userType;
        this.status = status;
    }

    public UUID getUserId() {
        return UserId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public UserType getUserType() {
        return userType;
    }

    public Status getStatus() {
        return status;
    }

    public void setUserId(UUID UserId) {
        this.UserId = UserId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}

