package Special_problems;
import java.util.Scanner;
public class Volume_Control {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter current volume");
        int x=sc.nextInt();
        System.out.println("Enter required volume");
        int y=sc.nextInt();
        System.out.println(x>y?"Number of times pressed\t"+(x-y):"Number of times pressed\t"+(y-x));
    }
}
