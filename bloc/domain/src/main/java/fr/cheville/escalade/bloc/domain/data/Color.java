package fr.cheville.escalade.bloc.domain.data;

public class Color {
    private Long id;
    private String name;
    private Integer difficulty;

    public Color() {
    }

    public Color(Long id, String name, Integer difficulty) {
        this.id = id;
        this.name = name;
        this.difficulty = difficulty;
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

    public Color id(Long id) {
        setId(id);
        return this;
    }

    public Color name(String name) {
        setName(name);
        return this;
    }

    public Color difficulty(Integer difficulty) {
        setDifficulty(difficulty);
        return this;
    }

}
