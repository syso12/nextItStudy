package sungbok.study;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class quest1 {
    public static void main(String[] args) throws ParseException {

        // 7개 도시 중 가장 냉면 값이 저렴한 도시와 그 가격을 찾아 출력해보세요.
        // json을 볼때는 jsonPaser(인터넷검색)로 먼저 파악을 해두자
        // city에서 도시를 뽑고
        // fields에서 id가 냉면인것을 뽑고
        // records에서 냉면가격이 제일 싼가격을 뽑아야??
        //
        String response = "{ \"city\" : [\"서울\", \"광주\", \"대구\", \"대전\", \"부산\", \"울산\", \"인천\"], \"fields\": [{\"id\": \"자장면\"},{\"id\": \"냉면\"}, {\"id\": \"김밥\"}, {\"id\": \"칼국수\"}], \"records\": [{\"시도명\": \"서울\", \"자장면\": 7069, \"냉면\": 11308, \"김밥\": 3215, \"칼국수\": 8962}, {\"시도명\": \"광주\", \"자장면\": 6800, \"냉면\": 9400, \"김밥\": 3160, \"칼국수\": 8400}, {\"시도명\": \"대구\", \"자장면\": 6250, \"냉면\": 10417, \"김밥\": 2750, \"칼국수\": 6750}, { \"시도명\": \"대전\", \"자장면\": 6700, \"냉면\": 10400, \"김밥\": 3000, \"칼국수\": 7800}, {\"시도명\": \"부산\", \"자장면\": 6143, \"냉면\": 10857, \"김밥\": 2786, \"칼국수\": 6986}, { \"시도명\": \"울산\", \"자장면\": 6500, \"냉면\": 9900, \"김밥\": 3300, \"칼국수\": 8400}, {\"시도명\": \"인천\", \"자장면\": 6500, \"냉면\": 10667, \"김밥\": 3050, \"칼국수\": 8000}]}";

        // System.out.println(response);

        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObj = (JSONObject) jsonParser.parse(response);

        System.out.println(jsonObj);

        JSONArray city = (JSONArray) jsonObj.get(("city"));
        System.out.println("도시" + city);

        JSONArray fields = (JSONArray) jsonObj.get(("fields"));
        System.out.println("아이디" + fields);


        JSONArray records = (JSONArray) jsonObj.get(("records"));
        System.out.println("가격" + records);

//        JSONObject price = (JSONObject) records.get();
//        System.out.println(price);


        // JSONArray recordss = (JSONArray) jsonObj.get(("records"));
        for (int i = 0; i < records.size() - 1; i++) {
            for (int k = 0; k < records.size() - 1 - i; k++) {
                JSONObject price = (JSONObject) records.get(k);
                JSONObject price1 = (JSONObject) records.get(k + 1);
                long nang = (Long) price.get("냉면");
                long nang1 = (Long) price1.get("냉면");

                if (nang > nang1) {
                    // 버블이니까 뒤집기
                    JSONObject food = (JSONObject) records.get(k);
                    records.set(k, records.get(k + 1));
                    records.set(k + 1, food);
                }
            }
        }
        JSONObject city1 = (JSONObject) records.get(0);
        //System.out.println(", 냉면가격: " + city1.get("냉면")+"원");
        System.out.println(city1.get("시도명") + ", 냉면가격: " + city1.get("냉면")+"원");
        // System.out.println(records.get(0));
//        for(int i = 0; i < records.size(); i++){
//            System.out.println("냉면싼곳" + records.get(i));
//        }

        // records 도 리스트이기때문에 get(int)를 넣으면 그에 해당하는 값만 나온다
        // 이거를 이용하면 될듯


        // 선생님 풀이
        long minPrice = (long)((JSONObject) records.get(0)).get("냉면");
        for(int i = 0; i < records.size(); i++){
            JSONObject cityy = (JSONObject) records.get(i);
            if(minPrice > (long)cityy.get("냉면")){
                minPrice = (long)cityy.get("냉면");
            }
        }
        System.out.println("냉면 최소값: " + minPrice);
        for(int i = 0; i < records.size(); i++){
            JSONObject cityy = (JSONObject) records.get(i);
            if(minPrice == (long)cityy.get("냉면")){
                System.out.println("냉면이 제일 싼도시 " + cityy.get("시도명"));
            }
        }


//        for(int i = 0; i < records.size(); i++){
//            records.get(i).
//        }
        // 2. 7개 도시의 자장면 평균 가격을 계산하여 출력해보세요.

        // 이 문제도 버블정렬?
        // 평균이니까 정렬을 할필요는 없다
//        for(int i = 0; i < records.size()-1; i++){
//            JSONObject
//
//            }
//        }

        // 선생님 풀이
        long totalPrice = 0;
        for(int i = 0; i < records.size(); i++){
            JSONObject cityy = (JSONObject) records.get(i);
            totalPrice +=(long)cityy.get("자장면");
        }
        double avgPrice = totalPrice / records.size();
        System.out.println("자장면 평균가격 " +avgPrice + "원");






    }

}
