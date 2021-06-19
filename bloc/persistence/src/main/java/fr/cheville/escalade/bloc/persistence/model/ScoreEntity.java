/* package fr.cheville.escalade.bloc.persistence.model;

import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="score")
public class ScoreEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="difficulty", nullable = false)
    private String difficulty;

    @ManyToMany
    @JoinTable(
    name = "blocs", 
    joinColumns = @JoinColumn(name = "score_id"), 
    inverseJoinColumns = @JoinColumn(name = "bloc_id"))
    Set<BlocEntity> blocs;


    public ScoreEntity() {
    }

    public ScoreEntity(Long id, String name, String difficulty, Set<BlocEntity> blocs) {
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

    public String getDifficulty() {
        return this.difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public Set<BlocEntity> getBlocs() {
        return this.blocs;
    }

    public void setBlocs(Set<BlocEntity> blocs) {
        this.blocs = blocs;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ScoreEntity)) {
            return false;
        }
        ScoreEntity scoreEntity = (ScoreEntity) o;
        return Objects.equals(id, scoreEntity.id) && Objects.equals(name, scoreEntity.name) && Objects.equals(difficulty, scoreEntity.difficulty) && Objects.equals(blocs, scoreEntity.blocs);
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