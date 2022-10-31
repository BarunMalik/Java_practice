package Array;
import java.util.Scanner;
public class Common {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5],b[]=new int[5];
        for(int i=0;i<b.length;i++){
            System.out.println("enter 2 numbers");
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        for(int i=0;i<b.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]==b[j]){
                    System.out.println("Common element\t"+a[i]);
                    break;
                }
            }
        }
    }
}
