package catalisa.lista06ocp;
public class Diretoria implements  Administracao{
    @Override
    public void adicionarProfessorParaCordenador(Coordenador coordenador, Professor professor) {
        coordenador.listaDeCordenados.add(professor);
    }
    @Override
    public void adicionarTurmaParaProfessor(Professor professor, Turma turma) {
        professor.listaDeTurmas.add(turma);
    }
    @Override
    public void listarProfessoresCordenados(Coordenador coordenador){
        coordenador.listaDeCordenados.forEach(professor -> {
            System.out.println("Professor: " + professor.getNome());
        });
    }
    @Override
    public void listarTurmasDoProfessor(Professor professor){
        professor.listaDeTurmas.forEach(turma -> {
            System.out.println("Turma: " + turma.getNome() + " Quantidade de alunos: " + turma.getNumeroAlunos());
        });
    }
}
