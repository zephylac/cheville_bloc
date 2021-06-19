package fr.cheville.escalade.bloc.domain.commands;

import fr.cheville.escalade.bloc.domain.annotation.DomainService;
import fr.cheville.escalade.bloc.domain.data.User;
import fr.cheville.escalade.bloc.domain.events.UserCreatedEvent;
import fr.cheville.escalade.bloc.domain.events.UserDeletedEvent;
import fr.cheville.escalade.bloc.domain.events.UserUpdatedEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.commandhandling.model.AggregateLifecycle;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.spring.stereotype.Aggregate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DomainService
@Aggregate
public class UserAggregate {

    private final Logger log = LoggerFactory.getLogger(UserAggregate.class);

    @AggregateIdentifier
    private String mail;

    private String name;

    public UserAggregate() {
    }

    // Command handlers

    @CommandHandler
    public UserAggregate(CreateUserCommand command) {
        User user = command.getUser();
        user.validateMail();
        AggregateLifecycle.apply(new UserCreatedEvent(user));
    }

    @CommandHandler
    public void onUpdateUserCommand(UpdateUserCommand command) {
        command.getUser().validateNameIsDifferent(name);
        AggregateLifecycle.apply(new UserUpdatedEvent(command.getUser()));
    }

    @CommandHandler
    public void onDeleteUserCommand(DeleteUserCommand command) {
        AggregateLifecycle.apply(new UserDeletedEvent(command.getMail()));
    }

    // Event handlers

    @EventSourcingHandler
    public void onUserCreatedEvent(UserCreatedEvent event) {
        log.debug("onUserCreatedEvent: {} ", event);

        this.mail = event.getUser().getMail();
        this.name = event.getUser().getName();
    }

    @EventSourcingHandler
    public void UserUpdatedEvent(UserUpdatedEvent event) {

        this.name = event.getUser().getName();
    }

    @EventSourcingHandler
    public void onUserDeletedEvent(UserDeletedEvent event) {
        this.mail = event.getMail();

    }
}
