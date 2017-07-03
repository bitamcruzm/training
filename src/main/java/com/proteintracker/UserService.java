package com.proteintracker;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Andrea Marcela Cruz Moreno, bridgingIT
 */
@Slf4j
@Service
@AllArgsConstructor
public class UserService {
    @Autowired
    private UserRepository repository;

    public void createUser (User user){
        repository.saveAndFlush(user);
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }
}
