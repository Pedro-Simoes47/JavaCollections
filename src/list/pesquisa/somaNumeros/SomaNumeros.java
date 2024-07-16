package list.pesquisa.somaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros{
    private List<Integer> listaInteiros;

    public SomaNumeros() {
        this.listaInteiros = new ArrayList<>();
    }
    public void adicionarNumero(int numero){
        listaInteiros.add(numero);
    }
    public int calcularSoma(){
        int totalSoma = 0;
        if(!listaInteiros.isEmpty()){
            for(Integer numero : listaInteiros){
                totalSoma += numero;
            }
        }
        else {
            System.out.println("Não a nada para somar, pois a lista está vazia!");
        }
        return totalSoma;
    }
    // VER MAIS SOBRE ESSA PARADA DE ACHAR O MAIOR E MENOR VALOR
    public int encontrarMaiorNumero(){
        int maior = Integer.MIN_VALUE;
        if(!listaInteiros.isEmpty()){
            for(Integer numero : listaInteiros){
                if(numero >= maior){
                    maior = numero;
                }
            }
        }
        else {
            System.out.println("A lista está vazia!");
        }
        return maior;
    }
    public int encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        if(!listaInteiros.isEmpty()){
            for(Integer numero : listaInteiros){
                if(numero <= menor){
                    menor = numero;
                }
            }
        }
        else {
            System.out.println("A lista está vazia!");
        }
        return menor;
    }
    public List exibirNumeros(){
        if(listaInteiros.isEmpty()){
            System.out.println("Não há numeros para exibir!");
        }
        return listaInteiros;
    }
}
