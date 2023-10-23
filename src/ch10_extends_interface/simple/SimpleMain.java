package ch10_extends_interface.simple;

import java.util.*;

public class SimpleMain {
    public static void main(String[] args) {
        Parent miseon = new Parent("미선", 30);

        System.out.println(miseon);

        miseon.hello();

        Child jjanggu = new Child("짱구",5);


        // 기본적으로 자식클래스는
        // 부모클래스의 필드변수와 메소드를 사용할 수 있다.
        System.out.println(jjanggu); // 부모의 toString 실행


        // Parent에서 name,age사용가능 extends!!
        System.out.println(jjanggu.name);
        System.out.println(jjanggu.age);

        // 상속받는 hello도 사용가능 하다.
        jjanggu.hello();

        // 자식, 부모 간 형변환
        List<String> strList = new ArrayList<>();
        Set<String> strSet = new HashSet<>();
        Map<String, String> strMap = new HashMap<>();


        // 다형성 문제 => 면접 또는 정처기 문제
        // who.hello는 뭐가 오느냐
        // Parent 객체가 아닌 new 에 있는 Child객체의 값의 결과가 나온다.
        Parent who = new Child("짱아", 2);
        who.hello();
    }
}
