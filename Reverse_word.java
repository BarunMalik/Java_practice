//Enter a word and print its reverse
import java.util.Scanner;
public class Reverse_word {
    public static void main(String[] args) {Scanner sc=new Scanner(System.in);
        System.out.println("Enter word");String a=sc.next(),b="";
        for(int i=0;i<a.length();i++){
            b=(a.charAt(i))+b;
        }System.out.println("Reversed word\t"+b);
    }
}
