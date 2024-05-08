package Tarefas;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ListaTarefas listaTarefas = new ListaTarefas();

    boolean init = true;

    while (init) {
      System.out.println("Anotação de tarefas");
      System.out.println("total tarefas: " + listaTarefas.totalTarefas());

      System.out.println("");
      System.out.println("1 - adicionar tarefa");
      System.out.println("2 - remover tarefa");
      System.out.println("3 - mostrar tarefas");
      System.out.println("0 - sair");
      System.out.print("Selecione uma opcao: ");
      System.out.println("");

      Scanner scanner = new Scanner(System.in);
      int opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          System.out.println("-------------------------------------");
          System.out.println("Adicione uma descricao: ");
          String descricao = scanner.next();
          listaTarefas.adicionaTarefa(descricao);
          break;

        case 2:
          System.out.println("-------------------------------------");
          System.out.println("Remover tarefa com descricao: ");
          String removeDescricao = scanner.next();
          listaTarefas.removerTarefa(removeDescricao);
          break;

        case 3:
          System.out.println("-------------------------------------");
          System.out.println("Lista com as tarefas");
          listaTarefas.exibirTarefas();
          break;

        case 0:
          init = false;
          scanner.close();
          break;

        default:
          scanner.close();
          break;
      }

      System.out.println("-------------------------------------");
    }

  }
}
