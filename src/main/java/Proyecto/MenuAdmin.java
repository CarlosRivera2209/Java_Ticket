package Proyecto;


public class MenuAdmin extends javax.swing.JFrame {

    ManejoUsuarios manejoUsuarios;
    EventManager eventManager;

    public MenuAdmin(ManejoUsuarios manejoUsuarios, EventManager eventManager) {
        initComponents();
        this.manejoUsuarios = manejoUsuarios;
        this.eventManager = eventManager;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminUser = new javax.swing.JButton();
        AdminEvents = new javax.swing.JButton();
        RegresarMenu = new javax.swing.JButton();
        Reportes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminUser.setBackground(new java.awt.Color(153, 102, 0));
        adminUser.setText("ADMIN USUARIOS");
        adminUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminUserActionPerformed(evt);
            }
        });
        getContentPane().add(adminUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 130, 41));

        AdminEvents.setBackground(new java.awt.Color(204, 102, 0));
        AdminEvents.setText("ADMIN EVENTOS");
        AdminEvents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminEventsActionPerformed(evt);
            }
        });
        getContentPane().add(AdminEvents, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 130, 41));

        RegresarMenu.setBackground(new java.awt.Color(153, 0, 0));
        RegresarMenu.setText("REGRESAR AL MENU");
        RegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarMenuActionPerformed(evt);
            }
        });
        getContentPane().add(RegresarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        Reportes.setBackground(new java.awt.Color(255, 102, 51));
        Reportes.setText("REPORTES");
        getContentPane().add(Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 130, 37));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminUserActionPerformed
        dispose();
        new Registro(manejoUsuarios,  eventManager).setVisible(true);
    }//GEN-LAST:event_adminUserActionPerformed

    private void AdminEventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminEventsActionPerformed
        dispose();
        new EventosAdmin(manejoUsuarios,  eventManager).setVisible(true);
    }//GEN-LAST:event_AdminEventsActionPerformed

    private void RegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarMenuActionPerformed
        dispose();
        new inicioSesion(manejoUsuarios,  eventManager).setVisible(true);
    }//GEN-LAST:event_RegresarMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminEvents;
    private javax.swing.JButton RegresarMenu;
    private javax.swing.JButton Reportes;
    private javax.swing.JButton adminUser;
    // End of variables declaration//GEN-END:variables
}
