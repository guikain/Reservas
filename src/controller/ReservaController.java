package controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Hospedagem;
import model.Reserva;
import model.Veiculo;
import util.Util;
import view.ReservaView;

public class ReservaController {
    

    List<Reserva> reservas;

    public ReservaController() {
        this.reservas = new ArrayList<>();
    }

    public List<Reserva> getReservas() {
        return reservas;
    }


    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }
    

    public Reserva buscarReserva(int codigo){
        Reserva re = reservas.stream().filter(r -> r.getReservaID() == codigo).findFirst().orElse(null);
        return (re != null) ? re : null;
    }

    public void salvarReserva(String origem, String destino, LocalDate dataInicio, LocalDate dataFim,
            Hospedagem hospedagem, Veiculo veiculo){

        float valorHospedagem = hospedagem.getValorPessoa() * hospedagem.getQuantidadePessoas();
        float valorVeiculo = veiculo.getValorPassagem();

        Reserva reserva = new Reserva(origem, destino, dataInicio, dataFim, calcularValorReserva(valorHospedagem, valorVeiculo), hospedagem, veiculo);
        reserva.setReservaID(Util.gerarReservaID());
        reservas.add(reserva);
    }

    public void excluirReserva(int reservaID){
        Reserva reserva = buscarReserva(reservaID);
        if(reserva != null){
            reservas.remove(reserva);
        }
    }

    public String listarReservas(String titulo){
        String relatorioReservas = "";
        for (Reserva reserva : reservas) {
            
            String dataFim = formatter(reserva.getDataFim());
            String dataInicio = formatter(reserva.getDataInicio());

            relatorioReservas += ReservaView.reservas(titulo, reserva, dataFim, dataInicio);
        }
        return relatorioReservas;

        //return reservas.stream().sorted().collect(Collectors.toList()).toString();
    }
    
    private String formatter(LocalDate data){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return data.format(formato);
    }

    public void ordenarPorDestino(){
        Collections.sort(reservas, 
        (a1, a2) -> a1.getDestino().compareTo(a2.getDestino()));
    }

    public void ordenarPorCodigo(){
        Collections.sort(reservas,
        (a1, a2) -> Integer.compare(a1.getReservaID(), a2.getReservaID()));
    }


    private float calcularValorReserva(float valorHospedagem, float valorVeiculo){
        // ja fiz a multiplicacao por quantidade de pessoas.
        return valorHospedagem  + valorVeiculo;
    }

    @Override
    public String toString() {
        return "ReservaController [reservas=" + reservas + "]";
    }
}
