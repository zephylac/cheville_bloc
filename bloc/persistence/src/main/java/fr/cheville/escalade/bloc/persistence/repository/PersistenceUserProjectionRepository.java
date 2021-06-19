package fr.cheville.escalade.bloc.persistence.repository;

import fr.cheville.escalade.bloc.domain.UserProjectionRepository;
import fr.cheville.escalade.bloc.domain.data.User;
import fr.cheville.escalade.bloc.domain.events.UserCreatedEvent;
import fr.cheville.escalade.bloc.domain.events.UserDeletedEvent;
import fr.cheville.escalade.bloc.domain.events.UserUpdatedEvent;
import fr.cheville.escalade.bloc.domain.queries.FindAllUsers;
import fr.cheville.escalade.bloc.domain.queries.FindUserByIdQuery;
import fr.cheville.escalade.bloc.domain.queries.FindUserByMailQuery;
import fr.cheville.escalade.bloc.domain.queries.UserExistsQuery;
import fr.cheville.escalade.bloc.persistence.annotation.PersistenceService;
import fr.cheville.escalade.bloc.persistence.model.UserEntity;

import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;

@PersistenceService
public class PersistenceUserProjectionRepository implements UserProjectionRepository {

    private final UserRepository userRepository;

    public PersistenceUserProjectionRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Event handlers

    @Override
    @EventHandler
    public void onUserCreatedEvent(UserCreatedEvent event) {
        
        UserEntity userDocument = new UserEntity(
            null, 
            event.getUser().getLogin(), 
            event.getUser().getName(), 
            event.getUser().getSurname(), 
            event.getUser().getMail(), 
            event.getUser().getPassword(), 
            true);
        userRepository.save(userDocument);
    }

    @Override
    @EventHandler
    public void onUserUpdatedEvent(UserUpdatedEvent event) {
        UserEntity existingUser = userRepository.findByMail(event.getUser().getMail());
        existingUser.setName(event.getUser().getName());
        userRepository.save(existingUser);
    }

    @Override
    @EventHandler
    public void onUserDeletedEvent(UserDeletedEvent event) {
        UserEntity existingUser = userRepository.findByMail(event.getMail());
        userRepository.delete(existingUser);
    }

    // Query handlers

    @Override
    @QueryHandler
    public Boolean onUserExistsQuery(UserExistsQuery query) {
        return userRepository.existsByMail(query.getMail());
    }

    @Override
    @QueryHandler
    public Optional<User> onFindUserByIdQuery(FindUserByIdQuery query) {
        return userRepository.findOptionalById(query.getId())
                .map(UserEntity::toUser);
    }

    @Override
    @QueryHandler
    public Optional<User> onFindUserByMailQuery(FindUserByMailQuery query) {
        return userRepository.findOptionalByMail(query.getMail())
                .map(UserEntity::toUser);
    }

    @Override
    @QueryHandler
    public List<User> onFindUserByMailQuery(FindAllUsers query) {
        return userRepository.findAll()
                .stream()
                .map(UserEntity::toUser)
                .collect(Collectors.toList());
    }
}