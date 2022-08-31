import java.util.Scanner;

public class TwinPrime {
    public static void main(String args[]){Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers");int a=sc.nextInt(),b=sc.nextInt();
        System.out.println((isPrime(a)&&isPrime(b)&&Math.abs(a-b)==2)?"Twin prime number":"Not twin prime number");
    }
    static boolean isPrime(int n){int p=0;
        for(int i=1;i<=n;i++){
            p=n%i==0?++p:p;
        }return p==2;
    }
}
//enter 2 numbers and check whether they are twin prime numbers are not 
