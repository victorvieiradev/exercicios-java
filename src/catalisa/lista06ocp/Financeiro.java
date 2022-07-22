package catalisa.lista06ocp;

public class Financeiro implements FolhaDePagamento {
    @Override
    public void aumentoSalarial(Funcionario funcionario, double aumento) {
        funcionario.setSalario(funcionario.getSalario() + (aumento*funcionario.getSalario())/100 );
    }
    public void reembolso(Funcionario funcionario){
        System.out.println(funcionario.getNome() + " Sua solicitação foi efetuada com sucesso.");
    }
}
