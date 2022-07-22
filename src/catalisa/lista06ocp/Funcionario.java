package catalisa.lista06ocp;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private String registro;
    private String orgao;
    private double salario;

    public Funcionario(String nome, String cpf, String registro, String orgao, double salario) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setRegistro(registro);
        this.setOrgao(orgao);
        this.setSalario(salario);
    }
    public void apresentar(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Registro: " + this.getRegistro());
        System.out.println("Orgão de lotação: " + this.getOrgao());
        System.out.println("Salário R$" + this.getSalario());
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

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
