package list.ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> listaPessoas;

    public OrdenacaoPessoa() {
        this.listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome,idade,altura));
    }

    public List<Pessoa> ordernarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordernarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorAltura, new CompararPorAltura());
        return  pessoasPorAltura;
    }
}