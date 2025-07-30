package com.bibliotech.application;

import com.bibliotech.adapters.output.persistence.UserRepositoryImpl;
import com.bibliotech.adapters.output.persistence.jpaEntities.JpaUserEntity;
import com.bibliotech.domain.usecases.AdminUseCases;
import com.bibliotech.domain.user.Status;
import com.bibliotech.domain.user.User;
import com.bibliotech.domain.user.UserRepository;
import com.bibliotech.domain.user.UserType;
import com.bibliotech.infrastructure.exceptions.EmailAlreadyExistsException;
import com.bibliotech.infrastructure.mappers.UserMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class AdminUseCaseImpl implements AdminUseCases {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    public AdminUseCaseImpl(UserMapper userMapper, UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }

    @Override
    public User createAdminUser(String name, String email, String password) {
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setUserType(UserType.ADMIN);
        user.setStatus(Status.APPROVED);

        try{
            userRepository.save(user);
        } catch (Exception e){
            System.out.println("Error trying to save new user");
            throw e;
        }
//        catch (DataIntegrityViolationException e){
//            throw new EmailAlreadyExistsException("Email " + email + "is already in use");
//        }
        return user;
    }
}
