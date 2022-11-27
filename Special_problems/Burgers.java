package Special_problems;
import java.util.Scanner;
public class Burgers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of buns and patty");
        int bn=sc.nextInt(),pat=sc.nextInt();
        System.out.println(bn>=pat?"Burgers made\t"+pat:"Burgers made\t"+bn);
    }
}
