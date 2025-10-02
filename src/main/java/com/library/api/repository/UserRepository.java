package com.library.api.repository;

import com.library.api.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

//CONTRATO COM O BANCO DE DADOS
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
