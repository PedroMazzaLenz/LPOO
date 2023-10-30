package exceptions;

public class EstoqueInsuficienteException extends Exception {
    public EstoqueInsuficienteException() {
        super("Erro, estoque insuficiente.");
    }
}

