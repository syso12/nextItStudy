package ch10_extends_interface.ramen;

public class Mupama extends Ramen{

    public Mupama() {
    }

    public Mupama(String name, int price, String company) {
        super(name, price, company);
    }

    @Override
    public void printRecipe(){
        System.out.println("끓는 물에 분말스프와 건더기스프를 넣고 3분후 잘 저어 드세요.");
    }
}
