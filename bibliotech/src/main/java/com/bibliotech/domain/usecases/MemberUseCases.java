package com.bibliotech.domain.usecases;

import com.bibliotech.domain.user.User;
import com.bibliotech.domain.user.UserDTO;

public interface MemberUseCases {
    public User saveUser(UserDTO userDTO);
}
