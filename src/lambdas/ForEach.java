package lambdas;

import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
        aprovados.forEach(nome -> System.out.println(nome + " !!!"));
        aprovados.forEach(System.out::println);
        aprovados.forEach(nome -> meuImprimir(nome));
        aprovados.forEach(ForEach::meuImprimir);
    }
    static void meuImprimir(String nome){
        System.out.println("Oi, meu nome é: " + nome);
    }
}
