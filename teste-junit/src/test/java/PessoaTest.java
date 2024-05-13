import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.Pesssoa;

public class PessoaTest {
  String nome = "Emerson";
  int idade = 23;

  Pesssoa pesssoa = new Pesssoa(nome, LocalDate.of(2001, 2, 13));

  @Test
  void validarCalculoIdade() {
    Assertions.assertEquals(idade, pesssoa.getIdade());
  }

  @Test
  void verificaNome() {
    Assertions.assertEquals(nome, pesssoa.getNome());
  }

  @Test
  void verificaIdade() {
    Assertions.assertEquals(idade, pesssoa.getIdade());
  }

  @Test
  void verificaMaiorIdade() {
    Assertions.assertTrue(pesssoa.maiorIdade());
  }
}
