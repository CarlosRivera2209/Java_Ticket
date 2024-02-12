package Proyecto;

import java.util.ArrayList;

public class Usuarios {
    public ArrayList<String> Codigos = new ArrayList();
    private String Nombre, NombreUser, contra;
    private int Tipo, Años;
    
    public Usuarios(String Nombre, String NombreUser, String contra, int Años, int Tipo){
        this.Nombre = Nombre;
        this.NombreUser = NombreUser;
        this.contra = contra;
        this.Años = Años;
        this.Tipo = Tipo;
    }
    
    public void EditAccount(String Nombre, String NombreUser, String contra, int Años, int Tipo){
        this.Nombre = Nombre;
        this.NombreUser = NombreUser;
        this.contra = contra;
        this.Años = Años;
        this.Tipo = Tipo;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public String getNombreUser(){
        return NombreUser;
    }
    
    public String getcontra(){
        return contra;
    }
    
    public int getTipo(){
        return Tipo;
    }
    
    public int getAños(){
        return Años;
    }

}
