package fr.cheville.escalade.bloc.domain.events;

import java.io.Serializable;

import fr.cheville.escalade.bloc.domain.data.User;

public class UserUpdatedEvent implements Serializable {

    private final User user;

    public UserUpdatedEvent(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
