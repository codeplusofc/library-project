package com.library.api.service;

import com.library.api.model.UserEntity;
import com.library.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity updateUser(UserEntity userEntity, Long id){
        Optional<UserEntity> userDoBanco = userRepository.findById(id);

        if (userDoBanco.isEmpty()){
            throw new RuntimeException("Usuario inexistente");
        }

        userDoBanco.get().setEmail(userEntity.getEmail());
        userDoBanco.get().setName(userEntity.getName());
        userDoBanco.get().setPassword(userEntity.getPassword());

        return userRepository.save(userDoBanco.get());
    }
}
