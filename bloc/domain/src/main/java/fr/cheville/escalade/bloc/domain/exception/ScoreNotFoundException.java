package fr.cheville.escalade.bloc.domain.exception;

public class ScoreNotFoundException extends RuntimeException {
    public ScoreNotFoundException(Long id) {
        super("Score with id " + id + " not found!");
    }
}
