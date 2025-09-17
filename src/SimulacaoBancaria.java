import Code.Banco;
import Code.Cliente;
import Code.Contas.Conta;
import Code.Exceptions.ContaNaoEncontradaException;
import Code.Exceptions.SaldoInsuficienteException;


public class SimulacaoBancaria {
    public static void main(String[] args) {
        Banco meuBanco = new Banco("BANCO FILIPPO", 777);
        Cliente cliente1 = new Cliente("Sergio Filippo", "02202022", "9292992");
        Cliente cliente2 = new Cliente("Lailoca", "131321313", "9551122");


//      System.out.println(cliente1.toString());

        Conta cc_sergio = meuBanco.abrirConta(cliente1, "CC");
        Conta cp_lailoca = meuBanco.abrirConta(cliente2, "CP");

        cc_sergio.depositar(2300);
        cp_lailoca.depositar(2250);

        try {
            cc_sergio.sacar(5000);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        meuBanco.aplicarRendimentosMensais();
        meuBanco.cobrarTaxasMensais();

        meuBanco.listarContas();

        try {
            meuBanco.buscarConta(3);
        } catch (ContaNaoEncontradaException e) {
            System.out.println(e.getMessage());
        }
    }
}
