package Proyecto;


import java.util.ArrayList;

public final class ManejoUsuarios extends Usuarios {

    public final ArrayList<Usuarios> Acc = new ArrayList();

    public ManejoUsuarios(String Name, String Usuario, String Contra, int Age, int Type) {
        super(Name, Usuario, Contra, Age, Type);
        Acc.add(new Usuarios("gæst", "Invitado", "", 20, 2));
        Acc.add(new Usuarios(Name, Usuario, Contra, Age, Type));
    }

    public void neoAccount(String Name, String Usuario, String Contra, int Age, int Type) {
        Acc.add(new Usuarios(Name, Usuario, Contra, Age, Type));
    }

    public void EditData(String OriginalUser, String Name, String Usuario, String Contra, int Age, int Type) {
        for (Usuarios Cuentas : Acc) {
            if (Cuentas.getNombreUser().equals(OriginalUser)) {
                Cuentas.EditAccount(Name, Usuario, Contra, Age, Type);
            }
        }
    }

    public void deletAccount(String NombreUsuario) {
        Acc.remove(getAccountPosiition(NombreUsuario, 0));
    }

    public int getAccountPosiition(String Name, int Posi) {
        if (Name.equals(Acc.get(Posi).getNombre())) {
            return Posi;
        } else if (Posi < Acc.size() - 1) {
            return getAccountPosiition(Name, Posi + 1);
        }
        return 0;
    }

    public boolean AccValidation(boolean CambioCuenta, String Usuario, String contra, int Posi) {
        if (CambioCuenta && Acc.get(Posi).getNombreUser().equals(Usuario) && Acc.get(Posi).getcontra().equals(contra)) {
            this.EditAccount(Acc.get(Posi).getNombre(), Usuario, contra, Acc.get(Posi).getAños(), Acc.get(Posi).getTipo());
            return true;
        } else if (!CambioCuenta) {
            if (Acc.get(Posi).getNombreUser().equals(Usuario)) {
                return true;
            } else if (Posi < Acc.size() - 1) {
                return AccValidation(CambioCuenta, Usuario, contra, Posi + 1);
            }
        } else if (Posi < Acc.size() - 1) {
            return AccValidation(CambioCuenta, Usuario, contra, Posi + 1);
        }
        return false;
    }

    public int TipoCuenta(int posicion, String NombreUsuario) {
        if (posicion < Acc.size()) {
            if (Acc.get(posicion).getNombreUser().equals(NombreUsuario)) {
                return Acc.get(posicion).getTipo();
            }
            return TipoCuenta(posicion + 1, NombreUsuario);
        }
        return -1;
    }

    public ArrayList<Usuarios> conseguirUser() {
        return Acc;
    }

    public Usuarios getCuenta(String nombre, int posicion) {
        if (posicion < Acc.size()) {
            if (Acc.get(posicion).getNombreUser().equals(nombre)) {
                return Acc.get(posicion);
            }
            return getCuenta(nombre, posicion + 1);
        }
        return null;
    }

}
