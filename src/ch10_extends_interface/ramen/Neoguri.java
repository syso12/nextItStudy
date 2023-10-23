package ch10_extends_interface.ramen;

public class Neoguri extends Ramen{

    public Neoguri() {
    }

    public Neoguri(String name, int price, String company) {
        super(name, price, company);
    }

    @Override
    // Override는 생략 가능하지만
    // 명시적으로 적어놔야 부모클래스로 부터 상속받고있는지 알수있다.
    public void printRecipe() {
        System.out.println("끓는 물에 다시마와 스프, 면을 넣고 4분 동안 익힌 후 드셔요");
    }

}
