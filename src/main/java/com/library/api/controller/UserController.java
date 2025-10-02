package com.library.api.controller;

import com.library.api.model.UserEntity;
import com.library.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    //INICIALIZA NOSSAS DEPENDENCIAS
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity userEntity){
        return userRepository.save(userEntity);
    }

    @GetMapping
    public List<UserEntity> getAllUsers(){
        return userRepository.findAll();
    }
}
