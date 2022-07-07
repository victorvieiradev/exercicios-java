package catalisa.lista05.parte01;

public class BolaMain {
    public static void main(String[] args) {
        
        Bola b1 = new Bola("vermelha", "borracha", 90);
        b1.setCor("Azul");
        System.out.println("Cor: " + b1.getCor());
    }
}
