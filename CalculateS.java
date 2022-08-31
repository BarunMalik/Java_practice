//s=9+99+89+8+79+7+69+6+59+5+......+19+1
public class CalculateS {
    public static void main(String[] args) {
        int s=0;
        for(int i=9;1<=i;i--){
            s+=i;
        }
        for(int i=99;19<=i;i=i-10){
            s+=i;
        }System.out.println(s);
    }
}
