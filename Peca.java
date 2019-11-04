class Peca{
    String peca;
    String cor;
    int x;
    int y;

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

    void setPosicao(int x, int y){
        this.x = x;
        this.y = y;
    }

}