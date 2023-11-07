package ch16_network.open_api;


import ch16_network.open_api.dto.MedicineDTO;
import ch16_network.open_api.service.MedicineService;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DataParsing {

    public static void main(String[] args) throws IOException, ParseException {
        String path = System.getProperty("user.dir");
        StringBuilder sb = new StringBuilder();

        try (FileReader reader = new FileReader(path + "/src/files/mediData.txt")) {

            char[] bowl = new char[1];

            while (true) {
                int count = reader.read(bowl);
                if (count == -1) {
                    break;
                }
                String text = new String(bowl);
                sb.append(text);
            }

        }
        System.out.println(sb);

        JSONParser jsonParser = new JSONParser();

        JSONObject body = (JSONObject) jsonParser.parse(sb.toString());

        System.out.println(body);

        JSONArray items = (JSONArray) body.get("items");

        System.out.println(items.size());


        for (int i = 0; i < items.size(); i++) {
            JSONObject item = (JSONObject) items.get(i);

            String entpName = (String) item.get("entpName");
            String itemName = (String) item.get("itemName");
            String efcyQesitm = (String) item.get("efcyQesitm");

            MedicineDTO medicine = new MedicineDTO(entpName, itemName, efcyQesitm);

            MedicineService medicineService = MedicineService.getInstance();


            // 100개의 약들을 데이터베이스에 저장

            medicineService.insertMedicine(medicine);
            MedicineService.getInstance();


        }


    }
}


