package memento;

public class GameRoleMemento {

    private String name;

    protected Integer round;

    private Integer score;

    public GameRoleMemento(String name, Integer round, Integer score) {
        this.name = name;
        this.round = round;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public Integer getRound() {
        return round;
    }

    public Integer getScore() {
        return score;
    }
}
