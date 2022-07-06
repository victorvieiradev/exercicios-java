package catalisa.lista05.parte01;

public class Pessoa {
    String nome;
    int idade;
    double peso = 0;
    double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    public void pessoaApresentar(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.peso <= 0){
            System.out.println("O usuário não informou o peso");
        }else {
            System.out.println("Peso: " + this.peso);
        }
        System.out.println("altura: " + this.altura);
    }
    public void  envelhecer(){
        this.idade += 1;
        crescer();
    }
    public void engordar(double peso) {
        this.peso += peso;
    }
    public  void emagrecer(double peso){
        this.peso -= peso;
    }
    public void crescer(){
        if (this.idade < 21){
            this.altura += 00.05;
        }else {
            System.out.println("Não é mais possível crescer.");
        }


    }
}
