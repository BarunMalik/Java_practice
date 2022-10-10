package Array;
import java.util.Scanner;
//input 10 words in an array and print the palindrome words
public class Print1 {
   static boolean pal(String a){String l="";
    for(int i=0;i<a.length();i++){
        l=a.charAt(i)+l;
    }
    return l.equals(a);
   } 
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String as[]=new String[10];
    for(int i=0;i<as.length;i++){
        System.out.println("Enter word");
        as[i]=sc.next();
    }
    for(int i=0;i<as.length;i++){
        if(pal(as[i])){
            System.out.println("Palindrome word:\t"+as[i]);
        }
    }
   }
}
