package sungbok.submit10true;

public class book {
    private int no;            /* 책 번호 */
    private String title;      /* 책 제목 */
    private boolean isBorrow;  /* 대여 여부 */        // boolean 타입으로 지정햇어야 함 -> 기본값이 false라서



    public book(int no, String title, boolean isBorrow) {
        this.no = no;
        this.title = title;
        this.isBorrow = isBorrow;

    }
    public book() {
    }

    @Override
    public String toString() {

        if (isBorrow == false) {
            return "[" +
                    "책번호: " + no +
                    ", 책 제목: " + title + '\'' +
                    ", 대여상태: " + "입고중" +
                    ']';
        }else{
            return "[" +
                    "책번호: " + no +
                    ", 책 제목: " + title + '\'' +
                    ", 대여상태: " + "대여중" +
                    ']';
        }
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isBorrow() {
        return isBorrow;
    }

    public void setBorrow(boolean borrow) {
        isBorrow = borrow;
    }
}
