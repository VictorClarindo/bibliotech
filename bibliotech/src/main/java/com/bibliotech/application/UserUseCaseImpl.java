package com.bibliotech.application;

import com.bibliotech.adapters.output.persistence.UserRepositoryImpl;
import com.bibliotech.domain.usecases.UserUseCases;
import com.bibliotech.domain.user.User;
import com.bibliotech.domain.user.UserDTO;
import com.bibliotech.domain.user.UserRepository;
import com.bibliotech.infrastructure.mappers.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserUseCaseImpl implements UserUseCases {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserUseCaseImpl(UserRepositoryImpl userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public User saveUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public List<UserDTO> findAll() {
        return userRepository.findAll().stream()
                .map(userMapper::UserToDto)
                .collect(Collectors.toList());
    }
}
