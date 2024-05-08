package Iphone;
import Internet.Internet;
import Telefone.Telefone;
import musica.Musica;

public class Iphone implements Musica, Internet, Telefone{

  private void verificarInternet() {
    System.out.println("Verificando intenet");
  }

  @Override
  public void ligar() {
    System.out.println("Ligando via iphone");
  }

  @Override
  public void correioVoz() {
    System.out.println("( 3 ) messagens de voz");
  }

  @Override
  public void mensagem() {
    System.out.println("Enviando menssagens");
  }

  @Override
  public void navegar(String url) {
    verificarInternet();
    System.out.println("Navegando pela internet no enderenço: " + url);
  }

  @Override
  public void email(String menssagem) {
    verificarInternet();
    System.out.println("Enviando e-mail: " + menssagem);
  }

  @Override
  public void play() {
    System.out.println("Sistema de play iphone");
  }

  @Override
  public void passarMusica() {
    System.out.println("Passando musica");
  }

  @Override
  public void voltarMusica() {
    System.out.println("Voltando musica");
  }

}
