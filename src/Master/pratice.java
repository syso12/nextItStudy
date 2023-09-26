package Master;
import java.util.Scanner;

public class pratice {
    public static void main(String[] args) {
//        String enigma = "너오구늘리뭐너먹구지리";
//        String ne = enigma.replace("너","");
//        System.out.println("1차암호 해독 [너 제거]: " + ne );
//
//        String gu = ne.replace("구","");
//        System.out.println("2차암호 해독 [구 제거]: " + gu );
//
//        String ri = gu.replace("리", "");
//        System.out.println("3차암호 해독 [리 제거]:" + ri);
//
//        System.out.println("해독완료!! -> " + ri);
//        System.out.println(ri);
//
//        System.out.println("\b===============================\b");
//        // 1번문제
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("이름을 입력해주세요");
//        System.out.print(">>>");
//        String name = sc.next();
//
//        System.out.println("국어점수를 입력해주세요");
//        System.out.print(">>>");
//        int ko = sc.nextInt();
//        System.out.println("수학점수를 입력해주세요");
//        System.out.print(">>>");
//        int ma = sc.nextInt();
//        System.out.println("영어점수를 입력해주세요");
//        System.out.print(">>>");
//        int en = sc.nextInt();
//
//        String grade;
//        double avg = (ko+ma+en)/3.0;
//
//        if(avg >= 90){
//            grade = "A";
//        } else if (avg >= 80 ) {
//            grade = "B";
//        }else grade = "C";
//
//        System.out.println("이름: " +  name);
//        System.out.println("국어: " + ko);
//        System.out.println("수학: " + ma);
//        System.out.println("영어: " + en);
//        System.out.printf("평균:"+ "%.2f" , avg);
//        System.out.println();
//        System.out.println("등급: " + grade);
//
//        System.out.println("\n======================================\n");
//        String idBack = "1231476";
//        idBack = idBack.substring(0,1);
//
//
//        int num = Integer.parseInt(idBack);
//        System.out.println(num);
//
//        String boat = num == 1 ? "남" : "여";
//        System.out.println(boat);
//        // System.out.println(num ? "남" : "여");
//        // 삼항연산자는 == ? : 세트임
//        // 알아두자
//
//        System.out.println("\n================================\n");
//        // 3번
//        int example = 278;
//
//        String number;
//        number = Integer.toString(example);
//        String a1;
//        String s1;
//        String d1;
//
//        a1 = number.substring(0,1);
//        s1 = number.substring(1,2);
//        d1 = number.substring(2,3);
//
//        System.out.println();
//
//        int q = Integer.parseInt(number.substring(0,1));
//        int w = Integer.parseInt(number.substring(1,2));
//        int e = Integer.parseInt(number.substring(2,3));
//
//
//
//        // 3 담은걸 합쳐서 출력
//        System.out.println(q + w + e);

        //팩토리얼 다들 기억하시나요?
        //수학기호로 4! 는 4 팩토리얼을 의미하며,
        //그 값은 4x3x2x1 = 24 입니다.
        //for문을 사용해서 10팩토리얼의 값을 출력해주세요.
        int ab = 10;
        for(int i = 1; i < 10; i++) {
            ab= i*ab;
        }
        System.out.println(ab);

        long sd = 15l;
        // 값이 크므로 long을 쓰자
        for(int s = 1; s < 15; s++) {
            sd= s*sd;

        }

        System.out.println(sd);

        // 윌리를 찾아라

        String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
        // 1. 2글자씩 분리하기
        // 2. 2글자씩 분리한걸 반복하기
        for(int b = 0; b <= findWally.length(); b++) {
            System.out.println(findWally.substring(b,b+2));

        }






    }
}
