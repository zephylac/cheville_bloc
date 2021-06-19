package fr.cheville.escalade.bloc.domain.data;

public class Type {
    private Long id;
    private String name;
    private String description;

    public Type() {
    }

    public Type(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    public Type id(Long id) {
        setId(id);
        return this;
    }

    public Type name(String name) {
        setName(name);
        return this;
    }

    public Type description(String description) {
        setDescription(description);
        return this;
    }

}
