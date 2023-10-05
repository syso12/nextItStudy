package sungbok.submit04;
import ch06_method.MethodMain;

import java.util.Scanner;

public class Submit04 {
    public static void main(String[] args) {
        // a나b가 n층으로 가려면 1~10사이의 숫자가 트루인지 입력값을 매겨야 하나?
        // for문으로 반복해서 n이 1~10이 하나씩 커지게 하는게 말이안된다
        // 그러면 1~10층을 입력할수잇는 조건을 만들어야 한다.
        // a는 5~10 부터 b는 1~5까지만 이동할수잇게 만들고
        // 비교를 하게 만들자
        Scanner sc = new Scanner(System.in);
        int afloor = 10;
        int bfloor = 4;
//        String Q = "q";
//        String EXIT = "exit";
        out: while (true) {
            System.out.println("================희영빌딩==================");
            System.out.println("승강기 A의 현재 위치 : " + afloor + "층");
            System.out.println("승강기 B의 현재 위치 : " + bfloor + "층");
            System.out.println("몇층에 계신가요?[종료하려면 q 또는 exit 입력] ");
            String text1 = sc.nextLine();
            if (text1.equals("q")) {
                System.out.println("프로그램이 종료되었습니다.");
                break out;
            } else if (text1.equals("exit")) {
                System.out.println("프로그램이 종료되었습니다.");
                break out;
            }else {
                int text = Integer.parseInt(text1);
                if (text >= 5) {
                    System.out.println(text + "층에서 엘리베이터를 호출합니다.");
                    System.out.println("승강기 A가" + text + "층으로 이동하였습니다.");
                    afloor = text;
                } else if (text <= 5) {
                    System.out.println(text + "층에서 엘리베이터를 호출합니다.");
                    System.out.println("승강기 B가" + text + "층으로 이동하였습니다.");
                    bfloor = text;
                }
            }
        }

//        // inputText가 "4" 인 경우
//        int floor = Integer.parseInt(inputText);
//
//        // 입력받은 층에 대한 엘리베이터 A와의 위치 차이 구하기
//        int diffA = Math.abs(elvatorA - floor); // 10 - 8 = 2
//
//        // 입력받은 층에 대한 엘리베이터 B와의 위치 차이 구하기
//        int diffB = MethodMain.myAbs(elvatorB - floor); // 4 - 8 = -4 가 아닌 4가 나오게된다(math.abs)함수 사용

        // 층수 차이가 같으면 위층에 있는 엘리베이터가 이동
//        if(elevator A > elevator B){
//
//        }





    }
}





