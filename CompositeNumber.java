import java.util.Scanner;

//a composite number is just the opposite of prime number
//input a number and check if it is a composite number 
public class CompositeNumber {
    public static void main(String args[]){Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");int a=sc.nextInt();
       System.out.println(isPrime(a)?"Not Composite":"Composite"); 
    }
    static boolean isPrime(int a){int p=0;
        for(int i=1;i<=a;i++){
            p=a%i==0?++p:p;
        }return p==2;
    }
}
