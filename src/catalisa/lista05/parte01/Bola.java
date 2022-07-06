package catalisa.lista05.parte01;

public class Bola {
    String cor;
    String material;
    int circunferencia;

    public Bola(String cor, String material, int circunferencia) {
        this.cor = cor;
        this.material = material;
        this.circunferencia = circunferencia;
    }
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


}