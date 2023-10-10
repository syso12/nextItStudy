package ch_08_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {
        // 리스트(ArrayList)
        // 배열과의 차이점 생각하면서 하자
        // 배열은 문자열을 담지못함

        // 리스트 객체 선언
        ArrayList<String> students = new ArrayList<String>();
        ArrayList<String> students2 = new ArrayList<>(); // 왼쪽에 String을선언 했기 때문에 오른쪽은 생략가능
        // 다형성을 이용한 선언
        List<String> students3 = new ArrayList<>();
        // 셋다 같음

        // <> ->제너릭 안에는 참조타입 객체만 담을수있다.
        // 숫자를 담는 컬렉션 리스트를 선언하고자 한다면??
        // 기본타입의 경우 Wrapper Class를 이용한다.
        // int타입을 담고싶다면 int 대신 Integer를 넣자
        ArrayList<Integer> intList = new ArrayList<>();

        // Wrapper Class는 기본 타입의 데이터를 참조 타입의 객체로
        // 사용해야하는 경우 사용된다.

        int num = 23;

        // 기본타입의 데이터를 Wrapper Class의 객체로 변환
        // = 박싱(boxing)
        // deprecated => 지원종료
        Integer numObj = num; // 오토박싱
        System.out.println(numObj + 7); // 기본타입 int와 별차이 못느낌

        // Wrapper Class에 저장된 값을
        // 기본 타입의 데이터로 꺼내기
        // = 언박싱(Unboxing)
        int val = numObj.intValue();
        System.out.println(val);

        // 오토 언박싱
        int val2 = numObj;

        // 오토박싱과 오토언박싱이 자동으로 이루어지기 때문에
        // 기본타입에 대해 Wrapper Class를 이용한다해도
        // 아무런 불편함을 느끼지 못한다.


        System.out.println("\n==========================================\n");

        // ArrayList에 값 담기
        // .add() 사용
        intList.add(1); // 1담기
        intList.add(2); // 2담기
        intList.add(3); // 3담기
        intList.add(4); // 4담기
        intList.add(5); // 5담기
//        intList.add(1, 2, 3, 4, 5); // 한번에 여러개 값 못담음


        // 배열과 달리 컬렉션은 println()에 찍어보면
        // 내부요소들이 잘 출력이 된다.
        // 배열모양으로 출력됨
        System.out.println(intList);

        students.add("지우");
        students.add("성복");
        students.add("장선");
        students.add("태곤");
        students.add("창연");
        // 제너릭 타입과 일치하는 데이터만 추가 가능
//        students.add(10);
        // 위에서 입력한 순서대로 출력됨
        System.out.println(students);

        System.out.println("\n===============================================\n");

        // 리스트의 길이를 리턴
        // .size()
        // students에 .add를 5명 햇기때문에 5가 나온다
        System.out.println(students.size());

        // 값이 들어있지않으면 size는 0
        ArrayList<String> tempList = new ArrayList<>();
        System.out.println(tempList.size());

        // 인덱싱
        // .get(인덱스)
        // 인덱스값 가져오기 (배열은 [2])
        System.out.println(students.get(2));


        // 해당 인덱스의 값 변경
        // .set(인덱스, 변경값)
        students.set(2, "유민");
        System.out.println(students);

        // .contains(객체) -> 객체란 리스트 안의 값
        // 리스트 안에 해당 객체가 존재하면 true, 없으면 false 리턴
        // 나중에 클래스로 만든 객체들을 담게되면 잘 동작 안한다.
        System.out.println(students.contains("유민"));
        System.out.println("\n=========================================\n");

        // .indexof(객체)
        // 리스트 안에 해당 객체가 존재하면 해당 인덱스 리턴, 없으면 -1 리턴
        System.out.println(students.indexOf("유민"));
        System.out.println("\n=========================================\n");
        // .isEmpty()
        // 리스트가 비어있으면 true, 아니면 false 리턴
        // .size() == 0 와 같다.
        System.out.println(students.isEmpty());
        System.out.println(students.size() == 0);

        // .remove()
        // 해당 인덱스의 데이터를 삭제
        students.remove(2);
        System.out.println(students);
        System.out.println(students.size()); // 삭제후 size가 줄어든다.
        System.out.println(students.get(2)); // 삭제후 인덱스가 한칸씩 당겨짐

        // .clear()
        // 리스트를 비움(size가 0이 됨)
        students.clear(); // 기존에 생성된 리스트 내부요소 제거
        System.out.println(students);

        // 리스트를 초기화해도 된다.(Init)
        // 재 정의를 통해서 리스트를 초기화 하는 느낌
        students = new ArrayList<>(); // 새롭게 생성된 빈 리스트로 변경

        System.out.println("\n=============================================\n");

        // for문으로 ArrayList 내부 요소 제어
        students.add("지우");
        students.add("성복");
        students.add("장선");
        students.add("태곤");
        students.add("창연");

        // 학생 이름 앞에 넘버링 추가
        // 1. 지우
        // 2. 성복
        // 3. 장선
        // 4. 태곤
        // 5. 창연

        // 배열은 .length 리스트는 .size()
        for(int i = 0; i < students.size(); i++) {
            students.set(i,(i+1) + ". " +  students.get(i));
        }
        System.out.println(students);

        System.out.println("\n=============================================\n");

        // 리스트의 정렬 (기본 오름차순정렬)
        Collections.sort(intList);
        System.out.println(intList);

        Collections.sort(intList, Collections.reverseOrder());
        System.out.println(intList);



    }
}
