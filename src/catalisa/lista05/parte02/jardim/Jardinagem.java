package catalisa.lista05.parte02.jardim;

public class Jardinagem {
    private int metrosGrama;
    private double valorAdubo;
    private int qtdAdubo;
    private double corteGrama;

    public Jardinagem(int metrosGrama, double valorAdubo, double corteGrama) {
        this.metrosGrama = metrosGrama;
        this.valorAdubo = valorAdubo;
        this.corteGrama = corteGrama;
    }

    public double usarAdubo(){
        return ((this.metrosGrama / 2) *100)/100;
    }
    public double precoAdubo(){
        return usarAdubo()*this.valorAdubo;
    }
    public double precoCorteGrama(){
        return this.metrosGrama* this.corteGrama;
    }
}
