package ch03_system;

public class Comments {
    // 자바 문서(javadoc) 주석
    // 메소드 사용법에 대해 설명하는 용도로 사용

    /**
     * 강연씨가 좋아하는 과일
     * */
    static String apple = "사과";




    public static void main(String[] args) {
        // 주석(Comment)

        // 단일 주석(코드 앞에 //)
        // 프로그래밍 언어마다 주석이 다른경우가 많다.
        // 단축키 [Ctrl + /]

        // 영역 선택 후 단축키를 입력하면 한번에 주석 처리/해제
        System.out.println("주석");
        System.out.println("주석");
        System.out.println("주석");
        System.out.println("주석");

        /* 다중 주석 */
        /*
        *  작성자: 정찬웅
        *  작성일: 2023-09-20
        */

        System.out.println(apple);

        // TODO 주석
        // 개발 중에 구현해야할 부분에 대해서
        // 미리 코멘트를 남겨놓는 경우 이용한다.



    }
}
