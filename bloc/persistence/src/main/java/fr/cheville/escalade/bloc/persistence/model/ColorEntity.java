/* package fr.cheville.escalade.bloc.persistence.model;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.cheville.escalade.bloc.domain.data.Color;

@Entity
@Table(name="color")
public class ColorEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="difficulty", nullable = false)
    private Integer difficulty;

    @OneToMany(mappedBy="color")
    private Set<BlocEntity> blocs;

    public ColorEntity() {
    }

    public ColorEntity(Long id, String name, Integer difficulty, Set<BlocEntity> blocs) {
        this.id = id;
        this.name = name;
        this.difficulty = difficulty;
        this.blocs = blocs;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDifficulty() {
        return this.difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public Set<BlocEntity> getBlocs() {
        return this.blocs;
    }

    public void setBlocs(Set<BlocEntity> blocs) {
        this.blocs = blocs;
    }

    public ColorEntity id(Long id) {
        setId(id);
        return this;
    }

    public ColorEntity name(String name) {
        setName(name);
        return this;
    }

    public ColorEntity difficulty(Integer difficulty) {
        setDifficulty(difficulty);
        return this;
    }

    public ColorEntity blocs(Set<BlocEntity> blocs) {
        setBlocs(blocs);
        return this;
    }

    public static ColorEntity from(Color color) {
        return new ColorEntity()
            .id(color.getId())
            .name(color.getName())
            .difficulty(color.getDifficulty());

    }

    public static Color get(ColorEntity colorEntity) {
        return new Color()
            .id(colorEntity.getId())
            .name(colorEntity.getName())
            .difficulty(colorEntity.getDifficulty());
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ColorEntity)) {
            return false;
        }
        ColorEntity colorEntity = (ColorEntity) o;
        return Objects.equals(id, colorEntity.id) && Objects.equals(name, colorEntity.name) && Objects.equals(difficulty, colorEntity.difficulty) && Objects.equals(blocs, colorEntity.blocs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, difficulty, blocs);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", difficulty='" + getDifficulty() + "'" +
            ", blocs='" + getBlocs() + "'" +
            "}";
    }

}
 */