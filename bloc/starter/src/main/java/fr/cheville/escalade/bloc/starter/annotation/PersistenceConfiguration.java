package fr.cheville.escalade.bloc.starter.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import fr.cheville.escalade.bloc.persistence.annotation.PersistenceService;

@Configuration
@ComponentScan(
        basePackages = "fr.cheville.escalade.bloc.persistence",
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,
        classes = PersistenceService.class)
        )
class PersistenceConfiguration {

}