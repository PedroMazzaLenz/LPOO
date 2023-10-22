package controller;

import model.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FuncionarioController {
    public static void main(String[] args) {

        Desenvolvedor d1 = new Desenvolvedor("Ana", 2500.00);
        Desenvolvedor d2 = new Desenvolvedor("Pedro", 2500.00);
        Desenvolvedor d3 = new Desenvolvedor("João", 2500.00);
        Desenvolvedor d4 = new Desenvolvedor("Carlos", 2500.00);
        Desenvolvedor d5 = new Desenvolvedor("Luana", 2500.00);
        Desenvolvedor d6 = new Desenvolvedor("Laura", 2700.00);

        Gerente g1 = new Gerente("Marcos", 3500.00, "BBAS3", 100);
        Gerente g2 = new Gerente("Luisa", 3500.00, "BBAS3", 200);
        Gerente g3 = new Gerente("Miguel", 3500.00, "BBAS3", 300);
        Gerente g4 = new Gerente("Alan", 3500.00, "BBAS3", 400);
        Gerente g5 = new Gerente("Julia", 3500.00, "BBAS3", 500);
        Gerente g6 = new Gerente("Maria", 3700.00, "BBAS3", 600);

        Cliente c1 = new Cliente(1, "Carla", "Silva", "BBAS3", 110);
        Cliente c2 = new Cliente(2, "Antonio", "Cardozo", "BBAS3", 220);
        Cliente c3 = new Cliente(3, "José", "Soares", "BBAS3", 330);
        Cliente c4 = new Cliente(4, "Julia", "Santos", "BBAS3", 440);
        Cliente c5 = new Cliente(5, "Maria", "da Silva", "BBAS3", 550);
        Cliente c6 = new Cliente(6, "João", "Mendez", "BBAS3", 660);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(g4);
        System.out.println(g5);
        System.out.println(g6);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(d1);
        funcionarios.add(d2);
        funcionarios.add(d3);
        funcionarios.add(d4);
        funcionarios.add(d5);
        funcionarios.add(d6);
        funcionarios.add(g1);
        funcionarios.add(g2);
        funcionarios.add(g3);
        funcionarios.add(g4);
        funcionarios.add(g5);
        funcionarios.add(g6);
        System.out.println();
        System.out.print("Lista de Funcionários:");
        System.out.println(funcionarios);

        List<Investidor> investidores = new ArrayList<>();
        investidores.add(c1);
        investidores.add(c2);
        investidores.add(c3);
        investidores.add(c4);
        investidores.add(c5);
        investidores.add(c6);
        investidores.add(g1);
        investidores.add(g2);
        investidores.add(g3);
        investidores.add(g4);
        investidores.add(g5);
        investidores.add(g6);
        System.out.println();
        System.out.print("Lista de Investidores:");
        System.out.println(investidores);


        funcionarios.sort(Comparator.comparing(Funcionario::getSalario).reversed());
        System.out.println();
        System.out.print("Lista de funcionários (ordenandos pelo salário, ordem decrescente):");
        System.out.println(funcionarios);

        investidores.sort(Comparator.comparing(Investidor::getQuantidade).reversed());
        System.out.println();
        System.out.print("Lista de clientes da empresa (ordenandos pela quantidade, ordem decrescente):");
        investidores.forEach(c -> {
            if(c instanceof Cliente) {
                System.out.print(c);
            }
        });

        System.out.println();
        System.out.println();
        System.out.print("Lista de investidores da empresa (ordenandos pela quantidade, ordem decrescente):");
        System.out.println(investidores);

        System.out.println();
        System.out.print("Funcionario com maior salário:");
        Funcionario f_maior_salario = Collections.max(funcionarios, Comparator.comparing(Funcionario::getSalario));
        funcionarios.forEach(f -> {
            if(f.getSalario() >= f_maior_salario.getSalario()) {
                System.out.print(f);
            }
        });

        System.out.println();
        System.out.println();
        System.out.print("Investidor com maior quantidade:");
        Investidor i_maior_quantidade_acoes = Collections.max(investidores, Comparator.comparing(Investidor::getQuantidade));
        investidores.forEach(i -> {
            if(i.getQuantidade() >= i_maior_quantidade_acoes.getQuantidade()) {
                System.out.print(i);
            }
        });


    }
}
