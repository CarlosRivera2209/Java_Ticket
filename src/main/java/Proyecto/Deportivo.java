package Proyecto;



import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public final class Deportivo extends Event{
    private final ArrayList<String> IntegrantesEquipo1, IntegrantesEquipo2;
    private String equipo1, equipo2, Deporte;
    
    public Deportivo(String equipo1, String equipo2, String Deporte, String Title, String Descripcion, String CodigoDeEvento, String CreatedBy, double MontoAcordado, int attendees, Date Fecha) {
        super(Title, Descripcion, CodigoDeEvento, CreatedBy, MontoAcordado, attendees, Fecha);
        IntegrantesEquipo1 = new ArrayList();
        IntegrantesEquipo2 = new ArrayList();
        this.CantidadMaxima = 20000;
        this.Deporte = Deporte;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }
    
    public String getIntegrantes(int equipos, int Pos, String integrantes){
        if (equipos == 1){
            if (Pos < IntegrantesEquipo1.size()){
                return getIntegrantes(equipos, Pos + 1, integrantes + IntegrantesEquipo1.get(Pos));
            }
        } else {
            if (Pos < IntegrantesEquipo2.size()){
                return getIntegrantes(equipos, Pos + 1, integrantes + IntegrantesEquipo2.get(Pos));
            }
        }
        return integrantes;
    }
    
    public ArrayList getMiembros(int Team){
        if (Team == 1){
            return this.IntegrantesEquipo1;
        } else return this.IntegrantesEquipo2;
    }
    
    public void addIntegrantesEquipo(int equipo, String integrante){
        if (equipo == 1) {
            IntegrantesEquipo1.add(integrante);
        } else IntegrantesEquipo2.add(integrante);
    }
    
    public void addInvitados(int attendees){
        if (CantidadMaxima >= this.invitados + attendees){
            this.invitados += attendees;
        } else JOptionPane.showMessageDialog(null, "Se excede la cantidad posible de invitados por: "+((this.invitados + attendees)-CantidadMaxima));
    }
    
    public void setEquipo(int Team, String TeamName){
        if (Team == 1){
            this.equipo1 = TeamName;
        } else this.equipo2 = TeamName;
    }
    
    public String getEquipo(int Team) {
        if (Team == 1){
            return this.equipo1;
        } else return this.equipo2;
    }

    public String getDeporte() {
        return Deporte;
    }
    
}
