package model;

public class DesenvolvedorJunior extends Desenvolvedor{

    public DesenvolvedorJunior(String nome, double salario) {
        super(nome, salario);
    }

    public DesenvolvedorJunior() {
        super();
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor Junior{" +
                "nome='" + super.getNome() + '\'' +
                ", salario=" + super.getSalario() +
                ", bonus=" + super.getBonus() +
                '}';
    }
}
