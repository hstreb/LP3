package br.org.fundatec.ti11app.viagem;

public class ViagemDTO {

    private String nomeMotorista;
    private String nomePassageiro;
    private double kmRodados;
    private int qtdMinutos;
    private String data;

    public ViagemDTO(String nomeMotorista, String nomePassageiro, double kmRodados, int qtdMinutos, String data) {
        this.nomeMotorista = nomeMotorista;
        this.nomePassageiro = nomePassageiro;
        this.kmRodados = kmRodados;
        this.qtdMinutos = qtdMinutos;
        this.data = data;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public double getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(double kmRodados) {
        this.kmRodados = kmRodados;
    }

    public int getQtdMinutos() {
        return qtdMinutos;
    }

    public void setQtdMinutos(int qtdMinutos) {
        this.qtdMinutos = qtdMinutos;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
