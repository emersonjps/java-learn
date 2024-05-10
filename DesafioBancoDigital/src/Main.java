public class Main {
  public static void main(String[] args) {

    Cliente cliente = new Cliente();
    cliente.setNome("Emerson");

    Conta contaCorrente = new ContaCorrente(cliente);
    contaCorrente.depositar(1200);

    Conta contaPoupanca = new ContaPoupanca(cliente);
    contaPoupanca.depositar(650);

    contaCorrente.transferir(250, contaPoupanca);
    contaCorrente.sacar(100);

    contaCorrente.imprimirExtrato();
    contaPoupanca.imprimirExtrato();

  }
}
