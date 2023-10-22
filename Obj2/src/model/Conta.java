package model;

public abstract class Conta {

    public double getSaldo() {
        return saldo;
    }
    protected double saldo;

    public Conta(){
        super();
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double valor) {
        saldo += valor;
    }

    public void saca(double valor) {
        saldo -= valor;
    }

    public void atualiza(double taxa) {
        saldo += saldo * taxa;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + this.saldo +
                '}';
    }

}
