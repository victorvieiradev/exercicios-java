package catalisa.lista08.exercicio01;

import java.util.Scanner;

public class GestaoProduto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();
        boolean start = true;
        int op = 0;
        try {
            while (start){
                System.out.println("Qual sua opção: \n1 - Cadastrar \n2 - Mostrar cadastrados \n3 - Remover Produto \n4 - Sair");
                op = input.nextInt();
                if (op==1){
                    cadastro.adicionarProduto();
                }else if (op==2){
                    cadastro.listarProdutos();
                }else if (op==3){
                    System.out.println("Qual é o nome do produto que você deseja excluir: ");
                    String nome = input.next();
                    cadastro.excluirProduto(nome);
                }else if(op == 4){
                    System.out.println("Finalizando o programa.");
                    start = false;
                }
            }
        }catch (Exception e){
            System.out.println("erro " + e.getLocalizedMessage());
        }
        input.close();
    }
}
