package sungbok.submit10true;

import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) throws ClassNotFoundException {
        //Class.forName("/sungbok.submit10true.Library"); 이방식도 맞음 나중에 써먹을 방식
         Library lib = Library.getInstance();

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("행동을 선택해주세요");
            System.out.println("1. 책 입고| 2. 책 대여| 3. 책 목록| 4. 책 검색| 5. 종료");
            System.out.print(">>> ");

            int command = Integer.parseInt(scan.nextLine());

            if(command == 1){
                // 책입고
                System.out.println("책 번호를 입력해주세요");
                System.out.print(">>> ");
                int no = Integer.parseInt(scan.nextLine());

                lib.returnBook(no);
            } else if (command == 2) {
                // 책 대여
                System.out.println("책 번호를 입력해주세요");
                System.out.print(">>> ");
                int no = Integer.parseInt(scan.nextLine());

                lib.borrow(no);

            } else if (command ==3) {
                // 책 목록
                lib.printBook();
            } else if (command == 4) {
                // 책 검색
                System.out.println("책 이름을 입력해주세요");
                System.out.print(">>> ");

                String keyword = scan.nextLine();

                lib.searchBook(keyword);

            }else {
                //종료
                break;
            }
        }
    }
}
