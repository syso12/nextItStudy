package sungbok.study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 난 또 이걸 while문으로 풀어보려고 했다.
// 랜덤으로 와야되는줄
// while문으로 풀어봐야겟다!!!!

public class quest033 {
    public static void main(String[] args) {
        ArrayList<String> menuList = new ArrayList<>();

        menuList.add("짜장면");
        menuList.add("짬뽕");
        menuList.add("볶음밥");
        menuList.add("김치찌개");
        menuList.add("제육볶음");
        menuList.add("돈까스");
        menuList.add("카레");
        menuList.add("냉면");
        menuList.add("삼겹살");
        menuList.add("김밥/라면");
        menuList.add("햄버거");
        menuList.add("생선구이");
        menuList.add("떡볶이");
        menuList.add("순대국밥");
        menuList.add("소고기국밥");
        menuList.add("육개장");

        // menuList 를 랜덤하게 섞기
        Collections.shuffle(menuList);

        worldcup(menuList);
//          코드가 중복되므로 간단하게 줄여보자
//        Scanner scan = new Scanner(System.in);
//
//
//        ArrayList<String> selectList = new ArrayList<>();

//        for(int i = 0; i < menuList.size(); i += 2){
//            System.out.println("16강===================");
//            System.out.println("메뉴를 선택해주세요.");
//            System.out.println("1. " + menuList.get(i));  // 0, 2, 4 ...
//            System.out.println("2. " + menuList.get(i+1));
//            System.out.print(">>> ");
//
//            int select = Integer.parseInt(scan.nextLine());
//
//            if(select == 1){
//                selectList.add(menuList.get(i));
//            }else {
//                selectList.add(menuList.get(i+1));
//            }
//        }
//
//
//        // 16강에서 뽑힌 리스트를 옮기는게 핵심
//        menuList.clear(); // 선택된거 전달받기 위한 준비
//        menuList.addAll(selectList); // 선택된거 전달받음
//        selectList.clear(); // 다음꺼 입력받은 준비 끝
//
//        for(int i = 0; i < menuList.size(); i += 2){
//            System.out.println(menuList.size() + "강===================");
//            System.out.println("메뉴를 선택해주세요.");
//            System.out.println("1. " + menuList.get(i));  // 0, 2, 4 ...
//            System.out.println("2. " + menuList.get(i+1));
//            System.out.print(">>> ");
//
//            int select = Integer.parseInt(scan.nextLine());
//
//            if(select == 1){
//                selectList.add(menuList.get(i));
//            }else {
//                selectList.add(menuList.get(i+1));
//            }
//        }
//
//        menuList.clear(); // 선택된거 전달받기 위한 준비
//        menuList.addAll(selectList); // 선택된거 전달받음
//        selectList.clear(); // 다음꺼 입력받은 준비 끝
//
//
//        // 8강
//        for(int i = 0; i < menuList.size(); i += 2){
//            System.out.println(menuList.size() + "강===================");
//            System.out.println("메뉴를 선택해주세요.");
//            System.out.println("1. " + menuList.get(i));  // 0, 2, 4 ...
//            System.out.println("2. " + menuList.get(i+1));
//            System.out.print(">>> ");
//
//            int select = Integer.parseInt(scan.nextLine());
//
//            if(select == 1){
//                selectList.add(menuList.get(i));
//            }else {
//                selectList.add(menuList.get(i+1));
//            }
//        }
//        menuList.clear(); // 선택된거 전달받기 위한 준비
//        menuList.addAll(selectList); // 선택된거 전달받음
//        selectList.clear(); // 다음꺼 입력받은 준비 끝
//
////        menuList = selectList;
////        selectList.clear();
//        // 4강
//        for(int i = 0; i < menuList.size(); i += 2){
//            if(menuList.size() == 2){
//                System.out.println("결승 ==================");
//            }else{
//                System.out.println(menuList.size() + "강===================");
//            }
//            System.out.println("메뉴를 선택해주세요.");
//            System.out.println("1. " + menuList.get(i));  // 0, 2, 4 ...
//            System.out.println("2. " + menuList.get(i+1));
//            System.out.print(">>> ");
//
//            int select = Integer.parseInt(scan.nextLine());
//
//            if(select == 1){
//                selectList.add(menuList.get(i));
//            }else {
//                selectList.add(menuList.get(i+1));
//            }
//        }
//        menuList.clear(); // 선택된거 전달받기 위한 준비
//        menuList.addAll(selectList); // 선택된거 전달받음
//        selectList.clear(); // 다음꺼 입력받은 준비 끝
//
//        // menuList에 1개 들어있으면 해당 음식이 우승
//        // 마지막 if는 어디에나 있어도 된다.
//        if(menuList.size() == 1){
//            System.out.println(menuList.get(0) + "우승!!");
//    }

    }// main 끝

    public static void worldcup(ArrayList<String> menuList){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> selectList = new ArrayList<>();

        for(int i = 0; i < menuList.size(); i += 2){
            if(menuList.size() == 2){
                System.out.println("결승 ==================");
            }else{
                System.out.println(menuList.size() + "강===================");
            }
            System.out.println("메뉴를 선택해주세요.");
            System.out.println("1. " + menuList.get(i));  // 0, 2, 4 ...
            System.out.println("2. " + menuList.get(i+1));
            System.out.print(">>> ");

            int select = Integer.parseInt(scan.nextLine());

            if(select == 1){
                selectList.add(menuList.get(i));
            }else {
                selectList.add(menuList.get(i+1));
            }
        }

        menuList = selectList;

        // menuList에 1개 들어있으면 해당 음식이 우승
        // 마지막 if는 어디에나 있어도 된다.
        if(menuList.size() == 1){
            System.out.println(menuList.get(0) + "우승!!");
        }else {
            // 재귀함수
            worldcup(menuList);
        }
    }



}
