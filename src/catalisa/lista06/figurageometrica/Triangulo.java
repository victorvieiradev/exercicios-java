package catalisa.lista06.figurageometrica;

public class Triangulo implements  Calculo{
    private  int base;
    private  int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        System.out.println("A área do triangulo é: " + (this.base*this.altura)/2);
    }
}
