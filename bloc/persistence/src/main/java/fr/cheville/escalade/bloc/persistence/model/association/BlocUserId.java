package fr.cheville.escalade.bloc.persistence.model.association;

import java.io.Serializable;
import java.util.Objects;

public class BlocUserId implements Serializable {

    private int bloc;
    private int user;

    public int getBloc() {
        return this.bloc;
    }

    public void setBloc(int bloc) {
        this.bloc = bloc;
    }

    public int getUser() {
        return this.user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof BlocUserId)) {
            return false;
        }
        BlocUserId blocUserId = (BlocUserId) o;
        return bloc == blocUserId.bloc && user == blocUserId.user;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bloc, user);
    }

    @Override
    public String toString() {
        return "{" +
            " bloc='" + getBloc() + "'" +
            ", user='" + getUser() + "'" +
            "}";
    }

}