/* package fr.cheville.escalade.bloc.persistence.model;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.cheville.escalade.bloc.domain.data.Type;

@Entity
@Table(name="type")
public class TypeEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="description", nullable = false)
    private String description;

    @OneToMany(mappedBy="type")
    private Set<BlocEntity> blocs;

    public TypeEntity() {
    }

    public TypeEntity(Long id, String name, String description, Set<BlocEntity> blocs) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<BlocEntity> getBlocs() {
        return this.blocs;
    }

    public void setBlocs(Set<BlocEntity> blocs) {
        this.blocs = blocs;
    }

    public TypeEntity id(Long id) {
        setId(id);
        return this;
    }

    public TypeEntity name(String name) {
        setName(name);
        return this;
    }

    public TypeEntity description(String description) {
        setDescription(description);
        return this;
    }

    public TypeEntity blocs(Set<BlocEntity> blocs) {
        setBlocs(blocs);
        return this;
    }

    public static TypeEntity from(Type type) {
        return new TypeEntity()
            .id(type.getId())
            .name(type.getName())
            .description(type.getDescription());
    }

    public static Type get(TypeEntity typeEntity) {
        return new Type()
            .id(typeEntity.getId())
            .name(typeEntity.getName())
            .description(typeEntity.getDescription());
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof TypeEntity)) {
            return false;
        }
        TypeEntity typeEntity = (TypeEntity) o;
        return Objects.equals(id, typeEntity.id) && Objects.equals(name, typeEntity.name) && Objects.equals(description, typeEntity.description) && Objects.equals(blocs, typeEntity.blocs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, blocs);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", blocs='" + getBlocs() + "'" +
            "}";
    }

}
 */