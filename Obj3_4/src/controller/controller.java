package controller;

import exceptions.EstoqueInsuficienteException;
import model.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class controller {
    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<>();
        List<Fornecimento> fornecimentos = new ArrayList<>();

        //Criando os vendedores, os produtos e o fornecedor
        Vendedor vendedor1 = new Vendedor("1", "João", "Rua Dos Anjos", "Vencato", "12345-678", "Jaguarão", "RS", "Papelaria");
        Vendedor vendedor2 = new Vendedor("2", "Maria", "Rua 23 de agosto", "Centro", "98765-432", "Pelotas", "RS", "SuperMercado");
        Produto produto1 = new Produto(1, "Caderno", 100, 30.00);
        Produto produto2 = new Produto(2, "Caneta", 200, 10.00);
        Produto produto3 = new Produto(3, "Carro", 50, 50000.00);
        Fornecedor fornecedor = new Fornecedor(345254321, "5199934233", "Antonia Cardozo");

        //Venda 1
        try {
            int quantidadeVenda1 = 10;
            if (produto1.getQuantidade() < quantidadeVenda1) {
                throw new EstoqueInsuficienteException();
            }

            Item item1 = new Item(1, 1.0, quantidadeVenda1, produto1);
            Pedido pedido1 = new Pedido(2, new Date(), produto1.getPreco() * quantidadeVenda1, "Atendido", item1, vendedor1);
            pedido1.getItens().add(item1);
            pedidos.add(pedido1);
            produto1.setQuantidade(produto1.getQuantidade() - quantidadeVenda1);
        } catch (EstoqueInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        //Venda 2
        try {
            int quantidadeVenda2 = 5;
            if (produto2.getQuantidade() < quantidadeVenda2) {
                throw new EstoqueInsuficienteException();
            }
            Item item2 = new Item(2, 2.0, quantidadeVenda2, produto2);
            Pedido pedido2 = new Pedido(3, new Date(), produto2.getPreco() * quantidadeVenda2, "Atendido", item2, vendedor2);
            pedido2.getItens().add(item2);
            pedidos.add(pedido2);
            produto2.setQuantidade(produto2.getQuantidade() - quantidadeVenda2);
        } catch (EstoqueInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        //Relatório de Vendas
        System.out.println("Relatório de Vendas:");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }

        //Criandos o fornecimentos
        int quantidadeFornecimento1 = 20;
        double valortotalfornecimento1 = (produto1.getPreco() * quantidadeFornecimento1);
        Fornecimento fornecimento1 = new Fornecimento(new Date(), valortotalfornecimento1, fornecedor, produto1);
        fornecimentos.add(fornecimento1);
        produto1.setQuantidade(produto1.getQuantidade() + quantidadeFornecimento1);

        int quantidadeFornecimento2 = 15;
        double valortotalfornecimento2 = (produto2.getPreco() * quantidadeFornecimento2);
        Fornecimento fornecimento2 = new Fornecimento(new Date(), valortotalfornecimento2, fornecedor, produto2);
        fornecimentos.add(fornecimento2);
        produto2.setQuantidade(produto2.getQuantidade() + quantidadeFornecimento2);

        //Relatório de Fornecimentos
        System.out.println("\n\nRelatório de Fornecimentos:");
        for (Fornecimento fornecimento : fornecimentos) {
            System.out.println(fornecimento);
        }


        //Objetivo 4
        System.out.printf("\n\n Objetivo 4\n\n");

        //Tentativa de venda sem estoque suficiente
        try {
            int quantidadeVenda3 = 500;
            if (produto3.getQuantidade() < quantidadeVenda3) {
                throw new EstoqueInsuficienteException();
            }
            Item item3 = new Item(3, 0.0, quantidadeVenda3, produto3);
            Pedido pedido3 = new Pedido(3, new Date(), produto2.getPreco() * quantidadeVenda3, "Atendido", item3, vendedor2);
            pedido3.getItens().add(item3);
            pedidos.add(pedido3);
            produto3.setQuantidade(produto3.getQuantidade() - quantidadeVenda3);
        } catch (EstoqueInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}