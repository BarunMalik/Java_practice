public class Pattern5 {
    public static void main(String args[]){ 
        String g="ABCD",dec="DCBA";int sp=0,lg=g.length(),ldec=dec.length();
        for(int i=0;i<4;i++){
            System.out.print(g.substring(0, lg));
            for(int j=0;j<sp;j++){
                System.out.print(" ");
            }
            System.out.println(dec.substring(0, ldec));lg--;sp+=2;
            ldec--;
        }sp=4;ldec++;lg+=2;
        for(int i=0;i<3;i++){
            System.out.print(g.substring(0,lg));
             for(int j=0;j<sp;j++){
                System.out.print(" ");
            }
            System.out.println(dec.substring(ldec, dec.length()));
            sp-=2;lg++;ldec--;
        }
    }
}
/*ABCDDCBA
 * ABC  CBA
 * AB    BA
 * A      A
 * AB    BA
 * ABC  CBA
 * ABCDDCBA */