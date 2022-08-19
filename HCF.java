import java.util.Scanner;
public class HCF{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter 2 numbers");
int a=s.nextInt(),b=s.nextInt();
while(a!=b){
    if(a>b){
        a=a-b;
    }else{
        b=b-a;
    }
}System.out.println("HCF is "+a);
}

}