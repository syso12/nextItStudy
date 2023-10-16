package sungbok.submit09.q01;

public class Product {

    String name; //private <- 캡슐화
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product[" +
                "name=" + name  +
                ", price=" + price +
                ']';
    }
}
