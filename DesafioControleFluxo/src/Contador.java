import java.util.Scanner;

public class Contador {

  public static void main(String[] args) {
    System.out.println("Sistema de contagem com base em parametros");

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro parametro");
    int parametro1 = scanner.nextInt();
    System.out.println("Digite o segundo parametro");
    int parametro2 = scanner.nextInt();

    scanner.close();
    
    try {
      contar(parametro1, parametro2);
    } catch (Exception e) {
      System.out.println("O segudo parametro deve ser maior que o primeiro " + e);
    }

  }

  static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {

    if (parametro1 > parametro2) {
      throw new ParametrosInvalidosException();
    }

    int contagem = parametro2 - parametro1;

    System.out.println("contagem");
    for (int i = 1; i <= contagem; i++) {
      System.out.println(i);
    }
    System.out.println("Fim da contagem");

  }

}
