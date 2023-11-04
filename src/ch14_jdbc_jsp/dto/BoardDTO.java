package ch14_jdbc_jsp.dto;

// members 테이블과 조인한 SELECT 문의 실행결과를 담을 DTO
public class BoardDTO {
//    주석달아주는 습관을 가지자
    private int boNo;           /* 글번호 */
    private  String boTitle;    /* 글제목 */
    private String boContent;   /* 글내용 */
    private String boId;        /* 작성자ID */
    private String boDate;      /* 작성일 */
    private String memName;     /* 작성자닉네임 */


    public BoardDTO(int boNo, String boTitle, String boContent, String boId, String boDate, String memName) {
        this.boNo = boNo;
        this.boTitle = boTitle;
        this.boContent = boContent;
        this.boId = boId;
        this.boDate = boDate;
        this.memName = memName;
    }

    public BoardDTO() {
    }

    @Override
    public String toString() {
        return "BoardDTO{" +
                "boNo=" + boNo +
                ", boTitle='" + boTitle + '\'' +
                ", boContent='" + boContent + '\'' +
                ", boId='" + boId + '\'' +
                ", boDate='" + boDate + '\'' +
                ", memName='" + memName + '\'' +
                '}';
    }

    public int getBoNo() {
        return boNo;
    }

    public void setBoNo(int boNo) {
        this.boNo = boNo;
    }

    public String getBoTitle() {
        return boTitle;
    }

    public void setBoTitle(String boTitle) {
        this.boTitle = boTitle;
    }

    public String getBoContent() {
        return boContent;
    }

    public void setBoContent(String boContent) {
        this.boContent = boContent;
    }

    public String getBoId() {
        return boId;
    }

    public void setBoId(String boId) {
        this.boId = boId;
    }

    public String getBoDate() {
        return boDate;
    }

    public void setBoDate(String boDate) {
        this.boDate = boDate;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }
}
