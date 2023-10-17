package ch09_class.homepage;

import java.util.ArrayList;

public class BoardDB {
    private static ArrayList<Board> boardList = new ArrayList<>();

    private BoardDB(){
        boardList.add(new Board(boardList.size()+1, "첫번째 게시글 제목", "오늘 하루", "호빵맨"));
        boardList.add(new Board(boardList.size()+1, "두번째 게시글 제목", "내일 하루", "식빵맨"));
        boardList.add(new Board(boardList.size()+1, "세번째 게시글 제목", "모레 하루", "찐빵맨"));
    }

    private static BoardDB instance = new BoardDB();

    public static BoardDB getInstance(){
        return instance;
    }

    // 게시물 목록 출력 메소드
    public void printBoard(){
        for( Board bo : boardList ){
            System.out.println("[" + bo.getNo() + " | "
            + bo.getTitle() + " | " + bo.getName() + "]");
        }
    }
    // 게시물 등록 메소드
    public void writeBoard(String title, String content, String name){
        boardList.add(new Board(boardList.size()+1,title,content,name));
    }
    // 게시글 보기 메소드
    public static void readBoard(int no){
        for( Board bo : boardList ){
            if(bo.getNo() == no){
                System.out.println("======================");
                System.out.println("제목: " + bo.getTitle());
                System.out.println("작성자: " + bo.getName());
                System.out.println("------------------");
                System.out.println(bo.getContent());
                System.out.println("======================");
                // break;
                return;
            }
        }
    }
}
