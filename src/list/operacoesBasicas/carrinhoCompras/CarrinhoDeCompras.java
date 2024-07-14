package list.operacoesBasicas.carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    // atributo da classe do Tipo lista sendo que essa lista e do tipo Item(classe)
    private List<Item> compras;

    // construtor da classe criando uma lista vazia
    public CarrinhoDeCompras(){
        this.compras = new ArrayList<>();
    }

    // método para adicionar um item na lista
    public void adicionarItem(String nome, double preco, int quantidade){
        /* aqui chama o método .add passando como parametro um novo objeto do tipo Item com os parametros de nome
         preco e quantidade que são necessarios para criar um item na lista compras
         */
        compras.add(new Item(nome, preco, quantidade));

    }

    // método para remover os itens da lista
    public void removerItem(String nome){
        // se cria uma nova lista para adicionar os itens que serão removidos
        List<Item> itensParaRemover = new ArrayList<>();
        // verifica se a lista esta vazia caso esteja pula direto pro bloco else
        if(!compras.isEmpty()) {
            /* faz um loop para iterar sobre cada item na lista de compras */
            for (Item item : compras) {
                // se o item tiver o mesmo nome que foi passado como parametro ele e adicionado a lista itensParaRemover
                if (item.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(item);
                }
            }
            // após ter iterado por todos os itens, pode chamar o método removeAll para delatar o item
            compras.removeAll(itensParaRemover);
        }
        else {
            System.out.println("A lista esta vazia!");
        }

    }
    public double calcularValorTotal(){
        double totalCompra = 0;
        if(!compras.isEmpty()){
            for(Item item : compras){
             double totalItem = item.getPreco() * item.getQuantidade();
             totalCompra += totalItem;
            }
             return totalCompra;
        }
        else{
            throw new RuntimeException("A lista esta vazia");
        }
    }
    public void exibirItem(){
        if(!compras.isEmpty()){
            System.out.println(compras);
        }
        else{
            System.out.println("A lista esta vazia!");
        }
    }


}
