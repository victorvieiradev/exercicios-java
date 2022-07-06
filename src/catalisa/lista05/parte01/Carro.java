package catalisa.lista05.parte01;

public class Carro {
    int quantidadeDePortas;
    String modelo;
    String marca;
    double potencia = 2.0;


    public Carro(int quantidadeDePortas, String modelo, String marca, double potencia) {
        this.quantidadeDePortas = quantidadeDePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public Carro(int quantidadeDePortas, String modelo, String marca) {
        this.quantidadeDePortas = quantidadeDePortas;
        this.modelo = modelo;
        this.marca = marca;
    }
}
