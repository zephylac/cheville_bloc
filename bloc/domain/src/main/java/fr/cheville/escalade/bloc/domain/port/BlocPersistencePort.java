package fr.cheville.escalade.bloc.domain.port;

import fr.cheville.escalade.bloc.domain.data.Bloc;

import java.util.List;

public interface BlocPersistencePort {

    void addBloc(Bloc bloc);

    void removeBloc(Bloc bloc);

    void updateBloc(Bloc bloc);

    List<Bloc> getAllBloc();

    Bloc getBlocById(Long blocId);
}
