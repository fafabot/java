package Lista22;

import java.util.Scanner;

public class pizzaP {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Primeira pizza
        pizza pizza1 = new pizza();
        pizza1.sabor = "Calabresa";
        pizza1.tamanho = "Grande";
        pizza1.bordaRecheada = true;

        pizza1.preparar();
        pizza1.assando();
        pizza1.mostrarInformacoes();

        System.out.println("----------------------");

        // Segunda pizza
        pizza pizza2 = new pizza();

        System.out.println("Qual o sabor da pizza?");
        pizza2.sabor = sc.next();

        System.out.println("Qual o tamanho da pizza?");
        pizza2.tamanho = sc.next();

        System.out.println("A pizza tem borda recheada? (true/false)");
        pizza2.bordaRecheada = sc.nextBoolean();

        pizza2.preparar();
        pizza2.assando();
        pizza2.mostrarInformacoes();

	}

}
