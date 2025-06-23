package com.bibliotech.adapters.output.persistence;

import com.bibliotech.adapters.output.persistence.jpaEntities.JpaUserEntity;
import com.bibliotech.domain.user.User;
import com.bibliotech.domain.user.UserRepository;

import java.util.List;
import java.util.Optional;

public class UserRepositoryImpl implements UserRepository {
    JpaUserRepository jpaUserRepository;

    public UserRepositoryImpl(JpaUserRepository jpaUserRepository) {
        this.jpaUserRepository = jpaUserRepository;
    }

    @Override
    public void save(User user) {
            jpaUserRepository.save(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        return List.of();
    }

    @Override
    public void deleteById(Long id) {

    }
}
