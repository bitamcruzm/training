package com.proteintracker;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Andrea Marcela Cruz Moreno, bridgingIT
 *         Created on 30.06.2017.
 */
@Slf4j
@RestController
@AllArgsConstructor
public class UserController {

    private UserService service;

    @PostMapping("/users")
    public ResponseEntity saveUser(@RequestBody @Valid User user) {

        service.createUser(user);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public HttpEntity<List<User>> getUsers() {
        List<User> users = service.getAllUsers();

        return new ResponseEntity<>(users, HttpStatus.OK);
    }

}
