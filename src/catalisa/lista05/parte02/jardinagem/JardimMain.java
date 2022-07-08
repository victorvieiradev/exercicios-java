package catalisa.lista05.parte02.jardinagem;

public class JardimMain {
    public static void main(String[] args) {
        Jardim j1 = new Jardim(10, 2, 2);
        System.out.println("Valor preço grama: " + j1.precoCorteGrama());
        System.out.println("Valor adulbo: " + j1.precoAdubo());
    }
}
