package ch_08_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {
    public static void main(String[] args) {
        // Set은 우리가 직접적으로 만들어서 사용하는 경우는 드묾
        // 배열처럼 잘 쓰이지않음)
        // 하지만 사용법은 잘 알아두어야 한다.

        // 집합(Set -> HashList)의 선언
        HashSet<String> stuSet = new HashSet<String>(); // <>안의 타입은 생략가능(ArrayList 와같음)
        HashSet<String> stuSet2 = new HashSet<>();

        // 다형성 이용
        Set<String> stuSet3 = new HashSet<>();

        // .add() 값을 추가
        stuSet.add("유민");
        stuSet.add("민재");
        stuSet.add("강연");
        stuSet.add("태곤"); // 위의 세개의 값먼저 출력하고 추가했는데 맨앞으로 나옴

        // 값 확인
        // 담고 있는 데이터의 순서가 존재하지않는다.
        System.out.println(stuSet);

        // 중복된 값이 들어가지 않는다.
        stuSet.add("태곤");
        System.out.println(stuSet);

        System.out.println("\n===============================================\n");

        // .contains(객체)
        // 해당 객체가 Set 안에 있으면 true, 없으면 false
        System.out.println(stuSet.contains("태곤"));

        // .index는 인덱스 값이 없기때문에 존재하지않음

        // .size()
        // Set 내부 요소 개수 리턴
        System.out.println(stuSet.size());

        System.out.println("\n==================================================\n");

        // Set 내부 요소 순회

        // 1. while문 사용
        // 각각의 요소에 접근
        Iterator<String> iterator = stuSet.iterator();
        while (iterator.hasNext()){
            String stu = iterator.next();
            System.out.println(stu);
        }

        System.out.println("\n====================================================\n");

        // 2. 향상된 for문 사용
        // foreach사용방법
        // for ( 뽑아낸 값을 담을 변수명 : 값을 뽑아내는곳)
        for( String stu : stuSet ){
            System.out.println(stu);
        }

        // 3. forEach문 사용
        stuSet.forEach(stu -> {
            System.out.println(stu);
        });

        System.out.println("\n================================================\n");

        // Set 중복을 허용하지 않는 특성을 이용한
        // 중복제거

        ArrayList<Integer> intList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            int rand = (int)(Math.random() * 11) + 10;
            intList.add(rand);
        }
        System.out.println(intList);

        HashSet<Integer> intSet = new HashSet<>();
        // intList 내부 요소들이 intSet에 담김
        intSet.addAll(intList);
        System.out.println(intSet); // 중복된 데이터는 하나만 남게 된다.

        intList.clear();
        // intSet 내부 요소들이 intList에 담김
        intList.addAll(intSet);
        System.out.println(intList); // 순서는 망가져있다.












    }
}
