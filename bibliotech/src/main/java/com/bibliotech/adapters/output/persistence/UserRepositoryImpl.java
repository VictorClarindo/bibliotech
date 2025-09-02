package com.bibliotech.adapters.output.persistence;

import com.bibliotech.adapters.output.persistence.jpaEntities.JpaUserEntity;
import com.bibliotech.domain.user.User;
import com.bibliotech.domain.user.UserRepository;
import com.bibliotech.infrastructure.mappers.UserMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final JpaUserRepository jpaUserRepository;
    private final UserMapper userMapper;

    public UserRepositoryImpl(JpaUserRepository jpaUserRepository, UserMapper userMapper) {
        this.jpaUserRepository = jpaUserRepository;
        this.userMapper = userMapper;
    }

    @Override
    public User save(User user) {
        JpaUserEntity jpaUser = userMapper.UserToJpaUser(user);
        User user1 = userMapper.JpaUserToUser(jpaUser);
        jpaUserRepository.save(jpaUser);
        return user1;
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<User> findAll() {
        return jpaUserRepository
                .findAll()
                .stream()
                .map(userMapper::JpaUserToUser).collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {

    }
}
