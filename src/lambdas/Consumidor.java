package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimirNome = produto -> System.out.println(produto.nome+" !!");
        Produto p1 = new Produto("Caneta", 12, 0.12);
        imprimirNome.accept(p1);
        Produto p2 = new Produto("Lapes", 5, 0.10);
        List<Produto> produtos = new ArrayList<>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.forEach(imprimirNome);
        produtos.forEach(produto -> System.out.println(produto.preco));
        produtos.forEach(System.out::println);
    }
}
