package view;

import model.Reserva;

public class ReservaView {
    
    public static String reservas(String titulo, Reserva reserva, String dataFim, String dataInicio){
        String lista = "";
        lista += "#########################################################\n";
        lista += " ---> " + titulo + "\n";
        lista += "#########################################################\n";
        lista += "#   Codigo da Reserva: " + reserva.getReservaID() + "\n";
        lista += "#   Nome do Hotel: " + reserva.getHospedagem().getNomeHotel()+ "\n";
        lista += "#   Cidade: " + reserva.getDestino()+ "\n";
        lista += "#   Quantidade de Pessoas:" + reserva.getHospedagem().getQuantidadePessoas()+ "\n";

        lista += "#   Numero da Passagem: " + reserva.getVeiculo().getNumeroPassagem()+ "\n";
        lista += "#   Tipo de Veiculo: " + reserva.getVeiculo().getClass().getName().replace("model.", "")+ "\n";
        lista += "#   Origem: " + reserva.getOrigem()+ "\n";
        lista += "#   Data/Hora Saida: " + dataInicio + " - " + reserva.getVeiculo().getHoraPartida()+ "\n";
        lista += "#   Destino: " + reserva.getDestino()+ "\n";
        lista += "#   Data/Hora Chegada: " + dataFim + " - " + reserva.getVeiculo().getHoraRetorno()+ "\n";
       
        lista += "#   Valor Por Pessoa: " + reserva.getHospedagem().getValorPessoa()+ "\n";
        lista += "#   Valor Passagem: " + reserva.getVeiculo().getValorPassagem()+ "\n";
        lista += "#   Total: " + reserva.getValor()+ "\n";
        lista += "#########################################################\n\n";
        return lista;
    }
    
}
