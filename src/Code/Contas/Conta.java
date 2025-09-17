package Code.Contas;

import Code.Cliente;
import Code.Exceptions.SaldoInsuficienteException;
import Code.Interfaces.Transacionavel;

public abstract class Conta implements Transacionavel {
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

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor <= 0) {
            System.out.println("Valor de saque invalido: " + valor);
            return;
        }
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente! Saldo atual: " + saldo);
        }
        this.saldo -= valor;
        System.out.println("Saque de R$ " + valor + " realizado para a conta " + numeroConta);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$" + valor + " realizado para a conta " + this.numeroConta);
        }  else {
            System.err.println("Valor de deposito invalido: " + valor);
        }
    }

    @Override
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
