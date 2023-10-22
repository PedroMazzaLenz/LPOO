package model;

public class ContaPoupanca extends Conta{

    public double getSaldo() {
        return saldo;
    }
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public String toString() {
        return "\nConta Poupança{" +
                "Saldo: " + super.saldo +
                '}';
    }
}
