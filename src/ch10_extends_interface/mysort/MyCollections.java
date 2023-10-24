package ch10_extends_interface.mysort;

import ch09_class.school.Student;

import java.util.ArrayList;

public class MyCollections {

    // 객체의 타입에 대해 범용적으로 사용하기 위해
    // 객체의 타입 부분에 T를 표기한다.
    // T를 사용하는 메소드의 경우 리턴 타입 앞에 <T> 를 추가해준다.
    // T는 단순 변수?? 모르겟다
    public static <T> void mysort(ArrayList<T> list, MyComparator<T> comp) {
        for (int k = 0; k < list.size() - 1; k++) {
            for (int i = 0; i < list.size() - 1; i++) {
                    // if문 안에 true 혹은 false를 리턴하는
                    // 인터페이스의 추상 메소드를 삽입
                    if(comp.mycompare(list.get(i), list.get(i+1))){
                    // 자리 바꾼다.
                    T tmp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, tmp);
                }
            }
        }
    }
}
