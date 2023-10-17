package sungbok.submit10;

public class Book {
    private int no;
    private String bookTitle;
    private String daeyeo;

    public Book(int no, String bookTitle, String daeyeo) {
        this.no = no;
        this.bookTitle = bookTitle;
        this.daeyeo = daeyeo;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "[" +
                "책번호=" + no +
                ", 책 제목='" + bookTitle + '\'' +
                ", 대여상태='" + daeyeo + '\'' +
                ']';
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getDaeyeo() {
        return daeyeo;
    }

    public void setDaeyeo(String daeyeo) {
        this.daeyeo = daeyeo;
    }
}
