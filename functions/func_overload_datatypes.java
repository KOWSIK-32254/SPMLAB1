
public class func_overload_datatypes {
     public static void main(String[] args) {

        sum(3,5);
        sum(3.5f,5.2f);
    }

     static void sum(int a, int b) {
        System.out.println("function sum (method overloading) with datatypes "+ (a+b));
    }

     static void sum(float a, float b) {
        System.out.println("function sum (method overloading) with Data types  "+ (a+b));
    }
}
