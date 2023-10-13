package sungbok.submit09.q01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductMain {
    public static void main(String[] args) {

        Product naeng = new Product("냉장고", 2000000);
        Product tv = new Product("TV", 1000000);
        Product air = new Product("에어컨", 800000);
        Product com = new Product("컴퓨터", 1300000);
        Product seon = new Product("선풍기", 100000);

        ArrayList<Product> productsList = new ArrayList<>();
        productsList.add(naeng);
        productsList.add(tv);
        productsList.add(air);
        productsList.add(com);
        productsList.add(seon);

//        System.out.println(products);

        for (int k = 0; k < productsList.size() - 1; k++) {
            for (int i = 0; i < productsList.size() - 1; i++) {
                if (productsList.get(i).price < productsList.get(i + 1).price) {
                    Product price = productsList.get(i);
                    productsList.set(i, productsList.get(i + 1));
                    productsList.set(i + 1, price);
                }
            }
        }

        for(int i = 0; i < productsList.size(); i++){
            System.out.println(productsList.get(i));
        }

//
//
//        Collections.sort(products, new Comparator<Product>() {
//            @Override
//            public int compare(Product p1, Product p2) {
//                return p1.price - p2.price;
//            }
//        });
//        for (int i = 0; i < products.size(); i++) {
//            //System.out.println(products.get(i));
//        }
//        // 배열의 인덱스 값을 가져오기
//        // for문으로 순회하기
//        // if로 만약에 product.size에 tv가 있는지 봐야된다.
//        //
//        System.out.println(products.get(0).name);


        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).name.equals("TV")) {
                System.out.println(i);
            }
        }


        System.out.println("\n====================================\n");



    }


}
