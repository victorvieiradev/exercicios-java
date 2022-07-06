package catalisa.lista05.parte01;

public class Quadrado {
    int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int calcularArea(){
        return  this.lado * this.lado;
    }


}