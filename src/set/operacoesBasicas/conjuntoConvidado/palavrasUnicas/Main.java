package set.operacoesBasicas.conjuntoConvidado.palavrasUnicas;



public class Main {
    public static void main(String[] args) {

        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Espadachim");
        conjuntoPalavrasUnicas.adicionarPalavra("Capitão");
        conjuntoPalavrasUnicas.adicionarPalavra("Atirador");
        conjuntoPalavrasUnicas.adicionarPalavra("Navegadora");
        conjuntoPalavrasUnicas.adicionarPalavra("Cozinheiro");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Capitão"));

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Atirador");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
