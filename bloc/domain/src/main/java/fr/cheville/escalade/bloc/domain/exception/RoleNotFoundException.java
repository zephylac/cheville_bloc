package fr.cheville.escalade.bloc.domain.exception;

public class RoleNotFoundException extends RuntimeException {
    public RoleNotFoundException(Long id) {
        super("Role with id " + id + " not found!");
    }
}
