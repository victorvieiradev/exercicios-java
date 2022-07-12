package catalisa.lista06.faculdade;

public abstract class Funcionario {
    protected  String nome;
    protected  String cpf;
    protected  String numeroDoRegistro;
    protected  String orgaoDeLotacao;
    protected  double salario;
    public Funcionario(String nome, String cpf, String numeroDoRegistro, String orgaoDeLotacao, double salario) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setNumeroDoRegistro(numeroDoRegistro);
        this.setOrgaoDeLotacao(orgaoDeLotacao);
        this.setSalario(salario);
    }
    public abstract void aumentarSalario();
    public void apresentar(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Número do registro: " + this.getNumeroDoRegistro());
        System.out.println("Orgão de lotação: " + this.getOrgaoDeLotacao());
        System.out.println("Salário: R$" + this.getSalario());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroDoRegistro() {
        return numeroDoRegistro;
    }

    public void setNumeroDoRegistro(String numeroDoRegistro) {
        this.numeroDoRegistro = numeroDoRegistro;
    }

    public String getOrgaoDeLotacao() {
        return orgaoDeLotacao;
    }

    public void setOrgaoDeLotacao(String orgaoDeLotacao) {
        this.orgaoDeLotacao = orgaoDeLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
