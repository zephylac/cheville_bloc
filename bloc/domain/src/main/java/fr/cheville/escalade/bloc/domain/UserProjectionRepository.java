package fr.cheville.escalade.bloc.domain;

import java.util.List;
import java.util.Optional;

import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;

import fr.cheville.escalade.bloc.domain.data.User;
import fr.cheville.escalade.bloc.domain.events.UserCreatedEvent;
import fr.cheville.escalade.bloc.domain.events.UserDeletedEvent;
import fr.cheville.escalade.bloc.domain.events.UserUpdatedEvent;
import fr.cheville.escalade.bloc.domain.queries.FindAllUsers;
import fr.cheville.escalade.bloc.domain.queries.FindUserByIdQuery;
import fr.cheville.escalade.bloc.domain.queries.FindUserByMailQuery;
import fr.cheville.escalade.bloc.domain.queries.UserExistsQuery;

public interface UserProjectionRepository {

    // Event handlers

    @EventHandler
    void onUserCreatedEvent(UserCreatedEvent event);

    @EventHandler
    void onUserUpdatedEvent(UserUpdatedEvent event);

    @EventHandler
    void onUserDeletedEvent(UserDeletedEvent event);

    // Query handlers

    @QueryHandler
    Boolean onUserExistsQuery(UserExistsQuery query);

    @QueryHandler
    Optional<User> onFindUserByIdQuery(FindUserByIdQuery query);

    @QueryHandler
    Optional<User> onFindUserByMailQuery(FindUserByMailQuery query);

    @QueryHandler
    List<User> onFindUserByMailQuery(FindAllUsers query);

}