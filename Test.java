import java.util.Scanner;
public class Test {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   switch (sc.nextInt()) {
    case 1:
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j);
            }System.out.println();
        }
        break;
   case 2:int a=5;
   for(int i=0;i<4;i++){int b=a;
    for(int j=0;j<=i;j++){
        System.out.print(b--);
    }System.out.println();a--;
}
    default:
        break;
   }
}
  
}
