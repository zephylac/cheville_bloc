package fr.cheville.escalade.bloc.domain.exception;

public class BlocNotFoundException extends RuntimeException {
    public BlocNotFoundException(Long id) {
        super("Bloc with id " + id + " not found!");
    }
}
