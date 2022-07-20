package catalisa.lista06solid;

public class FuncionarioAdministrativo extends  Funcionario{
    private String Funcao;
    private String senioridade;

    public FuncionarioAdministrativo(String nome, String cpf, String registro, String orgao, double salario, String funcao, String senioridade) {
        super(nome, cpf, registro, orgao, salario);
        this.setFuncao(funcao);
        this.setSenioridade(senioridade);
    }

    @Override
    public double reajustarSalario() {
        return this.getSalario()*10/100;
    }

    public String getFuncao() {
        return Funcao;
    }
    public void setFuncao(String funcao) {
        Funcao = funcao;
    }
    public String getSenioridade() {
        return senioridade;
    }
    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }
}
