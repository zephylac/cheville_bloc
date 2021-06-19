/* package fr.cheville.escalade.bloc.persistence.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.cheville.escalade.bloc.domain.data.Bloc;

@Entity
@Table(name="bloc")
public class BlocEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="file_url", nullable = false)
    private String file_url;

    @Column(name="date_start", nullable = false)
    private LocalDate date_start;

    @Column(name="date_end", nullable = false)
    private LocalDate date_end;
    
    @Column(name="sector", nullable = false)
    private Integer sector;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="color_id", nullable=false)
    private ColorEntity color;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="type_id", nullable=false)
    private TypeEntity type;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id", nullable=false)
    private UserEntity user;

    @OneToMany(mappedBy = "bloc")
    private List<BlocUserEntity> blocUserEntity;


    public BlocEntity() {
    }

    public BlocEntity(Long id, String file_url, LocalDate date_start, LocalDate date_end, Integer sector, ColorEntity color, TypeEntity type, UserEntity user, List<BlocUserEntity> blocUserEntity) {
        this.id = id;
        this.file_url = file_url;
        this.date_start = date_start;
        this.date_end = date_end;
        this.sector = sector;
        this.color = color;
        this.type = type;
        this.user = user;
        this.blocUserEntity = blocUserEntity;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFile_url() {
        return this.file_url;
    }

    public void setFile_url(String file_url) {
        this.file_url = file_url;
    }

    public LocalDate getDate_start() {
        return this.date_start;
    }

    public void setDate_start(LocalDate date_start) {
        this.date_start = date_start;
    }

    public LocalDate getDate_end() {
        return this.date_end;
    }

    public void setDate_end(LocalDate date_end) {
        this.date_end = date_end;
    }

    public Integer getSector() {
        return this.sector;
    }

    public void setSector(Integer sector) {
        this.sector = sector;
    }

    public ColorEntity getColor() {
        return this.color;
    }

    public void setColor(ColorEntity color) {
        this.color = color;
    }

    public TypeEntity getType() {
        return this.type;
    }

    public void setType(TypeEntity type) {
        this.type = type;
    }

    public UserEntity getUser() {
        return this.user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public List<BlocUserEntity> getBlocUserEntity() {
        return this.blocUserEntity;
    }

    public void setBlocUserEntity(List<BlocUserEntity> blocUserEntity) {
        this.blocUserEntity = blocUserEntity;
    }

    public BlocEntity id(Long id) {
        setId(id);
        return this;
    }

    public BlocEntity file_url(String file_url) {
        setFile_url(file_url);
        return this;
    }

    public BlocEntity date_start(LocalDate date_start) {
        setDate_start(date_start);
        return this;
    }

    public BlocEntity date_end(LocalDate date_end) {
        setDate_end(date_end);
        return this;
    }

    public BlocEntity sector(Integer sector) {
        setSector(sector);
        return this;
    }

    public BlocEntity color(ColorEntity color) {
        setColor(color);
        return this;
    }

    public BlocEntity type(TypeEntity type) {
        setType(type);
        return this;
    }

    public BlocEntity user(UserEntity user) {
        setUser(user);
        return this;
    }

    public BlocEntity blocUserEntity(List<BlocUserEntity> blocUserEntity) {
        setBlocUserEntity(blocUserEntity);
        return this;
    }

    public static BlocEntity from(Bloc bloc) {
        return new BlocEntity()
            .id(bloc.getId())
            .file_url(bloc.getFileUrl())
            .date_start(bloc.getDateStart())
            .date_end(bloc.getDateEnd())
            .sector(bloc.getSector())
            .color(ColorEntity.from(bloc.getColor()))
            .type(TypeEntity.from(bloc.getType()))
            .user(UserEntity.from(bloc.getUser()));
    }

    public static Bloc get(BlocEntity blocEntity) {
        return new Bloc()
            .id(blocEntity.getId())
            .fileUrl(blocEntity.getFile_url())
            .dateStart(blocEntity.getDate_start())
            .dateEnd(blocEntity.getDate_end())
            .sector(blocEntity.getSector())
            .color(ColorEntity.get(blocEntity.getColor()))
            .type(TypeEntity.get(blocEntity.getType()))
            .user(UserEntity.get(blocEntity.getUser()));
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof BlocEntity)) {
            return false;
        }
        BlocEntity blocEntity = (BlocEntity) o;
        return Objects.equals(id, blocEntity.id) && Objects.equals(file_url, blocEntity.file_url) && Objects.equals(date_start, blocEntity.date_start) && Objects.equals(date_end, blocEntity.date_end) && Objects.equals(sector, blocEntity.sector) && Objects.equals(color, blocEntity.color) && Objects.equals(type, blocEntity.type) && Objects.equals(user, blocEntity.user) && Objects.equals(blocUserEntity, blocEntity.blocUserEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, file_url, date_start, date_end, sector, color, type, user, blocUserEntity);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", file_url='" + getFile_url() + "'" +
            ", date_start='" + getDate_start() + "'" +
            ", date_end='" + getDate_end() + "'" +
            ", sector='" + getSector() + "'" +
            ", color='" + getColor() + "'" +
            ", type='" + getType() + "'" +
            ", user='" + getUser() + "'" +
            ", blocUserEntity='" + getBlocUserEntity() + "'" +
            "}";
    }

}
 */