package set.operacoesBasicas.conjuntoConvidado.conjuntoConvidado;

public class Main {
    public static void main(String[] args) {

        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("pedro", 1);
        convidados.adicionarConvidado("lola", 2);
        convidados.adicionarConvidado("fusquinha", 3);
        convidados.adicionarConvidado("framboesa", 4);
        convidados.adicionarConvidado("talita", 5);
        convidados.adicionarConvidado("tata", 5);

        System.out.println(convidados.contarConvidados());
        convidados.exibirConvidados();
        convidados.removerConvidado(2);
        System.out.println(convidados.contarConvidados());
        convidados.exibirConvidados();
    }
}
