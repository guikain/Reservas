package model;

import java.time.LocalTime;

public abstract class Veiculo {
    protected int numeroPassagem;
    protected float valorPassagem;
    protected LocalTime horaPartida;
    protected LocalTime horaRetorno;
    
    public Veiculo(int numeroPassagem, float valorPassagem, LocalTime horaPartida, LocalTime horaRetorno) {
        this.numeroPassagem = numeroPassagem;
        this.valorPassagem = valorPassagem;
        this.horaPartida = horaPartida;
        this.horaRetorno = horaRetorno;
    }

    public int getNumeroPassagem() {
        return numeroPassagem;
    }

    public void setNumeroPassagem(int numeroPassagem) {
        this.numeroPassagem = numeroPassagem;
    }

    public float getValorPassagem() {
        return valorPassagem;
    }

    public void setValorPassagem(float valorPassagem) {
        this.valorPassagem = valorPassagem;
    }

    public LocalTime getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(LocalTime horaPartida) {
        this.horaPartida = horaPartida;
    }

    public LocalTime getHoraRetorno() {
        return horaRetorno;
    }

    public void setHoraRetorno(LocalTime horaRetorno) {
        this.horaRetorno = horaRetorno;
    }

    //polimorfismo
    @Override
    public abstract String toString();
}
