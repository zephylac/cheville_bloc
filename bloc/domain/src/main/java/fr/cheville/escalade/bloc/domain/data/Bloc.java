package fr.cheville.escalade.bloc.domain.data;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Bloc {
    private Long id;
    private Integer sector;
    private String fileUrl;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private Type type;
    private Color color;
    private User user;
    private List<User> usersAchieved;

    public Bloc() {
    }

    public Bloc(Long id, Integer sector, String fileUrl, LocalDate dateStart, LocalDate dateEnd, Type type, Color color, User user, List<User> usersAchieved) {
        this.id = id;
        this.sector = sector;
        this.fileUrl = fileUrl;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.type = type;
        this.color = color;
        this.user = user;
        this.usersAchieved = usersAchieved;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSector() {
        return this.sector;
    }

    public void setSector(Integer sector) {
        this.sector = sector;
    }

    public String getFileUrl() {
        return this.fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public LocalDate getDateStart() {
        return this.dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDate getDateEnd() {
        return this.dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Type getType() {
        return this.type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getUsersAchieved() {
        return this.usersAchieved;
    }

    public void setUsersAchieved(List<User> usersAchieved) {
        this.usersAchieved = usersAchieved;
    }

    public Bloc id(Long id) {
        setId(id);
        return this;
    }

    public Bloc sector(Integer sector) {
        setSector(sector);
        return this;
    }

    public Bloc fileUrl(String fileUrl) {
        setFileUrl(fileUrl);
        return this;
    }

    public Bloc dateStart(LocalDate dateStart) {
        setDateStart(dateStart);
        return this;
    }

    public Bloc dateEnd(LocalDate dateEnd) {
        setDateEnd(dateEnd);
        return this;
    }

    public Bloc type(Type type) {
        setType(type);
        return this;
    }

    public Bloc color(Color color) {
        setColor(color);
        return this;
    }

    public Bloc user(User user) {
        setUser(user);
        return this;
    }

    public Bloc usersAchieved(List<User> usersAchieved) {
        setUsersAchieved(usersAchieved);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Bloc)) {
            return false;
        }
        Bloc bloc = (Bloc) o;
        return Objects.equals(id, bloc.id) && Objects.equals(sector, bloc.sector) && Objects.equals(fileUrl, bloc.fileUrl) && Objects.equals(dateStart, bloc.dateStart) && Objects.equals(dateEnd, bloc.dateEnd) && Objects.equals(type, bloc.type) && Objects.equals(color, bloc.color) && Objects.equals(user, bloc.user) && Objects.equals(usersAchieved, bloc.usersAchieved);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sector, fileUrl, dateStart, dateEnd, type, color, user, usersAchieved);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", sector='" + getSector() + "'" +
            ", fileUrl='" + getFileUrl() + "'" +
            ", dateStart='" + getDateStart() + "'" +
            ", dateEnd='" + getDateEnd() + "'" +
            ", type='" + getType() + "'" +
            ", color='" + getColor() + "'" +
            ", user='" + getUser() + "'" +
            ", usersAchieved='" + getUsersAchieved() + "'" +
            "}";
    }

}