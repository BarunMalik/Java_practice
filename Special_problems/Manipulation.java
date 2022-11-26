package Special_problems;
/*Ezio can manipulate at most X number of guards with the apple of eden.

Given that there are Y number of guards, predict if he can safely manipulate all of them. */
import java.util.Scanner;
public class Manipulation {
    public static void main(String args[]){
        System.out.println("Enter number of guards Ezio can manipulate ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("Enter number of guards present");
        int y=sc.nextInt();
        System.out.println(x>=y?"YES":"NO");
    }

}
