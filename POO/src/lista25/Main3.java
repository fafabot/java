package lista25;

public class Main3 {
    public static void main(String[] args) {

        Conta c1 = new ContaPoupanca();
        Conta c2 = new ContaInvestimento();

        System.out.println("Rendimento poupança: " + c1.calcularRendimento());
        System.out.println("Rendimento investimento: " + c2.calcularRendimento());
    }
}
