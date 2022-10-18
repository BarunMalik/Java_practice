package Array;
import java.util.Scanner;
public class Bubble_sort {
 public static void main(String[] args) {
        int a[]=new int [10];
        System.out.println("Enter");
        for(int i=0;i<a.length;i++){
            a[i]=new Scanner(System.in).nextInt();
        }
        int temp=0; 
        for(int l=0;l<a.length;l++){
            for(int j=0;j<a.length-l-1;j++){//conventionally for ascending order the previous element should be smaller but if this is not the case the code executes
               if(a[j]>a[1+j]){
                temp=a[j+1];
                a[j+1]=a[j];
                a[j]=temp;
                }
            }
        }
        System.out.println("Ascending order");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
   
}
