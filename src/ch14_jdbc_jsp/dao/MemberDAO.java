package ch14_jdbc_jsp.dao;

import ch14_jdbc_jsp.dto.MemberDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// DAO : data Access Object
// DTO에서 만든 데이터들을 접근 하는 곳
// 쿼리문을 작성해놓는 클래스
// member 테이블과 연관된 쿼리문만을 작성해놓음
// 싱글톤 적용해놓기 -> 굳이 안해도 됨
// DTO 먼저 만들고
// DAO 만들고
// 마지막으로 Service 만들기
public class MemberDAO {

    private MemberDAO(){}

    private static MemberDAO instance = new MemberDAO();

    public static MemberDAO getInstance(){
        return instance;
    }

    // DAO의 메소드에는 파라미터에 Connection객체가 들어올예정
    // 회원 목록 조회 (SELECT)
    // getMemberList는 변수이름
    public ArrayList<MemberDTO> getMemberList(Connection conn) throws SQLException {
        // 쿼리문 작성
        StringBuffer query = new StringBuffer();
        query.append("SELECT                      ");
        query.append("    mem_id                  ");
        query.append("  , mem_pw                  ");
        query.append("  , mem_name                ");
        query.append("  , mem_score  AS score     ");
        query.append("FROM                        ");
        query.append("  members                   ");    // query문 문자열 안에 ; 를 넣지 말아야한다.!!!

        // Connection 객체로부터 PreparedStatement 객체 생성
        PreparedStatement ps = conn.prepareStatement(query.toString());

        // 쿼리문 실행
        ResultSet rs = ps.executeQuery();

        // MemberDTO 객체들을 담을 ArrayList 생성
        ArrayList<MemberDTO> result = new ArrayList<>();


        // 결과 처리
        while (rs.next()){
            String memId = rs.getString("mem_id");
            String memPw = rs.getString("mem_pw");
            String memName = rs.getString("mem_name");
            int memScore = rs.getInt("score");

            // 데이터의 컬럼값을 담을 수 있는 객체 생성(MemberDTO)
            MemberDTO member = new MemberDTO(memId, memPw, memName, memScore);
            result.add(member);
        }

        rs.close();
        ps.close();

        return result;
    }


    // 회원가입 (INSERT) 메소드
    // 이렇게 해도 되지만 일일히 작업해야하기 때문에 비효율적
//    public int signUp(Connection conn, String id, String pw, String name)
    public int signUp(Connection conn, MemberDTO member) throws SQLException {
        // 쿼리문 작성
        StringBuffer query = new StringBuffer();
        // 문자열 더하기 중에 여백 없이 딱붙는 경우가 없도록 하기
        query.append("INSERT INTO              ");
        query.append("    members (            ");
        query.append("    mem_id               ");
        query.append("  , mem_pw               ");
        query.append("  , mem_name             ");
        query.append("  , mem_score            ");
        query.append("  ) VALUES (             ");
        query.append("    ?                    ");
        query.append("  , ?                    ");
        query.append("  , ?                    ");
        query.append("  , ?                    ");
        query.append("  )                      ");    // query문 문자열 안에 ; 를 넣지 말아야한다.!!!

        PreparedStatement ps = conn.prepareStatement(query.toString());

        int idx = 1;
        ps.setString(idx++,member.getMemId());
        ps.setString(idx++,member.getMemPw());
        ps.setString(idx++,member.getMemName());
        ps.setInt(idx++,member.getMemScore());

        int result = ps.executeUpdate();

        ps.close();

        return result;

    }

    // 로그인(SELECT, WHERE)
    // where절을 이용해서 맞는지 아닌지 확인

    public MemberDTO login(Connection conn, MemberDTO member) throws SQLException {
        StringBuffer query = new StringBuffer();
        query.append("SELECT                      ");
        query.append("    mem_id                  ");
        query.append("  , mem_pw                  ");
        query.append("  , mem_name                ");
        query.append("  , mem_score  AS score     ");
        query.append("FROM                        ");
        query.append("  members                   ");
        query.append("WHERE 1=1                   ");
        query.append("  AND mem_id = ?            ");
        query.append("  AND mem_pw = ?            ");    // query문 문자열 안에 ; 를 넣지 말아야한다.!!!

        PreparedStatement ps = conn.prepareStatement(query.toString());

        int idx = 1;
        ps.setString(idx++, member.getMemId());
        ps.setString(idx++, member.getMemPw());

        // 1개가 담겨있거나 아예 안담겨있음
        ResultSet rs = ps.executeQuery();

        // 빈 껍데기 MemberDTO 객체 생성
        MemberDTO result = new MemberDTO();

        if(rs.next()){
            // 로그인 성공. 해당 member 데이터 가져옴
            result.setMemId(rs.getString("mem_id"));
            result.setMemPw(rs.getString("mem_pw"));
            result.setMemName(rs.getString("mem_name"));
            result.setMemScore(rs.getInt("score"));

        }

        rs.close();
        ps.close();

        return result;

    }

}
