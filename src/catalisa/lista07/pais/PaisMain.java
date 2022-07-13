package catalisa.lista07.pais;

public class PaisMain {
    public static void main(String[] args) {
        Pais brasil = new Pais("+55", "Brasil", 300, 200);
        Pais paraguai = new Pais("+51", "Paraguai", 300, 200);
        Pais canada = new Pais("+51", "Canadá", 300, 200);
        Pais mechico = new Pais("+51", "Mechico", 300, 200);
        Visinhos visinhos = new Visinhos();
        visinhos.adicionarVisinhos(paraguai, brasil);
        visinhos.adicionarVisinhos(brasil, mechico);
        brasil.apresentar();
        brasil.eVisinho(canada);

    }

}
