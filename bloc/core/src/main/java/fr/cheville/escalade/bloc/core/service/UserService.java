package fr.cheville.escalade.bloc.core.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.cheville.escalade.bloc.core.service.annotation.CoreService;
import fr.cheville.escalade.bloc.domain.commands.UserCommands;
import fr.cheville.escalade.bloc.domain.data.User;
import fr.cheville.escalade.bloc.domain.exception.UserAlreadyExistsException;
import fr.cheville.escalade.bloc.domain.exception.UserNotFoundException;
import fr.cheville.escalade.bloc.domain.queries.UserQueries;
import fr.cheville.escalade.bloc.domain.queries.views.UserView;

@CoreService
public class UserService {

    private final UserCommands userCommands;
    private final UserQueries userQueries;

    private final Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    public UserService(UserCommands userCommands, UserQueries userQueries) {
        this.userCommands = userCommands;
        this.userQueries = userQueries;
    }

    public String createUser(User user) {
        log.debug("--- createUser: {} ", user);
        if (userQueries.userExists(user.getMail())) {
            throw new UserAlreadyExistsException(user.getMail());
        }
        return userCommands.createUser(user);
    }

    public void updateUser(User user) {
        if (!userQueries.userExists(user.getMail())) {
            throw new UserNotFoundException(user.getMail());
        }
        userCommands.updateUser(user);
    }

    public void deleteUser(String mail) {
        if (!userQueries.userExists(mail)) {
            throw new UserNotFoundException(mail);
        }
        userCommands.deleteUser(mail);
    }

    public User findUserById(Long id) {
        return userQueries.findUserById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    public User findUser(String mail) {
        return userQueries.findUser(mail)
                .orElseThrow(() -> new UserNotFoundException(mail));
    }

    public List<User> findAllUsers() {
        return userQueries.findAllUsers();
    }
}