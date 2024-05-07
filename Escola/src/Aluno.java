public class Aluno {
  private String nome;
  private int idade;
  private String cpf;

  Aluno(String cpf) {
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public int getIdade() {
    return idade;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }
}
