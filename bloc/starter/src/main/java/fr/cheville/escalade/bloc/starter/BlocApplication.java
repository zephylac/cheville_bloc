package fr.cheville.escalade.bloc.starter;

import org.axonframework.boot.util.RegisterDefaultEntities;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@RegisterDefaultEntities(packages = {"fr.cheville.escalade.bloc.persistence.model"})
//@EntityScan("fr.cheville.escalade.bloc.persistence.model")
@EnableJpaRepositories("fr.cheville.escalade.bloc.persistence.repository")
public class BlocApplication {

  public static void main(String[] args) {
    SpringApplication.run(BlocApplication.class, args);
  }

}