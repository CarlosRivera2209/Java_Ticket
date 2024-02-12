package Proyecto;

import java.util.Date;

public abstract class Event {

    private String NombredelEvento, descripcion, CodigoDeEvento;
    private final String createdBy;
    protected double Costedelestadio, invitados;
    protected int CantidadMaxima;
    private Date Fecha;
    private boolean Borrar;

    public Event(String Title, String Descripcion, String CodigoDeEvento, String Createdby, double MontoAcordado, int attendees, Date Fecha) {
        this.editEvent(Title, Descripcion, CodigoDeEvento, MontoAcordado, attendees, Fecha);
        this.createdBy = Createdby;
    }

    public final void editEvent(String Title, String Descripcion, String CodigoDeEvento, double MontoAcordado, int attendees, Date Fecha) {
        this.invitados = attendees;
        this.NombredelEvento = Title;
        this.descripcion = Descripcion;
        this.Costedelestadio = MontoAcordado;
        this.CodigoDeEvento = CodigoDeEvento;
    }

    public boolean isAvailable() {
        return (CantidadMaxima >= invitados);
    }

    public String getCreator() {
        return this.createdBy;
    }

    public String getTitle() {
        return this.NombredelEvento;
    }

    public String getDesc() {
        return this.descripcion;
    }

    public String getCode() {
        return this.CodigoDeEvento;
    }

    public double getCosts() {
        return this.Costedelestadio;
    }

    public Date getFecha() {
        return this.Fecha;
    }

    public boolean getBorrar() {
        return this.Borrar;
    }

    public void BorrarEvent() {
        Borrar = true;
    }
}
