package fr.cheville.escalade.bloc.core.service;

import java.util.List;

import fr.cheville.escalade.bloc.domain.data.Bloc;

public interface BlocService {

    void addBloc(Bloc bloc);

    void removeBloc(Bloc bloc);

    void updateBloc(Bloc bloc);

    List<Bloc> getAllBloc();

    Bloc getBlocById(Long blocId);

}
