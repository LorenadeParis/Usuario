package com.misiontic.usuario.repository;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.misiontic.usuario.entity.User;
import com.misiontic.usuario.repository.imp.IUserRepository;


@Repository
public class UserRepository {

    @Autowired
    private IUserRepository iUserRepository;

    public List<User> getAll() {
        return (List<User>) iUserRepository.findAll();
    }

    public Optional<User> getUser(int id) {
        return iUserRepository.findById(id);
    }

    public User save(User user) {
        return iUserRepository.save(user);
    }

    public boolean existeEmail(String email) {
        Optional<User> usuario = iUserRepository.findByEmail(email);

        return !usuario.isEmpty();
    }

    public Optional<User> autenticarUsuario(String email, String password) {
        return iUserRepository.findByEmailAndPassword(email, password);
    }
}
