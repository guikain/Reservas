package model;

import java.time.LocalTime;

public class Barco extends Veiculo{

    private int numeroCabine;

    public Barco(int numeroCabine, int numeroPassagem, float valorPassagem, LocalTime horaPartida, LocalTime horaRetorno) {
        super(numeroPassagem, valorPassagem, horaPartida, horaRetorno);
        this.numeroCabine = numeroCabine;
    }

    public int getNumeroCabine() {
        return numeroCabine;
    }

    public void setNumeroCabine(int numeroCabine) {
        this.numeroCabine = numeroCabine;
    }

    @Override
    public String toString() {
        return "Barco [numeroPassagem=" + numeroPassagem + ", numeroCabine=" + numeroCabine + ", valorPassagem="
                + valorPassagem + ", horaPartida=" + horaPartida + ", horaRetorno=" + horaRetorno + "]";
    }   
}
