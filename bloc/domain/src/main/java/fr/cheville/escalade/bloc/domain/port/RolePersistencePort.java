package fr.cheville.escalade.bloc.domain.port;

import fr.cheville.escalade.bloc.domain.data.Role;

import java.util.List;

public interface RolePersistencePort {

    void addRole(Role role);

    void removeRole(Role role);

    void updateRole(Role role);

    List<Role> getAllRole();

    Role getRoleById(Long roleId);
}
