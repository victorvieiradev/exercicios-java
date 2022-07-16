package catalisa.lista08.exercicio02;

import java.util.HashSet;
import java.util.Set;

public class Vestibular {
    private Set<Candidatos>listaDeCandidatos = new HashSet<>();
    public void adicionar(String matricula, double nota){
        this.listaDeCandidatos.add(new Candidatos(matricula, nota));
    }
    public void listar(){
        listaDeCandidatos.forEach(candidatos -> {
            System.out.println("Matricula: " + candidatos.getMatricula() + " nota: "+ candidatos.getNota());
        });
    }
    public void excluir(String matricula){
        this.listaDeCandidatos.removeIf(candidatos -> matricula.equalsIgnoreCase(candidatos.getMatricula()));
    }
}
