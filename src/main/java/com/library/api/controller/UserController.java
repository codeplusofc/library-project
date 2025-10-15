package com.library.api.controller;

import com.library.api.model.UserEntity;
import com.library.api.repository.UserRepository;
import com.library.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserService userService;

    @PostMapping
    public UserEntity createUser(@RequestBody UserEntity userEntity){
        return userRepository.save(userEntity);
    }

    @GetMapping
    public List<UserEntity> getAllUsers(){
        return userRepository.findAll();
    }

    @PutMapping("/{id}")
    public UserEntity updateUser(@RequestBody UserEntity userEntity, @PathVariable Long id){
       return userService.updateUser(userEntity,id);
    }
}
