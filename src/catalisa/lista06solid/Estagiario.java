package catalisa.lista06solid;

public class Estagiario implements Reembolsos{
    private String nome;
    private double bolsaEstudo;

    public Estagiario(String nome, double bolsaEstudo) {
        this.setNome(nome);
        this.setBolsaEstudo(bolsaEstudo);
    }

    @Override
    public void reembolsoDeDespesa() {
        Reembolsos.super.reembolsoDeDespesa();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getBolsaEstudo() {
        return bolsaEstudo;
    }

    public void setBolsaEstudo(double bolsaEstudo) {
        this.bolsaEstudo = bolsaEstudo;
    }
}
