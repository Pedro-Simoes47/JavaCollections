package list.ordenacao;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa listPessoas = new OrdenacaoPessoa();

        listPessoas.adicionarPessoa("Pedro", 29, 1.78);
        listPessoas.adicionarPessoa("Roberto", 28, 1.90);
        listPessoas.adicionarPessoa("Gerald", 22, 1.60);
        listPessoas.adicionarPessoa("Gera", 18, 2.60);

        System.out.println(listPessoas.ordernarPorAltura());
        System.out.println(listPessoas.ordernarPorIdade());
    }
}
