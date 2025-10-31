package lista23;

import java.util.Scanner;

public class CarroP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();

        System.out.print("Informe o modelo do carro: ");
        carro.setModelo(sc.nextLine());

        System.out.print("Informe o ano do carro: ");
        carro.setAno(sc.nextInt());

        System.out.println("--------------------");
        System.out.println("Carro: " + carro.getModelo() + " (" + carro.getAno() + ")");
        System.out.println("Velocidade atual: " + carro.getVelocidadeAtual() + " km/h");

        System.out.print("Aumentar velocidade em: ");
        carro.acelerar(sc.nextInt());
        System.out.println("Velocidade atual: " + carro.getVelocidadeAtual() + " km/h");

        System.out.print("Diminuir velocidade em: ");
        carro.frear(sc.nextInt());
        System.out.println("Velocidade atual: " + carro.getVelocidadeAtual() + " km/h");
    }
}
