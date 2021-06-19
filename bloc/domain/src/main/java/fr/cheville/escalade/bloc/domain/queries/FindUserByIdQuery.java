package fr.cheville.escalade.bloc.domain.queries;

public class FindUserByIdQuery {

    private final Long id;

    public FindUserByIdQuery(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
