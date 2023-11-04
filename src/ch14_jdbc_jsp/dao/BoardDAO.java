package ch14_jdbc_jsp.dao;

import ch14_jdbc_jsp.dto.BoardDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDAO {

    private BoardDAO() {
    }

    private static BoardDAO instance = new BoardDAO();

    public static BoardDAO getInstance() {
        return instance;
    }

    // 게시글 조회(SELECT) 메소드
    public ArrayList<BoardDTO> getBoardList(Connection conn) throws SQLException {
        StringBuffer query = new StringBuffer();
        query.append("   SELECT                        ");
        query.append("       b.bo_no                   ");
        query.append("     , b.bo_title                ");
        query.append("     , b.bo_content              ");
        query.append("     , b.bo_id                   ");
        query.append("     , b.bo_date                 ");
        query.append("     , m.mem_name                ");
        query.append("   FROM                          ");
        query.append("      members m , boards b       ");
        query.append("   WHERE 1=1                     ");
        query.append("   AND m.mem_id = b.bo_id        ");
        query.append("   AND b. del_yn = 'N'           ");
        query.append("   ORDER BY b.bo_no DESC         ");


        // Connection 객체로부터 PreparedStatement 객체 생성
        PreparedStatement ps = conn.prepareStatement(query.toString());

        // 쿼리문 실행
        ResultSet rs = ps.executeQuery();

        // BoardDTO 객체들을 담을 ArrayList 생성
        ArrayList<BoardDTO> result = new ArrayList<>();

        // 결과 처리
        while (rs.next()) {
            BoardDTO board = new BoardDTO();

            board.setBoNo(rs.getInt("bo_no"));
            board.setBoTitle(rs.getString("bo_title"));
            board.setBoContent(rs.getString("bo_content"));
            board.setBoId(rs.getString("bo_id"));
            board.setBoDate(rs.getString("bo_date"));
            board.setMemName(rs.getString("mem_name"));

            // 데이터의 컬럼값을 담을 수 있는 객체 생성(MemberDTO)  -> 이번엔 다르게 해보자(MemberDAO 클래스 랑 비교하기)

            result.add(board);
        }

        rs.close();
        ps.close();

        return result;

    }

    // 글 작성 (INSERT) 메소드 만들기
    public int writeBoard(Connection conn, BoardDTO board) throws SQLException {

        StringBuffer query = new StringBuffer();
        // 쿼리문 작성
        // 문자열 더하기 중에 여백 없이 딱붙는 경우가 없도록 하기
        query.append("INSERT INTO              ");
        query.append("      boards(              ");
        query.append("    bo_no                ");
        query.append("  , bo_title             ");
        query.append("  , bo_content           ");
        query.append("  , bo_id                ");
        query.append("  , bo_date              ");
        query.append("  , del_yn               ");
        query.append("  ) VALUES (             ");
        query.append("    seq_board.NEXTVAL    ");
        query.append("  , ?                    ");
        query.append("  , ?                    ");
        query.append("  , ?                    ");
        query.append("  , SYSDATE              ");
        query.append("  , 'N'                  ");
        query.append("  )                      ");    // query문 문자열 안에 ; 를 넣지 말아야한다.!!!

        PreparedStatement ps = conn.prepareStatement(query.toString());

        int idx = 1;
        ps.setString(idx++, board.getBoTitle());
        ps.setString(idx++, board.getBoContent());
        ps.setString(idx++, board.getBoId());


        int result = ps.executeUpdate();

        ps.close();

        return result;

    }

    // 게시글 목록(SELECT)조회 메소드
    public BoardDTO readBoard(Connection conn, int boNo) throws SQLException {
        StringBuffer query = new StringBuffer();
        query.append("   SELECT                        ");
        query.append("      b.bo_no                   ");
        query.append("     , b.bo_title                ");
        query.append("     , b.bo_content              ");
        query.append("     , b.bo_id                   ");
        query.append("     , b.bo_date                 ");
        query.append("     , m.mem_name                 ");
        query.append("   FROM                           ");
        query.append("       boards b, members m        ");
        query.append("   WHERE 1=1                     ");
        query.append("   AND m.mem_id = b.bo_id        ");
        query.append("   AND b.bo_no = ?               ");


        PreparedStatement ps = conn.prepareStatement(query.toString());

        int idx = 1;

        ps.setInt(idx, boNo);

        // 1개가 담겨있거나 아예 안담겨있음
        ResultSet rs = ps.executeQuery();

        // 빈 껍데기 MemberDTO 객체 생성
        BoardDTO result = new BoardDTO();

        if (rs.next()) {
            BoardDTO board = new BoardDTO();

            board.setBoNo(rs.getInt("bo_no"));
            board.setBoTitle(rs.getString("bo_title"));
            board.setBoContent(rs.getString("bo_content"));
            board.setBoId(rs.getString("bo_id"));
            board.setBoDate(rs.getString("bo_date"));
            board.setMemName(rs.getString("mem_name"));


            rs.close();
            ps.close();

        }

        return result;
    }

    // 게시글 삭제(UPDATE) 메소드 작성

    public int boardUpdate(Connection conn, int boNo) throws SQLException {
        StringBuffer query = new StringBuffer();
        query.append("   UPDATE                       ");
        query.append("      boards                       ");
        query.append("   SET                       ");
        query.append("      del_yn = 'Y'                       ");
        query.append("   WHERE 1=1                          ");
        query.append("   AND   bo_no = ?                         ");

        PreparedStatement ps = conn.prepareStatement(query.toString());

        int idx = 1;

        ps.setInt(idx, boNo);

        int result = ps.executeUpdate();


        ps.close();


        return result;
    }
}
