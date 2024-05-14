import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import com.example.Pesssoa;



public class PessoaTest {
  String nome = "Emerson";
  int idade = 23;

  Pesssoa emerson = new Pesssoa(nome, LocalDate.of(2001, 2, 13));

  @Test
  void validarCalculoIdade() {
    assertEquals(idade, emerson.getIdade());
  }

  @Test
  void verificaNome() {
    assertEquals(nome, emerson.getNome());
  }

  @Test
  void verificaIdade() {
    assertEquals(idade, emerson.getIdade());
  }

  @Test
  void verificaMaiorIdade() {
    assertTrue(emerson.maiorIdade());
  }
}
