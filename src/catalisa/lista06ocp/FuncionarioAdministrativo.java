package catalisa.lista06ocp;

public class FuncionarioAdministrativo extends  Funcionario{
    private String funcao;
    private String senioridade;

    public FuncionarioAdministrativo(String nome, String cpf, String registro, String orgao, double salario, String funcao, String senioridade) {
        super(nome, cpf, registro, orgao, salario);
        this.setFuncao(funcao);
        this.setSenioridade(senioridade);
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Função: " + this.getFuncao());
        System.out.println("Senioridade: " + this.getSenioridade());
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }
}
