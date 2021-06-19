package fr.cheville.escalade.bloc.persistence.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.cheville.escalade.bloc.persistence.annotation.PersistenceService;
import fr.cheville.escalade.bloc.persistence.model.UserEntity;


@PersistenceService
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByMail(String mail);

    Boolean existsByMail(String mail);

    Optional<UserEntity> findOptionalByMail(String mail);

    Optional<UserEntity> findOptionalById(Long id);
}