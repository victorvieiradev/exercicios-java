package catalisa.lista06.figurageometrica;

public class Quadrado extends FiguraGeometrica{
    private  int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }
    @Override
    public void calcularArea() {
        System.out.println("A área do quadrado é: " + this.lado * this.lado);
    }
}
