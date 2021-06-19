/* package fr.cheville.escalade.bloc.persistence.adapter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import fr.cheville.escalade.bloc.domain.data.Bloc;
import fr.cheville.escalade.bloc.domain.exception.BlocNotFoundException;
import fr.cheville.escalade.bloc.domain.port.BlocPersistencePort;
import fr.cheville.escalade.bloc.persistence.model.BlocEntity;
import fr.cheville.escalade.bloc.persistence.repository.BlocRepository;


@Service
public class BlocJpaAdapter implements BlocPersistencePort {

    private BlocRepository blocRepository;

    public BlocJpaAdapter(BlocRepository blocRepository) {
        this.blocRepository = blocRepository;
    }

    @Override
    public void addBloc(Bloc bloc) {
        blocRepository.save(BlocEntity.from(bloc));
    }

    @Override
    public void removeBloc(Bloc bloc) {
        blocRepository.delete(BlocEntity.from(bloc));
    }

    @Override
    public void updateBloc(Bloc bloc) {

    }

    @Override
    public List<Bloc> getAllBloc() {
        return blocRepository.findAll()
                .stream()
                .map(BlocEntity::get)
                .collect(Collectors.toList());
    }

    @Override
    public Bloc getBlocById(Long blocId) {
        return BlocEntity.get(blocRepository.findById(blocId)
                .orElseThrow(() -> new BlocNotFoundException(blocId)));
    }
}
 */