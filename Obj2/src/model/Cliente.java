package model;

public class Cliente implements Associado{
    private double saldo;
    private int qdeCotas;
    private double valorCota;
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "\nCliente {" +
                "Nome: " + nome +
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
