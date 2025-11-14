package lista25;

public class CartaoCredito extends Pagamento {
    @Override
    public void processarPagamento() {
        System.out.println("Pagamento com Cartão de Crédito aprovado!");
    }
}
