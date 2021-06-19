package fr.cheville.escalade.bloc.domain.port;

import fr.cheville.escalade.bloc.domain.data.Score;

import java.util.List;

public interface ScorePersistencePort {

    void addScore(Score score);

    void removeScore(Score score);

    void updateScore(Score score);

    List<Score> getAllScore();

    Score getScoreById(Long scoreId);
}
