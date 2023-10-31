package sungbok.study;
import java.util.ArrayList;
import java.util.Scanner;

public class quest03 {
    public static void main(String[] args) {

        // 리스트 랜덤 추출
        // 하지만 중복이 되면 안됨
        // 뽑힌것은 어디에 담아야함
        // 리스트에 있는 값들도 담아야?
        // 랜덤 추출갯수를 정해놔야?

        // 앞에 번호를 지정해놓고
        // 번호는 사이즈+ 해서 오게끔 해서
        // 랜덤추출되는것을 번호가 지정되게끔 하면될듯

        // selectlist도 만들어야 되네
        // 선택한것들을 담고 그 안에서 꺼내는 용도

        ArrayList<String> food = new ArrayList<>();
        food.add("짜장면");
        food.add("짬뽕");
        food.add("볶음밥");
        food.add("김치찌개");
        food.add("제육볶음");
        food.add("돈까스");
        food.add("카레");
        food.add("김밥/라면");
        food.add("순대국밥");
        food.add("냉면");
        food.add("삼겹살");
        food.add("햄버거");
        food.add("생선구이");
        food.add("떡볶이");

        // System.out.println(food);
        ArrayList<String> selectList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
//            int choice = (int) (Math.random() * food.size());
            for (int i = 0; i < food.size(); i+=2) {
                System.out.println("16강");
                System.out.println("메뉴를 선택해주세요");
                System.out.println("1. " + food.get(i) + " | " + "2. " + food.get(i+1));
                System.out.print(">>> ");
                int command = Integer.parseInt(scan.nextLine());
                if(command == 1){
                    selectList.add(food.get(i));
                }else if(command == 2){
                    selectList.add(food.get(i));
                }
            }
        }






    }
}