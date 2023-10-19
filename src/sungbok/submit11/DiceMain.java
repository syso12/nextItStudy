package sungbok.submit11;

import java.util.Arrays;
import java.util.Scanner;
// 야추 주사위
// 주사위클래스와 사람클래스를 따로두어서 사람이 주사위를 굴리도록 만든다
// 주사위의 족보는 ArrayList에 담아서 index값으로 하나하나 뽑아내도록 한다
// 점수계산은 정규표현식을 사용해서 &&(and)와 ||(or)를 이용해서 족보에 해당하는 점수가 되면 계산하자
// 야추주사위의 핵심은 내가 원하는 값이 나올때까지 주사위를 굴릴수 있다는것이다(총3번).
// 주사위의 랜덤 (math.random() + 6) + 1 을 하면 1~6까지 나온다
// 각 족보에 해당하는 점수는 딱 한번씩만 기록 가능
// 족보(13개)에 점수가 모두기록될때까지 주사위를 굴려 최종점수 합산
// 족보에 해당하지않으면 0점을 기록


public class DiceMain {
    public static void main(String[] args) {

        MaunalDB maunalDB = MaunalDB.getInstance();

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
                System.out.println("도박 중독 상담 번호 1336");
                System.out.println("나 자신과 가족을 지켜주세요");
                int [] dice = new int[5];
                    for(int i = 0; i < dice.length; i++){
                        dice[i]=(int)(Math.random() * 6) + 1;
                    }
                System.out.println("주사위 눈");
                System.out.println(Arrays.toString(dice));
                while (true){
                    System.out.println("행동을 선택해주세요");
                    System.out.println("1.주사위 굴리기 | 2.족보 확인하기 | 3. STOP");
                    int select = Integer.parseInt(scan.nextLine());
                    if(select == 1) {
                        System.out.println("keep할 주사위를 선택해주세요1");
//                        System.out.println(Arrays.toString(dice));
                        int [] choice = new int[5];
                        for(int a = 0; a < choice.length; a++){
                            choice[a]=(int)(Math.random() * 6) + 1;
                        }
                        int poket = Integer.parseInt(scan.nextLine());
                        choice[poket-1] = dice[poket-1];

                        System.out.println(poket + "가 담겼습니다");
                        System.out.println(Arrays.toString(choice));
                        System.out.println("------------------------");


                        System.out.println("keep할 주사위를 선택해주세요2");
                        int poket1 = Integer.parseInt(scan.nextLine());
                        choice[poket1-1] = dice[poket1-1];
                        System.out.println(Arrays.toString(choice));
                        int [] choice1 = new int[5];
                        for(int b = 0; b < choice1.length; b++){
                            choice1[b]=(int)(Math.random() * 6) +1;
                        }
                        int poket2 = Integer.parseInt(scan.nextLine());
                        choice1[poket2-1] = choice[poket2-1];
                        System.out.println(poket2 + "가 담겼습니다");


                        System.out.println("keep할 주사위를 선택해주세요3");
                        int poket3 = Integer.parseInt(scan.nextLine());
                        choice2[poket3-1] = choice1[poket3-1];
                        int [] choice2 = new int[5];
                        for(int c = 0; c < choice2.length; c++){
                            choice2[c]=(int)(Math.random() * 6) +1;
                        }
                        System.out.println(poket3 + "가 담겼습니다.");
                        System.out.println("최종 주사위는 " + Arrays.toString(choice2) +"입니다.");


                        // 배열에 있는 주사위 눈이 맘에들면 keep
                        // 배열의 인덱스를 추출하고 담기
                        // 맘에 드는 주사위 인덱스만큼 선택하게 하기
                        // keep한 주사위 빼고 나머지는 다시 돌리자(총3번)
                        // 어떻게?
                    } else if (select == 2) {
                        MaunalDB.readMaunal();
                    } else {
                        break;
                    }

                }
            } else if (command == 2) {
                // 족보 확인하기
                MaunalDB.readMaunal();
            } else if (command == 3) {
                // 점수 보기
            } else if (command == 4) {
                // 신고하기

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
