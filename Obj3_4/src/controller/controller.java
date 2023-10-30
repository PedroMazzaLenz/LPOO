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

        Produto produto2 = new Produto(24, "Caderno", 100, 12.99);
        Item item1 = new Item(1, 1.0, 10, produto2);

        Pedido pedido1 = new Pedido(2, new Date(), 129.90, "Atendido", item1, vendedor);
        pedido1.getItens().add(item1);

        pedidos.add(pedido1);

        produto.setQuantidade(produto.getQuantidade() - quantidade);


    }


    public void entradaEstoque(Fornecedor fornecedor, Produto produto, int quantidade) {
        Fornecedor fornecedor2 = new Fornecedor(454097593, "53984075634", "Carlos Luiz");
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
        Vendedor vendedor1 = new Vendedor("1", "João", "Rua Dos Anjos", "Vencato", "12345-678", "Jaguarão", "RS", "Papelaria");
        Vendedor vendedor2 = new Vendedor("2", "Maria", "Rua 23 de agosto", "Centro", "98765-432", "Pelotas", "RS", "SuperMercado");
        Produto produto1 = new Produto(1, "Caderno", 100, 12.99);
        Produto produto2 = new Produto(2, "Caneta", 200, 19.99);
        Fornecedor fornecedor = new Fornecedor(345254321, "5199934233", "Antonia Cardozo");

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
