package io.github.MoreiraGabryel.arquiteturaspring.montadora;

public class Motor {
    private String modelo;
    private int cavalos;
    private int cilindros;
    private Double litragem;
    private  TipoMotor tipo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCavalos() {
        return cavalos;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
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

    @Override
    public String toString() {
        return "Motor{" +
                "litragem=" + litragem +
                ", modelo='" + modelo + '\'' +
                ", cavalos='" + cavalos + '\'' +
                ", cilindros='" + cilindros + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
