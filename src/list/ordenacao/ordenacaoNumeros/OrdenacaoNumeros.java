package list.ordenacao.ordenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    private List<Integer> listaNumeros;


    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public List<Integer> ordernarAscendente(){
        // cria uma copia da lista
        List<Integer> listaOrdenada = new ArrayList<>(this.listaNumeros);
        // verifica se a lista esta vazia caso esteja pula pro else se nao estiver faz o bloco de codigo dentro do if
        if(!listaOrdenada.isEmpty()){
            // chama a classe collections com o metodo sort() e passa a lista para ser ordenada
            // como se trata de uma lista de numeros nao precisa implementar nada
            Collections.sort(listaOrdenada);
            return listaOrdenada;
        }
        else{
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public List<Integer> ordernarDescendente(){
        List<Integer> listaOrdenada = new ArrayList<>(this.listaNumeros);
        if(!listaOrdenada.isEmpty()){
            /* aqui esta chamando o metodo sort e passa a classe collections como o metodo reverseOrder para deixar em
            ordem descrecente.*/
            listaOrdenada.sort(Collections.reverseOrder());
            return listaOrdenada;
        }
        else{
            throw new RuntimeException("A lista esta vazia!");
        }
    }

}

