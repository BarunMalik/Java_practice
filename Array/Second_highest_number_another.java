package Array;
//using bubble sort school method
import java.util.Scanner;
public class Second_highest_number_another {
    public static void main(String[] args) {
        int []a=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            System.out.println("Enter number");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[1+j]){
                    int temp=a[1+j];
                    a[1+j]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Second highest number in the array is\t"+a[a.length-2]);
    }
}
