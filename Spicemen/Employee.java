//icse methods
package Spicemen;
import java.util.Scanner;
public class Employee {
    int eno;
    String ename;
    int age;
    double basic;
    double net;
    Employee(){
        eno=0;
        ename="";
        age=0;
        basic=0;
        net=0;
    }
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter employ number");
eno=sc.nextInt();
System.out.print("enter name");
ename=sc.nextLine();
System.out.println("Enter age");
age=sc.nextInt();
System.out.println("Enter basic");
basic=sc.nextInt();

    }
    void calculate(){
        double hra=(18.5*basic)/100,da=(17.45*basic)/100,pf=(8.10*basic)/100;
net=basic+hra+da-pf;
if(age> 50){net+=5000;}
    }
    void print(){
        System.out.println("Employ number = " +eno+"\tEmploy name = "+ename+"\tAge\t"+age+"\tBasic\t"+basic+"\tNet\t"+net);
    }
    public static void main(String[] args) {
        Employee e=new Employee();
        e.accept();
        e.calculate();e.print();
    }
}
