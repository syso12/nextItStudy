package sungbok.submit10;

import java.util.ArrayList;

public class Library {
    // 곧 회원가입을 할때마다 Member 객체를 생성할거고 -> member객체가 Book이 될꺼고
    // 생성된 Member 객체들은 MeberDB 안에 담을거야. -> Book의 객체들을 library에 담을꺼야
    // 어? 생각해보니 MemberDB라는 객체는 하나만 ->
    // 생성해서 쓰겟네?? -> 싱글톤(Singleton) 패턴 적용

    // Book 객체들을 보관하는 Library 클래스를 만들어주세요. 싱글턴 패턴을 적용해주세요.
    // Book은 넘버와 제목 대여여부를 만든것
    // Book DB가 필요없다?? 모르겟음

    // Library 클래스에 bookList를 만드셨겠죠? 도서 목록은 자유롭게 하셔도 되고, 제가 제공해드리는 도서 목록을 사용하셔도 됩니다.

    //※ strBooks 문자열을 split으로 쪼개서 얻은 배열을 이용하여, 각 책 제목에 대한  Book객체를 만들어 bookList에 담아주세요.
    // Library가 하는 역할???

    ArrayList<Book> bookList = new ArrayList<>();


    // public void String

    String strBooks = "삼국지, 해리포터와 마법사의 돌, 해리포터와 비밀의 방 , 해리포터와 아즈카반의 죄수,해리포터와 불사조 기사단, " +
            "해리포터와 혼혈왕자, 해리포터와 죽음의 성물,어린왕자, 나의 라임 오렌지나무, 이것이 자바다, 좋은생각, " +
            "반지의 제왕: 반지 원정대, 반지의 제왕: 두 개의 탑, 반지의 제왕: 왕의 귀환, 토익보카, 개미";


    private Library() {
        // bookList.add(new Book(bookList.size()+1, strBooks,false));


    }
}
