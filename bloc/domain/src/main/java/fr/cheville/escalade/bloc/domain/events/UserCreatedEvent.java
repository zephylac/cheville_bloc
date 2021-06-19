package fr.cheville.escalade.bloc.domain.events;

import java.io.Serializable;

import fr.cheville.escalade.bloc.domain.data.User;

public class UserCreatedEvent implements Serializable {

    private final User user;

    public UserCreatedEvent(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }


    @Override
    public String toString() {
        return "{" +
            " user='" + getUser() + "'" +
            "}";
    }

}
