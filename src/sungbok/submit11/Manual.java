package sungbok.submit11;

public class Manual {
    int hint;
    String dice;
    String rule;
    String example;

    public Manual(int hint, String dice, String rule, String example) {
        this.hint = hint;
        this.dice = dice;
        this.rule = rule;
        this.example = example;
    }

    public Manual() {
    }

    @Override
    public String toString() {
        return "Manual{" +
                "hint=" + hint +
                ", dice='" + dice + '\'' +
                ", rule='" + rule + '\'' +
                ", example='" + example + '\'' +
                '}';
    }

    public int getHint() {
        return hint;
    }

    public void setHint(int hint) {
        this.hint = hint;
    }

    public String getDice() {
        return dice;
    }

    public void setDice(String dice) {
        this.dice = dice;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }
}
