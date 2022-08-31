import java.util.Scanner;

//a duck number is a number which has zero in it
public class Ducknumber {
static boolean check(int n){
    while(n>0){
        if(n%10==0){return true;}n=n/10;
    }return false;
}
    public static void main(String args[]){Scanner sc =new Scanner (System.in);
       System.out.println("Enter the number");
        System.out.println(check(sc.nextInt())?"Duck number":"Not Duck number");
    }
}
