package com.misiontic.usuario.repository.imp;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.misiontic.usuario.entity.User;

public interface IUserRepository extends CrudRepository<User,Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    //Optional<User> findByName(String name);
}
