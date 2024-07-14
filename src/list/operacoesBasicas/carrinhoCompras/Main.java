package list.operacoesBasicas.carrinhoCompras;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println("Digite o nome do item seu preço e sua quantidade separando com espaço cada parametro: ");
        carrinhoDeCompras.adicionarItem(sc.nextLine(), sc.nextDouble(), sc.nextInt());
        carrinhoDeCompras.adicionarItem(sc.nextLine(), sc.nextDouble(), sc.nextInt());
        carrinhoDeCompras.adicionarItem(sc.nextLine(), sc.nextDouble(), sc.nextInt());

        carrinhoDeCompras.exibirItem();
        System.out.println(carrinhoDeCompras.calcularValorTotal());

        carrinhoDeCompras.removerItem(sc.next());
        System.out.println(carrinhoDeCompras.calcularValorTotal());
    }
}
