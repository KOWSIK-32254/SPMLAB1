package patterns;
import java.util.Scanner;

public class originalrev {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int rev=0;
    while(n>0){
    rev=(rev*10)+n%10;
    n=n/10;
    }
    System.out.println(rev);

}
