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
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // for문 내부 변수 i는 for 문 내에서 선언되고, for문 종료시 제거된다.
        // = 변수의 스코프
//        System.out.println(i);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // for문 내부 변수 i는 for문의 반복횟수를 조정하기 위함이
        // 주 목적이므로 꼭 i를 for문 내에서 쓸 필요는 없다.
        // i는 단순변수명일뿐이므로, i가 아닌 다른 단어를 사용해도 된다.
        System.out.println("\n============================================\n");
        one = 1;
        // 10번 반복하는 for문

        for (int number = 0; number < 10; number += 1) {
            System.out.println(one++);
        }

        // 정말많이 쓰게될 for문 형식
        // 20번 반복 하는 for문
        System.out.println("시작");
        for (int i = 0; i < 100000000; i++) {

        }

        System.out.println("\n============================================\n");

        // 1부터 20까지 더한값?
        // 변수의 스코프를 이용한 for문
        // 위아래 이동은 alt+shift
        // 띄우기 tab 뒤로 띄우기 shift+tab
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += i;
        }
        System.out.println(sum);

        // 1부터 40까지 중에 짝수 끼리만 더한값??
        // 자동 줄맞춤 [ctrl + alt + l]
        sum = 0;
        for (int i = 1; i <= 40; i++) {
            // 짝수일때만 (조건)sum에 i를 더한다.
            if (i % 2 == 0)
                sum += i;
        }
        System.out.println(sum);

        sum = 0;
        // 실행결과는 같은데 for문의 실행횟수는 더 적다.
        // (프로그램 실행 속도 증가 = 성능 증가)
        for (int i = 0; i <= 40; i += 2) {
            // i = 0, i = 2, i = 4
            sum += i;
            System.out.println(i);
        }

        // 0부터 2까지 0.2마다 출력
        // 소수인 double, float 타입의 연산은 정확하지않으므로 비추천한다.
        for (double i = 0; i <= 2; i += 0.2) {
            System.out.println(i);
        }
        System.out.println("\n============================================\n");
        // 0부터 2까지 0.2마다 출력
        for (int i = 0; i <= 20; i += 2) { // 0 , 2 , 4
            System.out.println((double) i / 10); // 0, 0.2, 0.4 , .....
        }

        System.out.println("\n============================================\n");

        // 구구단 2단
        // 2 x 1 = 2
        // 2 x 2 = 4
        // 2 x 3 = 6
        // 2 x 9 = 18
        int a = 2;
        for (int i = 1; i <= 9; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }

        System.out.println("\n============================================\n");

        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");

        // 위의 코드를 for문을 이용하여 같은 결과가 나오도록 만들기
        String star = "";
        for (int s = 0; s < 5; s++) {
            star += "*";
            System.out.println(star);
        }
        for (String i = "*"; i.length() < 5; i += "*") {
            System.out.println(i);
        }
        System.out.println("\n============================================\n");

        // 나머지 연산자(%) 의 사용 예시
        // for 문 내에서 순환하는 숫자에 대해서 사용하면 좋다.

        // 국수공장에서 면을 20cm 뽑고있다.
        for (int i = 0; i < 20; i++) {
            System.out.println("||||||||");
            // i가 4, 9, 14, .....일때 절단 시키기
            if (i == 4 || i == 9 || i == 14) {
                System.out.println("--------");
            }
            // 4, 9, 14, 19, 24, .... 는
            // 전부 5로 나누었을때의 나머지가 4인 숫자들
            if (i % 5 == 4) {
                System.out.println("--------");
            }
        }
        System.out.println("\n============================================\n");

        // 라면 공장에서 면을 30cm 뽑고있는데
        // 6cm마다 잘라주어야 한다.
        // ///////
        // \\\\\\\
        // ///////
        // \\\\\\\
        // 모양으로 출력하기

        for (int i = 0; i < 30; i++) {
            if (i % 2 == 0) { // 홀짝 판별을 위함
                System.out.println("////////");
            }else {
                System.out.println("\\\\\\\\\\\\\\\\");
            }
            // i가 5, 11, 17, 23 .... 일때 자른다
            // 6으로 나누었을때, 나머지가 5인 숫자(조건 체크
            // 조건을 체크하는 목적이 다른 if문은 서로 분리해야 한다.
            if (i % 6 == 5) {
                System.out.println("---------");
            }

        }

        System.out.println("\n=================================\n");

        // 10부터 1까지 출력
        // 10
        // 9
        // 1
        for(int i = 0; i <= 10; i++) {
            System.out.println(10 - i);
        }
        // 거꾸로 for문
        for(int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("\n=================================\n");

        // for문으로 String을 가지고 놀기
        // 숫자형 문자열의 각 자리수를 더한 결과 얻기
        // submit02에서 했던걸 for문을 이용해서 해결
        String example = "37845";

        example.substring(0,1); // i 가 0
        example.substring(1,2); // i 가 1
        example.substring(2,3); // i 가 2
        example.substring(3,4); // i 가 3
        example.substring(4,5); // i 가 4


        // 문자열의 길이만큼 반복 실행
        int result = 0;
        for(int i = 0; i < example.length(); i++) {
            System.out.println(example.substring(i,i+1));
            result += Integer.parseInt(example.substring(i, i+1));
        }
        System.out.println(result);

        System.out.println("\n===============================================\n");

        // 슈의 갯수는?
        String syusyu = "슈슈뮤슈뮤슈뮤슈듀슈뮤슈";
        // syusyu에서 "슈"가 몇글자 들어가있는지 세어보기
        // (눈으로 세어보기 7개)

        // syusyu에서 한글자씩 잘라서
        // "슈"와 일치하는지 체크
        // 개수 체크
//        String syu = "슈";
//        for (int i = 0; i < syusyu.length(); i++) {
//            System.out.println(syusyu.substring(i,i+1));
//            int count = syusyu.equals(syu);
//        }
//        System.out.println();

        // syusyu에서 한글자씩 잘라서
        // "슈"와 일치하는지 체크(if문)
        // 개수 체크(if문이 실행될때마다 1씩 증가하는 변수 필요)
        int count = 0;
        for(int i = 0; i < syusyu.length(); i++) {
            System.out.println(syusyu.substring(i, i+1));
            if(syusyu.substring(i,i+1).equals("슈")){
                count++;
            }
        }
        System.out.println("슈의 갯수: " + count);

        }
    }

