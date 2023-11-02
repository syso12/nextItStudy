package ch14_jdbc_jsp.dto;


// members 테이블의 데이터와 1:1 매핑이 되는 클래스
// SELECT 쿼리문의 실행 결과와 1:1 매핑이 되는 클래스
// DTO : Data Transfer Object
// vo와 똑같다
public class MemberDTO {
    // DB의 컬럼명이 mem_id라면 자바에서는 memId 으로 씀
    // 카멜식으로 쓸것!
    private String memId;
    private String memPw;
    private String memName;
    private int memScore;

    public MemberDTO(String memId, String memPw, String memName, int memScore) {
        this.memId = memId;
        this.memPw = memPw;
        this.memName = memName;
        this.memScore = memScore;
    }

    public MemberDTO() {
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "memId='" + memId + '\'' +
                ", memPw='" + memPw + '\'' +
                ", memName='" + memName + '\'' +
                ", memScore=" + memScore +
                '}';
    }

    public String getMemId() {
        return memId;
    }

    public void setMemId(String memId) {
        this.memId = memId;
    }

    public String getMemPw() {
        return memPw;
    }

    public void setMemPw(String memPw) {
        this.memPw = memPw;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public int getMemScore() {
        return memScore;
    }

    public void setMemScore(int memScore) {
        this.memScore = memScore;
    }
}
