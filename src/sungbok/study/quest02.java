package sungbok.study;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class quest02 {
    public static void main(String[] args) {
        String uniqueId = makeUniqueId();
        System.out.println(uniqueId);
    }
        //가끔 우리가 데이터베이스에 데이터를 추가할때, 유니크한 아이디를 넣어서 추가해야하는 경우가 많다.
        // 그때 사용하는게 UUID.randomUUID().toString() 인데,
        // 우리가 따로 유니크한 아이디를 만드는 메소드를 만들어보자.

        //메소드 실행시 현재 날짜에 대한 yyMMddHHmmssSSS 포맷의 문자열과
        //이후 랜덤한 숫자 6자리를 뒤에 덧붙인 21자리의 문자열이 리턴된다. (실제로 이 방법도 쓰임)

    public static String makeUniqueId(){

        // 배열로 6자리 랜덤숫자 부터 만들고
        // 배열을 String으로 형변환 하고
        // 데이트 타입하고 붙이면 되나?


        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmssSSS");
        String secret = sdf.format(date);

        // System.out.println(secret);
        int [] num = new int[6];

//        String temp = "";
        for(int i = 0; i < num.length; i++){
            num[i] = (int)(Math.random() * 10);
        }

//        for (int i = 0; i < num.length; i++) {
//            temp += num[i];
//        }
//
//        secret += temp;
//        String pw = Arrays.toString(num).replaceAll("[^0-9]","");
//        // System.out.println(secret+pw);
//        String all = secret+pw;


        return secret;
    }




}
