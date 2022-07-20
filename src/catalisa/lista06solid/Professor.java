package catalisa.lista06solid;

import java.util.ArrayList;
import java.util.List;

public class Professor extends  Funcionario{
    private String graduacao;
    private String diciplina;
    private int qtdAlunos;
    private List<Turma> listaDeTurmas = new ArrayList<>();
    private List<Estagiario> listaDeEstagiarios = new ArrayList<>();
    public Professor(String nome, String cpf, String registro, String orgao, double salario, String graduacao, String diciplina) {
        super(nome, cpf, registro, orgao, salario);
        this.setGraduacao(graduacao);
        this.setDiciplina(diciplina);
    }

    @Override
    public double reajustarSalario() {
        return this.getSalario()*10/100;
    }
    public void adicionarTurma(Turma turma){
        this.listaDeTurmas.add(turma);
        this.setQtdAlunos(this.getQtdAlunos() + turma.getQtdAlunos());
    }
    public void adicionarEstagiario(Estagiario estagiario){
        if (listaDeEstagiarios.size() < 3){
            this.listaDeEstagiarios.add(estagiario);
        }else {
            System.out.println("Não é possível ter mias estágiarios.");
        }

    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public String getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }
}
