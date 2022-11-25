import java.util.Scanner;
class Longest_substring_sequence{
    String k;
    Scanner sc=new Scanner(System.in);
    Longest_substring_sequence(){
    System.out.println("Enter String");
    k=sc.next();
    freq();
    }
    public static void main(String[] args) {
        Longest_substring_sequence l=new Longest_substring_sequence();
    }
    boolean pal(String n){
        String p="";
        for(int i=0;i<n.length();i++){
        char g=n.charAt(i);
        p=g+p;
        }return p.equals(n);
    }
    void freq(){
        String gsg="";int h=0;
        for(int i=0;i<k.length()-1;i++){
            char m=k.charAt(i);
            for(int j=i+1;j<k.length();j++){
                char f=k.charAt(j);
                if(f==m){
                  String gg=k.substring(i,j+1);
                    if(pal(gg)){
                        if(gg.length()>h){
                            h=gg.length();
                            gsg=gg;
                        }
                    }
                }
            }
        }
        System.out.println(gsg.equals("")?"Not there":"The word is\t"+gsg);
    }
}