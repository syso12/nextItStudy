package Master;
import java.util.Scanner;
public class master {
    public static void main(String[] args) {

        System.out.println(max4(152, 458, 8944));
        System.out.println(max4(41695, 984984, 984891));
        System.out.println(min3(10, 2, 5 ));
        System.out.println(min4(6,66,9,321));



    }
    //                          1, 2, 3
    public static int max4(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        return max;
    }
    public static int min3(int a, int b, int c) {
        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;

        return min;
    }
    public static int min4(int a, int b, int c, int d) {
        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;
        if(d < min) min = d;
        return min;
    }
}
