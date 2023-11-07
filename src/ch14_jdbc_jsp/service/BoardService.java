package ch14_jdbc_jsp.service;

// ConnectionPool로부터 Connection객체 대여/반납해가며
// DAO의 메소드에 대한 예외처리 담당

import ch14_jdbc_jsp.dao.BoardDAO;
import ch14_jdbc_jsp.dto.BoardDTO;
import ch14_jdbc_jsp.jdbc.ConnectionPool;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardService {

    private BoardService(){}

    private static BoardService instance = new BoardService();

    public static BoardService getInstance(){
        return instance;
    }

    private ConnectionPool cp = ConnectionPool.getInstance();
    private BoardDAO dao = BoardDAO.getInstance();

    // 게시글 목록

    public ArrayList<BoardDTO> getBoardList() {
        Connection conn = cp.getConnection();
        ArrayList<BoardDTO> result =  new ArrayList<>();

        try {
            result = dao.getBoardList(conn);
        } catch (SQLException e) {
           e.printStackTrace();
        } finally {
            cp.releaseConnection(conn);
        }

        return result;
    }

    // 글작성 (board 객체 내부에는 title , content, id가 들어가 있어야한다.)
    public void writeBoard(BoardDTO board){
        Connection conn = cp.getConnection();

        try {
            dao.writeBoard(conn,board);
            System.out.println("글작성 성공");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("글 작성 실패");
        } finally {
            cp.releaseConnection(conn);
        }

    }

    // 글 조회
    public BoardDTO readBoard(int boNo){
        Connection conn = cp.getConnection();
        BoardDTO result = new BoardDTO();

        try {
            result = dao.readBoard(conn, boNo);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            cp.releaseConnection(conn);
        }

        return result;
    }

    // 글 업데이트
    // void가 아닌 int 를 넣는다면 try안에서 값의 결과를 출력할수있다
    public void boardUpdate(int boNo){
        Connection conn = cp.getConnection();

        try {
            dao.boardUpdate(conn, boNo);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            cp.releaseConnection(conn);
        }

    }




}
