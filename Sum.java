import java.util.Scanner;

//input 2 numbers and multiply them without * sign
public class Sum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a=sc.nextInt(),b=sc.nextInt(),c=0;
        if(a==0||b==0){
           System.out.println("Multiplied result:\t"+0);
        }
        else{
            for(int i=1;i<=a;i++){
                c+=b;
            }
            System.out.println("Multiplied reslt:\t"+c);
        }
    }
}
