package tatteo.view;

import tatteo.*;


public class Modif_vuelo extends javax.swing.JFrame {

    Inicio inicio;
    Lista_vuelos lista_vuelos;
    Lista_ciudades lista_ciudades;
    Ciudad ciudad;

    public Modif_vuelo(Inicio inicio, Lista_vuelos lista_vuelos) {
        initComponents();
        setLocationRelativeTo(this);
        this.inicio = inicio;
        this.lista_vuelos = lista_vuelos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        modif_btn = new javax.swing.JButton();
        ver_lista_btn = new javax.swing.JButton();
        ir_inicio_btn = new javax.swing.JButton();
        NumVuelo_lbl = new javax.swing.JLabel();
        Aero_lbl = new javax.swing.JLabel();
        Costo_lbl = new javax.swing.JLabel();
        dur_field = new javax.swing.JTextField();
        numF_field = new javax.swing.JTextField();
        aero_field = new javax.swing.JTextField();
        Origen_lbl = new javax.swing.JLabel();
        price_field = new javax.swing.JTextField();
        Destino_lbl = new javax.swing.JLabel();
        Dur_lbl = new javax.swing.JLabel();
        cbox_origen = new javax.swing.JComboBox<>();
        cbox_destino = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Swis721 Lt BT", 1, 18)); // NOI18N
        jLabel1.setText("Modificar Vuelo");

        modif_btn.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        modif_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tatteo/img/conf.png"))); // NOI18N
        modif_btn.setText("Modificar");

        ver_lista_btn.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        ver_lista_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tatteo/img/list.png"))); // NOI18N
        ver_lista_btn.setText("Ver Lista ");
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

        NumVuelo_lbl.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        NumVuelo_lbl.setText("Numero de Vuelo");

        Aero_lbl.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        Aero_lbl.setText("Aerolínea");

        Costo_lbl.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        Costo_lbl.setText("Costo del Boleto");

        Origen_lbl.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        Origen_lbl.setText("Origen");

        Destino_lbl.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        Destino_lbl.setText("Destino");

        Dur_lbl.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        Dur_lbl.setText("Duración");

        cbox_origen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        cbox_origen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_origenActionPerformed(evt);
            }
        });

        cbox_destino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        cbox_destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_destinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(22, 22, 22)
                                                .addComponent(modif_btn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ver_lista_btn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ir_inicio_btn))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(Dur_lbl)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(dur_field))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(NumVuelo_lbl)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(numF_field, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(Aero_lbl)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(aero_field))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(Costo_lbl)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(price_field, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(Origen_lbl)
                                                                        .addComponent(Destino_lbl))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(cbox_origen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(cbox_destino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                .addGap(51, 51, 51)))
                                .addGap(18, 18, 18))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Origen_lbl)
                                        .addComponent(cbox_origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Destino_lbl)
                                        .addComponent(cbox_destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Dur_lbl)
                                        .addComponent(dur_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(NumVuelo_lbl)
                                        .addComponent(numF_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Aero_lbl)
                                        .addComponent(aero_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Costo_lbl)
                                        .addComponent(price_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(modif_btn)
                                        .addComponent(ver_lista_btn)
                                        .addComponent(ir_inicio_btn))
                                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbox_origenActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void cbox_destinoActionPerformed(java.awt.event.ActionEvent evt) {

    }

    //Campo de origen NO TOCAR
    private void ori_fieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void modif_btnActionPerformed(java.awt.event.ActionEvent evt) {

        // int fila = lista_vuelos.getTablaVuelos().getSelectedRow();
        int f = lista_vuelos.getFila();
        Ciudad c1=null, c2=null;


        int duracionV = Integer.parseInt(dur_field.getText());
        String numeroV = numF_field.getText();
        String aerolinea = aero_field.getText();
        int costoBoleto = Integer.parseInt(price_field.getText());

        lista_vuelos.getTablaVuelos().setValueAt(duracionV, f, 2);
        lista_vuelos.getTablaVuelos().setValueAt(numeroV, f, 3);
        lista_vuelos.getTablaVuelos().setValueAt(aerolinea, f, 4);
        lista_vuelos.getTablaVuelos().setValueAt(costoBoleto, f, 5);


        int item = 0;
        while (item < lista_ciudades.getGrafo().getCiudades().size()){
            if(lista_ciudades.getGrafo().getCiudades().get(item).getNombre().equals(cbox_origen.getSelectedItem()) ){
                c1= lista_ciudades.getGrafo().getCiudades().get(item);
            }else {
                item ++;
            }
        }

        item = 0;
        while (item < lista_ciudades.getGrafo().getCiudades().size()){
            if(lista_ciudades.getGrafo().getCiudades().get(item).getNombre().equals(cbox_destino.getSelectedItem()) ){
                c2 = lista_ciudades.getGrafo().getCiudades().get(item);
            }else {
                item ++;
            }
        }


        ciudad.getVuelos().get(f).setCosto(costoBoleto);
        ciudad.getVuelos().get(f).setDestino(c2);
        ciudad.getVuelos().get(f).setDuracion(duracionV);
        ciudad.getVuelos().get(f).setLineaA(aerolinea);
        ciudad.getVuelos().get(f).setNumV(numeroV);
        ciudad.getVuelos().get(f).setOrigen(c1);


        dur_field.setText(null);
        numF_field.setText(null);
        aero_field.setText(null);
        price_field.setText(null);

    }

    private void ir_inicio_btnActionPerformed(java.awt.event.ActionEvent evt) {
        inicio.setVisible(true);
        lista_vuelos.setVisible(false);
        this.setVisible(false);
    }

    private void ver_lista_btnActionPerformed(java.awt.event.ActionEvent evt) {
        lista_vuelos.setVisible(true);
        this.setVisible(false);
    }



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
    private javax.swing.JButton modif_btn;
    private javax.swing.JTextField numF_field;
    private javax.swing.JTextField price_field;
    private javax.swing.JButton ver_lista_btn;

}
