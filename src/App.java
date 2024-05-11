import java.time.LocalDate;
import java.time.LocalTime;

import controller.ReservaController;
import model.Aviao;
import model.Barco;
import model.Hospedagem;

public class App {
    public static void main(String[] args) throws Exception {
        
//Veiculos
        Barco barco = new Barco(2, 4, 6000f,
         LocalTime.parse("12:10"), LocalTime.parse("18:10"));

        Aviao aviao = new Aviao(40.2f, 2, 800.0f,
        LocalTime.parse("10:00"), LocalTime.parse("22:10"));

//Hoteis
        Hospedagem h1 = new Hospedagem("Candeias", 20,
         2, 120);

        Hospedagem h2 = new Hospedagem("Hotel Ibis", 10,
         2, 100); 

        Hospedagem h3 = new Hospedagem("Hotel Five Stars", 30,
         2, 600); 

        Hospedagem h4 = new Hospedagem("Hotel Burajirujin", 20,
         2, 400); 

//Reservas
        ReservaController rController = new ReservaController();
        System.out.println(rController.listarReservas("Vazio: "));

        rController.salvarReserva("Curitiba", "Sao Paulo", LocalDate.parse("2024-07-22"), LocalDate.parse("2024-08-06"), h2, aviao);
        rController.salvarReserva("Sao Paulo", "Balneario Camboriu", LocalDate.parse("2025-07-22"), LocalDate.parse("2025-08-06"), h1, barco);
        rController.salvarReserva("Curitiba", "Orlando", LocalDate.parse("2026-07-22"), LocalDate.parse("2026-08-06"), h3, aviao);

        rController.ordenarPorDestino();
        System.out.println(rController.listarReservas("Com os 3 Itens! "));

        rController.excluirReserva(2);

        System.out.println(rController.listarReservas("Apos item 2 excluido!"));

        rController.salvarReserva("Sao Paulo", "Tokyo", LocalDate.parse("2027-07-22"), LocalDate.parse("2027-08-06"), h4, aviao);
        rController.ordenarPorCodigo();
        System.out.println(rController.listarReservas("Item 4 Adicionado!"));

    }
}
