package fr.cheville.escalade.bloc.domain.commands;

import org.axonframework.commandhandling.TargetAggregateIdentifier;

public class DeleteUserCommand {

    @TargetAggregateIdentifier
    private final String mail;

    public DeleteUserCommand(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }
}
