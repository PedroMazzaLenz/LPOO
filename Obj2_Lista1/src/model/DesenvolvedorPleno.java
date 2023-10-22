package model;

public class DesenvolvedorPleno extends Desenvolvedor{

    public DesenvolvedorPleno(String nome, double salario) {
        super(nome, salario);
    }

    public DesenvolvedorPleno() {
        super();
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor Pleno{" +
                "nome='" + super.getNome() + '\'' +
                ", salario=" + super.getSalario() +
                ", bonus=" + super.getBonus() +
                '}';
    }
}
