package memento;

import java.util.Date;

public class GameRole {

    private String name;

    protected Integer round;

    private Integer score;

    public GameRole(String name) {
        this.name = name;
    }

    public void init(){
        this.round = 1;
        this.score = 0;
    }

    public void showRole(){
        System.out.println("\nRole Info:\n Name:" + name + "\n Round:" + round + "\n Score:" + score);
    }

    public void pass(){
        round = round + 1;
        score = score + 100;
    }

    public GameRoleMemento saveStatus(){
        return new GameRoleMemento(name,round,score);
    }

    public void recoveryStatus(GameRoleMemento memento){
        name = memento.getName();
        round = memento.getRound();
        score = memento.getScore();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

}
