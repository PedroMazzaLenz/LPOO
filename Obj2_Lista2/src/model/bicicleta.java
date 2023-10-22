package model;

public class bicicleta extends veiculo{

    private int tamanhoRoda;
    private String chassi;

    public bicicleta(int tamanhoRoda, String chassi) {
        this.tamanhoRoda = tamanhoRoda;
        this.chassi = chassi;
    }

    public bicicleta(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int tamanhoRoda, String chassi) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.tamanhoRoda = tamanhoRoda;
        this.chassi = chassi;
    }

    public int getTamanhoRoda() {
        return tamanhoRoda;
    }

    public void setTamanhoRoda(int tamanhoRoda) {
        this.tamanhoRoda = tamanhoRoda;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    @Override
    public String toString() {
        return "\nBicicleta{" +
                "Tamanho da roda=" + tamanhoRoda +
                ", Chassi='" + chassi + '\'' +
                ", Numero de eixos=" + getNumeroDeEixos() +
                ", Propulsao='" + getPropulsao() + '\'' +
                ", Marca='" + getMarca() + '\'' +
                ", Modelo='" + getModelo() + '\'' +
                ", Ano de fabricacao=" + getAnoFabricacao() +
                '}';
    }

}
