package sungbok.submit09.q02;

import ch09_class.common.UtilClass;

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

        // 낚시대의 상태
        boolean isBroken = false;

        // 미끼의 갯수
        int count = 10; // 낚시를 할때마다 미끼가 1개씩 줄고, 미끼가 0개면 낚시 불가능

        while(true) {
            System.out.println("행동을 선택해주세요.");
            System.out.println("1. 낚시하기 | 2. 잡은 물고기 목록 | 3. 떠나기");
            System.out.print(">>> ");

            int select = Integer.parseInt(scan.nextLine());

            if(select == 1) {

                if(isBroken){
                    System.out.println("낚시대가 부러져 더이상 낚시를 할수없다.");
                    continue;
                }
                if(count == 0){
                    System.out.println("미끼가 부족해서 더이상 낚시를 할수없습니다.");
                    continue;
                }
                // TODO 낚시하기
                // 물고기 잡기 랜덤으로
                // 낚시하기 선택시
                // 다금바리 5%확률
                // 능성어 10%확률
                // 돌돔 12%확률
                // 참돔 13%확률
                // 우럭 15%
                // 광어 15%
                // 고등어 30% 확률로 잡히도록 코드수정
                // 1~100 랜덤 정수 생성 ( = 물고기 낚을 확률)
                int rand = (int)(Math.random() * 100) +1;
                int idx = (int)(Math.random() * fishList.size());
                // rand -> 1~10 -> 10%
                if(rand <= 5){ // 5%확률
                    // 다금바리
                    idx = 6;
                   // count--;
                    System.out.println("남은 미끼갯수" + count);
                }else if(rand <= 15){ // 10%
                    idx = 5;
                   // count--;
                    System.out.println("남은 미끼갯수" + count);
                }else if(rand <= 27){ // 12%
                    idx = 4;
                   // count--;
                    System.out.println("남은 미끼갯수" + count);
                } else if (rand <= 40) { // 13%
                    idx =3;
                   // count--;
                    System.out.println("남은 미끼갯수" + count);
                }else if(rand <= 55){ // 15%
                    idx = 2;
                   // count--;
                    System.out.println("남은 미끼갯수" + count);
                }else if(rand <= 70){ // 15%
                    idx = 1;
                   // count--;
                   // System.out.println("남은 미끼갯수" + count);
                }

                // 5% 확률로 낚시대가 뿌셔질 수 있음
                // 낚시대가 뿌셔지면 더이상은 낚시하기 불가능
                // 1 ~ 100 랜덤 숫자 생성후 5이하인지 확인
                int randNum = UtilClass.makeRandom(1, 100);
                if(randNum <= 5){
                    // 낚시대가 부러진다.
                    System.out.println("낚시대가 부러진다.");
                    // 낚시대가 부러진 상태를 저장
                    isBroken = true;
                    continue;
                }

//                if(fishList == 100 % 5){
//                    fishList.getName()
//                }
                System.out.println(fishList.get(idx).getName() + "를 잡았다!!!");
                fishBag.add(fishList.get(idx));

                count--;
                System.out.println("남은 미끼" + count);
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
