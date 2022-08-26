// a automorpic number is a number whose square is present in the last of the number
import java.util.*;
public class Automorphic {
    static int reverse(int n){
        int a=0;while(n>0){
a=(a*10)+n%10;n=n/10;
        }return a;
    }
    public static void main(String args[]){
        System.out.println("Enter number");
        boolean lb=false;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt(),b=a*a,c=reverse(a),s=0;
while(0<b){
s=(s*10)+b%10;
if(c==s){lb=true;
    break;
}b=b/10;
}System.out.println(lb?"Automorphic number":"Not Automorpic");
    }
}
