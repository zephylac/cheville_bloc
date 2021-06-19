package fr.cheville.escalade.bloc.core.service;

import java.util.List;

import fr.cheville.escalade.bloc.domain.data.Role;

public interface RoleService {

    void addRole(Role role);

    void removeRole(Role role);

    void updateRole(Role role);

    List<Role> getAllRole();

    Role getRoleById(Long roleId);

}
