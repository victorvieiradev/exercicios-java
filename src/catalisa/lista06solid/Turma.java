package catalisa.lista06solid;
public class Turma {
    private String nome;
    private int qtdAlunos;

    public Turma(String nome, int qtdAlunos) {
        this.setNome(nome);
        this.setQtdAlunos(qtdAlunos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }
}
