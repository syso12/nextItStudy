package ch10_extends_interface.mysort;

public interface MyComparator<T> {

    // myComparator를 소환할때 <T>에 입력한 객체가
    // 메소드의 T에 적용된다.
    public boolean mycompare(T a, T b);
}
