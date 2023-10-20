package sungbok.submit11;

import java.util.ArrayList;

public class MaunalDB {
    private static ArrayList<Manual> diceRule = new ArrayList<>();

    private MaunalDB(){

        diceRule.add(new Manual(diceRule.size()+1, "Aces", "1이 나온 주사위 눈의 총합. 최대 5점", "⚀ ⚀ ⚀ ⚄ ⚅ = 3점"));

        diceRule.add(new Manual(diceRule.size()+1, "Deuces", "2이 나온 주사위 눈의 총합. 최대 10점", "⚁ ⚁ ⚁ ⚄ ⚅ = 6점"));

        diceRule.add(new Manual(diceRule.size()+1, "Threes", "3이 나온 주사위 눈의 총합. 최대 15점", "⚂ ⚂ ⚂ ⚄ ⚅= 9점"));
        diceRule.add(new Manual(diceRule.size()+1,"Fours", "4가 나온 주사위 눈의 총합. 최대 20점", "⚀ ⚁ ⚃ ⚃ ⚃  = 12점"));
        diceRule.add(new Manual(diceRule.size()+1, "Fives", "5가 나온 주사위 눈의 총합. 최대 25점", "⚀ ⚁ ⚄ ⚄ ⚄  = 15점"));
        diceRule.add(new Manual(diceRule.size()+1, "Sixes", "6이 나온 주사위 눈의 총합. 최대 30점", "⚀ ⚁ ⚅ ⚅ ⚅  = 18점"));
        diceRule.add(new Manual(diceRule.size()+1, "Bouns+35", "Aces부터 Sixes까지 더한 눈의 총합이 63점을 넘으면 추가 35점", "63점+35"));
        diceRule.add(new Manual(diceRule.size()+1, "Choice", "주사위 눈 5개의 총합. 최대 30점", "⚂ ⚃ ⚄ ⚅ ⚅  = 24점"));
        diceRule.add(new Manual(diceRule.size()+1, "4 of kind", "동일한 주사위 눈이 4개 이상일때, 주사위 눈 5개의 총합. 최대 30점", "⚄ ⚅ ⚅ ⚅ ⚅  = 29점"));
        diceRule.add(new Manual(diceRule.size()+1, "Full House", "주사위를 3개,2개로 묶었을때 각각의 묶음 안에서 주사위 눈이 서로 동일할때, 주사위 눈5개의 총합.최대 30점", "⚄ ⚄ ⚅ ⚅ ⚅  = 28점"));
        diceRule.add(new Manual(diceRule.size()+1, "Small Stright", "이어지는 주사위 눈이 4개 이상일때 고정 15점", "⚀ ⚁ ⚂ ⚃ ⚅  = 15점"));
        diceRule.add(new Manual(diceRule.size()+1, "Large Stright", "이어지는 주사위 눈이 5개 일때 고정 30점", "⚀ ⚁ ⚂ ⚃ ⚄ = 30점"));
        diceRule.add(new Manual(diceRule.size()+1, "Yacht", "동일한 주사위 눈이 5개일때 고정 50점", "⚀ ⚀ ⚀ ⚀ ⚀ = 50점"));
    }
    private static MaunalDB instance = new MaunalDB();

    public static MaunalDB getInstance(){return instance;}

    // 족보 확인 메소드 출력하기
    public static void readMaunal(){
        for(int i = 0; i < diceRule.size(); i++){
            System.out.println(diceRule.get(i));
        }
    }
}
