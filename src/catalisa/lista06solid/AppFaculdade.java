package catalisa.lista06solid;

public class AppFaculdade {
    public static void main(String[] args) {
        //Testando o funcionário administrativo.
        FuncionarioAdministrativo adm = new FuncionarioAdministrativo("Victor", "13487878", "1324", "ssp", 3000, "administrador", "senior");
        System.out.println("Nome: " + adm.getNome() + "salário após o reajuste: R$" + adm.reajustarSalario());
        adm.reembolsoDeDespesa();
        //Testando a classe turma.
        Turma turma = new Turma("Primeiro A", 40);
        //testando a classe estagiário.
        Estagiario estagiario = new Estagiario("Paulo", 500);
        estagiario.reembolsoDeDespesa();
        //Testando a classe professor.
        Professor professor = new Professor("Patricia", "1347878", "1234", "ssp", 12000, "superior completo", "Histçória");
        professor.reembolsoDeDespesa();
        professor.adicionarTurma(turma);
        professor.adicionarEstagiario(estagiario);
        System.out.println(professor.reajustarSalario());
        //testando a classe cordenador
        Coordenador cordenador = new Coordenador("Gabriel", "9183748237", "134", "ssp", 3000);
        cordenador.adicionarProfessorCoordenado(professor);
        cordenador.exibirCoordenados();
        System.out.println(cordenador.reajustarSalario());
        cordenador.reembolsoDeDespesa();




    }
}
