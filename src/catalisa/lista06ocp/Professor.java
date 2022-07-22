package catalisa.lista06ocp;

import java.util.ArrayList;
import java.util.List;

public class Professor extends  Funcionario{
    private String graduacao;
    private String diciplina;
    List<Turma> listaDeTurmas = new ArrayList<>();
    List<Estagiario> listaDeEstagiarios = new ArrayList<>();

    public Professor(String nome, String cpf, String registro, String orgao, double salario, String graduacao, String diciplina) {
        super(nome, cpf, registro, orgao, salario);
        this.setGraduacao(graduacao);
        this.setDiciplina(diciplina);
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Graduação: " + this.getGraduacao());
        System.out.println("Diciplina ministrada: " + this.getDiciplina());
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
}
