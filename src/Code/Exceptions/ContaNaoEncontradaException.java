package Code.Exceptions;

import Code.Cliente;

public class ContaNaoEncontradaException extends Exception {
    @Override
    public String getMessage() {
        return "A conta  nao foi encontrada.";
    }
}
