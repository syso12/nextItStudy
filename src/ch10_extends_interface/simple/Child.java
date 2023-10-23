package ch10_extends_interface.simple;


// Child는 Parent를 상속받는 클래스다.
// = 클래스 이름 옆에 extends Parent을 작성해준다.
public class Child extends Parent {
    // 자식 extends 부모

    public Child(String name, int age) {
        // super는 부모의 객체를 의미
        // super()는 부모의 생성자를 의미
        // this는 현재 객체를 의미
        super(name, age);
    }

    public Child() {
    }

    //  부모가 가진 메소드를 자식클래스에서 재정의
    // Override(부모클래스의 메소드를 자식클래스에서 재정의하게 하는 명령어)
    @Override
    public void hello() {

//        super.hello(); // 부모의 hello 메소드가 실행
        System.out.println("아이인 " + name + "입니다.");
    }
}
