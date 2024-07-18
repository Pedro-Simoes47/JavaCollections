package set.operacoesBasicas.conjuntoConvidado.palavrasUnicas;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }
    // tem outro modo de fazer
    /*
    * public void removerPalavra(String palavra) {
    if (!palavrasUnicasSet.isEmpty()) {
      if (palavrasUnicasSet.contains(palavra)) {
        palavrasUnicasSet.remove(palavra);
      } else {
        System.out.println("Palavra não encontrada no conjunto!");
      }
    } else {
      System.out.println("O conjunto está vazio!");
    }
  }
  * Provavelmente e mais simples e perfomatico
    * */
    public void removerPalavra(String palavra){
        String palavraParaRemover = null;
        for(String p : palavrasUnicas){
            if(p.equalsIgnoreCase(palavra)){
                palavraParaRemover = p;
                break;
            }
        }
        palavrasUnicas.remove(palavraParaRemover);
    }

    public String verificarPalavra(String palavra){
        if(!palavrasUnicas.contains(palavra)){
            System.out.println("Ela não pertence ao conjunto");
        }
        return "Sim, ela pertence no conjunto";

    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicas);
    }
}
