package catalisa.lista05.parte01;

public class RetanguloMain {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(20, 30);
        System.out.println("área: " + r1.calcularArea());
        System.out.println("Perimetro: " + r1.calcularPerimetro());
    }
}
