package catalisa.lista08.exercicio01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Cadastro {
    private Set<Produto> listaDeProdutos = new HashSet<>();
    public void adicionarProduto(){
        Scanner input = new Scanner(System.in);
        System.out.println("Quantos produtos você deseja cadastrar: ");
        int qtd = input.nextInt();
        for (int i = 1; i <= qtd; i++){
            System.out.println("Nome do produto: ");
            String nome = input.next();
            System.out.println("Preço R$");
            double preco = input.nextDouble();
            Produto produto = new Produto(nome, preco);
            this.listaDeProdutos.add(produto);
        }
        System.out.println("cadastrado");
    }
    public void listarProdutos(){
        for (Produto produto : listaDeProdutos){
            System.out.println("Nome: " + produto.getNome() + " Preço R$" + produto.getPreco());
        }
    }
    public void excluirProduto(String nome){
        for (Produto produto : listaDeProdutos){
            if (nome.equalsIgnoreCase(produto.getNome())){
                this.listaDeProdutos.remove(produto);
            }
        }
    }
}
