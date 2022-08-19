import java.util.Scanner;
public class Palindrome {
    public static void main(String []args){
        System.out.println("Enter a word");
String a=new Scanner(System.in).nextLine(),r="";
for(int i=0;i<a.length();i++){
    r=a.charAt(i)+r;
}System.out.println(a.equals(r)?"Palindrome string":"Not palindrome");

    }
}
