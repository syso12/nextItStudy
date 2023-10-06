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
            for(int i = 0; i < nameList.length; i++){
                String list = nameList[i].substring(0,1);
                if(list.equals("이")) {
                    count++;
                }

            }
        System.out.println("이씨 성을 가진 연예인은 총" + count + "명 입니다.");


        // 2번 최댓값 최솟값 구하기
        int[] intArr = {23, 456, 213, 32, 464, 1, 2, 4};
        Arrays.sort(intArr);
        System.out.println(intArr[intArr.length-1]);

        int num = 0;
        for(int i = 0; i < intArr.length; i++){
            intArr[i] *= -1;
        }
        Arrays.sort(intArr);
        for(int i = 0; i < intArr.length; i++){
            intArr[i] *= -1;
        }
        System.out.println("최대값은: " + intArr[0]);
        Arrays.sort(intArr);
        System.out.println("최소값은: " + intArr[0]);


        // 3번 로또 만들기
        int[] myLotto = makeLotto();
        for(int i = 0; i < myLotto.length; i++){
            System.out.println(myLotto[i] + " ");
        }




    } // 메인 끝
    public static int makeLotto(int num) {
//        int lotto [] = new int [6];
        for(int i = 0; i < lotto.length; i++) {
            lotto[i] = (int)(Math.random() * 45) +1;
            num++;
        }
    return num;
    }

}
