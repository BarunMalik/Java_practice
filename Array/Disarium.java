package Array;
//enter 10 numbers and print all the disarium numbers
import java.util.Scanner;
public class Disarium {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        for(int i=0;i<a.length;i++){
            System.out.println("Enter number");
            a[i]=sc.nextInt();
        }
        System.out.println("Disarium numbers are\n");
        for(int i=0;i<a.length;i++){
            int k=a[i],b=k,c=0;
            while(b>0){
                c++;
                b=b/10;
            }
            b=k;
            
            int s=0;
            while(c!=0){
                int temp=b%10;
                s+=(int)Math.pow(temp,c);
                b=b/10;c--;
            }
            if(a[i]==s){
            System.out.println(a[i]);}
        }
    }
}
