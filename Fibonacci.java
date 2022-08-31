//write a program to print n number of fibonacci number
import java.util.Scanner;
public class Fibonacci {
    void fibonacci(int z){int a=1,b=0,c=0;
        for(int i=0;i<=z;i++){
            System.out.print(c+"\t");c=a+b;a=b;b=c;
        }
    }
     public static void main(String[] args) {System.out.println("Enter number of times to print ");
        new Fibonacci().fibonacci(new Scanner(System.in).nextInt());
    }
}
