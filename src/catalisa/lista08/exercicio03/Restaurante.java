package catalisa.lista08.exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private List<Prato> listaDePratos = new ArrayList<>();
    public void adicionar(String nome){
        this.listaDePratos.add(new Prato(nome));
    }
    public void excluir(String nome){
        this.listaDePratos.removeIf(prato -> nome.equalsIgnoreCase(prato.getNome()));
    }
}
