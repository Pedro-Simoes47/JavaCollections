package list.pesquisa.somaNumeros;

public class Main {
    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(4);
        numeros.adicionarNumero(6);
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(12);
        numeros.adicionarNumero(5);

        System.out.println("A soma dos numeros é: " + numeros.calcularSoma());
        System.out.println("O maior numero é: " + numeros.encontrarMaiorNumero());
        System.out.println("O menor numero é: " + numeros.encontrarMenorNumero());

        System.out.println(numeros.exibirNumeros());
    }
}
