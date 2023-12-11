package patterns;
import java.util.*;
public class reverse{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        while(n>0){
            int ld=n%10;
            System.out.print(ld);
            n=n/10;
        }
        s.close();
    }
}