package fr.cheville.escalade.bloc.domain.data;

public class Score {
    private Long id;
    private Long score;
    private Long top_number;

    public Score() {
    }

    public Score(Long id, Long score, Long top_number) {
        this.id = id;
        this.score = score;
        this.top_number = top_number;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getScore() {
        return this.score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Long getTop_number() {
        return this.top_number;
    }

    public void setTop_number(Long top_number) {
        this.top_number = top_number;
    }
}