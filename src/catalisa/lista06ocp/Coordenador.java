package catalisa.lista06ocp;
import java.util.HashSet;
import java.util.Set;
public class Coordenador extends  Funcionario{
    Set<Professor> listaDeCordenados = new HashSet<>();
    public Coordenador(String nome, String cpf, String registro, String orgao, double salario) {
        super(nome, cpf, registro, orgao, salario);
    }
}
