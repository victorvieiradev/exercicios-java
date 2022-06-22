package catalisa.lista02;

import java.util.Scanner;

public class SalarioMensalComDescontos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Saiba o valor mensal dado o valor por horas e o número de horas trabalhadas no mês.");
        System.out.println("Informe o valor da sua hora R$");
        double valorDaHora = input.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = input.nextInt();
        input.close();
        double salarioMensal = horasTrabalhadas * valorDaHora;
        double ir = (11*salarioMensal)/100;
        double inss = (8*salarioMensal)/100;
        double sindicato = (5*salarioMensal)/100;
        double descontos = (ir + inss + sindicato);
        double salárioLiquido = (salarioMensal - descontos);
        System.out.printf("Salário bruto R$ %.2f \nTotal de descontos R$ %.2f \nSalário líquido R$%.2f \n", salarioMensal, descontos, salárioLiquido);
        System.out.printf("IR R$ %.2f \nINSS R$ %.2f \nSindicato R$ %.2f", ir, inss, sindicato);

    }
}
