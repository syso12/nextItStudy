package sungbok.submit12.Board;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
    private int num;
    private String title;
    private String day;
    private String content;

    public Board() {
    }

    public Board(int num, String title, String day, String content) {
        this.num = num;
        this.title = title;
        this.day = day;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Board{" +
                "num=" + num +
                ", title='" + title + '\'' +
                ", day='" + day + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public int getnum() {
        return num;
    }

    public void setnum(int num) {
        num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDay() {
        return day;
    }

    public void setDay() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        this.day = sdf.format(date);

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
