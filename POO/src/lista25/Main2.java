package lista25;

public class Main2 {
    public static void main(String[] args) {
        Personagem p1 = new Guerreiro();
        Personagem p2 = new Mago();
        Personagem p3 = new Curandeiro();

        p1.realizarAcao();
        p2.realizarAcao();
        p3.realizarAcao();
    }
}