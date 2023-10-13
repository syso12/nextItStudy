package ch09_class.school;

import ch09_class.common.UtilClass;

public class Student {


    // 필드변수를 private으로 두고
    // 필드변수에대핫 Getter, Setter를 만드는 행위
    // 캡슐화 라고 한다.(Encapsulation)
   private String name;
   private int kor;
   private int eng;
   private int math;
   private double avg;

    // 기본생성자는 자동으로 생성되어있다(보이지는 않음)
    // 값을 입력받는 생성자
    // 단축키 [Alt + Insert] - Constructor
    // 접근제어자
    // public : 해당 필드변수, 메소드, 생성자를 다른 패키지(폴더)에서 사용가능
    // private : 현재 파일 내에서만 사용 가능
    // (default) : 접근제어자 입력안한상태, 같은 패키지 내에서만 사용 가능
    // protected : 같은 패키지 내에서만 사용 가능 default와 같다고 볼수있다
    public Student(){

    }


    public Student(String name, int kor, int eng, int math, double avg) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        calAvg();
    }

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        calAvg();
    }

    @Override
    public String toString() {
        return name + ": 국어: " + kor +
                ", 영어: " + eng +
                ", 수학: " + math +
                ", 평균: " + avg;
    }

    // kor, eng, math 로 부터 평균을 계산하여 avg에 적용 메소드
    // myRound는 반올림 해주는 메소드 이름(생성한것)
    public void calAvg(){
        this.avg = UtilClass.myRound((kor+math+eng) / 3.0 , 2);
    }

    // 값을 넘겨주는 메소드
    public int getMath(){
        return math;
    }

    // 값을 수정하는 메소드
    public void setMath(int math){
        this.math = math;
        calAvg();
    }


    // private 인 필드변수에 대한 get메소드 set메소드를
    // Gettter Setter 라고 부른다.
    // [Alt + Insert] 를 이용하여 자동으로 만들 수 있다.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
        calAvg();
        // 값이 바뀌면 평균이 바뀌게끔 해야한다.
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
        calAvg();;
    }

    public double getAvg() {
        return avg;
    }


}
