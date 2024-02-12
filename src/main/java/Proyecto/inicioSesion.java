package Proyecto;


public class inicioSesion extends javax.swing.JFrame {

    ManejoUsuarios manejoUsuarios;
    EventManager eventManager;

    public inicioSesion(ManejoUsuarios manejoUsuarios, EventManager eventManager) {
        initComponents();
        this.manejoUsuarios = manejoUsuarios;
        this.eventManager = eventManager;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JPasswordField();
        Iniciar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Limitado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setBackground(new java.awt.Color(255, 255, 255));
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 345, -1));

        contraseña.setBackground(new java.awt.Color(255, 255, 255));
        contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 345, -1));

        Iniciar.setBackground(new java.awt.Color(51, 51, 255));
        Iniciar.setText("INICIAR");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });
        getContentPane().add(Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 102, 57));

        Salir.setBackground(new java.awt.Color(0, 0, 102));
        Salir.setText("SALIR");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 102, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("USUARIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("CONTRASEÑA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        Limitado.setBackground(new java.awt.Color(102, 0, 102));
        Limitado.setText("Iniciar como Limitado");
        Limitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimitadoActionPerformed(evt);
            }
        });
        getContentPane().add(Limitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed

    }//GEN-LAST:event_usuarioActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        String Usuario;
        String Contra;

        Usuario = usuario.getText();
        Contra = contraseña.getText();

        if (manejoUsuarios.AccValidation(true, Usuario, Contra, 0)) {
            if (manejoUsuarios.TipoCuenta(0, Usuario) == 0) {
                dispose();
                new MenuAdmin(manejoUsuarios,  eventManager).setVisible(true);
            }else if (manejoUsuarios.TipoCuenta(1, Usuario) == 1){
                dispose();
                new MenuContent(manejoUsuarios,  eventManager).setVisible(true);
            }
        }

    }//GEN-LAST:event_IniciarActionPerformed

    private void LimitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimitadoActionPerformed
        manejoUsuarios.AccValidation(true,"Invitado", "", 0);
        dispose();
        new MenuLimitados(manejoUsuarios,  eventManager).setVisible(true);
    }//GEN-LAST:event_LimitadoActionPerformed

    private void contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaActionPerformed

    }//GEN-LAST:event_contraseñaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Iniciar;
    private javax.swing.JButton Limitado;
    private javax.swing.JButton Salir;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
