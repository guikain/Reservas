package util;

public class Util {
    
    public static int reservaID = 1;

    public static int gerarReservaID(){
        return reservaID++;
    }
}
