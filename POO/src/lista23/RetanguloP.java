package lista23;

import java.util.Scanner;

public class RetanguloP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo ret = new Retangulo();

        System.out.print("Informe a largura: ");
        ret.setLargura(sc.nextDouble());

        System.out.print("Informe a altura: ");
        ret.setAltura(sc.nextDouble());

        System.out.println("--------------------");
        System.out.println("Área: " + ret.calcularArea());
        System.out.println("Perímetro: " + ret.calcularPerimetro());
    }
}
