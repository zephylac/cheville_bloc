package fr.cheville.escalade.bloc.starter.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import fr.cheville.escalade.bloc.domain.annotation.DomainService;

@Configuration
@ComponentScan(
        basePackages = "fr.cheville.escalade.bloc.domain",
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,
        classes = DomainService.class)
        )
class DomainConfiguration {

}