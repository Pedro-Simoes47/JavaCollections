package list.operacoesBasicas.carrinhoCompras;

public class Item {
    // atributos da classe
    private String nome;
    private double preco;
    private int quantidade;

    // construtor da classe
    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // métodos get para retornar os valores dos atributos ja que eles são privados
    public String getNome() {return nome;}

    public double getPreco() {return preco;}

    public int getQuantidade() {return quantidade;}

    @Override
    public String toString() {
        return "Item{" +
                "nome: " + nome +
                ", preco: " + preco +
                ", quantidade: " + quantidade +
                '}';
    }
}
