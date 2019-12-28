class Peca{
    private String peca;
    private String cor;
    private int x;
    private int y;
    public void criar(String in_peca, String in_cor, int in_x, int in_y){
        this.peca = in_peca;
        this.cor = in_cor;
        this.x = in_x;
        this.y = in_y;
    }
    public String getPeca() {
        return this.peca;
    }

    public String getCor() {
        return this.cor;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setPosicao(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setPeca(String x){
        this.peca = x;
    }
}