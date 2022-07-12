package catalisa.lista06.faculdade;

import java.util.HashSet;
import java.util.Set;

public class Cordenador extends  Funcionario{
    private Set<Professor> professoresSupervisionados = new HashSet<>();

    public Cordenador(String nome, String cpf, String numeroDoRegistro, String orgaoDeLotacao, double salario, Set<Professor> professoresSupervisionados) {
        super(nome, cpf, numeroDoRegistro, orgaoDeLotacao, salario);
        this.setProfessoresSupervisionados(professoresSupervisionados);
    }

    @Override
    public void aumentarSalario() {
        double reajuste = (5 * this.salario)/100;
        this.salario += reajuste;
    }

    public Set<Professor> getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(Set<Professor> professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }
}
