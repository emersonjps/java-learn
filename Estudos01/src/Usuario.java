public class Usuario {
    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        System.out.println("TV ligada: " + smartTV.ligada);
        System.out.println("Canal Atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);


        smartTV.ligar();
        System.out.println("TV ligada NOVO: " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("TV ligada NOVO: " + smartTV.ligada);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume atual 3+ NOVO: " + smartTV.volume);


        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        System.out.println("Volume atual 5- NOVO: " + smartTV.volume);

        smartTV.mudarCanal(10);
        System.out.println("Canal Atual: " + smartTV.canal);

        smartTV.aumentarCanal();
        System.out.println("Canal Atual: " + smartTV.canal);

        smartTV.diminuirCanal();
        System.out.println("Canal Atual: " + smartTV.canal);

    }
}