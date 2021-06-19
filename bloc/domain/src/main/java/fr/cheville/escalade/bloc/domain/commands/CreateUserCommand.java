package fr.cheville.escalade.bloc.domain.commands;

import fr.cheville.escalade.bloc.domain.data.User;

public class CreateUserCommand {

    private final User user;

    public CreateUserCommand(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
