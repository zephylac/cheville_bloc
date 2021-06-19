package fr.cheville.escalade.bloc.domain.data;

import java.util.List;
import java.util.Objects;

import fr.cheville.escalade.bloc.domain.exception.UserNameHasNotChangedException;

public class User {
    private Long id;

    private String login;

    private String name;

    private String surname;
    
    private String mail;

    private String password;

    private Boolean enabled;

    private List<Bloc> blocs;

    public User() {
    }

    public User(Long id, String login, String name, String surname, String mail, String password, Boolean enabled, List<Bloc> blocs) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.password = password;
        this.enabled = enabled;
        this.blocs = blocs;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean isEnabled() {
        return this.enabled;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Bloc> getBlocs() {
        return this.blocs;
    }

    public void setBlocs(List<Bloc> blocs) {
        this.blocs = blocs;
    }

    public User id(Long id) {
        setId(id);
        return this;
    }

    public User login(String login) {
        setLogin(login);
        return this;
    }

    public User name(String name) {
        setName(name);
        return this;
    }

    public User surname(String surname) {
        setSurname(surname);
        return this;
    }

    public User mail(String mail) {
        setMail(mail);
        return this;
    }

    public User password(String password) {
        setPassword(password);
        return this;
    }

    public User blocs(List<Bloc> blocs) {
        setBlocs(blocs);
        return this;
    }

    public User enabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    public void validateMail() {

    }

    public void validateNameIsDifferent(String providedName) {
        if (providedName.equals(name)) {
            throw new UserNameHasNotChangedException(name);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(login, user.login) && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(mail, user.mail) && Objects.equals(password, user.password) && Objects.equals(enabled, user.enabled) && Objects.equals(blocs, user.blocs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, name, surname, mail, password, enabled, blocs);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", login='" + getLogin() + "'" +
            ", name='" + getName() + "'" +
            ", surname='" + getSurname() + "'" +
            ", mail='" + getMail() + "'" +
            ", password='" + getPassword() + "'" +
            ", enabled='" + isEnabled() + "'" +
            ", blocs='" + getBlocs() + "'" +
            "}";
    }

}
