package list.operacoesBasicas.listaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa tarefaRemove : tarefas){
            if(tarefaRemove.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(tarefaRemove);
            }
        }
        tarefas.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefas.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefas);
    }

}
