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
        // 정답 (선생님이 풀어주심) 참고하기
//        for(int i = 0; i < 10; i++){ // 10번 반복 for문
//            // 10~20 랜덤숫자 생성
//            // Math.random() : 0~1 사이의 소수(1은 안나옴)
//            // Math.random() * 10 : 0~10사이의 소수(10은 안나옴)
//            // (int)(Math.random() * 10)+10 : 10~19 사이의 정수
//            // (int)(Math.random() * 11)+10 : 10~20 사이의 정수
//            // (int)(Math.random() * 45)+1 : 0~45 사이의 정수
//            // (int)(Math.random() * ?)+? : a~b 사이의 정수??? 아마도 () * b) + a 일듯
//            // 정답은 () * b - a + 1) + a : a~b 사이의 정수
//            int rand = (int)(Math.random() * 11) + 10;
//
//            // 생성된 숫자 intList에 담기
//            intList.add(rand);
//        }
//
//        // 중복된 숫자를 제거
//
//        // 새로운 빈 리스트 생성
//        ArrayList<Integer> newList = new ArrayList<>();
//
//        // intList를 순회하는 for문
//        for(int i = 0; i < intList.size(); i++) {
//            // newList에 intList의 값을 옮긴다.
//            // 값을 옮길때 newList 안에 intList.get(i)의 값이 존재하는지 체크
//            // 존재하지 않을때만 옮긴다.
//            if(newList.contains(intList.get(i)) == false) {
//                // 값이 존재함
//                newList.add(intList.get(i)); //intList의 숫자들이 가져와짐
//            }
//        }
//

        // 새로운 리스트 생성없이 remove로 중복제거
        // 정답 (선생님이 풀어주심) 참고하기
//        for(int i = 0; i < intList.size(); i++){
//            // i가 0일때, intList.get(0) 과 index 9,8,7,6,5,4,3,2,1 와 비교
//            // i가 1일때, intList.get(1) 과 index 9,8,7,6,5,4,3,2 와 비교
//            // i가 2일때, intList.get(2) 과 index 9,8,7,6,5,4,3 와 비교
//            for(int k = intList.size()-1; k > i; k--){
//                if(intList.get(i) == intList.get(k)){
//                    intList.remove(k);
//                }
//            }
//            intList.get(i)
//        }







//         내가 엉터리로 풀다 말은것
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

        // 정답(참고해서 복습하자)
//        // 아내가 사고싶은 물건 ["냉장고", "로봇청소기", "세탁기", "에어컨" , "식기세척기"]
//        ArrayList<String> wifeList = new ArrayList<>();
//        wifeList.add("냉장고");
//        wifeList.add("로봇청소기");
//        wifeList.add("세탁기");
//        wifeList.add("에어컨");
//        wifeList.add("식기세척기");
//        // 남편이 사고싶은 물건["노트북", "TV", "에어컨", "플레이스테이션", "로봇청소기"]
//        ArrayList<String> husList = new ArrayList<>();
//        husList.add("노트북");
//        husList.add("TV");
//        husList.add("에어컨");
//        husList.add("플레이스테이션");
//        husList.add("로봇청소기");
//
//        // 서로 사고싶은 물건 목록 (교집합)
//        ArrayList<String> bothList = new ArrayList<>();
//        for(int i = 0; i < wifeList.size(); i++){
////            wifeList.get(i)
//            // for문으로 husList를 순회해서
//            // wipeList.get(i)와 같은게 존재하는지 비교
//            for(int k = 0; k < husList.size(); k++){
//                if(wifeList.get(i) == husList.get(k)){
//                    bothList.add(wifeList.get(i));
//                }
//            }
////            if(husList.contains(wifeList.get(i))) { // contains는 클래스로 만든 객체를 담게 되면 잘 안된다
////                bothList.add(wifeList.get(i));
////            }
//        }
//        System.out.println("교집합" + bothList);
//
//        // 서로 사고싶은 물건 목록(합집합)
//        ArrayList<String> allList = new ArrayList<>();
//
//        for(int i = 0; i < wifeList.size(); i++){
//            allList.add(wifeList.get(i));
//        }
//        // allList.addAll(wifeList); 과 같음 (내가 구글링해서 풀은 방식 대신 교집합은 안됨)
//        for(int i = 0; i < husList.size(); i++){
//            // husList.get(i) 의 값이 allList 안에 없어야 추가
//            boolean isContain = false;
//            for(int k = 0; k < allList.size(); k++){
//                if(allList.get(k).equals(husList.get(i)) == true){
//                    isContain = true;
//
//                }
//                    }
//            // isContain의 값이 false일때 husList.get(i) 를 allList에 추가
//            if(isContain == false){
//                allList.add(husList.get(i));
//            }
//        }
//        System.out.println("합집합" + allList);


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
