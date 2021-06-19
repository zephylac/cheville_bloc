package fr.cheville.escalade.bloc.starter.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import fr.cheville.escalade.bloc.core.service.annotation.CoreService;

@Configuration
@ComponentScan(
        basePackages = "fr.cheville.escalade.bloc.core",
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,
        classes = CoreService.class)
        )
class CoreConfiguration {

}