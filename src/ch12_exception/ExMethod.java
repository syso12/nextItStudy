package ch12_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExMethod {

    // 날짜 문자열을 입력하면 그 밀리초로 바꿔서 리턴
    // yyyy.MM.dd 로 들어와야 함
    public static long dateToMillSec(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
        // 패턴과 다른 형태의 문자열이 파라미터로 들어오면 ParseException 발생
        // 해당에러에 대한 처리를 여기서 할거면 try - catch 사용
        // 해당에러에 대한 처리를 안할꺼면 throws를 이용하여 던진다.
        // -> 이후 dateToMillSec 메소드를 사용하는 곳에서 try - catch 사용해야 함
        Date result = sdf.parse(date);
        return result.getTime();
        // try - catch 는 에러상황 적절히 처리
//        try{
//            Date result= sdf.parse(date);
//            return result.getTime();
//        }catch (Exception e){
//            System.out.println("패턴 좀 맞춰주세요~!!");
//        }
//        return 0;

    }

    // 파라미터로 0이 들어오면 가위 리턴
    // 파라미터로 1이 들어오면 바위 리턴
    // 파라미터로 2이 들어오면 보 리턴

    public static String game(int num) throws Exception {
        if (num == 0) {
            return "가위";
        } else if (num == 1) {
            return "바위";
        } else if (num == 2) {
            return "보";
        } else {
            // 에러 발생 시키기
            // Exception을 상속받는 예외 클래스 객체를 생성하면서 던진다.
            throw new Exception("파라미터에 0~2 사이의 숫자를 넣어주세요.");
        }



    }
    // 입력받은 문자열을 콘솔창에 출력
    // 파라미터로 들어온 문자열이 숫자이거나, empty면 안됨
    public static void printName(String name) throws BizException{

        if(name.length() == 0){
            //throw new ArithmeticException();
            throw new BizException(ExCode.API_001, "빈문자열은 안됩니다");
        }else if(name.matches("^[0-9]+$")){
            // throw new ClassCastException();
             throw new BizException(ExCode.API_002, "숫자는 안됩니다.");
        }else {
            System.out.println(name);
        }

    }


}

