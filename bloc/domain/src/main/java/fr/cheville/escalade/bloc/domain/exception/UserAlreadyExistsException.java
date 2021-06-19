package fr.cheville.escalade.bloc.domain.exception;

public class UserAlreadyExistsException extends RuntimeException {

    public UserAlreadyExistsException(String mail) {
        super("User already exists with mail address: " + mail);
    }
}