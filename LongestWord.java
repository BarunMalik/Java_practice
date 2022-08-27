//enter a line and print the longest word
import java.util.Scanner;
public class LongestWord {
    void LongestWord(String w){w=w+" ";
    int l=0,f=0;    String lg="";
    for(int i=0;i<w.length();i++){
            if(w.charAt(i)==' '){
                String a=w.substring(f, i);f=i+1;
                if(a.length()>l){lg=a;l=a.length();}
            }
        }System.out.println("Longest word\t"+lg);
    }
    public static void main(String args[]){
        System.out.println("Enter Line");new LongestWord().LongestWord(new Scanner(System.in).nextLine());
    }
}
