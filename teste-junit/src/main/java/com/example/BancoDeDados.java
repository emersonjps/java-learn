package com.example;

import java.util.logging.Logger;

public class BancoDeDados {

  private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

  public static void iniciarConexao() {
    // Fez algo
    LOGGER.info("inicial conexao");
  }

  public static void finalizarConexao() {
    // Fez algo
    LOGGER.info("finalizou conexao");
  }

  public static void insereDados(Pesssoa pesssoa) {
    LOGGER.info("inseriu dados");

  }

  public static void removeDados(Pesssoa pesssoa) {
    LOGGER.info("inseriu dados");
  }

}
