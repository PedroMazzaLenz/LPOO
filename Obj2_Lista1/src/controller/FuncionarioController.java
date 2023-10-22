package controller;

import model.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {

    /*
    1. Foi possível criar instâncias da classe Funcionario? Justifique sua resposta.
        Não foi possivel criar por que Funcionario é um classe abstrata.
    2. Onde você deve inserir estas regras de negócio? Na classe xxController ou nas
classes Gerente e Desenvolvedor? Justifique sua resposta.

    */


    public static void main(String[] args) {
        Desenvolvedor d1 = new Desenvolvedor("Carlos", 2600);
        Desenvolvedor d2 = new Desenvolvedor();
        Gerente g1 = new Gerente("Ana", 4900);
        Gerente g2 = new Gerente();
        //Questão 2
        Gerente g3 = new GerenteGeral("Julia", 6500.00);
        Gerente g4 = new GerenteDesenvolvimento("Antonio", 4500.00);
        Desenvolvedor d3 = new DesenvolvedorSenior("Carlos", 3500.00);
        Desenvolvedor d4 = new DesenvolvedorSenior("Eduardo", 3500.00);
        Desenvolvedor d5 = new DesenvolvedorSenior("Fernanda", 3500.00);
        Desenvolvedor d6 = new DesenvolvedorSenior("Gabriel", 3500.00);
        Desenvolvedor d7 = new DesenvolvedorSenior("Isabela", 3500.00);
        Desenvolvedor d8 = new DesenvolvedorSenior("José",3500.00);
        Desenvolvedor d9 = new DesenvolvedorPleno("Ana", 2500.00);
        Desenvolvedor d10 = new DesenvolvedorPleno("Pedro", 2500.00);
        Desenvolvedor d11 = new DesenvolvedorPleno("Lucia", 2500.00);
        Desenvolvedor d12 = new DesenvolvedorPleno("Eduardo", 2500.00);
        Desenvolvedor d13 = new DesenvolvedorPleno("Carla", 2500.00);
        Desenvolvedor d14 = new DesenvolvedorPleno("Marcos", 2500.00);
        Desenvolvedor d15 = new DesenvolvedorJunior("Laura", 1800.00);
        Desenvolvedor d16 = new DesenvolvedorJunior("Ricardo", 1800.00);
        Desenvolvedor d17 = new DesenvolvedorJunior("Marina", 1800.00);
        Desenvolvedor d18 = new DesenvolvedorJunior("Paulo", 1800.00);
        Desenvolvedor d19 = new DesenvolvedorJunior("Larissa", 1800.00);
        Desenvolvedor d20 = new DesenvolvedorJunior("Fernando", 1800.00);


        System.out.println(d1);
        System.out.println(d2);
        System.out.println(g1);
        System.out.println(g2);

        d2.setNome("Luana");
        d2.setSalario(2600);
        g2.setNome("Maicon");
        g2.setSalario(4900);

        System.out.println();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(g1);
        System.out.println(g2);

        System.out.println();
        System.out.println("Bonus:");
        System.out.println(d1.getNome() + " " + d1.getBonus());
        System.out.println(d2.getNome() + " " + d2.getBonus());
        System.out.println(g1.getNome() + " " + g1.getBonus());
        System.out.println(g2.getNome() + " " + g2.getBonus());

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(g3);
        funcionarios.add(g4);
        funcionarios.add(d3);
        funcionarios.add(d4);
        funcionarios.add(d5);
        funcionarios.add(d6);
        funcionarios.add(d7);
        funcionarios.add(d8);
        funcionarios.add(d9);
        funcionarios.add(d10);
        funcionarios.add(d11);
        funcionarios.add(d12);
        funcionarios.add(d13);
        funcionarios.add(d14);
        funcionarios.add(d15);
        funcionarios.add(d16);
        funcionarios.add(d17);
        funcionarios.add(d18);
        funcionarios.add(d19);
        funcionarios.add(d20);
        System.out.print("Todos os funcionários\n");
        System.out.println(funcionarios);

        double folha_com_bonus = 0.0;
        for (Funcionario funcionario : funcionarios) {
            folha_com_bonus += funcionario.getSalario() + funcionario.getBonus();
        }
        System.out.println();
        System.out.println("Folha com bonus");
        System.out.println(NumberFormat.getCurrencyInstance().format(folha_com_bonus));

        double folha_sem_bonus = 0.0;
        for (Funcionario funcionario : funcionarios) {
            folha_sem_bonus += funcionario.getSalario();
        }
        System.out.println();
        System.out.println("Folha sem bonus");
        System.out.println(NumberFormat.getCurrencyInstance().format(folha_sem_bonus));

        System.out.println();
        System.out.print("Cargo, salário, bônus e salário com bonus");
        funcionarios.forEach(f -> {
            double salarioBruto = f.getSalario() + f.getBonus();
            System.out.println("\nFuncionário: " + f.getNome());
            System.out.println("Cargo: " + f.getClass().getSimpleName());
            System.out.println("Salário= " + NumberFormat.getCurrencyInstance().format(f.getSalario()));
            System.out.println("Bônus= " + NumberFormat.getCurrencyInstance().format(f.getBonus()));
            System.out.println("Salario com Bônus= " + NumberFormat.getCurrencyInstance().format(salarioBruto));
        });

        double folha_com_bonus_reajuste= 0.0;
        for(Funcionario f : funcionarios){
            f.setSalario(f.getSalario() * 1.05);
            folha_com_bonus_reajuste += f.getSalario() + f.getBonus();
        }

        System.out.println();
        System.out.println("Folha com bônus e reajuste");
        System.out.println(NumberFormat.getCurrencyInstance().format(folha_com_bonus_reajuste));
    }
}
