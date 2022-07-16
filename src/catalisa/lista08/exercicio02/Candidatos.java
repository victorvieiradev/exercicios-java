package catalisa.lista08.exercicio02;

public class Candidatos {
    private String matricula;
    private double nota;
    public Candidatos(String matricula, double nota) {
        this.setMatricula(matricula);
        this.setNota(nota);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
