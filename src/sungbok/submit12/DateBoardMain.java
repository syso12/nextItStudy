package sungbok.submit12;

import ch09_class.nextit.NextStudent;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;

public class DateBoardMain {

    public static void main(String[] args) throws ParseException {
        // dbList에 랜덤 날짜를 가지는 DateBoard 객체 100개 삽입
        ArrayList<DateBoard> dbList = new ArrayList<DateBoard>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

        for (int i = 0; i < 100; i++) {
            int randDay = (int) (Math.random() * 365) + 1;        // 1~365
            Calendar cal = Calendar.getInstance(); // 오늘날짜
            cal.add(Calendar.DATE, randDay * -1); // 오늘날짜에서 1~365 중 랜덤한 일수를 뺀다.

            String strDate = sdf.format(cal.getTime());
            dbList.add(new DateBoard((i + 1) + "번째 생성된 글", strDate));
        }

        for (int i = 0; i < dbList.size(); i++) {
            // System.out.println(dbList.get(i));
        }

        // TODO 코드작성 시작 ~!!

        // 날짜는 String 타입으로 정해져있다.
        // 그러면 Date타입으로 형변환을 해야 한다.
        // 형변환을 해야 정렬이 가능하다.
        // 날짜의 변수가 date로 되있나??

        // 배열에서 날짜만 따로 분리하기
        // 분리해서 String 타입을 Date타입으로 형변환하고
        // 정렬하고 년월일 분리 하고

        // 버블정렬 로 풀어야 함
//        for (int a = 0; a < dbList.size(); a++) {
//            String tday = dbList.get(a).getDate();
//            SimpleDateFormat sdff = new SimpleDateFormat("yyyy.MM.dd");
//            Date tdate = sdff.parse(tday);
//            Long time = tdate.getTime();
//        }
        System.out.println("\n=======================최근 날짜 순서==============================\n");
        for (int k = 0; k < dbList.size() - 1; k++) {
            for (int i = 0; i < dbList.size() - 1 - k; i++) {
                Date tdate1 = sdf.parse(dbList.get(i).getDate());
                Date tdate2 = sdf.parse(dbList.get(i+1).getDate());

                Long Milltime = tdate2.getTime() - tdate1.getTime();
                if (Milltime > 0) {


                    // 뒤집는 부분
                    DateBoard board = dbList.get(i);
                    dbList.set(i, dbList.get(i + 1));
                    dbList.set(i + 1, board);
                }
//                    // swap(intArr, i, i+1);
//                    NextStudent tmp = stuList.get(i);
//                    // numList.get(i+1) : numList 요소 중 인덱스 i+1
//                    stuList.set(i, stuList.get(i + 1));
//                    stuList.set(i + 1, tmp);
            }
        }

        for (int i = 0; i < dbList.size(); i++) {
            System.out.println(dbList.get(i));
        }

        System.out.println("\n==========================오래된 날짜 순서===============================");
        for (int k = 0; k < dbList.size() - 1; k++) {
            for (int i = 0; i < dbList.size() - 1 - k; i++) {
                Date tdate1 = sdf.parse(dbList.get(i).getDate());
                Date tdate2 = sdf.parse(dbList.get(i+1).getDate());

                Long Milltime = tdate1.getTime() - tdate2.getTime();
                if (Milltime > 0) {


                    // 뒤집는 부분
                    DateBoard board = dbList.get(i);
                    dbList.set(i, dbList.get(i + 1));
                    dbList.set(i + 1, board);
                }
//                    // swap(intArr, i, i+1);
//                    NextStudent tmp = stuList.get(i);
//                    // numList.get(i+1) : numList 요소 중 인덱스 i+1
//                    stuList.set(i, stuList.get(i + 1));
//                    stuList.set(i + 1, tmp);
            }
        }

        for (int i = 0; i < dbList.size(); i++) {
            System.out.println(dbList.get(i));
        }

        System.out.println("\n=============================최근 한달 내=======================================\n");

        // 캘린더로 형변환 해서
        // 현재시간하고  날짜 비교
        // 30일 이내

        Calendar tocal = Calendar.getInstance();

        //System.out.println(sdf.format(tocal.getTime()));

        tocal.add(Calendar.DATE,-30);

        // 오늘 기준 30일전 날짜
         //System.out.println(sdf.format(tocal.getTime()));
        Date date4 = tocal.getTime();
        // long month = sdf.parse(date4.getTime());
        //System.out.println(date4.getTime());

        // 이거를 long타입으로 형변환 ㄱㄱ

        for(int i = 0; i < dbList.size(); i++){
            Date date3 = sdf.parse(dbList.get(i).getDate());
            // 각 게시글 날짜 long타입
             //System.out.println(date3.getTime());
            if(date3.getTime() > date4.getTime()){
                System.out.println(dbList.get(i));
            }
        }

        System.out.println("\n=======================이번달 작성된 글=============================\n");

        Date date1 = new Date();
        sdf.format(date1.getTime());

        System.out.println(date1.getTime());

        Calendar toCal = Calendar.getInstance();

        int temp = toCal.get(Calendar.MONTH)+1;
        System.out.println(temp);

        // 10월을 뽑았고
        // db리스트에서 month가 10월과 같은지 비교
        // 같은거만 출력

        for(int i = 0; i < dbList.size(); i++) {
            Date tdate1 = sdf.parse(dbList.get(i).getDate());
            SimpleDateFormat sdff = new SimpleDateFormat("yyyy.MM");
            String dat = sdff.format(tdate1);
            if(temp == Integerdat()){
                System.out.println(dbList.get(i));
            }
        }


    }
}



















