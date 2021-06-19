package fr.cheville.escalade.bloc.domain.queries;

import fr.cheville.escalade.bloc.domain.annotation.DomainService;
import fr.cheville.escalade.bloc.domain.data.User;
import fr.cheville.escalade.bloc.commons.axon.AxonQuery;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@DomainService
public class UserQueries {

    private final AxonQuery axonQuery;

    @Autowired
    public UserQueries(AxonQuery axonQuery) {
        this.axonQuery = axonQuery;
    }

    public boolean userExists(String mail) {
        return axonQuery.query(new UserExistsQuery(mail), Boolean.class);
    }

    public Optional<User> findUserById(Long id) {
        return axonQuery.queryOptional(new FindUserByIdQuery(id), User.class);
    }

    public Optional<User> findUser(String mail) {
        return axonQuery.queryOptional(new FindUserByMailQuery(mail), User.class);
    }

    public List<User> findAllUsers() {
        return axonQuery.queryList(new FindAllUsers(), User.class);
    }
}
