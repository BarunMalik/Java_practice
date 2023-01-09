package Spicemen;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter word");
        int v=0;
        String a=sc.next(),aa="",vv="AEIOUaeiou";
        for(int i=0;i<a.length();i++){
            char p=a.charAt(i);
        for(int j=0;j<vv.length();j++){
            char pk=vv.charAt(j);
            if(p==pk){
               v++; 
            }
        }
        aa=p+aa;
        }
        System.out.println("Reversed string\t"+aa+"\nNumber of vowels\t"+v);
    }
}
