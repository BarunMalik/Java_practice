//a number after seperating the digits ,the factorial of the seperated digits are added and it is equal to the number
import java.util.Scanner;

public class krishnamutri{
    static int factorial(int n){int m=1;
        for(int i=1;i<=n;i++){
            m=m*i;
        }return m;
    } 
    public static void main(String args[]){Scanner sc=new Scanner(System.in);
System.out.println("Enter Number");int a=sc.nextInt(),s=0,p=a;
while(p>0){
s+=factorial(p%10);
    p=p/10;
}System.out.println(s==a?"Krishnamutri number":"Not Krishnamutri number");
    }
}