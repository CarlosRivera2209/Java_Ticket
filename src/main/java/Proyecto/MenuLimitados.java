package Proyecto;


public class MenuLimitados extends javax.swing.JFrame {

   ManejoUsuarios manejoUsuarios;
    EventManager eventManager;

    public MenuLimitados(ManejoUsuarios manejoUsuarios, EventManager eventManager) {
        initComponents();
        this.manejoUsuarios = manejoUsuarios;
        this.eventManager = eventManager;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setText("REPORTES");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 108, 64));

        jButton2.setBackground(new java.awt.Color(102, 0, 0));
        jButton2.setText("REGRESAR AL MENU");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jButton3.setBackground(new java.awt.Color(153, 102, 0));
        jButton3.setText("VER EVENTOS");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 108, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
