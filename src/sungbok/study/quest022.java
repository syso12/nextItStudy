package sungbok.study;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

// 나는 너무 어렵게 풀었다 ㅡㅡ;;
// 6개의 숫자만 출력하면 되기때문에
// 배열에 숫자를 담는것이 아니라 for문을 6번 반복하면 되는것이었다.
public class quest022 {
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString());

        SimpleDateFormat sdf = new SimpleDateFormat("yyMMddHHmmssSSS");

        String time = sdf.format(new Date());

        for(int i = 0; i < 6; i++){
            time +=(int)(Math.random() * 10);
        }
        System.out.println(time);
    }
}
