package ch14_jdbc;

import java.sql.*;

public class JdbcInsert {

    public static void main(String[] args) {
        // 1. ojdbc 라이브러리 내 oracleDriver 클래스를 깨우기
//        OracleDriver od = new OracleDriver();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 로드 성공");
        } catch (ClassNotFoundException e) {
            // throw new RuntimeException(e); // 프로그램 멈춤
            System.exit(0);             // 프로그램 종료
        }

        // 2. DB연결을 위한 URL, 계정 ID/PW 준비
        String url = "jdbc:oracle:thin:@nextit.or.kr:1521:xe";
        String id = "std207";
        String pw = "oracle21c";

        Connection conn = null;
        PreparedStatement ps = null;
        // ResultSet은 select문 에서만 필요하다.
//        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(url, id, pw);

            // 4. 쿼리문 작성
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

            ps = conn.prepareStatement(query.toString());

            // 쿼리문 내 ?에 값을 채워주기
            // 첫번째 물음표의 인덱스는 0이 아니라 1부터 시작
            // 앞에 번호는 자동 증가 하게 하자
            int idx = 1;
            ps.setString(idx++,"d001");
            ps.setString(idx++,"123d");
            ps.setString(idx++,"미친놈");
            ps.setInt(idx++,67);

            // insert, update, delect문은 executeUpdate()로 실행
            // 결과는 int타입이 리턴된다.
            // 왜??
            int result = ps.executeUpdate();  // insert문이지만 executeUpdate로 가야한다. // update값 row리턴

            System.out.println(result);



        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            // 8. DB연결에 사용된 객체들 close 해주기
            // 선언된 순서의반대 순서로 close 해주는것을 추천
            if(ps !=null){try {ps.close();} catch (SQLException e) {e.printStackTrace();}}
            if(conn !=null){try {conn.close();} catch (SQLException e) {e.printStackTrace();}}

        }


    }
}
