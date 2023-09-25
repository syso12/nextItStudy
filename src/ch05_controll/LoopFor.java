package ch05_controll;

public class LoopFor {
    public static void main(String[] args) {
        // 반복문
        // for

        // 콘솔창에 1부터 10까지 출력
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);

        int one = 1;
        System.out.println(one++);
        System.out.println(one++);
        System.out.println(one++);
        System.out.println(one++);
        System.out.println(one++);
        System.out.println(one++);
        System.out.println(one++);
        System.out.println(one++);
        System.out.println(one++);
        System.out.println(one++);

        // 반복문 사용
        // ;를 기준으로
        // for(초기화식; 조건식; 증감식)
        // 초기화식에는 for문의 반복횟수를 결정해주는 변수선언
        // 증감식에는 for문이 반복될때마다 변수의 증가량 지정
        // 조건식에는 for문이 반복되는 기준을 정한다.
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // for문 내부 변수 i는 for 문 내에서 선언되고, for문 종료시 제거된다.
        // = 변수의 스코프
//        System.out.println(i);

        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        // for문 내부 변수 i는 for문의 반복횟수를 조정하기 위함이
        // 주 목적이므로 꼭 i를 for문 내에서 쓸 필요는 없다.
        // i는 단순변수명일뿐이므로, i가 아닌 다른 단어를 사용해도 된다.

        one = 1;
        // 10번 반복하는 for문

        for(int number = 0; number < 10; number +=1) {
            System.out.println(one++);
        }

        // 정말많이 쓰게될 for문 형식
        // 20번 반복 하는 for문
        System.out.println("시작");
        for(int i = 0; i < 100000000; i++) {

        }

        System.out.println("\n============================================\n");

        // 1부터 20까지 더한값?
        // 변수의 스코프를 이용한 for문
        // 위아래 이동은 alt+shift
        // 띄우기 tab 뒤로 띄우기 shift+tab
        int sum = 0;
        for(int i = 1; i <= 20; i++){
            sum += i;
        }
        System.out.println(sum);

        // 1부터 40까지 중에 짝수 끼리만 더한값??
        // 자동 줄맞춤 [ctrl + alt + l]
        sum = 0;
        for(int i = 1; i <= 40; i++){
            // 짝수일때만 (조건)sum에 i를 더한다.
            if(i % 2 ==0)
            sum += i;
        }
        System.out.println(sum);


    }
}
