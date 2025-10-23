package primeiroProjeto;

import java.util.Scanner;

public class Lista20 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Funções sem parâmetro
        saudacao();
        retangulo();
        multiplos();
        contagem();
        meses();

        System.out.println("---------------------");
        
        
        //Funções com parâmetro
        System.out.print("Digite um número para verificar se é divisível por 5: ");
        int numDivisivel = sc.nextInt();
        divisivel(numDivisivel);
        

        System.out.print("Digite seu nome para a despedida: ");
        String nome = sc.nextLine();
        despedida(nome);

        
        System.out.print("Digite seu primeiro nome: ");
        String primeiroNome = sc.nextLine();
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = sc.nextLine();
        unir(primeiroNome, sobrenome);

        
        System.out.print("Digite um número para verificar se é maior que 100: ");
        int numMaior = sc.nextInt();
        maiorque100(numMaior);

        
        System.out.print("Digite a velocidade: ");
        int vel = sc.nextInt();
        velocidade(vel);


        System.out.print("Digite o dia da semana: ");
        String dia = sc.nextLine();
        saudacaoDia(dia);

        System.out.print("Digite a quantidade de itens em estoque: ");
        int qtd = sc.nextInt();
        estoque(qtd);
    }

    // 1 – Repetindo uma saudação
    public static void saudacao() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Bom dia!");
        }
    }

    // 2 – Desenhando um retângulo
    public static void retangulo() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("*****");
        }
    }

    // 3 – Imprimindo múltiplos de 5
    public static void multiplos() {
        for (int i = 5; i <= 25; i += 5) {
            System.out.println(i);
        }
    }

    // 4 – Exibindo uma contagem crescente
    public static void contagem() {
        for (int i = 1; i <= 8; i++) {
            System.out.println(i);
        }
        System.out.println("Pronto!");
    }

    // 5 – Mostrando os meses do ano
    public static void meses() {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};
        for (String mes : meses) {
            System.out.println(mes);
        }
    }

    // 1 – Verificando divisibilidade
    public static void divisivel(int numero) {
        if (numero % 5 == 0) {
            System.out.println(numero + " é divisível por 5.");
        } else {
            System.out.println(numero + " não é divisível por 5.");
        }
    }

    // 2 – Mensagem de despedida
    public static void despedida(String nome) {
        System.out.println("Até logo, " + nome + "!");
    }

    // 3 – Unindo nomes
    public static void unir(String primeiroNome, String sobrenome) {
        System.out.println("Nome completo: " + primeiroNome + " " + sobrenome);
    }

    // 4 – Verificando maior que 100
    public static void maiorque100(int numero) {
        if (numero > 100) {
            System.out.println(numero + " é maior que 100.");
        } else {
            System.out.println(numero + " não é maior que 100.");
        }
    }

    // 5 – Classificando velocidade
    public static void velocidade(int velocidade) {
        if (velocidade < 40) {
            System.out.println("Lenta");
        } else if (velocidade <= 80) {
            System.out.println("Normal");
        } else {
            System.out.println("Rápida");
        }
    }

    // 6 – Saudação por dia da semana
    public static void saudacaoDia(String dia) {
        System.out.println("Tenha uma ótima " + dia + "!");
    }

    // 7 – Verificando situação de estoque
    public static void estoque(int quantidade) {
        if (quantidade >= 10) {
            System.out.println("Estoque suficiente");
        } else if (quantidade >= 5) {
            System.out.println("Estoque baixo");
        } else {
            System.out.println("Estoque crítico");
        }
    }
}