import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Conta conta1 = new Conta();

        System.out.println("Por favor, digite ( Nome do Cliente )!");
        String inputNomeClente = scanner.next();
        conta1.setNomeCliente(inputNomeClente);

        System.out.println("Por favor, digite o número da ( Agência )!");
        String inputAgencia = scanner.next();
        conta1.setAgencia(inputAgencia);

        System.out.println("Por favor, digite o número da ( Conta )!");
        int inputNumero = scanner.nextInt();
        conta1.setNumero(inputNumero);

        System.out.println("Por favor, digite ( Saldo )!");
        double inputSaldo = scanner.nextDouble();
        conta1.setSaldo(inputSaldo);

        System.out.println();
        System.out.println("Olá " + conta1.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta1.getAgencia() + ", conta " + conta1.getNumero() + " e seu saldo " + conta1.getSaldo() + " já está disponível para saque.");

    }
}