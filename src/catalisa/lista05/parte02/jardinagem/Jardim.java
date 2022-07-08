package catalisa.lista05.parte02.jardinagem;

public class Jardim {
    private int qtdMetros = 2;
    private int qtdPlantas;
    private int qtdMetrosGrama;
    private double kilosAdubo;
    private double valorAdubo;
    private double valorMetroGrama;
    private double valorContGrama;

    public Jardim(int qtdMetrosGrama, double valorAdubo, double valorMetroGrama) {
        this.qtdMetrosGrama = qtdMetrosGrama;
        this.valorAdubo = valorAdubo;
        this.valorMetroGrama = valorMetroGrama;
    }

    public double usarAdubo() {
        return (this.qtdMetrosGrama / this.qtdMetros) * 100;
    }

    public double precoAdubo() {
        return usarAdubo() * this.valorAdubo;
    }

    public double precoCorteGrama() {
        this.valorContGrama = this.qtdMetrosGrama * this.valorMetroGrama;
        return this.valorContGrama;
    }
}
