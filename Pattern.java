/*
 1
 01
 101
 0101
 10101 
 */

public class Pattern {
    void Pattern(int n){
            for(int i=1;i<=n;i++){int p=i;
                for(int j=1;j<=i;j++){
                    System.out.print(p%2==0?0:1);p--;
                }System.out.println();
            }
    }
    public static void main(String args[]){
        new Pattern().Pattern(5);
    }
}
