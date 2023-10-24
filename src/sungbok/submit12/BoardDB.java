package sungbok.submit12;

import java.util.ArrayList;

public class BoardDB {
    private static ArrayList<Board> boardList = new ArrayList<>();

    private BoardDB(){

    }
    private static BoardDB Instance = new BoardDB();

    public static BoardDB getInstance(){
        return Instance;
    }

    // 게시물 목록 출력 메소드
    public void printBoard(){
        for(Board board : boardList){
            System.out.println("[" + board.getnum() + "|" + board.getTitle() + "|" + board.getDay() + "]");
        }
    }

    // 게시물 등록 메소드
    public void addressBoard(String title, String content, String inputContent){
        Board bo = new Board();
        bo.setDay();
        boardList.add(new Board(boardList.size()+1,title,bo.getDay(),content ));
    }





}
