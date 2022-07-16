package catalisa.lista08.exercicio03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppRestaurante {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurante restaurante = new Restaurante();
        boolean start = true;
        while (start){
            System.out.println("Qual sua opção: \n1 - adicionar \n2 - listar \n3 - excluir \n4 - sair");
            int op = input.nextInt();
            if (op==1){
                System.out.println("Qual a quantidade de pratos você deseja adicionar: ");
                int qtd = input.nextInt();
                for (int i = 1; i <= qtd; i++){
                    System.out.println(i + "º Nome do primeiro prato: ");
                    String nome = input.next();
                    System.out.println("qqual é a quantidade de ingredientes para o prato " + nome);
                    int quantidadeIngredientes = input.nextInt();
                    List<String> listaIngredientes = new ArrayList<>();
                    for (int j = 1; j <= quantidadeIngredientes; j++){
                        System.out.println(j + "º ingrediente");
                        listaIngredientes.add(input.next());
                    }
                restaurante.adicionar(nome, listaIngredientes);
                }
            }else if (op==2){
                restaurante.listar();
            }else if (op==3){
                System.out.println("Digite corretamente o nome do plato para excluir");
                String nome = input.next();
                restaurante.excluir(nome);
            }else if (op==4){
                System.out.println("Finalizando o programa.");
                start = false;
            }
        }
        input.close();
    }
}
