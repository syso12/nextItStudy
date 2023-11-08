package ch16_network.open_api.dao;

import ch14_jdbc_jsp.dao.MemberDAO;
import ch16_network.open_api.dto.MedicineDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MedicineDAO {

    private MedicineDAO(){}

    private static MedicineDAO instance = new MedicineDAO();

    public static MedicineDAO getInstance(){
        return instance;
    }

    public int insertMedicine(Connection conn, MedicineDTO medicine) throws SQLException {
        StringBuffer query = new StringBuffer();
        query.append("   INSERT INTO          ");
        query.append("          medicines (   ");
        query.append("        entp_name       ");
        query.append("      , item_name       ");
        query.append("      , efcy_qesitm     ");
        query.append("      ) VALUES (        ");
        query.append("        ?               ");
        query.append("       , ?              ");
        query.append("       , ?              ");
        query.append("        )               ");

        PreparedStatement ps = conn.prepareStatement(query.toString());

        int idx = 1;
        ps.setString(idx++, medicine.getEntpName());
        ps.setString(idx++, medicine.getItemName());
        ps.setString(idx++, medicine.getEfcyQesitm());

        int result = ps.executeUpdate();

        ps.close();

        return result;

    }

    // 약 찾기 메소드
    // 리스트에서 원하는 결과값을 출력해야 되기 때문에
    // ArrayList에서 찾는게 맞다.

    public ArrayList<MedicineDTO> mediList(Connection conn) throws SQLException {
        StringBuffer query = new StringBuffer();
        query.append("   SELECT          ");
        query.append("      item_name     ");
        query.append("     , entp_name    ");
        query.append("     , efcy_qesitm  ");
        query.append("   FROM            ");
        query.append("      medicines    ");

        // query.append(괄호 안에 %??%를 넣는것이 아니라
//        query.append("   WHERE 1=1   ");
//        query.append("   AND efcy_qestim = '%?%'    ");


        PreparedStatement ps = conn.prepareStatement(query.toString());

        // setString안에 %?%를 사용해야 한다
        // ps.setString(1,"두통");

        ResultSet rs = ps.executeQuery();

        ArrayList<MedicineDTO> resultList = new ArrayList<>();


        while (rs.next()){
            MedicineDTO result = new MedicineDTO();
            result.setItemName(rs.getString("item_name"));
            result.setEntpName(rs.getString("entp_name"));
            result.setEfcyQesitm(rs.getString("efcy_qesitm"));

            resultList.add(result);
        }

        rs.close();
        ps.close();

        return resultList;
    }





}
