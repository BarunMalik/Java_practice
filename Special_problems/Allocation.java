package Special_problems;
import java.util.Scanner;
public class Allocation {
    Scanner sc=new Scanner(System.in);
    int ar[],b;
    Allocation(){
        System.out.println("Enter budget");
        b=sc.nextInt();
        System.out.println("Number of houses available for sale");
        ar=new int[sc.nextInt()];
        for(int i=0;i<ar.length;i++){
            System.out.println("Enter price of house");
            ar[i]=sc.nextInt();
        }
        sort();
        System.out.println("Number of houses bought\t"+logic());
    }
    public static void main(String[] args) {
        Allocation a=new Allocation();
    }
    void sort(){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length-1-i;j++){
                if(ar[j+1] <ar[j]){
                    int temp=ar[j+1];
                    ar[j+1]=ar[j];
                    ar[j]=temp;
                }
                             
            }
        }
    }
    int logic(){int p=0,prc=0,kk=b,f=0;
        for(int i=0;i<ar.length;i++){
            prc+=ar[i];
            kk-=ar[i];
            if(kk>= prc){
                if(++f==1){++p;}
                ++p;
            }
        }
        return p;
    }
}
