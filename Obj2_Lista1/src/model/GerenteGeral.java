package model;

public class GerenteGeral extends Gerente{

    public GerenteGeral(String nome, double salario) {
        super(nome, salario);
    }

    public GerenteGeral() {
        super();
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.40;
    }

    @Override
    public String toString() {
        return "\nGerente Geral{" +
                "nome='" + super.getNome() + '\'' +
                ", salario=" + super.getSalario() +
                ", bonus=" + super.getBonus() +
                "}";
    }
}
