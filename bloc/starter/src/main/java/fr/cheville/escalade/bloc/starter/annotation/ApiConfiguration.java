package fr.cheville.escalade.bloc.starter.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import fr.cheville.escalade.bloc.api.annotation.RestApiService;

@Configuration
@ComponentScan(
        basePackages = "fr.cheville.escalade.bloc.api",
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,
        classes = RestApiService.class)
        )
class ApiConfiguration {

}