package catalisa.lista07.pais;

import java.util.HashSet;
import java.util.Set;

public class Pais {
    private  String codigoIso;
    private String nome;
    private  int populacao;
    private  double dimencao;
    private Set<Pais> listaDePais = new HashSet<>();

    public Pais(String codigoIso, String nome, double dimencao) {
        this.setCodigoIso(codigoIso);
        this.setNome(nome);
        this.setDimencao(dimencao);
    }
    public void eVizinho(Pais pais){
        if (this.listaDePais.contains(pais)){
            System.out.println(pais.getNome() + " é vizinho.");
        }else {
            System.out.println(pais.getNome() + " Não é vizinho.");
        }
    }
    public void emComumCom(Pais p){
    System.out.println(this.getNome() + " tem País em comum com " + p.getNome());
        for (Pais pais1 : listaDePais){
            if (p.listaDePais.contains(pais1)){
                System.out.println(pais1.getNome());
            }
        }
    }
    public void adicionarPais(Pais pais){
        this.listaDePais.add(pais);
    }
    public void listarPais(){
        System.out.println("os países vizinhos de: " + this.getNome());
        for (Pais pais : listaDePais){
            System.out.println(pais.getNome());
        }
    }


    public double calcularDensidade(){
        return this.getPopulacao() / this.getDimencao();
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

    public double getDimencao() {
        return dimencao;
    }

    public void setDimencao(double dimencao) {
        this.dimencao = dimencao;
    }
}
