package catalisa.lista07.pais;

import java.util.HashSet;
import java.util.Set;

public class Visinhos {
    public void adicionarVisinhos(Pais p1, Pais p2){
        p1.addPais(p2);
        p2.addPais(p1);
    }
}
