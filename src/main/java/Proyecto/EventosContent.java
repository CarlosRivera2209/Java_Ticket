package Proyecto;


public class EventosContent extends javax.swing.JFrame {

   ManejoUsuarios manejoUsuarios;
   EventManager eventManager;

    public EventosContent(ManejoUsuarios manejoUsuarios, EventManager eventManager) {
        initComponents();
        this.manejoUsuarios = manejoUsuarios;
        this.eventManager =eventManager;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CrearEvent = new javax.swing.JButton();
        EliminEvent = new javax.swing.JButton();
        EditEvent = new javax.swing.JButton();
        VerEvent = new javax.swing.JButton();
        regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CrearEvent.setText("Crear un evento");
        CrearEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearEventActionPerformed(evt);
            }
        });

        EliminEvent.setText("Eliminar un evento");
        EliminEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminEventActionPerformed(evt);
            }
        });

        EditEvent.setText("Editar un evento");
        EditEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditEventActionPerformed(evt);
            }
        });

        VerEvent.setText("Ver evento");
        VerEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerEventActionPerformed(evt);
            }
        });

        regresar.setText("Regresar al Menu");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CrearEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(regresar))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(205, 205, 205)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(VerEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EliminEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(EditEvent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(CrearEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EliminEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(EditEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(VerEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(regresar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CrearEventActionPerformed

    private void EliminEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminEventActionPerformed

    private void EditEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditEventActionPerformed

    private void VerEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerEventActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VerEventActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        dispose();
        new MenuContent(manejoUsuarios,  eventManager).setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearEvent;
    private javax.swing.JButton EditEvent;
    private javax.swing.JButton EliminEvent;
    private javax.swing.JButton VerEvent;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
