import java.util.ArrayList;
class Chess{
    private ArrayList<Peca> pecca = new ArrayList<Peca>();
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
    
    public void criarPecas(){
        for(int i = 0; i < 8; i++){
            if(i < 8){
                Piao x = new Piao();
                x.criar("P","0",1,i);
                pecca.add(x);
                Piao y = new Piao();
                y.criar("p","1",6,i);
                pecca.add(y);
            }
            if(i == 0 || i == 7){
                Piao x = new Piao();
                x.criar("T","0",0,i);
                pecca.add(x);
                Piao y = new Piao();
                y.criar("t","1",7,i);
                pecca.add(y);
            }
            if(i == 1 || i == 6){
                Piao x = new Piao();
                x.criar("R","0",0,i);
                pecca.add(x);
                Piao y = new Piao();
                y.criar("r","1",7,i);
                pecca.add(y);
            }
            if(i == 2 || i == 5){
                Piao x = new Piao();
                x.criar("W","0",0,i);
                pecca.add(x);
                Piao y = new Piao();
                y.criar("w","1",7,i);
                pecca.add(y);
            }
            if(i == 3){
                Piao x = new Piao();
                x.criar("K","0",0,i);
                pecca.add(x);
                Piao y = new Piao();
                y.criar("q","1",7,i);
                pecca.add(y);
            }
            if(i == 4){
                Piao x = new Piao();
                x.criar("Q","0",0,i);
                pecca.add(x);
                Piao y = new Piao();
                y.criar("k","1",7,i);
                pecca.add(y);
            }
        }
    }
    public void mostrarTabuleiro(){
        String letras = "ABCDEFGH";
        for(int i = 0; i < 8; i++){
            if(i == 0){
                System.out.print("   ");
                int numero = 1;
                for(int b = 1; b < 3 * 8 + 2; b++){
                    if(b % 3 == 0){
                    System.out.print(numero +"  ");
                    numero += 1;
                    }
                }
                System.out.println("");
                System.out.print(" ");
                for(int b = 0; b < 3 * 8 + 2; b++){
                    System.out.print("#");
                }
                System.out.println();
            }

            System.out.print(letras.charAt(i) +"#");
            
            for(int j = 0;j < 8; j++){
                if(tabuleiro[i][j] == 0){
                    Boolean temPeca = false;
                    System.out.print("[");
                    for(Peca x: pecca){
                        if(x.getX() == i && x.getY() == j){
                            System.out.print(x.getPeca());
                            temPeca = true;
                            break;
                        }
                    }
                    if(temPeca== false){
                        System.out.print(" ");
                    }
                    System.out.print("]");
                }else{
                    Boolean temPeca = false;
                    System.out.print(" ");
                    for(Peca x: pecca){
                        if(x.getX() == i && x.getY() == j){
                            System.out.print(x.getPeca());
                            temPeca = true;
                            break;
                        }
                    }
                    if(temPeca== false){
                        System.out.print(" ");
                    }
                    System.out.print(" ");
                }
            }
            System.out.print("#");
            System.out.println();
            if(i == 7){
                System.out.print(" ");
                for(int b = 0; b < 3 * 8 + 2; b++){
                    System.out.print("#");
                }
                System.out.println();
            }
        }
    }

    public void moverPeca(){
        
    }
}