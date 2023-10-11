package sungbok.submit08;

import java.util.ArrayList;
import java.util.HashSet;

public class Submit08 {
    public static void main(String[] args) {
        // 1번문제 ArrayList와 HashSet을 이용해서 makeLotto를 만드시오
        // 먼저 빈 리스트를 HashSet을 하나 만들고
        // While문 내에서 빈 HashSet 랜덤 로또 번호를 HashSet 사이즈가
        // 6개 될때까지 담는다
        // 이후 HashSet을 ArrayList로 변환하고
        // 오름차순으로 정렬하여 리턴

        ArrayList<Integer> myLotto = makeLotto();
        System.out.println(myLotto);
    } // 메인 끝

    public static int makeLotto(){
        // 빈 hashSet 리스트 생성
        HashSet<Integer> randNum = new HashSet<>();
        while ()
    }

}
