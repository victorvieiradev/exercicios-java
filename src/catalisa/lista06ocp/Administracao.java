package catalisa.lista06ocp;
public interface Administracao {
    public void adicionarProfessorParaCordenador(Coordenador coordenador, Professor professor);
    public void adicionarTurmaParaProfessor(Professor professor, Turma turma);
    public void listarProfessoresCordenados(Coordenador coordenador);
    public void listarTurmasDoProfessor(Professor professor);
}
