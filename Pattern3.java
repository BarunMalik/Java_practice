/* *A
*A*B
*A*B*C
*A*B*C*D
*A*B*C*D*E
*A*B*C*D*E*F
*A*B*C*D*E*F*G
*A*B*C*D*E*F*G*H
*A*B*C*D*E*F*G*H*I
*A*B*C*D*E*F*G*H*I*J*/






import java.util.Scanner;

public class Pattern3 {
   void Pattern(int n){
    for(int i=1;i<1+n;i++){char p='A';
for(int j=1;j<=i;j++){System.out.print("*"+(p++));}System.out.println();
    }
   } 
   public static void main(String args[]){System.out.println("Enter number of times to");
    new Pattern3().Pattern(new Scanner(System.in).nextInt());
   }
}
