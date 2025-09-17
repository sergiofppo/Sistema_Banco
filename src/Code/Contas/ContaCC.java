package Code.Contas;

import Code.Cliente;
import Code.Exceptions.SaldoInsuficienteException;
import Code.Interfaces.Taxavel;

public class ContaCC extends Conta implements Taxavel {

    public ContaCC(int numero, Cliente titular) {
        super(numero, titular);
    }

    private static final double TAXA_MANUTENCAO_MENSAL = 12.00;

    @Override
    public void cobrarTaxa() {
        try {
            this.sacar(TAXA_MANUTENCAO_MENSAL);
            System.out.println(
                    "Taxa de manutenção de R$" + TAXA_MANUTENCAO_MENSAL + " cobrada da conta " +
                            this.getNumeroConta());

        } catch (SaldoInsuficienteException e) {
            System.err.println("Não foi possível cobrar a taxa da conta " + this.getNumeroConta() +
                    ". Motivo: " + e.getMessage());
        }
    }
}
