package Array;
import java.util.*;
public class Burning_trees {
    int a[][];
    
    Scanner sc=new Scanner(System.in);
    Burning_trees(){
        System.out.println("Enter number of rows and then columns");
        a=new int[sc.nextInt()][sc.nextInt()];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=new Random().nextInt(2);
            }
        }print();
        System.out.println("tree needed to be burnt the count starts from 0\n First row and then column");

    }
    void print(){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]);
            }System.out.println();
        }
    }
    public static void main(String args[]){
        new Burning_trees();
    }
}
