import java.util.Scanner;
class FirstLetter{
public static void main(String[] args) {System.out.println("Enter Line");int f=0;
    Scanner sc=new Scanner(System.in);String a=sc.nextLine()+" ";
    for(int i=0;i<a.length();i++){
        if(a.charAt(i)==(char)32){
            String w=a.substring(f,i);f=i+1;
            System.out.println(w.charAt(0));
        }
    }
}
}