package com.bibliotech.application;

import com.bibliotech.adapters.output.persistence.UserRepositoryImpl;
import com.bibliotech.domain.usecases.UserUseCases;
import com.bibliotech.domain.user.User;
import com.bibliotech.domain.user.UserDTO;

import java.util.List;

public class UserUseCaseImpl implements UserUseCases {

    private final UserRepositoryImpl userRepository;

    public UserUseCaseImpl(UserRepositoryImpl userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
