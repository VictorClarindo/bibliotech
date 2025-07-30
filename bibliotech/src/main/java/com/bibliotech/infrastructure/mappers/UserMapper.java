package com.bibliotech.infrastructure.mappers;

import com.bibliotech.adapters.output.persistence.jpaEntities.JpaUserEntity;
import com.bibliotech.domain.user.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public JpaUserEntity toJpaUser(User user){
        JpaUserEntity jpaUser = new JpaUserEntity(user.getUserId(), user.getName(), user.getEmail(), user.getPassword(), user.getUserType(), user.getStatus());
        return jpaUser;
    }

    public User toUser(JpaUserEntity jpaUser){
        User user = new User(jpaUser.getUserId(), jpaUser.getName(), jpaUser.getEmail(), jpaUser.getPassword(), jpaUser.getUserType(), jpaUser.getStatus());
        return user;
    }
}
