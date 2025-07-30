package com.bibliotech.domain.usecases;

import com.bibliotech.domain.user.User;

public interface AdminUseCases {
    public User createAdminUser(String name, String email, String password);
}
