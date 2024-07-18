package list.ordenacao.ordenacaoNumeros;


public class Main {
    public static void main(String[] args) {

        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(6);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(7);
        ordenacaoNumeros.adicionarNumero(1);

        System.out.println(ordenacaoNumeros.ordernarAscendente());
        System.out.println(ordenacaoNumeros.ordernarDescendente());
    }
}
