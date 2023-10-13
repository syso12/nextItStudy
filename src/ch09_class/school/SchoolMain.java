package ch09_class.school;

import ch09_class.common.UtilClass;
import ch09_class.nextit.NextStudent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SchoolMain {
    public static void main(String[] args) {
        // 학교의 학생 성적 입력, 관리하는 프로그램 만들예정
        // 각 학생에 대해 객체로 만들어써야겠다.
        // 학생은 이름, 국어, 영어, 수학, 평균 을 가진다.

        Student minjae = new Student("민재", 65, 33, 42, (65+33+42)/3.0); // 객체 생성

        System.out.println(minjae);

        Student yumin = new Student("유민", 78, 82, 100);

        System.out.println(yumin);

        System.out.println(yumin.getMath());

        // 필드변수값 수정
        yumin.setMath(97);
        System.out.println(yumin);  // 평균이 변하지 않음

        // 필드변수 수정에 대한 제어
//        yumin.math
        yumin.setEng(83);
        System.out.println(yumin);

        // 점수가 몇이건 평균값을 지정해버리면 지정한값 그대로 나온다
        // 평균을 수정한다는건 있을 수 없는일...
        // 평균에 대한 setter를 지우기
//        yumin.setAvg(90.5);
        System.out.println(yumin);

        // 기본적으로 클래스 내 메소드는
        // 해당 클래스를 객체로 생성한 후 사용
//        Student.getMath()

        // Math 클래스 내 메소드를
        // Math를 객체로 생성하지 않아도 사용가능
        Math.random();
        Math.round(3.14);

        // static이 붙어있는 필드변수나 메소드는
        // 해당 클래스를 객체로 생성하지 않아도 사용가능
        UtilClass.myRound(3.1415,2);

        yumin.setKor(86);
        System.out.println(yumin);


        System.out.println("\n==========================================\n");

        ArrayList<Student> stuList = new ArrayList<>();

        stuList.add(minjae);
        stuList.add(yumin);
        stuList.add(new Student("지우", 76,98,75));
        stuList.add(new Student("강연", 86,88,85));
        stuList.add(new Student("동우", 77,99,64));

        for(int i = 0; i < stuList.size(); i++){
            System.out.println(stuList.get(i));
        }

        // stuList의 학생들의 평균을 이용해서
        // 종합성적표를 출력해보기
        // 1등 유민 국어: 86, 영어: 83, 수학: 97, 평균: 88.67
        // 2등 강연: 국어: 86, 영어: 88, 수학: 85, 평균: 86.33
        // ...
        // 평균에 대한 내림차순 나타내기

        // 사이즈만큼 돌아갈꺼고
        // for문으로 돌아가는 동안 구하기
        System.out.println("\n================================\n");
        for(int i = 0; i < stuList.size()-1; i++){
            for(int k = 0; k< stuList.size()-1; k++){
                if(stuList.get(i).getAvg() < stuList.get(i+1).getAvg()){
                    Student tmp = stuList.get(i);
                    stuList.set(i, stuList.get(i+1));
                    stuList.set(i+1,tmp);

                }

            }
            System.out.println(stuList.get(i));
        }
//        Collections.sort(stuList,(stuA, stuB) -> return (stuA.getAvg() - stuB.getAvg() < 0) ? -1 : 1)
//        Collections.sort(stuList,(stuA, stuB) -> {
//            int result = 1;
//            if(stuA.getAvg() - stuB.getAvg() < 0) {
//                return -1;
//            }
//            return result;
//        });
//        Collections.sort(stuList, new Comparator<Student>() {
//            @Override
//            public int compare(Student stuA, Student stuB) {
//                    return (stuA.getAvg() - stuB.getAvg() < 0) ? -1 : 1;
//                }
//
//        });



    }
}
