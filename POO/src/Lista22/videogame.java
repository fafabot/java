package Lista22;

public class videogame {

    String marca;
    String modelo;
    boolean ligado;

    void ligar() {
        ligado = true;
        System.out.println("O console está ligado.");
    }

    void desligar() {
        ligado = false;
        System.out.println("O console foi desligado.");
    }

    void verificarStatus() {
        if (ligado) {
            System.out.println("O console está LIGADO.");
        } else {
            System.out.println("O console está DESLIGADO.");
        }
    }
}