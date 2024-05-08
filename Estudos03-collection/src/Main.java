import java.util.Scanner;

import Tarefas.ListaTarefas;

public class Main {
  public static void main(String[] args) {
    ListaTarefas listaTarefas = new ListaTarefas();

    System.out.println("Número total de elementos no Array list: " + listaTarefas.totalTarefas());

    listaTarefas.adicionaTarefa("Estudar Java para revisão final.");
    System.out.println("Número total de elementos no Array list: " + listaTarefas.totalTarefas());

    System.out.println("Adicionar tarefa:");
    Scanner scanner = new Scanner(System.in);
    String descricao = scanner.next();

    listaTarefas.adicionaTarefa(descricao);
    System.out.println("Número total de elementos no Array list: " + listaTarefas.totalTarefas());

    listaTarefas.exibirTarefas();


    listaTarefas.adicionaTarefa("Não remover");
    listaTarefas.adicionaTarefa("Remover essa tarefa");
    listaTarefas.adicionaTarefa("Remover essa tarefa");
    listaTarefas.removerTarefa("Remover essa tarefa");
    listaTarefas.exibirTarefas();

    scanner.close(); 
  }
}
