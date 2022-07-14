package catalisa.lista07.pais;

public class Vizinho {
    public static void adicionarVizinho(Pais p1, Pais p2){
        p1.adicionarPais(p2);
        p2.adicionarPais(p1);
    }

}
