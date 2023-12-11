package functions;
import java.util.*;
public class Functions_factorial{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Functions_factorial fp=new Functions_factorial();
        fp.factorial(n);
    }

    public void factorial(int n) {
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}