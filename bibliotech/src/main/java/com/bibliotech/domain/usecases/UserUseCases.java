package com.bibliotech.domain.usecases;

import com.bibliotech.domain.user.CreateUserRequestDTO;
import com.bibliotech.domain.user.User;
import com.bibliotech.domain.user.UserDTO;

import java.util.List;

public interface UserUseCases {
    public User saveUser(CreateUserRequestDTO userRequestDTO);

    public List<UserDTO> findAll();
}
