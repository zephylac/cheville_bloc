package fr.cheville.escalade.bloc.domain.queries;

public class FindUserByMailQuery {

    private final String mail;

    public FindUserByMailQuery(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }
}
