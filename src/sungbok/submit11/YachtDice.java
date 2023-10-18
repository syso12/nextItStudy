package sungbok.submit11;

public class YachtDice {
    int num;
    int diceNum;
    int score;

    public YachtDice(int num, int diceNum, int score) {
        this.num = num;
        this.diceNum = diceNum;
        this.score = score;
    }

    public YachtDice() {
    }

    @Override
    public String toString() {
        return "YachtDice{" +
                "num=" + num +
                ", diceNum=" + diceNum +
                ", score=" + score +
                '}';
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDiceNum() {
        return diceNum;
    }

    public void setDiceNum(int diceNum) {
        this.diceNum = diceNum;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
