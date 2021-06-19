package fr.cheville.escalade.bloc.domain.events;

import java.io.Serializable;

public class UserDeletedEvent implements Serializable {

    private final String mail;

    public UserDeletedEvent(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }
}