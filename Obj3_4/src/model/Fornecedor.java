package model;

public class Fornecedor {
    private int cnpj;
    private String contato;
    private String nome;

    public Fornecedor(int cnpj, String contato, String nome) {
        this.cnpj = cnpj;
        this.contato = contato;
        this.nome = nome;
    }

    public boolean manterFornec(int cnpj) {
        if (this.cnpj == cnpj) {
            return true;
        } else {
            return false;
        }
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nFornecedor{" +
                "cnpj=" + cnpj +
                ", contato='" + contato + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
