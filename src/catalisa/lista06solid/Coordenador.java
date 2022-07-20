package catalisa.lista06solid;

import java.util.ArrayList;
import java.util.List;

public class Coordenador extends Funcionario{
    private List<Professor> listaProfessoresCoordenados = new ArrayList<>();

    public Coordenador(String nome, String cpf, String registro, String orgao, double salario) {
        super(nome, cpf, registro, orgao, salario);
    }

    @Override
    public double reajustarSalario() {
        return this.getSalario()*5/100;
    }

    public void adicionarProfessorCoordenado(Professor professor){
        if (listaProfessoresCoordenados.size() > 10){
            System.out.println("O número máximo de professores cordenado é 10");
        }else {
            this.listaProfessoresCoordenados.add(professor);
        }

    }
    public void exibirCoordenados(){
        listaProfessoresCoordenados.forEach(professor -> {
            System.out.println("Nome: " + professor.getNome() + "\nCPF: " + professor.getCpf() + "\nNúmero do registro: " + professor.getRegistro() + "\nOrgão de lotação: " + professor.getOrgao() + "\nSalário: R$" + professor.getSalario());
        });
    }

}
