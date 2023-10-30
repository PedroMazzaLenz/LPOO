package model;

public class Vendedor extends Funcionario {
    private String local;

    public Vendedor(String matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado, String local) {
        super(matricula, nome, endereco, bairro, cep, cidade, estado);
        this.local = local;
    }

    public void realizarPedido() {
        // Não sei
    }

    public void consultarPreco() {
        // Não sei
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "\nVendedor{" +
                "local='" + local + '\'' +
                ", matricula='" + getMatricula() + '\'' +
                ", nome='" + getNome() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", bairro='" + getBairro() + '\'' +
                ", cep='" + getCep() + '\'' +
                ", cidade='" + getCidade() + '\'' +
                ", estado='" + getEstado() + '\'' +
                '}';
    }
}
