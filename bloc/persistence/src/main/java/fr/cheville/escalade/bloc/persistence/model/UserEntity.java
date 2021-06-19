package fr.cheville.escalade.bloc.persistence.model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.tomcat.jni.Local;

import fr.cheville.escalade.bloc.domain.data.User;

@Entity
@Table(name="user")
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="login", nullable = false)
    private String login;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="surname", nullable = false)
    private String surname;
    
    @Column(name="mail", nullable = false)
    private String mail;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name="enabled", nullable = false)
    private Boolean enabled;

    /* @OneToMany(mappedBy = "user")
    private List<BlocUserEntity> blocUserEntity; */

/*     @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
            )
    private Set<RoleEntity> roles = new HashSet<>(); */

    public UserEntity() {
    }


    public UserEntity(Long id, String login, String name, String surname, String mail, String password, Boolean enabled) {
        this.id = id;
        this.login = login;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.password = password;
        this.enabled = enabled;
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


    public UserEntity id(Long id) {
        setId(id);
        return this;
    }

    public UserEntity login(String login) {
        setLogin(login);
        return this;
    }

    public UserEntity name(String name) {
        setName(name);
        return this;
    }

    public UserEntity surname(String surname) {
        setSurname(surname);
        return this;
    }

    public UserEntity mail(String mail) {
        setMail(mail);
        return this;
    }

    public UserEntity password(String password) {
        setPassword(password);
        return this;
    }

    public UserEntity enabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserEntity)) {
            return false;
        }
        UserEntity userEntity = (UserEntity) o;
        return Objects.equals(id, userEntity.id) && Objects.equals(login, userEntity.login) && Objects.equals(name, userEntity.name) && Objects.equals(surname, userEntity.surname) && Objects.equals(mail, userEntity.mail) && Objects.equals(password, userEntity.password) && Objects.equals(enabled, userEntity.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, name, surname, mail, password, enabled);
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
            "}";
    }

    public User toUser() {
        return new User(
            this.id,
            this.login,
            this.name,
            this.surname,
            this.mail,
            this.password,
            this.enabled,
            null
        );
    }
}
