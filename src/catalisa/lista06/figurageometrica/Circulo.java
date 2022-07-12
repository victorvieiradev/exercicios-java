package catalisa.lista06.figurageometrica;

public class Circulo implements Calculo{
    private int r;

    public Circulo(int r) {
        this.r = r;
    }

    @Override
    public void calcularArea() {
        System.out.println("A área do circulo é: " + (Math.PI* this.r *this.r));
    }
}
