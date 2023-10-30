package model;

import java.util.Date;

public class Fornecimento {
    private Date data;
    private double valorTotal;
    private Fornecedor fornecedor;
    private Produto produto;

    public Fornecimento(Date data, double valorTotal, Fornecedor fornecedor, Produto produto) {
        this.data = data;
        this.valorTotal = valorTotal;
        this.fornecedor = fornecedor;
        this.produto = produto;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\nFornecimento{" +
                "data=" + data +
                ", valorTotal=" + valorTotal +
                ", fornecedor=" + fornecedor +
                ", produto=" + produto +
                '}';
    }
}
