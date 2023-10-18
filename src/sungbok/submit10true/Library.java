package sungbok.submit10true;

import java.util.ArrayList;

public class Library { // 싱글톤 만드는거 공부하자
    private ArrayList<book> bookList = new ArrayList<>();

    private Library(){
        // split으로 분리하기
        String strBooks = "삼국지, 해리포터와 마법사의 돌, 해리포터와 비밀의 방 , 해리포터와 아즈카반의 죄수,해리포터와 불사조 기사단, " +
                "해리포터와 혼혈왕자, 해리포터와 죽음의 성물,어린왕자, 나의 라임 오렌지나무, 이것이 자바다, 좋은생각, " +
                "반지의 제왕: 반지 원정대, 반지의 제왕: 두 개의 탑, 반지의 제왕: 왕의 귀환, 토익보카, 개미";
        String[] strArray  = strBooks.split(","); // ", "하면 되지만 그런경우가 아니기 때문에 사용이 힘들다
        // 배열로 묶기 []
        // 리스트는.get(i) 배열은 [i]
        for(int i = 0; i < strArray.length; i++){
            strArray[i] = strArray[i].trim(); //좌우 공백 제거
            System.out.println(strArray[i]);
        }

        // strArray : 책 제목
        for(int i = 0; i < strArray.length; i++){
            bookList.add(new book(bookList.size()+1, strArray[i], false));
        }
        for(int i = 0; i < bookList.size(); i++){
            System.out.println(bookList.get(i));
        }

    }

    private static sungbok.submit10true.Library instance = new sungbok.submit10true.Library();

    public static sungbok.submit10true.Library getInstance(){
        return instance;
    }

    // 책 목록 출력 메소드
    public void printBook(){
        for( book bo : bookList ){
            System.out.println(bo);
        }
    }
    // 책 대여 메소드
    public void borrow (int no){
        // bookList에 담긴 Book 객체 중에 필드변수no값이
        // 파라미터로 들어온 no값과 같은 녀석을 찾고,
        // 해당 Book 객체의 isBorrow 값을 true로 바꾼다.
        for( book bo : bookList ){
            if(bo.getNo() == no){
                bo.setBorrow(true);
                System.out.println(bo.getTitle() + "을 대여하였습니다.");
                return;
            }
        }

        System.out.println("해당 책이 존재하지않습니다.");
    }
    // 책을 반납 메소드
    public void returnBook(int no) {
        for (book bo : bookList) {
            if (bo.getNo() == no) {
                bo.setBorrow(false);
                System.out.println(bo.getTitle() + "을 입고되었습니다.");
                return;
            }
        }
    }
    // 책 검색 메소드
    public void searchBook(String keyword){
        // bookList를 순회하면서 각각의 Book 객체의 title에
        // keyword가 포함되어있으면 출력
        for( book book : bookList ){
            // book.getTitle().contains(keyword) 이방식도 된다.
            if(book.getTitle().indexOf(keyword) != -1){
                System.out.println(book);
            }
        }
    }


}
