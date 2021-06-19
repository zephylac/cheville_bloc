package fr.cheville.escalade.bloc.api.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.cheville.escalade.bloc.core.service.UserService;
import fr.cheville.escalade.bloc.domain.data.User;
import fr.cheville.escalade.bloc.domain.exception.UserNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(path = "/api")
public class UserControllerImpl {
    
    private final UserService userService;

    private final Logger log = LoggerFactory.getLogger(UserControllerImpl.class);

    @Autowired
    public UserControllerImpl(UserService userService) {
        log.debug("Created bean userControllerImpl");
        this.userService = userService;
    }

    @PostMapping("/user")
    public ResponseEntity<Void> addUser(@Valid @RequestBody User user) {
        log.debug("---adduser: {}", user);
        userService.createUser(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/user")
    public ResponseEntity<String> removeUser(User user) {
        //userService.removeUser(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/user")
    public ResponseEntity<String> updateUser(User user) {
        userService.updateUser(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable Long userId) {
        try {
            return new ResponseEntity<>(userService.findUserById(userId), HttpStatus.OK);
        } catch (UserNotFoundException ex) {
            //log.error("Error!", ex);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/user")
    public ResponseEntity<List<User>> getUser() {
        return new ResponseEntity<>(userService.findAllUsers(), HttpStatus.OK);
    }

}
