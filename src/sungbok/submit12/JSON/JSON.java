package sungbok.submit12.JSON;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSON {
    public static void main(String[] args) throws ParseException {
        // 2020년 8월 2일의 한국 환율(KRW) 값을 꺼내보세요
        String resp = "{\"success\": true, \"timeseries\": true, \"base\": \"USD\", \"start_date\": \"2020-08-01\", \"end_date\": \"2022-08-01\", \"rates\": {\"2020-08-01\": {\"JPY\": 105.65, \"KES\": 107.57, \"KGS\": 76.52, \"KHR\": 4092.64, \"KMF\": 417.5, \"KPW\": 898.38, \"KRW\": 1192.25}, \"2020-08-02\": {\"JPY\": 105.74, \"KES\": 107.69, \"KGS\": 76.62, \"KHR\": 4100, \"KMF\": 418.06, \"KPW\": 899.58, \"KRW\": 1193.46}}}";

        System.out.println(resp);

        JSONParser jsonParser = new JSONParser();
        JSONObject jsonObj = (JSONObject) jsonParser.parse(resp);

        JSONObject rates = (JSONObject) jsonObj.get("rates");
        System.out.println(rates);

        JSONObject target = (JSONObject)rates.get("2020-08-02");

        System.out.println(target.get("KRW"));
    }
}
