package functions;
import java.util.*;

public class Functions_prac1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        Functions_prac1 fp = new Functions_prac1();
        fp.multiply(n, x);
    }

    void multiply(int a, int b) {
        int c = a * b;
        System.out.println(c);
    }
}
