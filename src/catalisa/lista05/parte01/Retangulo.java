package catalisa.lista05.parte01;

public class Retangulo {
    double ladoA;
    double ladoB;

    public Retangulo(double ladoA, double ladoB) {
        this.setLadoA(ladoA);
        this.setLadoB(ladoB);
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }
    public double calcularArea(){
        return this.ladoA * this.ladoB;
    }
    public double calcularPerimetro(){
        return  (this.ladoA*2) + (this.ladoB*2);
    }
}
