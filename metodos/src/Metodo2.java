package metodos.src;

public class Metodo2 { // Classe SMARTTV
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    //novoCanal = Paramentro
    public void mudarDeCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal alterado para: " + canal);
    }

    public void ligar() {
        ligada = true;
        System.out.println("Televisao Ligada");
    }

    public void desligar() {
        System.out.println("Televisao Desligada");
        ligada = false;
        
    }

    public void aumentarVolume() {
        ++volume;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume() {
        --volume;
        System.out.println("Diminuindo volume para: " + volume);
    }

    public int subirCanal() {
        return ++canal;
    }

    public int descerCanal() {
        return --canal;
    }

}
