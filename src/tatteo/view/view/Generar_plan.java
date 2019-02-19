
package tatteo.view;

import tatteo.Grafo;
import tatteo.RutaAerea;


public class Generar_plan extends javax.swing.JFrame {
    Inicio inicio;
    RutaAerea rutaA; 
    Grafo grafo; 
    Lista_vuelos lista_vuelos; 
    
    
    public Generar_plan(Inicio inicio, Grafo grafo) {
        initComponents();
        setLocationRelativeTo(this);
        this.inicio = inicio;
        this.grafo = grafo; 
    }
    
    public int buscarCiudad (String o){
        int indice = 0;
        //int indice = -1; 

        for (int i = 0; i < grafo.getCiudades().size(); i++) {
            if(grafo.getCiudades().get(i).getNombre().equals(o)){
                indice = i;
            }
        }
        return indice; 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenerarPlan_lbl = new javax.swing.JLabel();
        ori_field = new javax.swing.JTextField();
        dest_field = new javax.swing.JTextField();
        Origen_lbl = new javax.swing.JLabel();
        Destino_lbl = new javax.swing.JLabel();
        Criterio_lbl = new javax.swing.JLabel();
        criterio_btn = new javax.swing.JComboBox<>();
        generar_plan_btn = new javax.swing.JButton();
        ir_inicio_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GenerarPlan_lbl.setFont(new java.awt.Font("Swis721 Lt BT", 1, 18)); // NOI18N
        GenerarPlan_lbl.setText("Generar Nuevo Plan de Vuelo");

        ori_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ori_fieldActionPerformed(evt);
            }
        });

        Origen_lbl.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        Origen_lbl.setText("Origen");

        Destino_lbl.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        Destino_lbl.setText("Destino");

        Criterio_lbl.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        Criterio_lbl.setText("Criterio");

        criterio_btn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        criterio_btn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Costo", "Tiempo" }));
        criterio_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criterio_btnActionPerformed(evt);
            }
        });

        generar_plan_btn.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        generar_plan_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tatteo/img/track.png"))); // NOI18N
        generar_plan_btn.setText("Generar Plan");
        generar_plan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generar_plan_btnActionPerformed(evt);
            }
        });

        ir_inicio_btn.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        ir_inicio_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tatteo/img/home.png"))); // NOI18N
        ir_inicio_btn.setText("Inicio");
        ir_inicio_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ir_inicio_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Origen_lbl)
                                .addGap(18, 18, 18)
                                .addComponent(ori_field))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Destino_lbl)
                                    .addComponent(Criterio_lbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(criterio_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dest_field, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(generar_plan_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(ir_inicio_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(GenerarPlan_lbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GenerarPlan_lbl)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Origen_lbl)
                    .addComponent(ori_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Destino_lbl)
                    .addComponent(dest_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Criterio_lbl)
                    .addComponent(criterio_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generar_plan_btn)
                    .addComponent(ir_inicio_btn))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ori_fieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void criterio_btnActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void ir_inicio_btnActionPerformed(java.awt.event.ActionEvent evt) {
        inicio.setVisible(true);
        this.setVisible(false);
    }

    private void generar_plan_btnActionPerformed(java.awt.event.ActionEvent evt) {
        String criterio, ori; 
        int vO, vD; 
        ori = ori_field.getText();
        vO = buscarCiudad(ori);
        rutaA = new RutaAerea (grafo.getCiudades(), vO);
        int iM = grafo.getCiudades().size();
        int ady [][] = new int [iM][iM];
        
        
        criterio = (String) criterio_btn.getSelectedItem(); 
        
        switch (criterio){
            case "Costo":
                ady = rutaA.pesoCosto(grafo.getCiudades().get(0).getVuelos(), grafo.getCiudades()); //Mismos vuelos para todas las ciudades, por eso se obtiene la lista de vuelos en la posicion 0 (indiferente para cualquier otra posicion)
                rutaA.minimo(); 
                rutaA.caminoMinimo(ady, grafo.getCiudades().get(0).getVuelos());
                
                
            case "Tiempo":
                ady = rutaA.pesoTiempo(grafo.getCiudades().get(0).getVuelos(), grafo.getCiudades());
                rutaA.minimo(); 
                rutaA.caminoMinimo(ady, grafo.getCiudades().get(0).getVuelos());  
        }
        
    }



    private javax.swing.JLabel Criterio_lbl;
    private javax.swing.JLabel Destino_lbl;
    private javax.swing.JLabel GenerarPlan_lbl;
    private javax.swing.JLabel Origen_lbl;
    private javax.swing.JComboBox<String> criterio_btn;
    private javax.swing.JTextField dest_field;
    private javax.swing.JButton generar_plan_btn;
    private javax.swing.JButton ir_inicio_btn;
    private javax.swing.JTextField ori_field;

}
