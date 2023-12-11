import java.util.Scanner;

public class func_primerange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        primeran(n);

    }

    public static void primeran(int n){
        System.out.println("primes are : ");
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.println(i+" ");
            }
        }
    }


    public static boolean isprime(int n){
        if(n==2){
            return true;
        }
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}
