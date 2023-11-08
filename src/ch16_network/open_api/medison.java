package ch16_network.open_api;

import ch16_network.open_api.dto.MedicineDTO;
import ch16_network.open_api.service.MedicineService;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.Scanner;

public class medison {

    public static void main(String[] args) {

        // 서비스단은 쿼리문을 실행하기 위해 만든곳
        MedicineService medicineService = MedicineService.getInstance();


        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("증상을 이야기해주세요 [종료: q]");
            System.out.print(">>> ");
            String ache = scan.nextLine();
            System.out.println("약국에 가서 아래의 약들을 요청하세요");




            if (ache.equals("q")) {
                break;



                // else가 있든없든 if조건이 참이면 넘어가기 때문에 굳이 else조건을 안써도 된다.
            } else if (ache != null && ache != "") {
                ArrayList<MedicineDTO> medList = new ArrayList<>();

                medList = medicineService.mediList();

                for (int i = 0; i < medList.size(); i++) {
                    if (medList.get(i).getEfcyQesitm().contains(ache)){
                        System.out.println(medList.get(i).getItemName());
                    }


                }
            }else{
                System.out.println("잘못입력함");
            }


        }
    }


}
