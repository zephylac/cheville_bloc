package fr.cheville.escalade.bloc.domain.queries;

public class UserExistsQuery {

    private final String mail;

    public UserExistsQuery(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }
}
