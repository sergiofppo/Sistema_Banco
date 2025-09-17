package Code.Exceptions;

public class SaldoInsuficienteException extends Exception {

    @Override
    public String getMessage() {
        return "Saldo da Conta insuficiente.";
    }
}
