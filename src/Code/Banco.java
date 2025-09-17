package Code;

import Code.Contas.Conta;
import Code.Contas.ContaCC;
import Code.Contas.ContaCP;
import Code.Exceptions.ContaNaoEncontradaException;
import Code.Interfaces.Rendavel;
import Code.Interfaces.Taxavel;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nomeBanco;
    private int idBanco;
    private List<Conta> contas;

    public Banco(String nomeBanco, int idBanco) { // construtor
        this.nomeBanco = nomeBanco;
        this.idBanco = idBanco;
        this.contas = new ArrayList<>();
    }

    public Conta abrirConta(Cliente titular, String tipoConta){

        int novoNumeroConta = this.contas.size() + 1;

        Conta novaConta;
        if ("CC".equalsIgnoreCase(tipoConta)) {
            novaConta = new ContaCC(novoNumeroConta, titular);
        } else if ("CP".equalsIgnoreCase(tipoConta)) {
            novaConta = new ContaCP(novoNumeroConta, titular);
        } else {
            throw new IllegalArgumentException("Tipo de conta invalido! Use 'CC' para Conta Corrente e 'CP' para Conta Poupanca.");
        }
        this.contas.add(novaConta);

        System.out.println("Conta " + tipoConta.toUpperCase() + " número " + novoNumeroConta + " aberta para " + titular.getNomeCliente() + ".");


        return novaConta;
    }

    public Conta buscarConta(int numeroConta) throws ContaNaoEncontradaException {
        for (Conta conta : this.contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        throw new ContaNaoEncontradaException("Conta com o número " + numeroConta + " não foi encontrada.");
    }

    public void aplicarRendimentosMensais() {
        System.out.println("Processando rendimentos de fim de mes...");
        for (Conta conta : this.contas) {
            if (conta instanceof Rendavel) {
                ((Rendavel) conta).aplicarRendimento();
            }
        }
    }

    public void cobrarTaxasMensais() {
        System.out.println("\nProcessando cobrança de taxas de fim de mês...");

        for (Conta conta : this.contas) {
            if (conta instanceof Taxavel) {
                System.out.println("Verificando taxas para a conta: " + conta.getNumeroConta());
                Taxavel contaTributavel = (Taxavel) conta;
                contaTributavel.cobrarTaxa();
            }
        }
        System.out.println("Processamento de taxas finalizado.");
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public int getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(int idBanco) {
        this.idBanco = idBanco;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

}
