package catalisa.lista06.figurageometrica;

public class Retangulo extends  FiguraGeometrica{
    private  int ladoA;
    private int ladoB;

    public Retangulo(int ladoA, int ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public void calcularArea() {
        System.out.println("A área do retangulo é: " + this.ladoA * this.ladoB);
    }
}
