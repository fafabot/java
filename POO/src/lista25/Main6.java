package lista25;

public class Main6 {
    public static void main(String[] args) {
        Instrumento i1 = new Violao();
        Instrumento i2 = new Bateria();
        Instrumento i3 = new Piano();

        i1.tocar();
        i2.tocar();
        i3.tocar();
    }
}
