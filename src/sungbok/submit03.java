package sungbok;
import java.util.Scanner;
public class submit03 {
    public static void main(String[] args) {
        // 10팩토리얼 값 구하기
        int a = 10;
        for (int i = 1; i < 10; i++) {
            a = a * i;
        }
        System.out.println("10!값은: " + a);
        // 15팩토리얼 값 구하기
        long b = 15l;
        for (int i = 1; i < 15; i++) {
            b = b * i;
        }
        System.out.println("15!값은: " + b);

        System.out.println("\n=======================================\n");
        // 2번
        // 월리를 찾아라
        String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
        int text = findWally.length();
        System.out.println(text);
        int count = 0;
        for (int i = 0; i < findWally.length() - 1; i+=2) {
            // 60개인데 61개까지 자르고잇다.
            // 60개로 맞춰야한다.
            System.out.println(findWally.substring(i, i + 2));
            if (findWally.substring(i, i + 2).equals("월리")) {
                count++;
            }
        }
        System.out.println("월리의 갯수는 : " + count);
        System.out.println("\n=======================================\n");
        // 3번
        // 거꾸로 트리 만들기
        // *****
        // ****
        // ***
        // **
        // *
        // for문 5번 반복하기
        String stars = "*****";
        // 1,5
        // 2,5
        // 3,5
        // 4,5
        // 5,5
        int num = 5;
        for (int i = 0; i <= 5; i++) {
            System.out.println(stars.substring(i, num));
        }
        System.out.println("\n=======================================\n");
        // 4번
        // 로꾸꺼 로꾸꺼 반대로 돌리기
        // 1
        // 꺼 꾸 로 "" 꺼 꾸 로

        // 6,7   0.1
        // 5,6   1.2
        // 5,4
        Scanner sc = new Scanner(System.in);
        System.out.println("거꾸로 뒤집을 문자열 입력: ");
        System.out.print(">>> ");
        String reverse = sc.nextLine();
        System.out.print("뒤집은 결과: ");
        for(int k = reverse.length(); k >= 1; k--) {
            System.out.print(reverse.substring(k-1,k));
        }
        // System.out.println("뒤집은 결과: " + reverse);














        }
    }

