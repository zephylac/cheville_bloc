package fr.cheville.escalade.bloc.domain.port;

import fr.cheville.escalade.bloc.domain.data.User;

import java.util.List;

public interface UserPersistencePort {

    void addUser(User user);

    void removeUser(User user);

    void updateUser(User user);

    List<User> getAllUser();

    User getUserById(Long userId);
}
