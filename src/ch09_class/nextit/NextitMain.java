package ch09_class.nextit;

import ch09_class.school.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class NextitMain {
    public static void main(String[] args) {
        String gyName = "강연";
        int gyAge = 27;
        int gyLevel = 1;
        int gyExp = 40;

        String ymName = "유민";
        int ymAge = 27;
        int ymLevel = 1;
        int ymExp = 30;

        // 하루가 지나서 경험치가 오른다.
        gyExp += 30;
        ymExp += 30;

        // 이틀이 지나서 경험치가 오른다.
        gyExp += 30;
        ymExp += 30;

        // 삼일이 지나서 경험치가 오른다.
        gyExp += 30;
        ymExp += 30;

        // 경험치가 100이상이 되면 레벨업
        if(gyExp >= 100){
            gyLevel++;

            // exp가 120일때 레벨업 -> exp 20 남도록
            gyExp %=100;
        }
        if(ymExp >= 100){
            ymLevel++;
            ymExp %=100;
        }

        // 상태확인
        System.out.println(gyName);
        System.out.println(gyLevel);
        System.out.println(gyExp);

        System.out.println(ymName);
        System.out.println(ymLevel);
        System.out.println(ymExp);

        System.out.println("\n==================================\n");

        // 클래스로 부터 객체 생성
        NextStudent gangyeon = new NextStudent();

        // 객체의 속성(=필드변수)에 접근
        System.out.println(gangyeon.name);
        System.out.println(gangyeon.age);
        System.out.println(gangyeon.level);
        System.out.println(gangyeon.exp);

        // 필드 변수에 값을 담아주지 않으면
        // 생성된 객체의 필드 변수들은 초기값(default) 인 상태
        // 숫자 : 0, boolean : false, 참조타입 : null -> 이러한 기본값들을 가짐

        gangyeon.name = "강연";
        gangyeon.age = 27;
        gangyeon.level = 1;
        gangyeon.exp = 40;

        // ch09_class.nextit.NextStudent@4617c264
        // 이러한 결과값이 나옴
        System.out.println(gangyeon);


        System.out.println(gangyeon.name);
        System.out.println(gangyeon.age);
        System.out.println(gangyeon.level);
        System.out.println(gangyeon.exp);

        // 하루가 지남
        gangyeon.exp += 30;
        System.out.println(gangyeon.exp);

        // 이틀이 지남
        gangyeon.exp += 30;
        System.out.println(gangyeon.exp);

        // 레벨업 과정
        // 레벨업을 하면 남은경험치도 쪼개준다.
        if(gangyeon.exp > 100){
            gangyeon.level += 1;
            gangyeon.exp %= 100;

        }

        // 삼일이 지남
        // 객체의 메소드 실행
        gangyeon.oneDayLater();

        System.out.println("\n==========================================\n");

        NextStudent yumin = new NextStudent();
        Scanner scan = new Scanner(System.in);

        yumin.name = "유민";
        yumin.age = 27;
        yumin.level = 1;
        yumin.exp = 30;

        // 1~3일이 지남
        yumin.oneDayLater();
        yumin.oneDayLater();
        yumin.oneDayLater();

        // 동일한 클래스로부터 생성된 객체들은
        // 같은 속성(필드변수)과 메소드를 가지고 있으나
        // 속성의 값은 개별적이다.

        // 한번에 속성값 확인하기
        // 객체를 println()에 집어 넣었을때
        // toString()의 리턴값이 출력된다.
        System.out.println(gangyeon.toString());
        // System.out.println("NextStudent{name='강연', age=27, level=2, exp=38}"); 와 같음
        System.out.println(yumin);

        // toString()이 있으면 필요없음
        gangyeon.printState();
        yumin.printState();

        System.out.println("\n=========================================================\n");

        // 필드값을 입력받는 생성자(Constructor)로 객체를 생성하기
        // new NextStudent() 에서 NextStudent()을 생성자라고 부른다.
        // 파라미터를 입력받지 않는 생성자를 기본 생성자라고 부른다.
        NextStudent minjae = new NextStudent("민재", 21, 1, 30);

        System.out.println(minjae);

        // 나머지 학생들 중 2명을 객체로 만들기
        NextStudent dongwoo = new NextStudent("동우",21,1,80);
        NextStudent taegon = new NextStudent("태곤",36,1,50);

        System.out.println(dongwoo);
        System.out.println(taegon);

        // 생성자를 추가해서 level = 1을 굳이 입력하지 않아도 되도록 만들기
        // 생성자를 만들때 level = 1을 미리 설정하면 된다.
        NextStudent jiwoo = new NextStudent("지우",27,80);
        System.out.println(jiwoo);


        System.out.println("\n==============================================\n");

        // 객체의 복사
        NextStudent jiwooBot = jiwoo;

        System.out.println(jiwooBot);
        System.out.println(jiwoo);

        jiwooBot.name = "지우봇";
        System.out.println(jiwooBot);
        System.out.println(jiwoo);

        NextStudent taegonBot = new NextStudent(taegon.name, taegon.exp, taegon.age, taegon.level);

        taegonBot.name = "태곤봇";
        System.out.println(taegonBot);
        System.out.println(taegon);



        // 하루가 지났습니다....
        gangyeon.oneDayLater();
        yumin.oneDayLater();
        jiwoo.oneDayLater();
        dongwoo.oneDayLater();
        taegon.oneDayLater();

        // 이틀이 지났습니다....
        gangyeon.oneDayLater();
        yumin.oneDayLater();
        jiwoo.oneDayLater();
        dongwoo.oneDayLater();
        taegon.oneDayLater();

        // 여러개의 객체를 한번에 다루기
        ArrayList<NextStudent> stuList = new ArrayList<>();

        stuList.add(gangyeon);
        stuList.add(yumin);
        stuList.add(jiwoo);
        stuList.add(dongwoo);
        stuList.add(taegon);

        System.out.println(stuList);

        for(int i = 0; i < stuList.size(); i++){
            System.out.println(stuList.get(i));
        }

        // 하루가 더 지났습니다....
        for(int i = 0; i < stuList.size(); i++){
            stuList.get(i).oneDayLater();
        }
        System.out.println("\n=======================================================\n");
        // 향상된 for문
        for( NextStudent stu : stuList ){
            System.out.println(stu);
        }

        // 5일이 한번에 지난다.
        for(int k = 0; k < 100; k++){
            for(int i = 0; i < stuList.size(); i++){
                stuList.get(i).oneDayLater();
            }
        }
        for( NextStudent stu : stuList ){
            System.out.println(stu);
        }

        // 굳이 객체를 변수에 담은 후 리스트에 추가하지않아도 된다.
        NextStudent jangseon = new NextStudent("장선", 30, 30);
        stuList.add(jangseon);

        stuList.add(new NextStudent("창연", 34, 80));
        for( NextStudent stu : stuList ){
            System.out.println(stu);
        }

        System.out.println("\n========================버블============================\n");

        // stuList에 담겨있는 학생들의 레벨을 기준으로 정렬
        // 버블정렬

        for (int k = 0; k < stuList.size(); k++) {
            for (int i = 0; k < stuList.size(); k++) {
                // -1이 붙는거 알아보기 (모르겟음)
                // 왼쪽이 오른쪽보다 큰지 비교
                if (stuList.get(i).level < stuList.get(i + 1).level) {
                    // 왼쪽이 오른쪽보다 작은지 비교
                    // if(intArr[i] < intArr[i+1]) { 등호를 바꾸면 내림차순
                    // 자리 바꾼다.
//                swap(intArr, i, i+1);
                    NextStudent tmp = stuList.get(i);
                    // numList.get(i+1) : numList 요소 중 인덱스 i+1
                    stuList.set(i, stuList.get(i + 1));
                    stuList.set(i + 1, tmp);
                }
            }
        }
        // 등수와 함께 출력
        for(int i = 0; i < stuList.size(); i++){
            System.out.println((i+1) + "등. " + stuList.get(i));
        }

        System.out.println("\n=====================버블======================\n");

        // Collections.sort() 사용
        // stuList.get(i) < stuList.get(i+1) 와 유사한 상태가 되어서
        // 정렬을 시킬 수 없음
        // -> 정렬 기준을 알려주면 해결가능
        Collections.sort(stuList, new Comparator<NextStudent>() {
            @Override
            public int compare(NextStudent stuA, NextStudent stuB) {
                // 기준
                // 왼쪽 stuA level에서 오른쪽 stuB level을 뺀값이
                // 양수인지 음수인지에 따라 내부적으로 자리를 바꾼다.
                // stuA.level - stuB.level : 오름차순
                // stuB.level - stuA.level : 내림차순
                return stuA.level - stuB.level;
            }
        });
        // 등수와 함께 출력
        // 위 compare의 식과 같다 (세개가 동일한 값)
        for(int i = 0; i < stuList.size(); i++){
            System.out.println((i+1) + "등. " + stuList.get(i));
        }
        // 위 compare의 식과 같다 (세개가 동일한 값)
        Collections.sort(stuList,(stuA, stuB) -> stuB.level - stuA.level);
        Collections.sort(stuList,(stuA, stuB) -> {
            return stuB.level - stuA.level;
        });


        Student naruto = new Student();

        System.out.println(naruto);

        // System.out.println(naruto.name);
        // System.out.println(naruto.kor);



    }


}
