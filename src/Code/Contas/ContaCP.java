package Code.Contas;

import Code.Cliente;
import Code.Interfaces.Rendavel;

public class ContaCP extends Conta implements Rendavel {

    public ContaCP(int numero, Cliente titular) {
        super(numero, titular);
    }

    private static final double TAXA_RENDIMENTO = 0.005;


    @Override
    public void aplicarRendimento() {
        double rendimento = this.getSaldo() * TAXA_RENDIMENTO;
        this.depositar(rendimento);
        System.out.println("Rendimento de R$" + rendimento + " aplicado na conta " + this.getNumeroConta());

    }
}
