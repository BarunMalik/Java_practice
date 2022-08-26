// a automorpic number is a number whose square is present in the last of the number the shortway
import java.util.Scanner;
public class Automorpic2 {
    public static void main(String args[]){Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number ");
        int a=sc.nextInt(),b=a*a,l=(""+a).length(),d=(int)Math.pow(10, l),e=b%d;
        System.out.println(e==a?"Automorphic":"Not Automorphic");
    }
}
