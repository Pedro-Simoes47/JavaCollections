package list.pesquisa.catalogoLivros;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Java Para Iniciantes", "Nelio Alves", 2017);
        catalogoLivros.adicionarLivro("Java intermediario", "Nelio Alves", 2017);
        catalogoLivros.adicionarLivro("Como ser bobo", "Patrick", 2011);
        catalogoLivros.adicionarLivro("Java intermediario", "Nelio Alves", 2019);
        catalogoLivros.adicionarLivro("Iniciantes", "pedro", 2007);
        catalogoLivros.adicionarLivro("Python iniciantes", "Alessandro Manrique", 2009);


        System.out.println(catalogoLivros.pesquisarPorAutor("Nelio Alves"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2009, 2019));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Java intermediario"));


    }
}
