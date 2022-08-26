//a automorphic number is a number in which the square of the number is the addition of the seperated digits of the number.
//example 9 square is 81 so 8+1=9
import java.util.*;
public class Automorphic {
    public static void main(String []args){Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
    int a=sc.nextInt(),b=a*a,s=0;
    while(b>0){
s+=(b%10);b=b/10;
    }System.out.println(s==a?"Automorpic Number":"Not Automorpic");
    }
}
