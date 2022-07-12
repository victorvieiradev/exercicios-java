package catalisa.lista06.faculdade;

public class Professor extends  Funcionario{
    private String nivelDeGraduacao;
    private String diciplinaMinistrada;
    private int quantidadeDeAlunos;
    private int quantidadeDeTurmas;
    public Professor(String nome, String cpf, String numeroDoRegistro, String orgaoDeLotacao, double salario, String nivelDeGraduacao, String diciplinaMinistrada, int quantidadeDeAlunos, int quantidadeDeTurmas) {
        super(nome, cpf, numeroDoRegistro, orgaoDeLotacao, salario);
        this.setNivelDeGraduacao(nivelDeGraduacao);
        this.setDiciplinaMinistrada(diciplinaMinistrada);
        this.setQuantidadeDeAlunos(quantidadeDeAlunos);
        this.setQuantidadeDeTurmas(quantidadeDeTurmas);
    }

    @Override
    public void aumentarSalario() {
        double reajuste = (10 * this.salario)/100;
        this.salario += reajuste;
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
