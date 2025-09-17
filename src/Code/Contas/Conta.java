package Code.Contas;

import Code.Cliente;

public abstract class Conta {
    private int numeroConta;
    private double saldo;
    private Cliente titular;

    public Conta(int numero, Cliente titular) {
        this.saldo = 0;
        this.titular = titular;
        this.numeroConta = numero;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

}
