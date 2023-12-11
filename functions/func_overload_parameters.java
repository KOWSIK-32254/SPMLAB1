import java.util.Scanner;

public class func_overload_parameters {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a =s.nextInt();
        int b =s.nextInt();
        int c =s.nextInt();

        sum(a,b);
        sum(a,b,c);
    }

     static void sum(int a, int b, int c) {
        System.out.println("function sum (method overloading) with 3 variables "+ (a+b+c));
    }

     static void sum(int a, int b) {
        System.out.println("function sum (method overloading) with 2 variables "+ (a+b));
    }
}
