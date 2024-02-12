package Proyecto;

import java.util.Date;
import javax.swing.JOptionPane;

public class CrearEventoAdmin extends javax.swing.JFrame {

    ManejoUsuarios manejoUsuarios;
    EventManager eventManager;

    private int cantidadMax;
    private String NombresEquipos;
    public static Date palindromo = new Date();

    public CrearEventoAdmin(ManejoUsuarios manejoUsuarios, EventManager eventManager) {
        initComponents();
        this.manejoUsuarios = manejoUsuarios;
        this.eventManager = eventManager;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        cantidadMax = 20000;
        Generos.setVisible(false);
        NombresEquipo.setVisible(true);
        deportes.setVisible(true);
        CambiarName.setVisible(true);
        a.setVisible(false);
        e.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        TipoEvento = new javax.swing.JComboBox<>();
        Codigo = new javax.swing.JTextField();
        NombreEvent = new javax.swing.JTextField();
        Descripcion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Monto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CrearEvent = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        CambiarName = new javax.swing.JButton();
        NombresEquipo = new javax.swing.JComboBox<>();
        CantidadP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Calen = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        deportes = new javax.swing.JComboBox<>();
        Generos = new javax.swing.JComboBox<>();
        a = new javax.swing.JLabel();
        e = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TipoEvento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deportivo", "Musical", "Religioso", " " }));
        TipoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoEventoActionPerformed(evt);
            }
        });
        getContentPane().add(TipoEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 14, -1, -1));
        getContentPane().add(Codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 328, -1));
        getContentPane().add(NombreEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 328, -1));
        getContentPane().add(Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 328, -1));

        jLabel1.setText("Codigo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 106, -1, -1));

        jLabel2.setText("Nombre del evento");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 137, -1, -1));

        jLabel3.setText("Descripción del evento");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 177, 124, -1));
        getContentPane().add(Monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 328, -1));

        jLabel4.setText("Monto Acordado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 214, -1, -1));

        CrearEvent.setText("Crear");
        CrearEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearEventActionPerformed(evt);
            }
        });
        getContentPane().add(CrearEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, -1, -1));

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });
        getContentPane().add(Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        CambiarName.setText("Cambiar Nombre Equipo");
        CambiarName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarNameActionPerformed(evt);
            }
        });
        getContentPane().add(CambiarName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        NombresEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Equipo 1", "Equipo 2" }));
        getContentPane().add(NombresEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 14, -1, -1));

        CantidadP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadPActionPerformed(evt);
            }
        });
        getContentPane().add(CantidadP, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 328, -1));

        jLabel5.setText("Personas que van asistir");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));
        getContentPane().add(Calen, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 70, -1));

        jLabel6.setText("Establecer Fecha");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        deportes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Futbol", "Baseball", "Rugby", "Tenis" }));
        getContentPane().add(deportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, -1, -1));

        Generos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "POP", "ROCK", "RAP", "CLASICA", "REGGEATON", "OTRO" }));
        getContentPane().add(Generos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        a.setText("¿Que genero de musica es?");
        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        e.setText("Tipo de deporte");
        getContentPane().add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearEventActionPerformed
        palindromo = Calen.getDate();
        try {
            if (Integer.parseInt(CantidadP.getText()) < cantidadMax) {
                if (!Codigo.getText().isBlank()) {
                    System.out.println("hola mundo");
                    if (!NombreEvent.getText().isBlank()) {
                        System.out.println("hola Josh");
                        if (!Descripcion.getText().isBlank()) {
                            System.out.println("hola Johnny");
                            if (!Monto.getText().isBlank() && Monto.getText().matches("[0-9]+")) {
                                System.out.println("hola Bryan");
                                if (!CantidadP.getText().isBlank() && CantidadP.getText().matches("[0-9]+")) {
                                    System.out.println("hola Carlos ");
                                    switch (TipoEvento.getSelectedIndex()) {
                                        case 0 -> {
                                            eventManager.addSportEvent(NombresEquipo.getItemAt(0), NombresEquipo.getItemAt(1), deportes.getSelectedItem().toString(), NombreEvent.getText(), Descripcion.getText(), Codigo.getText(), manejoUsuarios.getNombreUser(), Double.parseDouble(Monto.getText()), Integer.parseInt(CantidadP.getText()), palindromo);
                                            JOptionPane.showMessageDialog(null, "Se ha creado Evento Deportivo");
                                            dispose();
                                            new MenuAdmin(manejoUsuarios, eventManager).setVisible(true);
                                        }
                                        case 1 -> {
                                            eventManager.addMusicalEvent(NombreEvent.getText(), Descripcion.getText(), Codigo.getText(), Generos.getSelectedItem().toString(), manejoUsuarios.getNombreUser(), Double.parseDouble(Monto.getText()), Integer.parseInt(CantidadP.getText()), palindromo);
                                            JOptionPane.showMessageDialog(null, "Se ha creado Evento Musical");
                                            dispose();
                                            new MenuAdmin(manejoUsuarios, eventManager).setVisible(true);
                                        }

                                        case 2 -> {
                                            eventManager.addReligioso(NombreEvent.getText(), Descripcion.getText(), Codigo.getText(), manejoUsuarios.getNombreUser(), Double.parseDouble(Monto.getText()), Integer.parseInt(CantidadP.getText()), 0, palindromo);
                                            JOptionPane.showMessageDialog(null, "Se ha creado Evento Religioso");
                                            dispose();
                                            new MenuAdmin(manejoUsuarios, eventManager).setVisible(true);
                                        }
                                    }

                                } else {
                                    JOptionPane.showMessageDialog(null, "Tiene que ingresar la cantidad de personas adecuadas");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Tiene que ingresar el monto adecuado");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Tiene que ingresar la descripcion del evento");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Tiene que ingresar el Nombre del Evento");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Tiene que ingresar el Codigo");
                }
            } else {
                JOptionPane.showInternalMessageDialog(null, "Se paso de la cantidad de personas que pueden asistir");
            }
        } catch (Exception i) {

        }


    }//GEN-LAST:event_CrearEventActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        dispose();
        new EventosAdmin(manejoUsuarios, eventManager).setVisible(true);
    }//GEN-LAST:event_CancelarActionPerformed

    private void TipoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoEventoActionPerformed
        switch (TipoEvento.getSelectedIndex()) {
            case 0 -> {
                cantidadMax = 20000;
                Generos.setVisible(false);
                NombresEquipo.setVisible(true);
                deportes.setVisible(true);
                CambiarName.setVisible(true);
                a.setVisible(false);
                e.setVisible(true);

            }
            case 1 -> {
                cantidadMax = 25000;
                Generos.setVisible(true);
                NombresEquipo.setVisible(false);
                deportes.setVisible(false);
                CambiarName.setVisible(false);
                a.setVisible(true);
                e.setVisible(false);
            }

            case 2 -> {
                cantidadMax = 30000;
                Generos.setVisible(false);
                NombresEquipo.setVisible(false);
                deportes.setVisible(false);
                CambiarName.setVisible(false);
                a.setVisible(false);
                e.setVisible(false);
            }

        }
    }//GEN-LAST:event_TipoEventoActionPerformed

    private void CambiarNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarNameActionPerformed
        switch (NombresEquipo.getSelectedIndex()) {
            case 0 -> {
                NombresEquipos = JOptionPane.showInputDialog("Ingresa el nombre del equipo 1");
                NombresEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{NombresEquipos, NombresEquipo.getItemAt(1)}));

            }
            case 1 -> {
                NombresEquipos = JOptionPane.showInputDialog("Ingresa el nombre del equipo 2");
                NombresEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{NombresEquipo.getItemAt(0), NombresEquipos}));
            }
        }
    }//GEN-LAST:event_CambiarNameActionPerformed

    private void CantidadPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadPActionPerformed

    }//GEN-LAST:event_CantidadPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Calen;
    private javax.swing.JButton CambiarName;
    private javax.swing.JButton Cancelar;
    private javax.swing.JTextField CantidadP;
    private javax.swing.JTextField Codigo;
    private javax.swing.JButton CrearEvent;
    private javax.swing.JTextField Descripcion;
    private javax.swing.JComboBox<String> Generos;
    private javax.swing.JTextField Monto;
    private javax.swing.JTextField NombreEvent;
    private javax.swing.JComboBox<String> NombresEquipo;
    private javax.swing.JComboBox<String> TipoEvento;
    private javax.swing.JLabel a;
    private javax.swing.JComboBox<String> deportes;
    private javax.swing.JLabel e;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
