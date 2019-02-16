package tatteo.view;
import tatteo.Grafo;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import javax.swing.table.DefaultTableModel;

public class Lista_vuelos extends javax.swing.JFrame {


    Agg_vuelo agg_vuelo;
    Modif_vuelo modif_vuelo;
    Inicio inicio;
    Lista_ciudades lista_ciudades;
    Grafo grafo;

    public DefaultTableModel defaultTableModel = new DefaultTableModel();

    public Lista_vuelos(Inicio inicio, Agg_vuelo agg_vuelo, Lista_ciudades lista_ciudades) {
        initComponents();
        setLocationRelativeTo(this);

        this.inicio = inicio;
        this.agg_vuelo = agg_vuelo;
        this.lista_ciudades = lista_ciudades;
        this.grafo = lista_ciudades.grafo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        add_vuelo_btn = new javax.swing.JButton();
        del_vuelo_btn = new javax.swing.JButton();
        modif_vuelo_btn = new javax.swing.JButton();
        ir_inicio_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVuelos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Swis721 Ex BT", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Swis721 Lt BT", 1, 18)); // NOI18N
        jLabel1.setText("Lista de Vuelos");

        add_vuelo_btn.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        add_vuelo_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tatteo/img/add.png"))); // NOI18N
        add_vuelo_btn.setText("Add Vuelo");
        add_vuelo_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_vuelo_btnActionPerformed(evt);
            }
        });

        del_vuelo_btn.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        del_vuelo_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tatteo/img/delete.png"))); // NOI18N
        del_vuelo_btn.setText("Del Vuelo");
        del_vuelo_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_vuelo_btnActionPerformed(evt);
            }
        });

        modif_vuelo_btn.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        modif_vuelo_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tatteo/img/conf.png"))); // NOI18N
        modif_vuelo_btn.setText("Modif Vuelo");
        modif_vuelo_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modif_vuelo_btnActionPerformed(evt);
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

        tablaVuelos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Origen", "Destino", "Duración", "# Vuelo", "Aerolínea", "Costo ($)"
            }
        ));
        tablaVuelos.addFocusListener(new java.awt.event.FocusAdapter() {

        });
        tablaVuelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaVuelosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaVuelos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add_vuelo_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(del_vuelo_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(modif_vuelo_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ir_inicio_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_vuelo_btn)
                    .addComponent(del_vuelo_btn)
                    .addComponent(modif_vuelo_btn)
                    .addComponent(ir_inicio_btn))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaVuelosMousePressed(java.awt.event.MouseEvent evt) {
        
    }


    private void del_vuelo_btnActionPerformed(java.awt.event.ActionEvent evt) {
        int eliminar = tablaVuelos.getSelectedRow();
        if(eliminar >= 0){
            defaultTableModel.removeRow(eliminar);
            inicio.defaultTableModel.removeRow(eliminar);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un Vuelo para Eliminar");
        }
    }

    int fila;
    public int getFila() {
        return fila;
    }
   
      
    private void modif_vuelo_btnActionPerformed(java.awt.event.ActionEvent evt) {
        Modif_vuelo modif_vuelo = new Modif_vuelo(inicio, this);
        modif_vuelo.cbox_origen = agg_vuelo.cbox_origen;
        modif_vuelo.cbox_destino = agg_vuelo.cbox_destino;
        modif_vuelo.setVisible(true);
        fila = tablaVuelos.getSelectedRow(); 
        
    }

    private static boolean cargarRepo = true;

    private void add_vuelo_btnActionPerformed(java.awt.event.ActionEvent evt) {

        String nombre;

        if(cargarRepo){
            for(int i=0; i<grafo.getCiudades().size();i++){
                nombre = grafo.getCiudades().get(i).getNomAerPais();
                agg_vuelo.cbox_destino.addItem(nombre);
            }
            for(int i=0; i<grafo.getCiudades().size();i++){
                nombre = grafo.getCiudades().get(i).getNomAerPais();
                agg_vuelo.cbox_origen.addItem(nombre);
            }
            cargarRepo = false;
        }

        agg_vuelo.lista_vuelos = this;
        agg_vuelo.setVisible(true);
        this.setVisible(false);

    }

    private void ir_inicio_btnActionPerformed(java.awt.event.ActionEvent evt) {
        inicio.setVisible(true);
        this.setVisible(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_vuelo_btn;
    private javax.swing.JButton del_vuelo_btn;
    private javax.swing.JButton ir_inicio_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modif_vuelo_btn;
    public javax.swing.JTable tablaVuelos;
    // End of variables declaration//GEN-END:variables

    public JTable getTablaVuelos() {
        return tablaVuelos;
    }


}
