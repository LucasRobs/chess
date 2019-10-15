import java.util.ArrayList;
import java.awt.Color;
class Chess{
    private ArrayList<Peca> peca = new ArrayList<Peca>(32);
    private int tabuleiro[][] = new int[8][8];
    
    public void novoTabuleiro(){
        for(int i = 0; i < 8; i++){
            for(int j = 0;j < 8; j++){
                if(i % 2 == 0){
                    if(j % 2 == 0){
                        tabuleiro[i][j] = 0;
                    }else{
                        tabuleiro[i][j] = 1;
                    }
                }else{
                    if(j % 2 == 0){
                        tabuleiro[i][j] = 1;
                    }else{
                        tabuleiro[i][j] = 0;
                    }
                }
            }
        }
    }
    public void mostrarTabuleiro(){
        for(int i = 0; i < 8; i++){
            if(i == 0){
                for(int b = 0; b < 3 * 8 + 2; b++){
                    System.out.print("#");
                }
                System.out.println();
            }
            System.out.print("#");
            for(int j = 0;j < 8; j++){
                if(tabuleiro[i][j] == 0){
                    System.out.print("[ ]");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.print("#");
            System.out.println();
            if(i == 7){
                for(int b = 0; b < 3 * 8 + 2; b++){
                    System.out.print("#");
                }
                System.out.println();
            }
        }
    }
}