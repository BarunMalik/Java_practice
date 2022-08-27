//Special Words Are Those Words that Start and End with the Same Letter Example- pop
import java.util.Scanner;
public class Special_word {
    boolean Special(String a){
        return a.charAt(0)==a.charAt(a.length()-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
       System.out.println("Special word\t" +(new Special_word().Special(sc.next())));
    }
}
