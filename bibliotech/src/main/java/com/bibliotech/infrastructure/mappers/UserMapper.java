package com.bibliotech.infrastructure.mappers;

import com.bibliotech.adapters.output.persistence.jpaEntities.JpaUserEntity;
import com.bibliotech.domain.user.User;
import com.bibliotech.domain.user.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public JpaUserEntity UserToJpaUser(User user){
        return new JpaUserEntity(user.getUserId(), user.getName(), user.getEmail(), user.getPassword(), user.getUserType(), user.getStatus());
    }

    public User JpaUserToUser(JpaUserEntity jpaUser){
        return new User(jpaUser.getUserId(), jpaUser.getName(), jpaUser.getEmail(), jpaUser.getPassword(), jpaUser.getUserType(), jpaUser.getStatus());
    }

    public UserDTO UserToDto(User user){
        return new UserDTO(user.getUserId(), user.getName(), user.getEmail(), user.getUserType(), user.getStatus());
    }

}
