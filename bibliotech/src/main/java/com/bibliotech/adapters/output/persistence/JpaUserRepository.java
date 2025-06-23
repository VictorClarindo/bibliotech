package com.bibliotech.adapters.output.persistence;

import com.bibliotech.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaUserRepository extends JpaRepository<User, Long> {
}
