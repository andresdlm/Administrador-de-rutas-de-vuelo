package tatteo.view;

public class Inicio extends javax.swing.JFrame {

    
    public Inicio() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        vuelos_btn = new javax.swing.JButton();
        ciudades_btn = new javax.swing.JButton();
        generarPlan_btn = new javax.swing.JButton();
        cargarArch_btn = new javax.swing.JButton();
        MenuInicio = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Swis721 Lt BT", 1, 18)); // NOI18N
        jLabel1.setText("Lista de Rutas Disponibles");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Swis721 Lt BT", 3, 24)); // NOI18N
        jLabel2.setText("TATTEO VIAJES C.A ");

        vuelos_btn.setFont(new java.awt.Font("Swis721 Lt BT", 1, 18)); // NOI18N
        vuelos_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tatteo/img/avion.png"))); // NOI18N
        vuelos_btn.setText("VUELOS");
        vuelos_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vuelos_btnActionPerformed(evt);
            }
        });

        ciudades_btn.setFont(new java.awt.Font("Swis721 Lt BT", 1, 18)); // NOI18N
        ciudades_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tatteo/img/world.png"))); // NOI18N
        ciudades_btn.setText("CIUDADES");
        ciudades_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudades_btnActionPerformed(evt);
            }
        });

        generarPlan_btn.setFont(new java.awt.Font("Swis721 Lt BT", 1, 18)); // NOI18N
        generarPlan_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tatteo/img/track.png"))); // NOI18N
        generarPlan_btn.setText("GENERAR PLAN");
        generarPlan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarPlan_btnActionPerformed(evt);
            }
        });

        cargarArch_btn.setFont(new java.awt.Font("Swis721 Lt BT", 1, 18)); // NOI18N
        cargarArch_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tatteo/img/outbox.png"))); // NOI18N
        cargarArch_btn.setText("CARGAR ARCHIVO");
        setJMenuBar(MenuInicio);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(vuelos_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ciudades_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generarPlan_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cargarArch_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vuelos_btn)
                    .addComponent(ciudades_btn)
                    .addComponent(generarPlan_btn)
                    .addComponent(cargarArch_btn))
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vuelos_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vuelos_btnActionPerformed
        // TODO add your handling code here:
        Lista_vuelos vuelos = new Lista_vuelos();
        vuelos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_vuelos_btnActionPerformed

    private void ciudades_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudades_btnActionPerformed
        // TODO add your handling code here:
        Lista_ciudades ciudades = new Lista_ciudades();
        ciudades.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ciudades_btnActionPerformed

    private void generarPlan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarPlan_btnActionPerformed
        // TODO add your handling code here:
        Generar_plan genPlan = new Generar_plan();
        genPlan.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_generarPlan_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuInicio;
    private javax.swing.JButton cargarArch_btn;
    private javax.swing.JButton ciudades_btn;
    private javax.swing.JButton generarPlan_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton vuelos_btn;
    // End of variables declaration//GEN-END:variables
}
