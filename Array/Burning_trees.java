package Array;
import java.util.*;
public class Burning_trees {
    int a[][];
    int r1,c1;
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
        r1=sc.nextInt();c1=sc.nextInt();
        if(!exist(r1, c1)&&a[r1][c1]==0){
            System.out.println("Given coordinates or tree doesnot exist");
        }else{
            System.out.println("The trees starts burning");
            square(r1, c1);
            print();
        }
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
    boolean exist(int x,int y){  //x for row and y for column
        return x>=0&&y>=0&&a.length>x&&a[x].length>y;
    }
    void square(int x,int y){--x;
        --y;
        int idex=3,yp=y;    
        for(int i=0;i<idex;i++){
            for(int j=0;j<idex;j++){
                if(exist(x, y)&&a[x][y]!=0){
                   //retaining the values in here and calling more squares
                   
                    a[x][y]=0;
                }y++;
            }x++;
            y=yp;}
    }
    void more_square(int x,int y){

    }
}
