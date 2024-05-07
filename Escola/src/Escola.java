public class Escola {
  public static void main(String[] args) {
    
    Aluno aluno1 = new Aluno("123");
    aluno1.setNome("Emerson");
    aluno1.setIdade(23);
    System.out.println("Aluno " + aluno1.getNome() + " tem a idade de " + aluno1.getIdade() + " com cpf " + aluno1.getCpf());
  }
}
