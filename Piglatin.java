import java.util.Scanner;
public class Piglatin {
    public static void main(String[] args) {Scanner sc=new Scanner(System.in);
        System.out.println("Enter word in Lowercase");
        String a=sc.next().toLowerCase(),b="";boolean m=false;
        for(int i=0;i<a.length();i++){char as=a.charAt(i);
            if(as=='a'||as=='e'||as=='i'|as=='u'||as=='o'){
                m=true;b=a.substring(0, i);
                a=a.substring(i);break;
            }
        }
        System.out.println(m?"Piglatin form\t"+(a+b+"ay"):"Piglatin form\t"+(a+"ay"));
    }
}
