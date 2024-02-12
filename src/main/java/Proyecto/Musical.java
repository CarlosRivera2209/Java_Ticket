package Proyecto;



import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public final class Musical extends Event{
    private final ArrayList<String> Integrantes = new ArrayList();
    private final String Genero;
    
    public Musical(String Title, String Descripcion, String CodigoDeEvento, String Genero, String CreatedBy, double MontoAcordado, int attendees, Date Fecha) {
        super(Title, Descripcion, CodigoDeEvento, CreatedBy, MontoAcordado, attendees, Fecha);
        this.Costedelestadio += MontoAcordado*0.3;
        this.CantidadMaxima = 25000;
        this.Genero = Genero;
    }
    
    public boolean removeIntegrante(int Pos, String Integrante){
        if (Pos < Integrantes.size()){
            if (Integrantes.get(Pos).equals(Integrante)){
                Integrantes.remove(Pos);
                return true;
            } else return removeIntegrante(Pos + 1, Integrante);                
        }
        return false;
    }
    
    public void addInvitados(int attendees){
        if (CantidadMaxima >= this.invitados + attendees){
            this.invitados += attendees;
        } else JOptionPane.showMessageDialog(null, "Se excede la cantidad posible de invitados por: "+((this.invitados + attendees)-CantidadMaxima));
    }
    
    public void addIntegrantes(String Integrante){
        this.Integrantes.add(Integrante);
    }
    
    public String getGenero(){
        return this.Genero;
    }
    
}
