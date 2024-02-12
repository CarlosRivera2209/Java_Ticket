package Proyecto;

public class MenuContent extends javax.swing.JFrame {

    ManejoUsuarios manejoUsuarios;
    EventManager eventManager;

    public MenuContent(ManejoUsuarios manejoUsuarios, EventManager eventManager) {
        initComponents();
        this.manejoUsuarios = manejoUsuarios;
        this.eventManager = eventManager;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminEventos = new javax.swing.JButton();
        Reportes = new javax.swing.JButton();
        regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AdminEventos.setBackground(new java.awt.Color(153, 102, 0));
        AdminEventos.setText("ADMIN EVENTOS");
        AdminEventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminEventosActionPerformed(evt);
            }
        });
        getContentPane().add(AdminEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 140, 52));

        Reportes.setBackground(new java.awt.Color(255, 102, 0));
        Reportes.setText("REPORTES");
        Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportesActionPerformed(evt);
            }
        });
        getContentPane().add(Reportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 140, 52));

        regresar.setBackground(new java.awt.Color(153, 0, 0));
        regresar.setText("REGRESAR AL MENU");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        dispose();
        new inicioSesion(manejoUsuarios,  eventManager).setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed

    private void AdminEventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminEventosActionPerformed
        dispose();
        new EventosContent(manejoUsuarios,  eventManager).setVisible(true);
    }//GEN-LAST:event_AdminEventosActionPerformed

    private void ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ReportesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminEventos;
    private javax.swing.JButton Reportes;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
