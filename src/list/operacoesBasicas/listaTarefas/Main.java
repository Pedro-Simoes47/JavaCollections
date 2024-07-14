package list.operacoesBasicas.listaTarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("Numero de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Fazer janta");
        listaTarefas.adicionarTarefa("Fazer janta");
        listaTarefas.adicionarTarefa("Trocar água dos gatos");
        listaTarefas.adicionarTarefa("Colocar ração para os gatos");
        listaTarefas.adicionarTarefa("Estudar para ter futuro");
        System.out.println("Numero de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();
        listaTarefas.removerTarefa("Fazer janta");
        System.out.println("Numero de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.obterDescricoesTarefas();
    }



}
