package catalisa.lista06.faculdade;

import java.util.HashSet;
import java.util.Set;

public class Cordenador extends  Funcionario{
    private Set<Professor> professoresSupervisionados = new HashSet<>();

    public Cordenador(String nome, String cpf, String numeroDoRegistro, String orgaoDeLotacao, double salario) {
        super(nome, cpf, numeroDoRegistro, orgaoDeLotacao, salario);

    }

    @Override
    public void aumentarSalario() {
        double reajuste = (5 * this.salario)/100;
        this.salario += reajuste;
    }

    @Override
    public void apresentar() {
        System.out.println("Coordenador");
        super.apresentar();
        aumentarSalario();
        System.out.println("Depois do reajuste de 5% o seu salário será: R$" + this.getSalario());
        System.out.println("Lista de professores supervisionados");
        for (Professor profesor : professoresSupervisionados){
            System.out.println("Professor: " + profesor.getNome());
        }
    }

    public Set<Professor> getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void adicionarProfessor(Professor professoresSupervisionados) {
        this.professoresSupervisionados.add(professoresSupervisionados);
    }
}
