//a buzz nmber is a number which either ends with 7 or divisible by 7
import java.util.Scanner;
public class BuzzNumber {
 public static void main(String[] args) {System.out.println("Enter number to check");
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println(a%7==0||(a%10)==7?"Buzz number":"Not Buzz nmber");
           }
}
