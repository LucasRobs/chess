import java.util.ArrayList;
class Chess{
    private ArrayList<Peca> pecca = new ArrayList<Peca>(32);
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
    
    public void criarPessas(){
        for(int i = 0; i < 32; i++){
            if(i < 8){
                Piao x = new Piao();
                x.setPosicao(1,i);
                pecca.add(x);
                x.setPosicao(6,i);
                pecca.add(x);
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
                    System.out.print("["+ peca(j).getPeca() + "]");
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
    /*
    public char localPecca(int x, int y){
        for()
    }*/
}