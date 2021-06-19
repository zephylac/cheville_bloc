package fr.cheville.escalade.bloc.domain.commands;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

import fr.cheville.escalade.bloc.domain.data.User;

public class UpdateUserCommand {

    @TargetAggregateIdentifier
    private final String mail;
    private final User user;

    public UpdateUserCommand(String mail, User user) {
        this.mail = mail;
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
