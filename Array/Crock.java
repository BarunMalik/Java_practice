package Array;
import java.util.Scanner;

public class Crock {
    Scanner sc=new Scanner(System.in);
    int i=0,d=0,e=0;
    int a[];
    Crock(){
        System.out.println("Enter number of ducks to be");
        d=sc.nextInt();a=new int[d];
        System.out.println("Duck to eat first");
        e=sc.nextInt();
        eat(e);
        System.out.println("Starts:");
    }
    boolean doesexist(int k){boolean m=false;
        for(int j=0;j<a.length;j++){
            if(a[j]==k){
                m=true;break;
            }
        }return m;
    }
    void eat(int n){
       System.out.println(e);
        for(int is=1;is<=n;is++){
            ++e;if(e>a.length){e=1;}
        }blacklist(e);
        if(!doesexist(n)){
            eat(n);
        }
    }
    void blacklist(int p){
        a[i++]=p;
    }
    public static void main(String[] args) {
        new Crock();
    }
}
