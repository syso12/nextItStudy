package ch11_java_api;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class ApiDate {
    public static void main(String[] args) throws ParseException {
        // API 란?? 완성된, 만들어져있는 코드를 가져다 쓰는것
        // SDK 란?? 프로그램 로직, 기술이 만들어져있으나
        // 그냥 가져다쓰기보다는 가지고 와서 추가적인 개발을
        // 해서 써야하는 것

        // JDK 안에 만들어져있는 API 들 배우기

        // 현재 시간 구하기
        // 1. Date 클래스 사용
        Date dateToday = new Date();

        // Date 객체가 생성될 때 (= new Date() 실행)
        // Date 객체 내부에 new Date()가 실행되었을때의 시간이
        // 저장된다.
        // Date는 날짜를 나타내는 객체

        // Tue Oct 24 10:26:52 KST 2023
        System.out.println(dateToday);

        // 날짜 포맷을 이용하여
        // 2023-10-24 10:26:55  형태로 바꾸기
        // SimpleDateFormat 방식이 제일 쉬운거같다.
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        // sdf.format(Date 객체) 는 Date 객체에 저장된 날짜를
        // 정해둔 날짜 포맷형식으로 변환한 문자열을 리턴
        String strToday = sdf.format(dateToday);
        System.out.println(strToday);

        System.out.println("\n=========================================================\n");

        // 2. Calendar 클래스 사용
        // .getInstance() 실행시 새로운 객체가 생성된다.
        // 객체가 생성될 때의 시간이 저장된다.
        Calendar calToday = Calendar.getInstance();

        System.out.println(calToday);

        // Calendar 객체에서 Date객체 꺼내기
        Date calToDate = calToday.getTime();

        System.out.println(calToDate);
        System.out.println(sdf.format(calToDate));
        System.out.println(sdf.format(calToday.getTime()));

        System.out.println("\n=====================================================\n");

        // 3. System 클래스 사용
        // 현재 시간에 대해 밀리초 단위로 리턴
        // 1970년 1월 1일 0시부터 현재까지 경과된 시간을 밀리초 단위로 리턴
        long longToDay = System.currentTimeMillis();
        System.out.println(longToDay);

        System.out.println(sdf.format(longToDay));
        System.out.println(sdf.format(0L));

        System.out.println("\n==================================================\n");

        // 다양한 날짜 타입 만들기
        // 1. 2023/10/24 11:04:30
        // 2. 23-10-24 오전 11:04:30
        // 3. 화요일 11:04:30
        // @ 2023.10.24 AM 11:04:30


        // 1. hh -> 0~12 라서 오후 2시면 02로 표현
        // h -> 오전 3시면 3, 오후 4시면 4로 표현 (한자리 숫자에 대해 앞에 0이 안붙음)
        // HH -> 0~24라서 오후 2시면 14로 표현
        // yyyy -> 2023, yy -> 23
        // MM -> 7월이면 07로 표현, M -> 7월이면 7로 표현
        Date date1 = new Date();
        SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
        String time1 = sdf1.format(date1);
        System.out.println(time1);

        // 2. 23-10-24 오전 11:04:30 오전은 hh
        // 2. 23-10-24 오후 11:04:30 오후는 HH를 붙이는게 일반적
        Date date2 = new Date();
        SimpleDateFormat sdf2 = new SimpleDateFormat("YY-MM-dd a hh:mm:ss");
        String time2 = sdf2.format(date2);
        System.out.println(time2);

        // 3. 화요일 11:04:30
        Date date3 = new Date();
        SimpleDateFormat sdf3 = new SimpleDateFormat("E요일 HH:mm:ss");
        String time3 = sdf3.format(date3);
        System.out.println(time3);

        // @ 2023.10.24 AM 11:04:30
        Date date4 = new Date();
        SimpleDateFormat sdf4 = new SimpleDateFormat("YYYY.MM.dd a HH:mm:ss", Locale.US);
        String time4 = sdf4.format(date4);
        System.out.println(time4);

        // @ 현재 미국날짜를 2023.10.24 AM 01:04:30 로 출력하기
        TimeZone time;
        time = TimeZone.getTimeZone("America/Los_Angeles");
        DateFormat df = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
        df.setTimeZone(time);
        System.out.println(df.format(new Date()));

//        TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
//        Calendar calendar = Calendar.getInstance(timeZone);
//        Date date5 = calendar.getTime();
//        System.out.println(sdf4.format(date5));

        System.out.println("\n=================================================\n");

        // 날짜형 문자열(String) -> Date 객체로 변환
        String strTomorrow = "2023-10-25 20:12:45";

        // SimpleDateFormat 에 문자열과 같은 형태의 포멧 설정
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // parse는 Integer parseInt에서 쓰이는 parse임
        // 해당 날짜형 문자열의 날짜가 저장된 Date 객체 리턴
        // sdf의 날짜 포멧과 날짜형 문자열의 형식이 하나라도 다르면 에러남
        Date dateTomorrow = sdf.parse(strTomorrow);

        System.out.println(dateTomorrow);

        String strtime = "11:48:32";
        sdf = new SimpleDateFormat("HH:mm:ss");
        Date datetime = sdf.parse(strtime);
        System.out.println(datetime); // Thu Jan 01 11:48:32 KST 1970

        String strYear = "2023.10.20";
        sdf = new SimpleDateFormat("yyyy.MM.DD");
        Date DateDay = sdf.parse(strYear);
        System.out.println(DateDay); // Fri Jan 20 00:00:00 KST 2023

        System.out.println("\n=============================================\n");

        // 날짜 세팅하기
        Calendar cal = Calendar.getInstance();

        // 98년 12월 02일
        // 여기서 month 부분은 1월이 0, 2월이 1, .... 12월이 11
        // 월이 크면 년도 같이 넘어가게된다.
        cal.set(1998, 11, 2);
        cal.set(1998, 11, 2, 4, 20, 20);

        sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        System.out.println(sdf.format(cal.getTime()));

        // Date 타입의 객체를 Calendar 타입으로 변환
        Date temp = new Date();
        Calendar calTemp = Calendar.getInstance();
        calTemp.setTime(temp);      // Date 객체의 시간이 Calendar 객체에 저장된다.

        // 2023.10.25 20:12:45
        System.out.println(sdf.format(calTemp.getTime()));

        // 날짜 꺼내기

        // 년도
        System.out.println(calTemp.get(Calendar.YEAR)); // 1이라는 숫자에 대해 네이밍이 주어진 상태
        // System.out.println(calTemp.get(1)); // 위의 YEAR과 같은값을 출력
        // 월
        System.out.println(calTemp.get(Calendar.MONTH) + 1);
        // 일
        System.out.println(calTemp.get(Calendar.DATE));
        // 시간
        System.out.println(calTemp.get(Calendar.HOUR)); // 8
        System.out.println(calTemp.get(Calendar.HOUR_OF_DAY)); // 20

        // 분
        System.out.println(calTemp.get(Calendar.MINUTE));
        // 초
        System.out.println(calTemp.get(Calendar.SECOND));

        System.out.println("\n=========================================\n");

        // 날짜 연산
        String oneDay = "2023.10.24 12:21:32";
        String twoDay = "2023.11.21 11:11:22";

        sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        Date oneDate = sdf.parse(oneDay);
        Date twoDate = sdf.parse(twoDay);

        // Date 객체에 .getTime() 하면 그 밀리초(long)가 나옴
        System.out.println(oneDate.getTime());
        System.out.println(twoDate.getTime());

        Long diffMillSec = twoDate.getTime() - oneDate.getTime();
        System.out.println(diffMillSec + "밀리초 차이");

        // 1초 = 1000밀리초
        // diffMillSec / 1000 => 초단위
        long diffSec = diffMillSec / 1000;
        System.out.println(diffSec + "초 차이");

        // 1분 = 60초
        // diffSec / 60 => 분단위
        long diffMin = diffSec / 60;
        System.out.println(diffMin + "분 차이");

        // 1시간 = 60분
        // diffMin / 60 => 시단위
        long diffHour = diffMin / 60;
        System.out.println(diffHour + "시 차이");

        // 1일 = 24시간
        // diffHour / 24 => 일 단위
        long diffDay = diffHour / 24;
        System.out.println(diffDay + "일 차이");

        // 한줄로 몇일 차이인지 확인
        long diff = diffMillSec / 1000 / 60 / 60 / 24;
        System.out.println(diff + "일 차이");

        System.out.println("\n===================================\n");

        // 디데이 계산기
        // 2023.09.18 에 대해 +36
        // 2023.11.03 에 대해 -10
        // 이 출력되는 디데이 계산기 만들어 보기

        // 오늘 날짜에 대한 Date 객체 생성후
        // 1. welcomeDay와 날짜연산
        // 2. together와 날짜연산
        String welcomeDay = "2023.09.18";

        // String toDay = "2023.10.24";
        Date toDay = new Date(); // 오늘 날짜는 이런식으로 선언하자!!

        sdf = new SimpleDateFormat("yyyy.MM.dd");

        Date welDay = sdf.parse(welcomeDay);
        // Date tDay = sdf.parse(toDay);

        System.out.println(welDay.getTime());

        long MilSec = toDay.getTime() - welDay.getTime();

        System.out.println(MilSec);

        long day = MilSec / 1000 / 60 / 60 / 24;
        System.out.println("날짜 차이는 " + day + "일");


        String together = "2023.11.03";
        // toDay에 시/분/초 가 00:00:00이 되어야 함
        // 시스템 날짜상에는 시간이 정해져있기때문에 지정한 날짜와 시간 차이가 있어서
        // 날짜계산이 제대로 되지않음.

        // toDay <- 2023.10.25 09:16:22
        String ttoDay = sdf.format(toDay); // <- 2023.10.25 00:00:00이 된다.
        // String ttoDay = "2023.10.25"와 같다
        Date tog = sdf.parse(together);

        System.out.println(tog.getTime());

        long Milmin = toDay.getTime() - tog.getTime();

        System.out.println(Milmin);

        long todayy = (Milmin / 1000 / 60 / 60 / 24);
        System.out.println("날짜 차이는 " + todayy + "일");


        System.out.println("\n=====================================================\n");

        // Calendar 날짜 연산
        // 특정 날짜를 기준으로 날짜를 더하거나 뺄때 유용
        Calendar toCal = Calendar.getInstance();
        System.out.println(sdf.format(toCal.getTime()));

        // 3일 뒤
        toCal.add(Calendar.DATE, 3);
        System.out.println(sdf.format(toCal.getTime()));

        // 20일 뒤
        toCal.add(Calendar.DATE, 20);
        System.out.println(sdf.format(toCal.getTime()));

        // 7일 전
        toCal.add(Calendar.DATE, -7);
        System.out.println(sdf.format(toCal.getTime()));

        // 10달 뒤
        toCal.add(Calendar.MONTH, 10);
        System.out.println(sdf.format(toCal.getTime()));

        System.out.println("\n==================================================\n");

        // 달력만들기
        // Date 객체보단 Calendar를 이용하자
        int year = 2023;
        int month = 9;

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1); // month는 지정한 값과 +1이 되있기 때문에 반대로 -1을하면 원하는값이 나온다.
        System.out.println(sdf.format(calendar.getTime()));

        // 해당월에 따라 1일이 무슨요일에 시작하는지 알아야한다.
        // DAY_OF_WEEK의 리턴값 :   1:일요일, 2:월요일, 3:화요일.....7:토요일
        int startDay = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(startDay); // 3

        // 해당 월의 마지막 일자가 몇인지도 알아야한다.
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(lastDay); // 31

        System.out.println(year + "년" + month + "월 달력");
        System.out.println("일\t월\t화\t수\t목\t금\t토");


        for (int i = 1; i <= 42; i++) { // 왜 42일까??
            // i가 startDay보다 작으면 출력 안함
            if (i < startDay) {
//                System.out.println("\t");
            } else {
                // startDay가 3이라면
                // i는 3일때 처음 들어온다.
                // i = 3 -> 1
                // i = 4 -> 2
                // i = 5 -> 3

                // startDay가 4라면
                // i 는 4일때 처음 들어온다.
                // i = 4 -> 1
                // i = 5 -> 2
                // i - startDay + 1
                int currentDay = i - startDay + 1;
                // System.out.println(currentDay);

                // currentDay가 lastDay보다 크면 for문 종료
                if (currentDay > lastDay) {
                    break;
                }

                System.out.printf("%02d\t", currentDay);
            }

            // i가 7, 14, 21, 28 .... 일때 줄바꾸기
            if (i % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n=======================================\n");

        // 주말이 제외된 달력을 만들어 보기
        // 일 요일 토요일 빼고 나머지 날짜가 출력 되게끔 하기

        System.out.println(startDay);
        System.out.println(lastDay);

        System.out.println(year + "년" + month + "월 달력");
        System.out.println("월\t화\t수\t목\t금");

        for (int i = 1; i <= 42; i++) {
            if (i < startDay && i > 1) {
                // i가 1일때 일요일인데도 탭이 추가된다.
                System.out.println("\t");
            } else {
                int currentDayy = i - startDay + 1;
                if (currentDayy > lastDay) {
                    break;
                }
                // 숫자를 그리는 부분
                // 일, 토요일은 그리지 않도록
                // i % 7 == 0일때 그리지않음
                // 또 i % 7 == 1일때도 그리지 않음
                // i % 7 == 0 또는 i % 7 == 1 이 아닌경우에만 그린다.
                if(!(i % 7 == 0 || i % 7 == 1)){
                    System.out.printf("%02d\t", currentDayy);
                }

            }

            // i가 7, 14, 21, 28 .... 일때 줄바꾸기
            if (i % 7 == 0) {
                System.out.println();


            }

        }


    }
}
