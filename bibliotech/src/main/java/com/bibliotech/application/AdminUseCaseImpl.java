package com.bibliotech.application;

import com.bibliotech.adapters.output.persistence.UserRepositoryImpl;
import com.bibliotech.adapters.output.persistence.jpaEntities.JpaUserEntity;
import com.bibliotech.domain.usecases.AdminUseCases;
import com.bibliotech.domain.user.Status;
import com.bibliotech.domain.user.User;
import com.bibliotech.domain.user.UserType;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class AdminUseCaseImpl implements AdminUseCases {

    private final UserRepositoryImpl userRepository;

    public AdminUseCaseImpl(UserRepositoryImpl userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createAdminUser(String name, String email, String password) {
        JpaUserEntity jpaUser = new JpaUserEntity();
        jpaUser.setName(name);
        jpaUser.setEmail(email);
        jpaUser.setPassword(password);
        jpaUser.setUserType(UserType.ADMIN);
        jpaUser.setStatus(Status.APPROVED);

        User user = new User(jpaUser.getUserId(), jpaUser.getName(), jpaUser.getEmail(), jpaUser.getPassword(), jpaUser.getUserType(), jpaUser.getStatus());

        try{
            userRepository.save(user);
        } catch (Exception e){
            System.out.println("Error trying to save new user");
            throw e;
        }
        return user;
    }
}
