package model;

public class DesenvolvedorSenior extends Desenvolvedor{

    public DesenvolvedorSenior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.20;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor Senior{" +
                "nome='" + super.getNome() + '\'' +
                ", salario=" + super.getSalario() +
                ", bonus=" + super.getBonus() +
                '}';
    }
}
