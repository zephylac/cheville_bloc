/* package fr.cheville.escalade.bloc.persistence.adapter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import fr.cheville.escalade.bloc.domain.data.Role;
import fr.cheville.escalade.bloc.domain.exception.RoleNotFoundException;
import fr.cheville.escalade.bloc.domain.port.RolePersistencePort;
import fr.cheville.escalade.bloc.persistence.model.RoleEntity;
import fr.cheville.escalade.bloc.persistence.repository.RoleRepository;


@Service
public class RoleJpaAdapter implements RolePersistencePort {

    private RoleRepository roleRepository;

    public RoleJpaAdapter(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public void addRole(Role role) {
        roleRepository.save(RoleEntity.from(role));
    }

    @Override
    public void removeRole(Role role) {
        roleRepository.delete(RoleEntity.from(role));
    }

    @Override
    public void updateRole(Role role) {

    }

    @Override
    public List<Role> getAllRole() {
        return roleRepository.findAll()
                .stream()
                .map(RoleEntity::get)
                .collect(Collectors.toList());
    }

    @Override
    public Role getRoleById(Long roleId) {
        return RoleEntity.get(roleRepository.findById(roleId)
                .orElseThrow(() -> new RoleNotFoundException(roleId)));
    }
}
 */