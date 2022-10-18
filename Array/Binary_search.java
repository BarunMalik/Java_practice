package Array;
import java.util.Scanner;
//in Binary search the array must be sorted
public class Binary_search {
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7,8,9,10};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int s=0,e=a.length-1,mid,pos=-1,n=sc.nextInt();
        while(pos==-1&&s<=e){
            mid=(s+e)/2;
            if(a[mid]==n){pos=mid;}
            else if(n<a[mid]){
                e=mid-1;
            }else{s=mid+1;}
        }System.out.println(pos!=-1?"present\t"+pos:"not present");
    }
}
