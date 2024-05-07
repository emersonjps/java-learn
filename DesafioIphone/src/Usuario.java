import Iphone.Iphone;

public class Usuario {
  public static void main(String[] args) {
    // Tem um iphone
    Iphone iphone01 = new Iphone();
    iphone01.ligar(); 
    iphone01.correioVoz(); 
    iphone01.mensagem(); 
    iphone01.navegar("https://github.com/emersonjps"); 
    iphone01.email("Conteúdo da mensagem aqui"); 
    iphone01.play(); 
    iphone01.passarMusica(); 
    iphone01.voltarMusica(); 
    
}
  

}
