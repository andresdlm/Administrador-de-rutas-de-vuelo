package tatteo.view;

import javax.swing.table.DefaultTableModel;
import tatteo.Ciudad;
import tatteo.Grafo;
import tatteo.Repositorio;
import tatteo.Vuelo;

import java.awt.event.ActionEvent;

public class Agg_vuelo extends javax.swing.JFrame {

    Inicio inicio;
    Lista_vuelos lista_vuelos;
    Grafo grafo;
    public DefaultTableModel defaultTableModel = new DefaultTableModel();
   
    public Agg_vuelo(Inicio inicio, Grafo grafo) {
        initComponents();
        setLocationRelativeTo(this);
        this.inicio = inicio;
        this.grafo = grafo;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Origen_lbl = new javax.swing.JLabel();
        Destino_lbl = new javax.swing.JLabel();
        Dur_lbl = new javax.swing.JLabel();
        NumVuelo_lbl = new javax.swing.JLabel();
        Aero_lbl = new javax.swing.JLabel();
        Costo_lbl = new javax.swing.JLabel();
        dur_field = new javax.swing.JTextField();
        numF_field = new javax.swing.JTextField();
        price_field = new javax.swing.JTextField();
        aero_field = new javax.swing.JTextField();
        AddListVue_btn = new javax.swing.JButton();
        ver_lista_btn = new javax.swing.JButton();
        ir_inicio_btn = new javax.swing.JButton();
        cbox_destino = new javax.swing.JComboBox<>();
        cbox_origen = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Swis721 Lt BT", 1, 18)); // NOI18N
        jLabel1.setText("Agregar Nuevo Vuelo");

        Origen_lbl.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        Origen_lbl.setText("Origen");

        Destino_lbl.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        Destino_lbl.setText("Destino");

        Dur_lbl.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        Dur_lbl.setText("Duración");

        NumVuelo_lbl.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        NumVuelo_lbl.setText("Numero de Vuelo");

        Aero_lbl.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        Aero_lbl.setText("Aerolínea");

        Costo_lbl.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        Costo_lbl.setText("Costo del Boleto");

        dur_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dur_fieldActionPerformed(evt);
            }
        });

        numF_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        price_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        aero_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        AddListVue_btn.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        AddListVue_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tatteo/img/menu.png"))); // NOI18N
        AddListVue_btn.setText("Añadir a Lista");
        AddListVue_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AggListVue_btnActionPerformed(evt);
            }
        });

        ver_lista_btn.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        ver_lista_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tatteo/img/list.png"))); // NOI18N
        ver_lista_btn.setText("Ver Lista");
        ver_lista_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_lista_btnActionPerformed(evt);
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

        cbox_destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_destinoActionPerformed(evt);
            }
        });

        cbox_origen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_origenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddListVue_btn)
                            .addComponent(Costo_lbl)
                            .addComponent(Aero_lbl)
                            .addComponent(NumVuelo_lbl)
                            .addComponent(Dur_lbl)
                            .addComponent(Destino_lbl)
                            .addComponent(Origen_lbl))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbox_origen, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbox_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dur_field, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numF_field, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(price_field, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ver_lista_btn)
                                .addGap(30, 30, 30)
                                .addComponent(ir_inicio_btn))
                            .addComponent(aero_field, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbox_origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Origen_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbox_destino, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Destino_lbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dur_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dur_lbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numF_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumVuelo_lbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aero_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Aero_lbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Costo_lbl))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddListVue_btn)
                    .addComponent(ver_lista_btn)
                    .addComponent(ir_inicio_btn))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dur_fieldActionPerformed(ActionEvent evt) {
    }

    private void AggListVue_btnActionPerformed(java.awt.event.ActionEvent evt) {

        String origen = (String) cbox_origen.getSelectedItem();
        String destino = (String) cbox_destino.getSelectedItem();
        int duracion = Integer.parseInt(dur_field.getText());
        String numeroDeVuelo = numF_field.getText();
        String aerolinea = aero_field.getText();
        String costoBoleto = price_field.getText();
        Ciudad ciudad = null, ciudad2 = null;

        for(int i =0; i<grafo.getCiudades().size();i++){
            if(grafo.getCiudades().get(i).getNomAerPais().equals(origen)){
                ciudad = grafo.getCiudades().get(i);
            }
        }

        for(int i =0; i<grafo.getCiudades().size();i++){
            if(grafo.getCiudades().get(i).getNomAerPais() == destino){
                ciudad2 = grafo.getCiudades().get(i);
            }
        }

        Vuelo vuelo = new Vuelo(ciudad, ciudad2, duracion, Integer.parseInt(costoBoleto), numeroDeVuelo, aerolinea);

        Repositorio repositorio = new Repositorio();


        lista_vuelos.defaultTableModel = (DefaultTableModel) lista_vuelos.getTablaVuelos().getModel();
        String [] agregar = new String [6];
        agregar[0] = ((String) cbox_origen.getSelectedItem()).split(",")[0];
        agregar[1] = ((String) cbox_destino.getSelectedItem()).split(",")[0];
        agregar[2] = Integer.toString(vuelo.getDuracion());
        agregar[3] = Integer.toString(vuelo.getCosto());
        agregar[4] = vuelo.getNumV();
        agregar[5] = vuelo.getLineaA();
        lista_vuelos.defaultTableModel.addRow(agregar);
        inicio.defaultTableModel = (DefaultTableModel) inicio.tablaInicio.getModel();
        String[] agregar2 = new String[4];
        agregar2[0] = agregar[0];
        agregar2[1] = agregar[1];
        agregar2[2] = agregar[4];
        agregar2[3] = agregar[2];
        inicio.defaultTableModel.addRow(agregar2);

        repositorio.IngresarDatos(Integer.parseInt(agregar[4]),agregar[5], Integer.parseInt(agregar[3]),Integer.parseInt(agregar[2]));
        repositorio.IngresarDatos(agregar[0],agregar[1],Integer.parseInt(agregar[4]));

        dur_field.setText(null);
        numF_field.setText(null);
        aero_field.setText(null);
        price_field.setText(null);
    }

    private void ir_inicio_btnActionPerformed(java.awt.event.ActionEvent evt) {                                              
        inicio.setVisible(true);
        this.setVisible(false);
    }

    private void ver_lista_btnActionPerformed(java.awt.event.ActionEvent evt) {                                              
        lista_vuelos.setVisible(true);
        this.setVisible(false);
    }

    private void cbox_origenActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    }

    private void cbox_destinoActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
    }



    private javax.swing.JButton AddListVue_btn;
    private javax.swing.JLabel Aero_lbl;
    private javax.swing.JLabel Costo_lbl;
    private javax.swing.JLabel Destino_lbl;
    private javax.swing.JLabel Dur_lbl;
    private javax.swing.JLabel NumVuelo_lbl;
    private javax.swing.JLabel Origen_lbl;
    private javax.swing.JTextField aero_field;
    public javax.swing.JComboBox<String> cbox_destino;
    public javax.swing.JComboBox<String> cbox_origen;
    private javax.swing.JTextField dur_field;
    private javax.swing.JButton ir_inicio_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField numF_field;
    private javax.swing.JTextField price_field;
    private javax.swing.JButton ver_lista_btn;

}
