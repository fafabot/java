package Lista22;

public class musica {

    String titulo;
    String artista;
    double duracao;

    void tocar() {
        System.out.println("Tocando " + titulo + " de " + artista + "...");
    }

    void pausar() {
        System.out.println("Música pausada");
    }

    void mostrarDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Duração: " + duracao + " minutos");
    }
}