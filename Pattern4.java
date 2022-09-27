public class Pattern4 {
    public static void main(String args[]){ 
        String g="ABCD",dec="CBA";int sp=0,lg=g.length(),ldec=dec.length(),st=0;
        for(int i=0;i<4;i++){
            System.out.print(g.substring(0, lg));
            for(int j=0;j<sp;j++){
                System.out.print(" ");
            }
            System.out.println(dec.substring(st, ldec));lg--;sp+=2;
            if(i>0){st++;}
        }sp=4;lg+=2;ldec=1;
        for(int i=0;i<3;i++){
            System.out.print(g.substring(0,lg));
             for(int j=0;j<sp;j++){
                System.out.print(" ");
            }
            System.out.println(dec.substring(ldec, dec.length()));
            sp-=2;lg++;if(i==0){ldec--;}
        }
    }
}

/* ABCDCBA
 * ABC  CBA
 * AB    BA
 * A      A
 * AB    BA
 * ABC  CBA
 * ABCDCBA
 */
