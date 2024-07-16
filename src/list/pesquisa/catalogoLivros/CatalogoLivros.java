package list.pesquisa.catalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosDoAutor = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for (Livro livro : livroList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosDoAutor.add(livro);
                }
            }
        }
        return livrosDoAutor;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for (Livro livro : livroList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();
        if(!livroList.isEmpty()){
                for (Livro livro : livroList){
                    if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                        livrosPorAno.add(livro);
                    }
                }
        }
        return livrosPorAno;
    }
}
