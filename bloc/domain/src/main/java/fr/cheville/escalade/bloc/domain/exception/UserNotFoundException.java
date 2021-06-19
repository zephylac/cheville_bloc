package fr.cheville.escalade.bloc.domain.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("User with id " + id + " not found!");
    }
    
    public UserNotFoundException(String mail) {
        super("User with mail " + mail + " not found!");
    }
}
