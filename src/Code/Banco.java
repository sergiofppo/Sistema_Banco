package Code;

import Code.Contas.Conta;
import Code.Contas.ContaCC;
import Code.Contas.ContaCP;

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

    public int buscarConta(int numero) {

        return numero;
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

    @Override
    public String toString() {
        return "Banco{" +
                "nomeBanco='" + this.nomeBanco + '\'' +
                ", idBanco=" + this.idBanco +
                ", contas=" + this.contas +
                '}';
    }
}
