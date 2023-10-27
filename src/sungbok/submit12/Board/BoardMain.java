package sungbok.submit12.Board;

import java.util.Scanner;

public class BoardMain {
    public static void main(String[] args) {

        BoardDB boardDB = BoardDB.getInstance();

        Board bo = new Board();

        Scanner scan = new Scanner(System.in);

        while (true){
        System.out.println("행동을 선택해주세요");
        System.out.println("1.글 목록 | 2. 글 쓰기 | 3. 종료");
        System.out.print(">>> ");
        int command = Integer.parseInt(scan.nextLine());

        if(command == 1){
            // 게시물 출력
            boardDB.printBoard();


        } else if (command ==2) {
            System.out.println("글 제목을 입력해주세요: ");
            String inputTitle = scan.nextLine();
            System.out.println("글 내용을 입력해주세요: ");
            String inputContent = scan.nextLine();
            boardDB.addressBoard(inputTitle, bo.getDay(),inputContent);

        }else if(command ==3) {
            System.out.println("종료합니다.");
            break;
        }
        }
    }
}
