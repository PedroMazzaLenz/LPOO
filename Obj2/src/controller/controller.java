package controller;

import model.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class controller {
    public static void main(String[] args) {
        ContaPoupanca poupanca1 = new ContaPoupanca(1500.0);
        ContaPoupanca poupanca2 = new ContaPoupanca(200.0);
        ContaPoupanca poupanca3 = new ContaPoupanca(3000.0);

        ContaCorrente corrente1 = new ContaCorrente(1900.0);
        ContaCorrente corrente2 = new ContaCorrente(100.0);
        ContaCorrente corrente3 = new ContaCorrente(4000.0);

        Cliente cliente1 = new Cliente("João");
        Cliente cliente2 = new Cliente("Maria");
        Cliente cliente3 = new Cliente("Pedro");

        System.out.println("\nContas Poupanças:");
        System.out.println(poupanca1);
        System.out.println(poupanca2);
        System.out.println(poupanca3);

        System.out.println("\nContas Corrente:");
        System.out.println(corrente1);
        System.out.println(corrente2);
        System.out.println(corrente3);

        System.out.println("\nClientes:");
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);

        List<Conta> contas = new ArrayList<>();
        contas.add(poupanca1);
        contas.add(poupanca2);
        contas.add(poupanca3);
        contas.add(corrente1);
        contas.add(corrente2);
        contas.add(corrente3);

        List<Associado> AssociadoList = new ArrayList<>();
        AssociadoList.add(corrente1);
        AssociadoList.add(corrente2);
        AssociadoList.add(corrente3);
        AssociadoList.add(cliente1);
        AssociadoList.add(cliente2);
        AssociadoList.add(cliente3);


        poupanca1.deposita(1000.0);
        poupanca1.atualiza(0.05);
        poupanca3.saca(50.0);
        System.out.println();
        System.out.println(poupanca1);


        corrente1.deposita(500.0);
        corrente1.saca(400.0);
        System.out.println(corrente1);

        corrente1.lucros(100, 0);
        corrente2.lucros(400, 0);
        corrente3.lucros(600, 0);
        cliente1.lucros(300, 0);
        cliente2.lucros(600, 0);
        cliente3.lucros(600, 0);

        AssociadoList.sort(Comparator.comparing(Associado::getQtdeCotas).reversed());
        System.out.println("\n\nLista de associados em ordem decrescente de cotas:");
        System.out.println(AssociadoList);

        Associado associadoComMaisCotas = null;
        int maxCotas = Integer.MIN_VALUE;

        for (Associado associado : AssociadoList) {
            if (associado.getQtdeCotas() > maxCotas) {
                maxCotas = associado.getQtdeCotas();
                associadoComMaisCotas = associado;
            }
        }
        System.out.println("\n\nMaior número de cotas:" + associadoComMaisCotas);

        contas.sort(Comparator.comparing(Conta::getSaldo).reversed());
        System.out.println("\n\nLista de contas em ordem de saldos:");
        System.out.println(contas);

        System.out.println("\n\nLista de associados que possuem conta cadastrada:");
        for (Associado associado: AssociadoList) {
            if (associado instanceof ContaCorrente) {
                System.out.println(associado);
            }
        }

        Conta contaComMaiorSaldo = null;
        double maxSaldo = Integer.MIN_VALUE;

        for (Conta conta : contas) {
            if (conta.getSaldo() > maxSaldo) {
                maxSaldo = conta.getSaldo();
                contaComMaiorSaldo = conta;
            }
        }
        System.out.println("\n\nMaior Saldo:" + contaComMaiorSaldo);
    }
}
