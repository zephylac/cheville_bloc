package fr.cheville.escalade.bloc.domain.commands;

import org.axonframework.commandhandling.gateway.CommandGateway;

import fr.cheville.escalade.bloc.domain.annotation.DomainService;
import fr.cheville.escalade.bloc.domain.data.User;

@DomainService
public class UserCommands {

    private final CommandGateway commandGateway;

    public UserCommands(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    public String createUser(User user) {
        return commandGateway.sendAndWait(new CreateUserCommand(user));
    }

    public void updateUser(User user) {
        commandGateway.sendAndWait(new UpdateUserCommand(user.getMail(), user));
    }

    public void deleteUser(String mail) {
        commandGateway.sendAndWait(new DeleteUserCommand(mail));
    }
}
