import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Quiz_Class10_methods {
    String val[]=new String[7],quest[]=new String[7];int bl[]=new int[7];int p=0;
    Quiz_Class10_methods(){
        System.out.print("Please write in lower case\n");
        val[0]="Actual Parameter".toLowerCase();
        quest[0]="A parameter which is used in function call and which is used to provide value to the formal parameter is known as ?";
        val[1]="Constructor".toLowerCase();
        quest[1]="It is used to initilize a class variable or instance variable,the name of the class should be same as this.It doesnot have any return type. What is this?";
        val[2]="Formal Parameter".toLowerCase();
        quest[2]="Parameter which is used in function defination and which is used to accept a value from the actual parameter. What is this?";
        val[3]="Method".toLowerCase();
        quest[3]="It is used as a subprogram , it must have a return type, if it is not returnig anyting it has void. What it is?";
        val[4]="call by value";
        quest[4]="It means calling a method with a parameter as a value. What it is?";
        val[5]= "call by reference";
        quest[5]="When a refererence data is passed through a method then any change in the formal parameter will reflect in the actual program.What is it?";
        val[6]="non parameterized method";
    quest[6]="When a method has no arguments then it is known as?";  
question();  }
    int rand(){
return (int)(Math.random()*7);
    }
    void question(){
        int r=rand();
        if(!doit(r)){p++;blacklist(p);
            System.out.println(quest[r]);
            System.out.println(new Scanner(System.in).nextLine().equals(val[r])?"Correct":"Wrong");
            try
    {
        Thread.sleep(3000);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }}
if(p!=7){
    question();
}
        }
        public static void main(String args[]){
            Quiz_Class10_methods p =new Quiz_Class10_methods();
        }int index=0;
        void blacklist(int n){
            bl[index]=n;index++;
        }
        boolean doit(int p){
            for(int i=0;i<bl.length;i++){
                if(bl[i]==p){return true;}
            }return false;
        }
}
//still some development required