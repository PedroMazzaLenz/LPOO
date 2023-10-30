package controller;

import exceptions.EstoqueInsuficienteException;
import model.*;

import java.util.*;

public class controller {
    private List<Pedido> pedidos = new ArrayList<>();
    private List<Fornecimento> fornecimentos = new ArrayList<>();

    public void realizarVenda(Vendedor vendedor, Produto produto, int quantidade) throws EstoqueInsuficienteException {

        if (produto.getQuantidade() < quantidade) {
            throw new EstoqueInsuficienteException();
        }

        Produto produto2 = new Produto(1, "Produto A", 100, 9.99);
        Item item1 = new Item(1, 0.0, 10, produto2);

        Pedido pedido1 = new Pedido(1, new Date(), 99.90, "Atendido", item1, vendedor);
        pedido1.getItens().add(item1);

        pedidos.add(pedido1);

        produto.setQuantidade(produto.getQuantidade() - quantidade);


    }


    public void entradaEstoque(Fornecedor fornecedor, Produto produto, int quantidade) {
        Fornecedor fornecedor2 = new Fornecedor(12345678, "Contato", "Nome do Fornecedor");
        Fornecimento fornecimento = new Fornecimento(new Date(), 999.90, fornecedor2, produto);

        fornecimentos.add(fornecimento);

        produto.setQuantidade(produto.getQuantidade() + quantidade);
    }

    public void imprimirRelatorioVendas() {
        System.out.println("Relatório de Vendas:");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }

    public void imprimirRelatorioFornecimentos() {
        System.out.println("Relatório de Fornecimentos:");
        for (Fornecimento fornecimento : fornecimentos) {
            System.out.println(fornecimento);
        }
    }


        public static void main(String[] args) throws EstoqueInsuficienteException {

        controller controller = new controller();
        System.out.printf("");
        Vendedor vendedor1 = new Vendedor("123", "João", "Rua A", "Bairro B", "12345-678", "Cidade C", "Estado D", "Local E");
        Vendedor vendedor2 = new Vendedor("456", "Maria", "Rua X", "Bairro Y", "98765-432", "Cidade Z", "Estado W", "Local F");
        Produto produto1 = new Produto(1, "Produto A", 100, 9.99);
        Produto produto2 = new Produto(2, "Produto B", 200, 19.99);
        Fornecedor fornecedor = new Fornecedor(12345678, "Contato", "Nome do Fornecedor");

        System.out.printf("\n");
        controller.realizarVenda(vendedor1, produto1, 10);
        controller.realizarVenda(vendedor2, produto2, 5);

        System.out.printf("\n");
        controller.imprimirRelatorioVendas();

        System.out.printf("\n");
        System.out.println("Estoque após vendas:");
        System.out.println(produto1);
        System.out.println(produto2);

        controller.entradaEstoque(fornecedor, produto1, 20);
        controller.entradaEstoque(fornecedor, produto2, 15);

        System.out.printf("\n");
        controller.imprimirRelatorioFornecimentos();

        System.out.printf("\n");
        System.out.printf("\n");

        try {
            controller.realizarVenda(vendedor1, produto1, 300);
        } catch (EstoqueInsuficienteException e) {
            System.out.println(e.getMessage());
            return;
        }
    }
}
