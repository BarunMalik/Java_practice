/* 1 3 5 7 9
 * 3 5 7 9 1
 * 5 7 9 1 3
 * 7 9 1 3 5
 * 9 1 3 5 7
 */



public class Pattern2 {
    void Pattern(int n){int p=1;
        for(int i=1;i<=n;i++){int q=p;
             for(int j=1;j<=n;j++){
            System.out.print(q+" ");q+=2;
            q=q==11?1:q;
            }System.out.println();p+=2;
            }
        }
      public  static void main(String args[]){
            new Pattern2().Pattern(5);
        }
}
