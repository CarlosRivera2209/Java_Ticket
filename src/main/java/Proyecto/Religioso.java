package Proyecto;

import java.util.Date;

public class Religioso extends Event {

    private int almasConvert;

    public Religioso(String Title, String Descripcion, String CodigoDeEvento, String Createdby, double MontoAcordado, int attendees, int almasConvert, Date Fecha) {
        super(Title, Descripcion, CodigoDeEvento, Createdby, MontoAcordado+2000, attendees, Fecha);
    }

    public int getAlmasConvert() {
        return almasConvert;
    }
}
