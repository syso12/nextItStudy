package sungbok.submit07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Submit07 {
    public static void main(String[] args) {
        // 1번문제
        // 10~20 까지 랜덤 출력후
        // 중복 제거 하기

        // 10~20까지 의 리스트를 for문을 돌려서 만들기
        // 랜덤숫자 10번 만들기
        // = 랜덤숫자 생성하면서 담는 행동 10번 반복
        // 생성된 숫자를 리스트에 담기



//        intList.add(1);
//        System.out.println(intList);
//        for(int a = 9; a <= 20; a++){
//            a++;
//            System.out.println(a);
//        }






        ArrayList<Integer> intList = new ArrayList<>();
        int num = 9;
        for(int i = 0; i < 10; i++){
           num = (int)(Math.random() * 11);
            num++;
            intList.add(num+9);
        }
        System.out.println(intList);

        ArrayList<Integer> noList = new ArrayList<>();
//        for(int i = 0; i < intList.size(); i++){
//            if( )
//        }]
        // 구글링해서 풀어봄 (이해가 안감)
//        for(Integer a : intList){
//            if(!noList.contains(a)){
//                noList.add(a);
//            }
//        }

        for(int i = 0; i < intList.size(); i++){

            // 13
            // 13 11 18 17 10 14
            if(!noList.contains(intList.get(i))){
                noList.add(intList.get(i));
            }
        }

        System.out.println("중복 안되는숫자" + noList);

        Collections.sort(noList);

        System.out.println("오름차순" + noList);

        Collections.sort(noList,Collections.reverseOrder());

        System.out.println("내림차순" + noList);
        System.out.println(("\n==============================================\n"));
        // 2번 문제
        // 아내와 남편이 사고싶은 물건 교집합 합집합 나타내기

        ArrayList<String> wife = new ArrayList<>();
        wife.add("냉장고");
        wife.add("로봇청소기");
        wife.add("세탁기");
        wife.add("에어컨");

        ArrayList<String> man = new ArrayList<>();
        man.add("노트북");
        man.add("TV");
        man.add("에어컨");
        man.add("플레이스테이션");
        man.add("로봇청소기");

//        wife.retainAll(man);
//        System.out.println("같이 사고싶은거 " + wife.toString());
//
//        wife.addAll(man);
//        System.out.println("함께 사고싶은거 " + wife.toString());

        ArrayList<String> twin = new ArrayList<>();
//        for(int i = 0; i < wife.size(); i++){
//            if(wife.contains(man.get(i))){
//                twin.add(wife.get(i));
//            }
//        }
        for(int i = 0; i < wife.size(); i++){
            if(man.contains(wife.get(i))){
                twin.add(wife.get(i));
            }
        }
        System.out.println("공통 사고싶은거" + twin);

        twin = new ArrayList<>();
        twin = wife;

        for(int i = 0; i < wife.size(); i++) {
            if(man.contains(wife.get(i))){
                twin.add(wife.get(i));
            }else{
                twin.add(wife.get(i));
            }
        }
        System.out.println("둘다 사고싶은거" + twin);







    }
}
