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

    @Override
    public void adicionarEstagiarioParaProfessor(Professor professor, Estagiario estagiario) {
        if (professor.listaDeEstagiarios.size() <= 2){
            professor.listaDeEstagiarios.add(estagiario);
        }else {
            System.out.println(professor.getNome() + " é permitido apenas dois estagiarios por professor.");
        }
    }

    @Override
    public void listarEstagiariosDoProfessor(Professor professor) {
        professor.listaDeEstagiarios.forEach(estagiario -> {
            System.out.println("Estágiario: " + estagiario.getNome());
        });
    }
}
