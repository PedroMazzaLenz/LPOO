package model;

public class ContaCorrente extends Conta implements Associado{

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    private double saldo;
    private int qdeCotas;
    private double valorCota;

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "\nConta Corrente{" +
                "Saldo: " + super.saldo +
                ", Quantidade de Cotas: " + qdeCotas +
                ", Valor da Cota: " + valorCota +
                '}';
    }

    @Override
    public double lucros(int qdeCotas, double valorCota) {
        this.qdeCotas = qdeCotas;
        this.valorCota = valorCota;
        return 0;
    }

    @Override
    public int getQtdeCotas() {
        return 0;
    }
}
