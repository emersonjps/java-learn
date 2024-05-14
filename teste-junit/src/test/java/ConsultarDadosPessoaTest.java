import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.BancoDeDados;
import com.example.Pesssoa;

public class ConsultarDadosPessoaTest {

  @BeforeAll
  static void configuraConexao() {
    BancoDeDados.iniciarConexao();
  }

  @BeforeEach
  void insereDadosParaTeste() {
    BancoDeDados.insereDados(new Pesssoa("Emerson", LocalDate.of(2001, 2, 13)));
  }

  @AfterEach
  void removeDadosParaTeste() {
    BancoDeDados.removeDados(new Pesssoa("Emerson", LocalDate.of(2001, 2, 13)));
  }


  @Test
  void validaDadosRetorno() {
    Assertions.assertTrue(true);
  }

  @AfterAll
  static void finalizarConexao() {
    BancoDeDados.finalizarConexao();
  }
}
