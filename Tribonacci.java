import java.util.Scanner;
public class Tribonacci{
    public static void main(String args[]){
        int a=1,b=2,c=3,d=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of times to print");
        int k=sc.nextInt();
        System.out.print(a+"\t"+b+"\t"+c+"\t");
for(int i=4;i<=k;i++){
    d=a+b+c;
    System.out.print(d+"\t");
    a=b;b=c;c=d;
}
    }
}