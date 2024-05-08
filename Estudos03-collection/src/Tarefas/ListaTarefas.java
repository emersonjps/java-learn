package Tarefas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
  private List<Tarefas> listaTarefas;

  public ListaTarefas() {
    listaTarefas = new ArrayList<>();
  }

  public void adicionaTarefa(String descricao) {
    listaTarefas.add(new Tarefas(descricao));
  }

  public void removerTarefa(String descricao) {
    List<Tarefas> removerTarefas = new ArrayList<>();
    for (Tarefas tarefa : listaTarefas) {
      if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
        removerTarefas.add(tarefa);
      }
    }
    listaTarefas.removeAll(removerTarefas);
  }

  public int totalTarefas() {
    return listaTarefas.size();
  }

  public void exibirTarefas() {
    for (Tarefas tarefa : listaTarefas) {
      System.out.println(tarefa.getDescricao());
    }
  }
  
}
