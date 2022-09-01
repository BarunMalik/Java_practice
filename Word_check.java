//Enter a word and check how many are special,digit,letter
import java.util.Scanner;
public class Word_check {
    public static void main(String args[]){Scanner sc=new Scanner(System.in);
System.out.println("Enter word");int s=0,d=0,l=0;
String a=sc.nextLine();
for(int i=0;i<a.length();i++){
    char q=a.charAt(i);
    if(Character.isDigit(q)){d++;}
    else if(Character.isLetter(q)){l++;}
    else{s++;}
}System.out.println("Number of Special characters\t"+s+"\nNumber of Digits\t"+d+"\nNumber of Letters\t"+l);
    }
}
