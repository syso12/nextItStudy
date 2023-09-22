package sungbok.submit02;
import java.util.Scanner;
public class Submit02 {
    public static void main(String[] args) {
        // 01번
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력해주세요");
        System.out.print(">>> ");
        String name = sc.nextLine();
        System.out.println("국어점수를 입력해주세요");
        System.out.print(">>> ");
        String ko = sc.nextLine();
        int score = Integer.parseInt(ko);
        System.out.println("수학점수를 입력해주세요");
        System.out.print(">>> ");
        String ma = sc.nextLine();
        int score1 = Integer.parseInt(ma);
        System.out.println("영어점수를 입력해주세요");
        System.out.print(">>> ");
        String en = sc.nextLine();
        int score2 = Integer.parseInt(en);

        double avg = (double) (score1 + score2 + score) / 3;
        // double avg = (score1 + score2 + score) / 3.0;
        // 소수점을 만드는 계산할때 숫자를 형변환하는거보다
        // 식 자체를 형변환 하는것이 정석!!!
        // 소수를 두자리로 자르기
        // %2f 사용
        //


        System.out.println("이름 :" + name);
        System.out.println("국어 :" + score);
        System.out.println("수학 :" + score1);
        System.out.println("영어 :" + score2);
        System.out.printf("평균 :" + "%.2f" , avg);


        System.out.println("\n==========================================\n");
        // 2번
        int example = 278;
        // 자동형변환을 이용한 int 에서 String으로 변환 "" + int = String
        String num = "0" + example;
        System.out.println(num);


//        String num = Integer.toString(example);
//        String q = num.substring(0,1);
//        String w = num.substring(1,2);
//        String e = num.substring(2,3);

//        String q = num.substring(1,2);
//        String w = num.substring(2,3);
//        String e = num.substring(3,4);

        int z = Integer.parseInt(num.substring(1,2));
        int x = Integer.parseInt(num.substring(2,3));
        int c = Integer.parseInt(num.substring(3,4));

        System.out.println(z+x+c);







    }

}
