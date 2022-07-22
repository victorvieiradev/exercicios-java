package catalisa.lista06ocp;

public class Turma {
    private String nome;
    private int numeroAlunos;

    public Turma(String nome, int numeroAlunos) {
        this.setNome(nome);
        this.setNumeroAlunos(numeroAlunos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroAlunos() {
        return numeroAlunos;
    }

    public void setNumeroAlunos(int numeroAlunos) {
        this.numeroAlunos = numeroAlunos;
    }
}
