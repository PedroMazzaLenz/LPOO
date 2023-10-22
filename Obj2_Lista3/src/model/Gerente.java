package model;

public class Gerente extends Funcionario implements Investidor{

    private String ticker;
    private int quantidade;

    public Gerente() {
        super();
    }

    public Gerente(String ticker, int quantidade) {
        this.ticker = ticker;
        this.quantidade = quantidade;
    }

    public Gerente(String nome, double salario, String ticker, int quantidade) {
        super(nome, salario);
        this.ticker = ticker;
        this.quantidade = quantidade;
    }

    @Override
    public String getTicker() {
        return ticker;
    }

    @Override
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    @Override
    public double getBonus() {
        return this.getSalario() * 0.15;
    }

    @Override
    public String toString() {
        return "\nGerente{" +
                "Bonus=" + getBonus() +
                ", Nome='" + super.getNome() + '\'' +
                ", Salário='" + super.getSalario() + '\'' +
                ", Ticker='" + ticker + '\'' +
                ", Quantidade=" + quantidade +
                '}';
    }
}
