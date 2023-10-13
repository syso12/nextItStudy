package sungbok.submit09.q02;

import java.util.ArrayList;
import java.util.Scanner;

public class FishingMain {
    public static void main(String[] args) {
        // 바다속 물고기 목록
        ArrayList<Fish> fishList = new ArrayList<>();

        fishList.add(new Fish("고등어", 5000));
        fishList.add(new Fish("광어", 25000));
        fishList.add(new Fish("우럭", 27000));
        fishList.add(new Fish("참돔", 30000));
        fishList.add(new Fish("돌돔", 35000));
        fishList.add(new Fish("능성어", 70000));
        fishList.add(new Fish("다금바리", 120000));

        Scanner scan = new Scanner(System.in);


// 잡은 물고기를 담을 가방
        ArrayList<Fish> fishBag = new ArrayList<>();

        while(true) {
            System.out.println("행동을 선택해주세요.");
            System.out.println("1. 낚시하기 | 2. 잡은 물고기 목록 | 3. 떠나기");
            System.out.print(">>> ");

            int select = Integer.parseInt(scan.nextLine());

            if(select == 1) {
                // TODO 낚시하기
                // 물고기 잡기 랜덤으로
                int temp = (int)(Math.random() * fishList.size());
                System.out.println(fishList.get(temp).getName() + "를 잡았다!!!");
                fishBag.add(fishList.get(temp));
                // 물고기를 잡아 잡은 고기를 출력
                // 잡은걸 bag에 저장 (fishbag)
                // fishbag이라는 리스트에 담는다.(.add)
            }else if(select == 2) {
                // TODO 잡은 물고기 목록 보기
                // fiahbag에 있는 물고기와 가격 출력
                // 합산 가격만 따로 출력
                // 리스트에서 더하기
                for(int i= 0; i < fishBag.size(); i++){
                    System.out.println(fishBag.get(i));
                }
                int catchfish = 0;
                for(int i = 0; i < fishBag.size(); i++){
                   catchfish+=fishBag.get(i).price;
                }
                System.out.println("총" + catchfish + "원");
            }else if(select == 3) {
                // TODO 종료
                break;
            }
            System.out.println();
        }


    }
}
