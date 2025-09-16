package Code.Contas;

import Code.Cliente;

public abstract class Conta {
    private int numero;
    private double saldo;
    private Cliente titular;

    public Conta(int numero, Cliente titular) {
        this.saldo = 0;
        this.titular = titular;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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
