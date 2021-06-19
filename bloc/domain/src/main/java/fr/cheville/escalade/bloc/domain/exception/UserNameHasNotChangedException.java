package fr.cheville.escalade.bloc.domain.exception;

public class UserNameHasNotChangedException extends IllegalArgumentException {

    public UserNameHasNotChangedException(String name) {
        super("User name is not different: " + name);
    }
}