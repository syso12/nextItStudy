package sungbok.submit11;

import java.util.Scanner;
// 야추 주사위
// 주사위클래스와 사람클래스를 따로두어서 사람이 주사위를 굴리도록 만든다
// 주사위의 족보는 ArrayList에 담아서 index값으로 하나하나 뽑아내도록 한다
// 점수계산은 정규표현식을 사용해서 &&(and)와 ||(or)를 이용해서 족보에 해당하는 점수가 되면 계산하자
// 야추주사위의 핵심은 내가 원하는 값이 나올때까지 주사위를 굴릴수 있다는것이다.
// 주사위의 랜덤 (math.random() + 6) + 1 을 하면 1~6까지 나온다


public class DiceMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("야추 주사위  ⚀ ⚁ ⚂ ⚃ ⚄ ⚅");
        System.out.println("참가자의 이름을 입력하세요");
        System.out.print(">>> ");
        String name = scan.nextLine();

        System.out.println(name + "님 환영합니다.");

        System.out.println("행동을 선택해주세요.");
        System.out.println("1. 도박 | 2. 족보 확인하기 | 3. 점수보기 |4. 신고하기 |5. 탈출");
        while (true) {
            int command = Integer.parseInt(scan.nextLine());

            if (command == 1) {
                // 도박 시작
            } else if (command == 2) {
                // 족보 확인하기
            } else if (command == 3) {
                // 점수 보기
            } else if (command == 4) {

            } else if (command == 5) {
                // 탈출하기
                System.out.println("돈 생기면 또와ㅋ");
                break;
            } else if (command == 6) {
                // 미정
                System.out.println("");
            } else {
                System.out.println("잘못입력하셨습니다.");
                continue;
            }

        }
    }
}
