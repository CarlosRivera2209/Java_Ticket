package Proyecto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Registro extends javax.swing.JFrame {

    Object Cuenta;
    ManejoUsuarios manejoUsuarios;
    EventManager eventManager;

    public Registro(ManejoUsuarios manejoUsuarios, EventManager eventManager) {
        initComponents();
        this.manejoUsuarios = manejoUsuarios;
        this.eventManager = eventManager;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombreReal = new javax.swing.JTextField();
        contraseña = new javax.swing.JPasswordField();
        cancelar = new javax.swing.JButton();
        CrearCuenta = new javax.swing.JButton();
        NombreUsuario = new javax.swing.JTextField();
        edad = new javax.swing.JTextField();
        AdminCuenta = new javax.swing.JComboBox<>();
        TipoCuenta = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreReal.setBackground(new java.awt.Color(255, 255, 255));
        NombreReal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreRealActionPerformed(evt);
            }
        });
        getContentPane().add(NombreReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 220, -1));

        contraseña.setBackground(new java.awt.Color(255, 255, 255));
        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 220, -1));

        cancelar.setBackground(new java.awt.Color(204, 204, 0));
        cancelar.setForeground(new java.awt.Color(0, 0, 0));
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        CrearCuenta.setBackground(new java.awt.Color(255, 102, 51));
        CrearCuenta.setForeground(new java.awt.Color(0, 0, 0));
        CrearCuenta.setText("Crear Cuenta");
        CrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearCuentaActionPerformed(evt);
            }
        });
        getContentPane().add(CrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, -1, 20));

        NombreUsuario.setBackground(new java.awt.Color(255, 255, 255));
        NombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 220, -1));

        edad.setBackground(new java.awt.Color(255, 255, 255));
        edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edadActionPerformed(evt);
            }
        });
        getContentPane().add(edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 84, -1));

        AdminCuenta.setBackground(new java.awt.Color(255, 204, 0));
        AdminCuenta.setForeground(new java.awt.Color(0, 0, 0));
        AdminCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crear Cuenta", "Editar Cuenta", "Borrar Cuenta", " " }));
        AdminCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminCuentaActionPerformed(evt);
            }
        });
        getContentPane().add(AdminCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        TipoCuenta.setBackground(new java.awt.Color(255, 153, 0));
        TipoCuenta.setForeground(new java.awt.Color(0, 0, 0));
        TipoCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Contenidos" }));
        TipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoCuentaActionPerformed(evt);
            }
        });
        getContentPane().add(TipoCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre Completo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre de Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminCuentaActionPerformed
        switch (AdminCuenta.getSelectedIndex()) {
            case 0 -> {
                eliminarInfo();
                this.CrearCuenta.setText("CREAR CUENTA");
            }
            case 1 -> {
                ConseguirUser();
                this.CrearCuenta.setText("EDITAR CUENTA");
            }

            case 2 -> {
                ConseguirUser();
                this.CrearCuenta.setText("ELIMINAR CUENTA");
            }

        }
    }//GEN-LAST:event_AdminCuentaActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();
        new MenuAdmin(manejoUsuarios,  eventManager).setVisible(true);
    }//GEN-LAST:event_cancelarActionPerformed

    private void TipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoCuentaActionPerformed

    }//GEN-LAST:event_TipoCuentaActionPerformed

    private void NombreRealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreRealActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreRealActionPerformed

    private void CrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearCuentaActionPerformed
        switch (AdminCuenta.getSelectedIndex()) {
            case 0:
                createAcc();
                eliminarInfo();
                break;
            case 1:
                if (Cuenta != null) {
                    manejoUsuarios.EditData(Cuenta.toString(), NombreReal.getText(), NombreUsuario.getText(), contraseña.getText(), Integer.parseInt(edad.getText()), TipoCuenta.getSelectedIndex());
                    Cuenta = null;
                    eliminarInfo();
                }
                break;
            case 2:
                if (Cuenta != null) {
                    manejoUsuarios.deletAccount(Cuenta.toString());
                    Cuenta = null;
                    eliminarInfo();
                }
                break;
        }


    }//GEN-LAST:event_CrearCuentaActionPerformed

    private void NombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreUsuarioActionPerformed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraseñaActionPerformed

    private void edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edadActionPerformed

    private void eliminarInfo() {
        NombreReal.setText("");
        NombreUsuario.setText("");
        contraseña.setText("");
        edad.setText("");
    }

    private void ConseguirUser() {

        if (manejoUsuarios.conseguirUser().size() > 2) {
            ArrayList<String> Usuarios = new ArrayList();
            for (int palo = 2; palo < manejoUsuarios.conseguirUser().size(); palo++) {
                Usuarios.add(manejoUsuarios.conseguirUser().get(palo).getNombreUser());
            }
            Cuenta = JOptionPane.showInputDialog(this, "Seleccione la cuenta que quiere editar", "Editar Cuenta", JOptionPane.DEFAULT_OPTION, null, Usuarios.toArray(), 0);
            if (Cuenta != null) {
                if (manejoUsuarios.getCuenta(Cuenta.toString(), 0) != null) {
                    NombreReal.setText(manejoUsuarios.getCuenta(Cuenta.toString(), 0).getNombre());
                    NombreUsuario.setText(manejoUsuarios.getCuenta(Cuenta.toString(), 0).getNombreUser());
                    contraseña.setText(manejoUsuarios.getCuenta(Cuenta.toString(), 0).getcontra());
                    edad.setText(String.valueOf(manejoUsuarios.getCuenta(Cuenta.toString(), 0).getAños()));
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ha creado una cuenta :(");
            Cuenta = null;
        }
    }

    private void createAcc() {
        if (!NombreReal.getText().isBlank()) {
            if (!NombreUsuario.getText().isBlank()) {
                if (!contraseña.getText().isBlank()) {
                    if (!edad.getText().isBlank() && edad.getText().matches("[0-9]+")) {
                        manejoUsuarios.neoAccount(NombreReal.getText(), NombreUsuario.getText(), contraseña.getText(), Integer.parseInt(edad.getText()), TipoCuenta.getSelectedIndex());
                        JOptionPane.showMessageDialog(null, "Su cuenta a sido creada con exito");
                    } else {
                        JOptionPane.showMessageDialog(null, "Tiene que ingresar su edad");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Tiene que ingresar su contraseña");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Tiene que ingresar su Nombre de Usuario");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Tiene que ingresar su Nombre Completo");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AdminCuenta;
    private javax.swing.JButton CrearCuenta;
    private javax.swing.JTextField NombreReal;
    private javax.swing.JTextField NombreUsuario;
    private javax.swing.JComboBox<String> TipoCuenta;
    private javax.swing.JButton cancelar;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JTextField edad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
