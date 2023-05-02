package metodos.src;

public class UsuarioMetodo2 { //UsuarioSmartTV
    public static void main(String[] args) {
        Metodo2 smartTv = new Metodo2();

        System.out.println("Tv ligada?" + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        smartTv.desligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.diminuirVolume();

        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.mudarDeCanal(17);
        System.out.println("Canal atual: " + smartTv.canal);


    }

}
