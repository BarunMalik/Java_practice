package Array;
//input an array and check whether it is in ascending order or not
import java.util.Scanner;
public class Check1 {
    public static void main(String []args){
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            System.out.print(" Enter numbers\n");
            a[i]=sc.nextInt();
        }
        boolean m=false;
        for(int i=1;i<a.length;i++){
            if(a[i] <a[i-1]){
                m=true;break;
            }
        }System.out.println(m?"Not in ascending":"Ascending");
    }
}
