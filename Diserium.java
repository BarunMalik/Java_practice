import java.util.Scanner;
//135 is a disarium number 1^1+3^2+5^3=135
public class Diserium {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt(),c=0,b=a;
        while(b>0){
            c++;
            b=b/10;
        }
        b=a;
        
        int s=0;
        while(c!=0){
            int temp=b%10;
            s+=(int)Math.pow(temp,c);
            b=b/10;c--;
        }
        System.out.println(s==a?"Disarium number":"Not disarium number");
    }
}
