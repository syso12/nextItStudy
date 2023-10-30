package ch12_exception;

import java.util.Scanner;

public class TryWithResource {

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//
//        try{
//            Integer.parseInt(scan.nextLine());
//        }catch (Exception e){
//            // 에러처리
//            System.out.println("에러발생");
//        }finally {
//            // try 내부코드가 에러가 발생하든 안하든 finally 내부는 실행
//            scan.close();
//        }
//        scan.nextLine();
        // try-catch문 실행순서
        // try를 하고 오류가 없다면 finally실행
        // try를 하고 오류가 있다면 catch실행 후 finally실행

        // try-with-resource 구문
        // .close() 가 필요한 객체를 try() 소괄호 안에 선언후
        // try(){} 중괄호 내에서 사용
        // 이후 별도로 .close()를 작성하지 않아도 자동으로 닫힌다.
        try(Scanner sca = new Scanner(System.in)){
            System.out.println(sca.nextLine());
        }catch (Exception e){
            e.printStackTrace();
        }

        // catch가 없다는 것은 딱 .close()만을 이용하겠다는 목적
        Scanner scan = new Scanner(System.in);
        System.out.println(scan.nextLine());


    }
}
