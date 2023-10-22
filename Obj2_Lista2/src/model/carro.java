package model;

public class carro extends veiculo implements automovel{

    private int capacidadePortaMalas;
    private String renavam;
    private String chassi;
    private String placa;

    public carro(){
        super();
    }

    public carro(int capacidadePortaMalas, String renavam, String chassi, String placa) {
        this.capacidadePortaMalas = capacidadePortaMalas;
        this.renavam = renavam;
        this.chassi = chassi;
        this.placa = placa;
    }

    public carro(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int capacidadePortaMalas, String renavam, String chassi, String placa) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.capacidadePortaMalas = capacidadePortaMalas;
        this.renavam = renavam;
        this.chassi = chassi;
        this.placa = placa;
    }

    public int getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }

    public void setCapacidadePortaMalas(int capacidadePortaMalas) {
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "\nCarro{" +
                "Capacidade do Porta-Malas=" + capacidadePortaMalas +
                ", Renavam='" + renavam + '\'' +
                ", Chassi='" + chassi + '\'' +
                ", Placa='" + placa + '\'' +
                "numeroDeEixos=" + getNumeroDeEixos() +
                ", propulsao='" + getPropulsao() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", anoFabricacao=" + getAnoFabricacao() +
                '}';
    }
}
