package Proyecto;

import java.util.ArrayList;
import java.util.Date;

public class EventManager {

    private final ArrayList<Event> EventManager;

    public EventManager() {
        EventManager = new ArrayList();
    }

    public void addSportEvent(String equipo1, String equipo2, String Deporte, String Title, String Descripcion, String CodigoDeEvento, String CreatedBy, double MontoAcordado, int attendees, Date Fecha) {
        EventManager.add(new Deportivo(equipo1, equipo2, Deporte, Title, Descripcion, CodigoDeEvento, CreatedBy, MontoAcordado, attendees, Fecha));
    }

    public Deportivo getSportEvent(int pos, String CodigoDeEvento) {
        if (pos < EventManager.size()) {
            if (EventManager.get(pos).getCode().equals(CodigoDeEvento)) {
                return (Deportivo) EventManager.get(pos);
            } else {
                return getSportEvent(pos, CodigoDeEvento);
            }
        }
        return null;
    }

    public void addMusicalEvent(String Title, String Descripcion, String CodigoDeEvento, String Genero, String CreatedBy, double MontoAcordado, int attendees, Date Fecha) {
        EventManager.add(new Musical(Title, Descripcion, CodigoDeEvento, Genero, CreatedBy, MontoAcordado, attendees, Fecha));
    }

    public Musical getMusicalEvent(int pos, String CodigoDeEvento) {
        if (pos < EventManager.size()) {
            if (EventManager.get(pos).getCode().equals(CodigoDeEvento)) {
                return (Musical) EventManager.get(pos);
            } else {
                return getMusicalEvent(pos, CodigoDeEvento);
            }
        }
        return null;
    }

    public boolean removeEvent(int Pos, String Code) {
        if (Pos < EventManager.size()) {
            if (EventManager.get(Pos).getCode().equals(Code)) {
                if (EventManager.get(Pos).getBorrar()) {
                    EventManager.get(Pos).BorrarEvent();
                    return true;
                }
                return false;
            } else {
                return removeEvent(Pos + 1, Code);
            }
        }
        return false;
    }

    public Event getEvent(int Pos, String Code) {
        if (Pos < EventManager.size()) {
            return (EventManager.get(Pos).getCode().equals(Code)) ? EventManager.get(Pos) : getEvent(Pos + 1, Code);
        }
        return null;
    }

    public int getEventsAmount() {
        return EventManager.size();
    }

    public void addReligioso(String Title, String Descripcion, String CodigoDeEvento, String Createdby, double MontoAcordado, int attendees, int almasConvert, Date Fecha) {
        EventManager.add(new Religioso(Title, Descripcion, CodigoDeEvento, Createdby, MontoAcordado, attendees, almasConvert, Fecha));
    }
}
