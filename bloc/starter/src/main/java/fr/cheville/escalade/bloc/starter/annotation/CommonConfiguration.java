package fr.cheville.escalade.bloc.starter.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import fr.cheville.escalade.bloc.commons.axon.annotation.CommonsService;

@Configuration
@ComponentScan(
        basePackages = "fr.cheville.escalade.bloc.commons",
        includeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,
        classes = CommonsService.class)
        )
class CommonConfiguration {

}