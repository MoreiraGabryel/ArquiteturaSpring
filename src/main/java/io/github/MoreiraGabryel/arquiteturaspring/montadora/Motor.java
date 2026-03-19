package io.github.MoreiraGabryel.arquiteturaspring.montadora;

public class Motor {
    private String modelo;
    private String cavalos;
    private String cilindros;
    private Double litragem;
    private  TipoMotor tipo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCavalos() {
        return cavalos;
    }

    public void setCavalos(String cavalos) {
        this.cavalos = cavalos;
    }

    public String getCilindros() {
        return cilindros;
    }

    public void setCilindros(String cilindros) {
        this.cilindros = cilindros;
    }

    public Double getLitragem() {
        return litragem;
    }

    public void setLitragem(Double litragem) {
        this.litragem = litragem;
    }

    public TipoMotor getTipo() {
        return tipo;
    }

    public void setTipo(TipoMotor tipo) {
        this.tipo = tipo;
    }
}
