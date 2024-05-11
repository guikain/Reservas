package model;

import java.time.LocalDate;

public class Reserva implements Comparable<Reserva>{
    
    private int reservaID;
    private String origem, destino;
    private LocalDate dataInicio, dataFim;
    private float valor;
    private Hospedagem hospedagem;
    private Veiculo veiculo;


    public Reserva(String origem, String destino, LocalDate dataInicio, LocalDate dataFim, float valor,
            Hospedagem hospedagem, Veiculo veiculo) {
        this.origem = origem;
        this.destino = destino;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.valor = valor;
        this.hospedagem = hospedagem;
        this.veiculo = veiculo;
    }


    public int getReservaID() {
        return reservaID;
    }


    public void setReservaID(int reservaID) {
        this.reservaID = reservaID;
    }


    public String getOrigem() {
        return origem;
    }


    public void setOrigem(String origem) {
        this.origem = origem;
    }


    public String getDestino() {
        return destino;
    }


    public void setDestino(String destino) {
        this.destino = destino;
    }


    public LocalDate getDataInicio() {
        return dataInicio;
    }


    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }


    public LocalDate getDataFim() {
        return dataFim;
    }


    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }


    public float getValor() {
        return valor;
    }


    public void setValor(float valor) {
        this.valor = valor;
    }


    public Hospedagem getHospedagem() {
        return hospedagem;
    }


    public void setHospedagem(Hospedagem hospedagem) {
        this.hospedagem = hospedagem;
    }


    public Veiculo getVeiculo() {
        return veiculo;
    }


    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    @Override
    public String toString() {
        return "Reserva [reservaID=" + reservaID + ", origem=" + origem + ", destino=" + destino + ", dataInicio="
                + dataInicio + ", dataFim=" + dataFim + ", valor=" + valor + ", hospedagem=" + hospedagem + ", veiculo="
                + veiculo + "]";
    }


    @Override
    public int compareTo(Reserva r) {
        return hospedagem.getNomeHotel().compareTo(r.getHospedagem().getNomeHotel());
    }
    
}
