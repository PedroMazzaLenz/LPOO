package model;

public class caminhao extends veiculo implements automovel{

    private int capacidadeDeCarga;
    private String renavam;
    private String chassi;
    private String placa;

    public caminhao() {
        super();
    }

    public caminhao(int capacidadeDeCarga, String renavam, String chassi, String placa) {
        this.capacidadeDeCarga = capacidadeDeCarga;
        this.renavam = renavam;
        this.chassi = chassi;
        this.placa = placa;
    }

    public caminhao(int numeroDeEixos, String propulsao, String marca, String modelo, int anoFabricacao, int capacidadeDeCarga, String renavam, String chassi, String placa) {
        super(numeroDeEixos, propulsao, marca, modelo, anoFabricacao);
        this.capacidadeDeCarga = capacidadeDeCarga;
        this.renavam = renavam;
        this.chassi = chassi;
        this.placa = placa;
    }

    public int getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(int capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
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
        return "\nCaminhao{" +
                "Capacidade de carga=" + capacidadeDeCarga +
                ", Renavam='" + renavam + '\'' +
                ", Chassi='" + chassi + '\'' +
                ", Placa='" + placa + '\'' +
                "Numero de eixos=" + getNumeroDeEixos() +
                ", Propulsao='" + getPropulsao() + '\'' +
                ", Marca='" + getMarca() + '\'' +
                ", Modelo='" + getModelo() + '\'' +
                ", Ano de fabricacao=" + getAnoFabricacao() +
                '}';
    }
}
