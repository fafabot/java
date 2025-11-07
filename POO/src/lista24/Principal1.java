package lista24;

import java.util.Scanner;

public class Principal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cachorro dog = new Cachorro();
        
        System.out.print("Digite o nome do cachorro: ");
        String nomeDog = sc.nextLine();
        dog.setNome(nomeDog);
        
        System.out.print("Digite a idade do cachorro (em anos): ");
        int idadeDog = sc.nextInt();
        dog.setIdade(idadeDog);
        
        System.out.print("Digite a raça do cachorro: ");
        String racaDog = sc.nextLine();
        dog.setRaca(racaDog);

        System.out.println("\nInformações do Cachorro");
        dog.mostrarInfo();
        dog.abanarRabo();

        System.out.println("-----------------------------");
        
        Gato gato = new Gato();
        System.out.print("Digite o nome do gato: ");
        String nomeCat = sc.nextLine();
        gato.setNome(nomeCat);
        
        System.out.print("Digite a idade do gato (em anos): ");
        int idadeCat = sc.nextInt();
        gato.setIdade(idadeCat);
        
        System.out.print("Digite a cor do gato: ");
        String corCat = sc.nextLine();
        gato.setCor(corCat);

        System.out.println("\nInformações do Gato");
        gato.mostrarInfo();
        gato.subirNoMuro();
    }
}	
