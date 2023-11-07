package ch16_network.open_api.service;

import ch14_jdbc_jsp.jdbc.ConnectionPool;
import ch16_network.open_api.dao.MedicineDAO;
import ch16_network.open_api.dto.MedicineDTO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class MedicineService {

    private MedicineService(){}

    private static MedicineService instance = new MedicineService();

    public static MedicineService getInstance(){
        return instance;
    }

    private ConnectionPool cp = ConnectionPool.getInstance();
    private MedicineDAO dao = MedicineDAO.getInstance();

    // 약 리스트 넣기
    public void insertMedicine(MedicineDTO medicine) {
        Connection conn = cp.getConnection();

        try {
            dao.insertMedicine(conn, medicine);
        } catch (SQLException e) {
           e.printStackTrace();
        }finally {
            cp.releaseConnection(conn);
        }
    }
    // 약 뽑아내기
    public ArrayList<MedicineDTO> mediList(){
        Connection conn = cp.getConnection();

        ArrayList<MedicineDTO> resultList = new ArrayList<>();

        try {
            resultList = dao.mediList(conn);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            cp.releaseConnection(conn);
        }
        return resultList;
    }



}
