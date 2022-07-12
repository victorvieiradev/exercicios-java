package catalisa.lista06.faculdade;

public class FuncionarioAdministrativo extends  Funcionario{
    private String funcaoAdministrativa;
    private String senioridade;

    public FuncionarioAdministrativo(String nome, String cpf, String numeroDoRegistro, String orgaoDeLotacao, double salario, String funcaoAdministrativa, String senioridade) {
        super(nome, cpf, numeroDoRegistro, orgaoDeLotacao, salario);
        this.setFuncaoAdministrativa(funcaoAdministrativa);
        this.setSenioridade(senioridade);
    }

    @Override
    public void aumentarSalario() {
        double reajuste = (10 * this.salario)/100;
        this.salario += reajuste;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Tipo de função: " + this.getFuncaoAdministrativa());
        System.out.println("Senioridade: " + this.getSenioridade());
    }

    public String getFuncaoAdministrativa() {
        return funcaoAdministrativa;
    }

    public void setFuncaoAdministrativa(String funcaoAdministrativa) {
        this.funcaoAdministrativa = funcaoAdministrativa;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }
}
