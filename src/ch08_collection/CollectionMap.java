package ch08_collection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionMap {
    public static void main(String[] args) {
        // Map -> HashMap 의 선언
        // Map은 값을 Key와 Value값의 한쌍으로 저장
        HashMap<String, String> stuMap = new HashMap<String, String>();
        HashMap<String, String> stuMap2 = new HashMap<>();

        // 어지간한 경우에 key값 타입은 String이다.
        HashMap<String, Integer> coinMap= new HashMap<>();

        // 값 추가
        // .put(key, value)
        stuMap.put("첫째", "태곤");
        stuMap.put("둘째", "창연");
        stuMap.put("셋째", "성복");

        // Set과 마찬가지로 순서가 보장되지 않는다.
        System.out.println(stuMap);

        // 중복된 key값을 허용하지 않는다.
        stuMap.put("첫째", "민재");
        System.out.println(stuMap); // 기존(중복) 키값의 데이터를 덮어쓴다.

        stuMap.put("넷째", "성복");
        System.out.println(stuMap); // 기존(중복) value값의 데이터는 덮어쓰지않고 작성됨

        coinMap.put("비트코인", 36000000);
        coinMap.put("도지코인", 78);
        System.out.println(coinMap);

        System.out.println("\n==============================================\n");

        // .get(key)
        // key의 해당하는 value를 리턴
        System.out.println(stuMap.get("첫째"));
        // 존재하지않는 key를 입력하면 null 리턴
        System.out.println(stuMap.get("몰라"));

        System.out.println(coinMap.get("비트코인"));

        // .size()
        // Map내부 요소 갯수 리턴
        System.out.println(stuMap.size());

        // .containsKey(값)
        // Map 내부 요소 중에 괄호 안 값과 같은 Key가 존재하면 true, 없으면 false
        System.out.println(stuMap.containsKey("둘째"));
        System.out.println(stuMap.get("둘째") != null); // 위와 같음

        // .containsValue(값)
        // Map 내부 요소 중에 괄호 안 값과 같은 Value가 존재하면 true, 없으면 false
        System.out.println(stuMap.containsValue("성복"));

        // .remove(key)
        // 해당 key값을 가지는 내부 요소를 삭제
        stuMap.remove("둘째");
        System.out.println(stuMap);

        System.out.println("\n===========================================\n");

        // Map 순회
        // 1. keySet 이용
        Set<String> keySet = stuMap.keySet();

        for( String key : keySet ) {
            System.out.println(key); // keySet이기 때문에 값은 첫째, 셋째, 넷째가 담긴다
            System.out.println(stuMap.get(key));
        }
        System.out.println("\n=================================================\n");
        // 2. EntrySet 이용
        Set<Entry<String, String>> entrySet = stuMap.entrySet();

        for( Entry<String, String> entry : entrySet ) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
