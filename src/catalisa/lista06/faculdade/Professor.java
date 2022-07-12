package catalisa.lista06.faculdade;

import java.util.HashSet;
import java.util.Set;

public class Professor extends Funcionario {
    private String nivelDeGraduacao;
    private String diciplinaMinistrada;
    private int quantidadeDeAlunos;
    private int quantidadeDeTurmas;
    private Set<Turma> turma = new HashSet();
    public Professor(String nome, String cpf, String numeroDoRegistro, String orgaoDeLotacao, double salario, String nivelDeGraduacao, String diciplinaMinistrada) {
        super(nome, cpf, numeroDoRegistro, orgaoDeLotacao, salario);
        this.setNivelDeGraduacao(nivelDeGraduacao);
        this.setDiciplinaMinistrada(diciplinaMinistrada);
    }


    @Override
    public void apresentar() {
        System.out.println("Professor: ");
        super.apresentar();
        System.out.println("Nivel de graduação: " + this.getNivelDeGraduacao());
        System.out.println("Diciplina Ministrada: " + this.getDiciplinaMinistrada());
        System.out.println("Quantidade de alunos: " + this.getQuantidadeDeAlunos());
        System.out.println("Quantidade de turmas cadastradas: " + this.getQuantidadeDeTurmas());
        aumentarSalario();
        System.out.println("Após o reajuste salárial de 10% seu salário será: R$" + this.getSalario());
        System.out.println("Turmas que este professor da aula: ");
        for (Turma t1 : turma){
            System.out.println("Nome da turma: " + t1.getNomeDaTurma());
            System.out.println("Quantidade de alunos da turma: " + t1.getQuantidadeDeAlunos());
        }
    }

    @Override
    public void aumentarSalario() {
        double reajuste = (10 * this.salario) / 100;
        this.salario += reajuste;
    }
    public void adicionarTurma(Turma t){
        this.turma.add(t);
        this.setQuantidadeDeTurmas(this.getQuantidadeDeTurmas() + 1);
        this.setQuantidadeDeAlunos(getQuantidadeDeAlunos() + t.getQuantidadeDeAlunos());
    }
    public String getNivelDeGraduacao() {

        return nivelDeGraduacao;
    }

    public void setNivelDeGraduacao(String nivelDeGraduacao) {
        this.nivelDeGraduacao = nivelDeGraduacao;
    }

    public String getDiciplinaMinistrada() {
        return diciplinaMinistrada;
    }

    public void setDiciplinaMinistrada(String diciplinaMinistrada) {
        this.diciplinaMinistrada = diciplinaMinistrada;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public int getQuantidadeDeTurmas() {
        return quantidadeDeTurmas;
    }

    public void setQuantidadeDeTurmas(int quantidadeDeTurmas) {
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }
}
