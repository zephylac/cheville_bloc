package fr.cheville.escalade.bloc.core.service;

import java.util.List;

import fr.cheville.escalade.bloc.domain.data.Score;

public interface ScoreService {

    void addScore(Score score);

    void removeScore(Score score);

    void updateScore(Score score);

    List<Score> getAllScore();

    Score getScoreById(Long scoreId);

}
