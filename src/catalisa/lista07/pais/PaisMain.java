package catalisa.lista07.pais;

public class PaisMain {
    public static void main(String[] args) {
        Pais p1 = new Pais("BRA", "Brasil", 100);
        p1.setPopulacao(300);
        Pais p2 = new Pais("USA", "Estados Unidos da America", 200);
        Pais p3 = new Pais("ARG", "Argentina", 3100);
        Pais p4 = new Pais("asdf", "Canadá", 3100);
        Vizinho.adicionarVizinho(p1, p3);
        Vizinho.adicionarVizinho(p1, p4);
        p1.eVizinho(p2);
        p3.eVizinho(p1);
        p1.listarPais();
        System.out.println("Dencidade demografica é: " + p1.calcularDensidade());
    }
}
