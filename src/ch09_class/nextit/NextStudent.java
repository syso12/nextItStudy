package ch09_class.nextit;

public class NextStudent {
    String name;  /* 학생의 이름 */
    int age;      /* 학생의 나이 */
    int level = 1;    /* 학생의 레벨(기본값 1 부여)  */
    int exp;      /* 학생의 경험치(경험치가 100이되면 레벨업) */

    // 파라미터를 입력받지 않는 기본 생성자
    // 클래스 내에 생성자를 별도로 만들어 주지 않으면
    // 보이지않더라도 기본적으로 존재한다.
    NextStudent(){

    }

    // 파라미터를 입력받는 생성자 만들기
    // 컨트롤 + 알트 + s 컨트로럭트와 같은 값
    NextStudent(String name, int age, int level, int exp){
        // this는 현재 객체를 의미
        // 현재 객체의 필드변수에 생성자를 파라미터로 들어온 값 부여
        this.name = name;
        this.age = age;
        this.level = level;
        this.exp = exp;
    }

    NextStudent(String name, int age, int exp){
//        this.name = name;
//        this.age = age;
//        this.exp = exp;
        // this() 는 현재 객체의 생성자를 의미
        this(name, age, 1, exp);
    }

    // .toString() 메소드 오버라이딩
    // 단축키 [Alt + insert] - toString() 클릭
    // 이클립스에서 [Ctrl + Alt + s] 와 같음
    @Override
    public String toString() {
        return "NextStudent{" +
                "이름: '" + name + '\'' +
                ", 나이: " + age +
                ", 레벨: " + level +
                ", 경험치: " + exp +
                '}';
    }

    public void printState(){
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("레벨: " + level);
        System.out.println("경험치: " + exp);
    }



    // 하루가 지날때 실행
    // 경험치를 얻고, 경험치가 100이상이 되면 레벨업 시킴
    public void oneDayLater(){
        exp += (int)(Math.random() * 31)+ 10;

        if(exp >= 100){
            level += 1;
            exp %= 100;
            System.out.println("레벨업!! 레벨이 " + level + "가 되었습니다");
        }
        System.out.println("현재 경험치" + exp);
    }


}
