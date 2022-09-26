package TicTactoe.Random;

import java.util.Scanner;

public class TicTacToe {
    Scanner sc=new Scanner(System.in);
    TicTacToe(){
        LoopThrough();
        place(z);
    }
    char a='X';int al=1;
    char [][]board={{' ','|',' ','|',' '},
                     {'-','+','-','+','-'}
                    ,{' ','|',' ','|',' '},
                    {'-','+','-','+','-'},
                    {' ','|',' ','|',' '}};
    public static void main(String[] args){
     new TicTacToe();   
    }int z=0;
    void place(int z){
        System.out.println("Place peace form 0-8");
        int as=sc.nextInt();
        if(as<1&&as>9){
            System.out.println("Wrong Choice");
            place(z);
        }
        else if(z>8){}
        else{
            switch(as){
                case 0:
                board[0][0]=a;break;
                case 1:
                board[0][2]=a;break;
                case 2:
                board[0][4]=a;break;
                case 3:
                board[2][0]=a;break;

                case 4:
                board[2][2]=a;break;
                case 5:
                board[2][4]=a;break;
                case 6:
                board[4][0]=a;break;
                case 7:
                board[4][2]=a;break;

                case 8:
                board[4][4]=a;break;
            }
            ++z;
            change();LoopThrough();place(z);
        }
    }
    void change(){
        ++al;
        a=al%2==0?'O':'X';
    }
    
    
    
    
    
    void LoopThrough(){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                System.out.print(board[i][j]);
            }System.out.println();
        }
    }
}
