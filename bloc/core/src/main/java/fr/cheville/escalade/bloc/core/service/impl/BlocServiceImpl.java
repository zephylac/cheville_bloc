package fr.cheville.escalade.bloc.core.service.impl;

import java.util.List;

import fr.cheville.escalade.bloc.core.service.BlocService;
import fr.cheville.escalade.bloc.domain.data.Bloc;
import fr.cheville.escalade.bloc.domain.port.BlocPersistencePort;

//@Service
public class BlocServiceImpl implements BlocService {

    private final BlocPersistencePort blocPersistencePort;

    public BlocServiceImpl(BlocPersistencePort blocPersistencePort) {
        this.blocPersistencePort = blocPersistencePort;
    }

    @Override
    public void addBloc(Bloc bloc) {
        blocPersistencePort.addBloc(bloc);
    }

    @Override
    //@Transactional
    public void removeBloc(Bloc bloc) {
        blocPersistencePort.removeBloc(bloc);
    }

    @Override
    public void updateBloc(Bloc bloc) {
        blocPersistencePort.updateBloc(bloc);
    }

    @Override
    public List<Bloc> getAllBloc() {
        return blocPersistencePort.getAllBloc();
    }

    @Override
    public Bloc getBlocById(Long blocId) {
        return blocPersistencePort.getBlocById(blocId);
    }
}
