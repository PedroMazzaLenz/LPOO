package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private int numero;
    private Date data;
    private double valor;
    private String status; // Substitui o Enumeration
    private List<Item> itens;
    private Vendedor vendedor;

    public Pedido(int numero, Date data, double valor, String status, Item item1, Vendedor vendedor) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.status = status;
        this.vendedor = vendedor;
        this.itens = new ArrayList<>();
    }

    public boolean manterPedido(int numero) {
        return true;
    }

    public boolean manterItem(int codItem) {
        return true;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public String toString() {
        return "\nPedido{" +
                "numero=" + numero +
                ", data=" + data +
                ", valor=" + valor +
                ", status='" + status + '\'' +
                ", itens=" + itens +
                ", vendedor=" + vendedor +
                '}';
    }
}
