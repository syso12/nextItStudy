package sungbok.submit12;

public class CartoonBoard extends Board{
    private String image;

    public CartoonBoard() {
        super();
    }

    public CartoonBoard(int num, String title, String day, String content, String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
