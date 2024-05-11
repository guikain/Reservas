package model;

import java.time.LocalTime;

public class Aviao extends Veiculo{

    private float pesoBagagem;

    public Aviao(float pesoBagagem, int numeroPassagem, float valorPassagem, LocalTime horaPartida, LocalTime horaRetorno) {
        super(numeroPassagem, valorPassagem, horaPartida, horaRetorno);
        this.pesoBagagem = pesoBagagem;
    }

    public float getPesoBagagem() {
        return pesoBagagem;
    }

    public void setPesoBagagem(float pesoBagagem) {
        this.pesoBagagem = pesoBagagem;
    }

    @Override
    public String toString() {
        return "Aviao [numeroPassagem=" + numeroPassagem + ", pesoBagagem=" + pesoBagagem + ", valorPassagem="
                + valorPassagem + ", horaPartida=" + horaPartida + ", horaRetorno=" + horaRetorno + "]";
    }
}
