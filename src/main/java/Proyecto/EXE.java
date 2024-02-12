package Proyecto;


public class EXE {

    public static void main(String[] args) {
        ManejoUsuarios manejoUsuarios = new ManejoUsuarios("Admin", "Admin", "Supersecreto", 50, 0);
        EventManager eventManager = new EventManager();
        new inicioSesion(manejoUsuarios,  eventManager).setVisible(true);

    }

}
