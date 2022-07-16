package catalisa.lista08.exercicio02;

import java.util.Scanner;

public class AppVestibular {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vestibular vestibular = new Vestibular();
        boolean start = true;
        while (start){
            System.out.println("Qual sua opção: \n1 - adicionar \n2 - Listar \n3 - Excluir \n4 - Sair");
            int op = input.nextInt();
            if (op==1){
                System.out.println("Quantas matriculas de aluno deseja adicionar: ");
                int qtd = input.nextInt();
                for (int i = 1; i <= qtd; i++){
                    System.out.println("digite o número da matricula: ");
                    String matricula = input.next();
                    System.out.println("Nota: ");
                    double nota = input.nextDouble();
                    vestibular.adicionar(matricula, nota);
                }
                System.out.println("Cadastro realizado");
            }else if (op==2){
                vestibular.listar();
            }else if (op==3){
                System.out.println("Qual mátricula deseja remover, porfavor digite corretamente o nome para conseguirmos encontrar e excluir para você.");
                String matricula = input.next();
                vestibular.excluir(matricula);
            }else if (op==4){
                System.out.println("Finalizando o programa");
                start = false;
            }
        }
        input.close();
    }
}
