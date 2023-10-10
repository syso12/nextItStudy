package sungbok.submit06;

import java.util.Arrays;

public class Submit06 {
    public static void main(String[] args) {
        // 1번 이씨 성을 찾아라
        String[] nameList = {"이정재", "김혜수", "이병헌", "송중기", "유아인", "류준열",
                "공유", "마동석", "이종석", "황정민", "박소담", "이선균", "이성민", "최민식", "이동휘",
                "권상우", "소지섭", "공효진", "조정석", "허성태", "이하늬"};
        // 이름을 각각 분리
        // 앞글자만 substring(0,1) 따오기
        // "이".equals 하기
        // 총 몇명인지 나타내기


//        String list = String.join(", ", nameList);
//        System.out.println(list);
        int count = 0;
        for (int i = 0; i < nameList.length; i++) {
            String list = nameList[i].substring(0, 1);
            if (list.equals("이")) {
                count++;
            }

        }
        System.out.println("이씨 성을 가진 연예인은 총" + count + "명 입니다.");

        int cou = 0;
        for (int i = 0; i < nameList.length; i++) {
            if (nameList[i].substring(0, 1).equals("이")) ;
            {
                cou++;
            }
        }
        System.out.println("이씨 성 " + cou);


        // 2번 최댓값 최솟값 구하기
        int[] intArr = {23, 456, 213, 32, 464, 1, 2, 4};
        Arrays.sort(intArr); // 기본이 오름차순 정렬 1, 2, 4, 23, 32, 213, 456, 464
        System.out.println(intArr[intArr.length - 1]);

        int num = 0;
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] *= -1;
        }
        Arrays.sort(intArr);
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] *= -1;
        }
        System.out.println("최대값은: " + intArr[0]);
        Arrays.sort(intArr);
        System.out.println("최소값은: " + intArr[0]);
        System.out.println("\n====================================================\n");
        System.out.println("최솟값: " + intArr[0]);

        System.out.println("최대값: " + intArr[intArr.length - 1]);  //??? 무슨말인지 공부하기

        // int.arr의 길이만큼 for문을 돌리고
        // 외부에 int값(0)을 변수로 놓고 intarr[i]값과 큰지 비교한후
        // 큰게 오면 멈추게 하면
        // max값이 옴
        // 반대로 하면 min값도 구할수잇음
        // 변수값과 [i]값 비교


        // 3번 로또 만들기
        // 1~45 사이의 랜덤숫자를 배열에 6개 담는다.
        // 중복된 숫자가 잇으면 안됨.
//        int[] myLotto = makeLotto();
//        for(int i = 0; i < myLotto.length; i++){
//            System.out.println(myLotto[i] + " ");
//        }
//
//
//
//
////    public static int makeLotto() {
////        int lotto [] = new int [6];
////        for(int i = 0; i < 6; i++) {
////            lotto[i] = (int)(Math.random() * 45) +1;
////            num++;
////        }
////    return num;
////    }
//
//        // 배열의 변수선언은 int뒤에다가 선언하는것!!
//        int[] lotto = new int[6]; // 0 ,0 ,0 ,0 ,0 ,0 6개
//        // 6번 반복하는 for문 -> 6자리 채워주기 위해
//        // 몇번 반복해야하는지 애매한 상황 => while문
//        for (int i = 0; i < lotto.length; i++) {
//            // 방금 생성된 랜덤 숫자 rand가 현재 lotto 배열안에 들어있는지 체크
//            int rand = (int) (Math.random() * 45) + 1;
//
//            for (int n = 0; n < lotto.length; n++) {
//                if (lotto[n] == rand) {
//                    // 방금 생성된 랜덤 숫자가 현재 배열 내에 존재함
//                    i--; // i-- 이 방식은 권장하지않음
//                }
//
//            }
//
//            lotto[i] = rand;
//
//        }
//
//
//
//        // 랜덤숫자 생성
//        int[]numArr = new int[6];
//        int idx = 0;
//        while(true){
//            int rand = (int)(Math.random()*45) + 1;
//
//            // 랜덤숫자가 현재 배열 내 존재하는지 체크
//            boolean isDuple = false;
//            for(int i = 0; i < numArr.length; i++) {
//                if(numArr[i]) == rand){
//                    // 랜덤 숫자가 현재 배열에 존재함
//                    isDuple = true;
//                }
//            }
//            // 위 for문이 끝날때까지 if문이 단 한번이라도 실행이 되었는지 체크
//            // isDuple이 false일때 rand를 배열에 담기
//            if(!isDuple){
//
//                numArr[idx] = rand;
//                idx++;
//            }
//            if(idx == 6){
//                break;
//            }
//        }
//    } // main 끝
//    public static int [] makeLotto(){
//        int[] numArr = new int[6];
//        int idx = 0;
//        while(true){
//            int rand = (int)(Math.random()*45) + 1;
//
//            // 랜덤숫자가 현재 배열 내 존재하는지 체크
//            boolean isDuple = false;
//            for(int i = 0; i < numArr.length; i++) {
//                if(numArr[i]) == rand){
//                    // 랜덤 숫자가 현재 배열에 존재함
//                    isDuple = true;
//                }
//            }
//            // 위 for문이 끝날때까지 if문이 단 한번이라도 실행이 되었는지 체크
//            // isDuple이 false일때 rand를 배열에 담기
//            if(!isDuple){
//
//                numArr[idx] = rand;
//                idx++;
//            }
//            if(idx == 6){
//                break;
//            }
//        }
//        // 정렬해주기
//        Arrays.sort(numArr);
//        return numArr;
//    }

    }
}

