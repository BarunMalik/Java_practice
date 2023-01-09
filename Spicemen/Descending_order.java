//enter 10 numbers and print them in descending order
package Spicemen;
import java.util.Scanner;
public class Descending_order {
    public static void main(String[] args) {
        int a[]=new int[10];
        int a1[]=new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            a1[i]=a[i];
        }
     
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if((a[j] < a[1+j])){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Original array");
        for(int i=0;i<a.length;i++){
            System.out.println(a1[i]);
        }
        System.out.println("Sorted array");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
