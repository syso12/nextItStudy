package sungbok.submit11;

public class Game {
    String name;
    int score;

    public Game(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Game() {
    }

    @Override
    public String toString() {
        return "game{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
