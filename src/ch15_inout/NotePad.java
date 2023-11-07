package ch15_inout;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotePad {

    public static void main(String[] args) {
        // 프로그램 실행시
        // 파일명과 내용을 입력받아
        // /home/pcxx/stuList 폴더 내에 해당 파일명으로 입력한
        // 내용이 들어간 텍스트 파일 생성하기


        Scanner scan = new Scanner(System.in);

        System.out.println("파일명을 입력하세요");
        String input = scan.nextLine();

        System.out.println("내용을 입력하세요");
        String say = scan.nextLine();

        try(FileWriter fiw = new FileWriter("/home/pc32/stuList/" + input);) {

            fiw.write(say);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
