package com.bibliotech.adapters.input.controller;

import com.bibliotech.adapters.output.persistence.UserRepositoryImpl;
import com.bibliotech.adapters.output.persistence.jpaEntities.JpaUserEntity;
import com.bibliotech.application.UserUseCaseImpl;
import com.bibliotech.domain.usecases.UserUseCases;
import com.bibliotech.domain.user.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserUseCases userUseCase;

    public UserController(UserUseCaseImpl userUseCase) {
        this.userUseCase = userUseCase;
    }

    @PostMapping(value = "create")
    public ResponseEntity<User> createUser(@RequestBody CreateUserRequestDTO userRequestDTO){
        User user = userUseCase.saveUser(userRequestDTO);
        return ResponseEntity.ok(user);
    }

    @GetMapping(value = "/teste")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok().body("Teste ok!");
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<UserDTO>> getUsers(){
        List<UserDTO> userList = userUseCase.findAll();
        return ResponseEntity.ok(userList);
    }
}
