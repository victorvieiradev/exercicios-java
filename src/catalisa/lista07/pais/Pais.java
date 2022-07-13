package catalisa.lista07.pais;

import java.util.HashSet;
import java.util.Set;

public class Pais {
    private String codigoIso;
    private String nome;
    private int populacao;
    private int dimenssao;
    private Set<Pais> paisComFronteira = new HashSet<>();

    public Pais(String codigoIso, String nome, int populacao, int dimenssao) {
        this.setCodigoIso(codigoIso);
        this.setNome(nome);
        this.setPopulacao(populacao);
        this.setDimenssao(dimenssao);
    }
    public void apresentar(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Código: " + this.getCodigoIso());
        System.out.println("População: " + this.getPopulacao());
        System.out.println("Dimensão geografica: " + this.getDimenssao());
        System.out.println("Dencidade demografica: " + this.exebirDencidadeDemografica());
        System.out.println("Os meus visinhos são: ");
        for (Pais pais: paisComFronteira){
            System.out.println(pais.getNome());
        }
    }
    public void addPais(Pais pais){
        this.paisComFronteira.add(pais);
    }
    public void eVisinho(Pais pais){
        if (this.paisComFronteira.contains(pais)){
            System.out.println(pais.getNome()+" é visinho");
        }else {
            System.out.println(pais.getNome()+" não é visinho.");
        }
    }
    private double exebirDencidadeDemografica(){
        return this.getPopulacao() / this.getDimenssao();
    }
    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public int getDimenssao() {
        return dimenssao;
    }

    public void setDimenssao(int dimenssao) {
        this.dimenssao = dimenssao;
    }
}
