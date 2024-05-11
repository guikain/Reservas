package model;

public class Hospedagem {
    
    private String nomeHotel;
    private int numeroQuartosReservados;
    private int quantidadePessoas;
    private float valorPessoa;

    public Hospedagem(String nomeHotel, int numeroQuartosReservados, int quantidadePessoas, float valorPessoa) {
        this.nomeHotel = nomeHotel;
        this.numeroQuartosReservados = numeroQuartosReservados;
        this.quantidadePessoas = quantidadePessoas;
        this.valorPessoa = valorPessoa;
    }

    public String getNomeHotel() {
        return nomeHotel;
    }

    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }

    public int getNumeroQuartosReservados() {
        return numeroQuartosReservados;
    }

    public void setNumeroQuartosReservados(int numeroQuartosReservados) {
        this.numeroQuartosReservados = numeroQuartosReservados;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    public float getValorPessoa() {
        return valorPessoa;
    }

    public void setValorPessoa(float valorPessoa) {
        this.valorPessoa = valorPessoa;
    }

    @Override
    public String toString() {
        return "Hospedagem [nomeHotel=" + nomeHotel + ", numeroQuartosReservados=" + numeroQuartosReservados
                + ", quantidadePessoas=" + quantidadePessoas + ", valorPessoa=" + valorPessoa + "]";
    }
}
