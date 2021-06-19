/* package fr.cheville.escalade.bloc.persistence.model;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.cheville.escalade.bloc.persistence.model.association.BlocUserId;

@Entity
@Table(name = "bloc_user")
@IdClass(BlocUserId.class)
public class BlocUserEntity {

    @Id
    @ManyToOne
    @JoinColumn(name = "bloc_id", referencedColumnName = "id")
    private BlocEntity bloc;

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity user;

    @Column(name = "date_achieved")
    private LocalDate date_achieved;

    @Column(name = "favorite")
    private Boolean favorite;

    @Column(name = "work_in_progress")
    private Boolean workInProgress;

    @Column(name = "comment")
    private String comment;

    public BlocUserEntity() {
    }

    public BlocUserEntity(BlocEntity bloc, UserEntity user, LocalDate date_achieved, Boolean favorite, Boolean workInProgress, String comment) {
        this.bloc = bloc;
        this.user = user;
        this.date_achieved = date_achieved;
        this.favorite = favorite;
        this.workInProgress = workInProgress;
        this.comment = comment;
    }
    
    public BlocEntity getBloc() {
        return this.bloc;
    }

    public void setBloc(BlocEntity bloc) {
        this.bloc = bloc;
    }

    public UserEntity getUser() {
        return this.user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public LocalDate getDate_achieved() {
        return this.date_achieved;
    }

    public void setDate_achieved(LocalDate date_achieved) {
        this.date_achieved = date_achieved;
    }

    public Boolean isFavorite() {
        return this.favorite;
    }

    public Boolean getFavorite() {
        return this.favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public Boolean isWorkInProgress() {
        return this.workInProgress;
    }

    public Boolean getWorkInProgress() {
        return this.workInProgress;
    }

    public void setWorkInProgress(Boolean workInProgress) {
        this.workInProgress = workInProgress;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public BlocUserEntity bloc(BlocEntity bloc) {
        setBloc(bloc);
        return this;
    }

    public BlocUserEntity user(UserEntity user) {
        setUser(user);
        return this;
    }

    public BlocUserEntity date_achieved(LocalDate date_achieved) {
        setDate_achieved(date_achieved);
        return this;
    }

    public BlocUserEntity favorite(Boolean favorite) {
        setFavorite(favorite);
        return this;
    }

    public BlocUserEntity workInProgress(Boolean workInProgress) {
        setWorkInProgress(workInProgress);
        return this;
    }

    public BlocUserEntity comment(String comment) {
        setComment(comment);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof BlocUserEntity)) {
            return false;
        }
        BlocUserEntity blocUserEntity = (BlocUserEntity) o;
        return Objects.equals(bloc, blocUserEntity.bloc) && Objects.equals(user, blocUserEntity.user) && Objects.equals(date_achieved, blocUserEntity.date_achieved) && Objects.equals(favorite, blocUserEntity.favorite) && Objects.equals(workInProgress, blocUserEntity.workInProgress) && Objects.equals(comment, blocUserEntity.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bloc, user, date_achieved, favorite, workInProgress, comment);
    }

    @Override
    public String toString() {
        return "{" +
            " bloc='" + getBloc() + "'" +
            ", user='" + getUser() + "'" +
            ", date_achieved='" + getDate_achieved() + "'" +
            ", favorite='" + isFavorite() + "'" +
            ", workInProgress='" + isWorkInProgress() + "'" +
            ", comment='" + getComment() + "'" +
            "}";
    }

} */