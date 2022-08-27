import java.util.Scanner;

//prime number pattern
public class Prime {Scanner sc=new Scanner(System.in);
 boolean isPrime(int n){
    int p=0;
    for(int i=1;i<=n;i++){
        p=n%i==0?++p:p;
    }return p==2;
 }
 void range(int f,int l){
if(f==l){System.out.println("Wrong Input\nThe first range and the last range cannot be same enter again");
range(sc.nextInt(), sc.nextInt());}else{System.out.println("Prime numbers are:");
    for(int i=f;i<=l;i++){if(isPrime(i)){
        System.out.println(i);}
    }
}
 }
 public static void main(String args[]){
    System.out.println("Enter range to print prime numbers");
    new Prime().range(new Prime().sc.nextInt(), new Prime().sc.nextInt());
 }
}
