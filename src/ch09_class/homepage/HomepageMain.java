package ch09_class.homepage;

import java.util.Scanner;

public class HomepageMain {
    public static void main(String[] args) {
        // 회원가입, 로그인, 회원목록
        // 로그인후 게시판 진입
        // 글목록, 글쓰기, 글조회
        // 회원: 아이디, 비밀번호, 닉네임
        // 게시글: 글번호, 글제목, 글내용, 작성자(닉네임)

        // 곧 회원가입을 할때마다 Member 객체를 생성할거고
        // 생성된 Member 객체들은 MeberDB 안에 담을거야.
        // 어? 생각해보니 MemberDB라는 객체는 하나만
        // 생성해서 쓰겟네?? -> 싱글톤(Singleton) 패턴 적용

        MemberDB memDB =  MemberDB.getInstance();
        BoardDB boardDB = BoardDB.getInstance();

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("행동을 선택해 주세요");
            System.out.println("1. 회원가입 | 2. 로그인 | 3. 회원목록 | 4. 종료");
            System.out.print(">>> ");

            int command = Integer.parseInt(scan.nextLine());

            if(command == 1){
                // 회원가입 진행
                System.out.println("아이디를 입력하세요");
                System.out.print(">>> ");
                String inputId =  scan.nextLine();

                System.out.println("비밀번호를 입력하세요");
                System.out.print(">>> ");
                String inputPw =  scan.nextLine();

                System.out.println("닉네임을 입력하세요");
                System.out.print(">>> ");
                String inputName =  scan.nextLine();

                Member mem = new Member(inputId, inputPw, inputName);
                // 회원가입시, 중복된 아이디를 입력했다면 회원가입을 진행시키지 않음
//                if(inputId.contains(mem.getId())){
//                    System.out.println("중복된 아이디입니다.");
//                    continue;
//                }
                int result = memDB.signUp(mem);

                if(result == 1){
                    System.out.println("회원가입 성공!! 로그인 해주세요.");
                }else{
                    System.out.println("회원가입 실패!! 중복된 아이디입니다..");
                }
            }else if(command == 2){
                // 로그인
                System.out.println("아이디를 입력하세요");
                System.out.print(">>> ");
                String inputId =  scan.nextLine();

                System.out.println("비밀번호를 입력하세요");
                System.out.print(">>> ");
                String inputPw =  scan.nextLine();

                // 로그인의 결과가 실패면 result는 null
                // 로그인의 결과가 성공이면 result는 null이 아님

                Member result = memDB.login(inputId,inputPw);

                System.out.println(result);

                if(result != null){
                    // 로그인 성공
                    System.out.println("로그인 성공!!!" + result.getName() +"님 환영합니다.");

                    // 게시판 진입
                    while(true){
                        // 게시물 목록 출력
                        boardDB.printBoard();

                        System.out.println("행동을 선택해 주세요 ");
                        System.out.println("1. 글쓰기 | 2. 글보기 | 3. 로그아웃");
                        System.out.print(">>> ");

                        int select = Integer.parseInt(scan.nextLine());

                        if(select == 1){
                            // 글쓰기
                            System.out.println("글 제목 입력: ");
                            String inputTitle = scan.nextLine();

                            System.out.println("글 내용 입력: ");
                            String inputContent = scan.nextLine();

                            // inputTitle, inputContent, result.getName()
                            boardDB.writeBoard(inputTitle,inputContent,result.getName());
                        } else if (select == 2) {
                            // 글보기
                            System.out.print("글 번호 입력: ");
                            int no = Integer.parseInt(scan.nextLine());

                            BoardDB.readBoard(no);


                        } else if (select == 3) {
                            // 로그아웃
                            break;
                        }else{
                            System.out.println("잘못입력하셧습니다.");
                        }


                    }
                }else{
                    // 로그인 실패
                    System.out.println("아이디 혹은 비밀번호가 틀립니다.");
                }

                // memDB 내 memList안에 Member 객체
            }else if(command == 3){
                // 회원목록
                memDB.showMemList();
            }else if(command == 4){
                // 종료

                System.out.println("안녕~~");
                break;
            }else{
                System.out.println("잘못입력하셨습니다.");
            }



        }


    }
}
