/* package fr.cheville.escalade.bloc.persistence.adapter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import fr.cheville.escalade.bloc.domain.data.User;
import fr.cheville.escalade.bloc.domain.exception.UserNotFoundException;
import fr.cheville.escalade.bloc.domain.port.UserPersistencePort;
import fr.cheville.escalade.bloc.persistence.model.UserEntity;
import fr.cheville.escalade.bloc.persistence.repository.UserRepository;


@Service
public class UserJpaAdapter implements UserPersistencePort {

    private UserRepository blocRepository;

    public UserJpaAdapter(UserRepository blocRepository) {
        this.blocRepository = blocRepository;
    }

    @Override
    public void addUser(User bloc) {
        blocRepository.save(UserEntity.from(bloc));
    }

    @Override
    public void removeUser(User bloc) {
        blocRepository.delete(UserEntity.from(bloc));
    }

    @Override
    public void updateUser(User bloc) {

    }

    @Override
    public List<User> getAllUser() {
        return blocRepository.findAll()
                .stream()
                .map(UserEntity::get)
                .collect(Collectors.toList());
    }

    @Override
    public User getUserById(Long blocId) {
        return UserEntity.get(blocRepository.findById(blocId)
                .orElseThrow(() -> new UserNotFoundException(blocId)));
    }
}
 */