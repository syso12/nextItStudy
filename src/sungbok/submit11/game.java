package sungbok.submit11;

public class game {
    String name;
    int age;
    String mind;
    int score;

    public game(String name, int age, String mind, int score) {
        this.name = name;
        this.age = age;
        this.mind = mind;
        this.score = score;
    }

    public game() {
    }

    @Override
    public String toString() {
        return "game{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mind='" + mind + '\'' +
                ", score=" + score +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMind() {
        return mind;
    }

    public void setMind(String mind) {
        this.mind = mind;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
