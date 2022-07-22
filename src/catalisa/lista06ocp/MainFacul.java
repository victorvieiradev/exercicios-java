package catalisa.lista06ocp;

public class MainFacul {
    public static void main(String[] args) {
        //testando o funcionário administrativo
        FuncionarioAdministrativo funcionarioAdministrativo = new FuncionarioAdministrativo("Gabriel", "123.123.123-12", "1212", "Secretaria estadual da educação", 1000, "Assistente administrativo", "Junior");
        Financeiro financeiro = new Financeiro();
        financeiro.aumentoSalarial(funcionarioAdministrativo, 10);
        funcionarioAdministrativo.apresentar();
        //testando a classe professor
        Professor professor = new Professor("Victor", "321.123.321-21", "3322", "Secretarial estadual da educação", 2000, "Superior completo e letras português e inglês", "Português");
        financeiro.aumentoSalarial(professor, 10);
        professor.apresentar();
        //Testando o coordenador
        Coordenador coordenador = new Coordenador("Leonardo", "123.432.123-78", "5555", "Secretaria da educação do estado", 4000);
        financeiro.aumentoSalarial(coordenador, 5);
        coordenador.apresentar();
        //Testando a classe diretoria
        Diretoria diretoria = new Diretoria();
        diretoria.adicionarProfessorParaCordenador(coordenador, professor);
        diretoria.listarProfessoresCordenados(coordenador);
        //Testando a classe turma
        Turma turma = new Turma("Primeiro A", 50);
        //adicionando uma turma para um professor
        diretoria.adicionarTurmaParaProfessor(professor, turma);
        diretoria.listarTurmasDoProfessor(professor);
        //Testando a classe estagiário
        Estagiario estagiario = new Estagiario("Silvia", "444.333.222-11", "1234", "Secretaria da educação estadual", 800);
        financeiro.aumentoSalarial(estagiario, 15);
        financeiro.reembolso(estagiario);
        //Adicionando um estagiario para um professor
        diretoria.adicionarEstagiarioParaProfessor(professor, estagiario);
        diretoria.listarEstagiariosDoProfessor(professor);



    }
}
