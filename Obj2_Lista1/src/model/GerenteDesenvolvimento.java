package model;

public class GerenteDesenvolvimento extends Gerente{

    public GerenteDesenvolvimento(String nome, double salario) {
        super(nome, salario);
    }

    public GerenteDesenvolvimento() {
        super();
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.20;
    }

    @Override
    public String toString() {
        return "\nGerente Desenvolvimento{" +
                "nome='" + super.getNome() + '\'' +
                ", salario=" + super.getSalario() +
                ", bonus=" + super.getBonus() +
                '}';
    }
}
