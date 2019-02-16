package tatteo.view;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import tatteo.Ciudad;
import tatteo.Grafo;
import tatteo.Repositorio;

import java.awt.event.ActionEvent;


public class Lista_ciudades extends javax.swing.JFrame {


    public DefaultTableModel defaultTableModel = new DefaultTableModel();
    Inicio inicio;
    Agg_vuelo agg_vuelo;
    
    public Lista_ciudades(Inicio inicio) {
        initComponents();
        setLocationRelativeTo(this);
        this.inicio = inicio;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ir_inicio_btn = new javax.swing.JButton();
        AddCiu_lbl = new javax.swing.JLabel();
        NombCiu_fieldl = new javax.swing.JTextField();
        NombCiu_lbl = new javax.swing.JLabel();
        AeroCiu_field = new javax.swing.JTextField();
        AeroCiu_lbl = new javax.swing.JLabel();
        PaisCiu_field = new javax.swing.JTextField();
        PaisCiu_lbl = new javax.swing.JLabel();
        AddListCiu_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCiudades = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Swis721 Lt BT", 1, 18)); // NOI18N
        jLabel1.setText("Lista de Ciudades Disponibles");

        ir_inicio_btn.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        ir_inicio_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tatteo/img/home.png"))); // NOI18N
        ir_inicio_btn.setText("Inicio");
        ir_inicio_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ir_inicio_btnActionPerformed(evt);
            }
        });

        AddCiu_lbl.setFont(new java.awt.Font("Swis721 Lt BT", 1, 18)); // NOI18N
        AddCiu_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tatteo/img/add.png"))); // NOI18N
        AddCiu_lbl.setText("Agregar Nueva Ciudad");

        NombCiu_fieldl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombCiu_fieldlActionPerformed(evt);
            }
        });

        NombCiu_lbl.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        NombCiu_lbl.setText("Nombre");

        AeroCiu_lbl.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        AeroCiu_lbl.setText("Aeropuerto");

        PaisCiu_lbl.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        PaisCiu_lbl.setText("País");

        AddListCiu_btn.setFont(new java.awt.Font("Swis721 Lt BT", 1, 14)); // NOI18N
        AddListCiu_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tatteo/img/menu.png"))); // NOI18N
        AddListCiu_btn.setText("Añadir a la Lista");
        AddListCiu_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddListCiu_btnActionPerformed(evt);
            }
        });

        tablaCiudades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Aeropuerto", "País"
            }
        ));
        jScrollPane1.setViewportView(tablaCiudades);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddListCiu_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ir_inicio_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(NombCiu_lbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(NombCiu_fieldl, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(AeroCiu_lbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(AeroCiu_field))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(PaisCiu_lbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(PaisCiu_field)))
                            .addComponent(AddCiu_lbl)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(AddCiu_lbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombCiu_fieldl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombCiu_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AeroCiu_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AeroCiu_lbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PaisCiu_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PaisCiu_lbl))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddListCiu_btn)
                    .addComponent(ir_inicio_btn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ir_inicio_btnActionPerformed(java.awt.event.ActionEvent evt) {                                              
        inicio.setVisible(true);
        this.setVisible(false);
    }

    public Grafo grafo = new Grafo ();
     

    public Grafo getGrafo() {
        return grafo;
    }


    
    private void AddListCiu_btnActionPerformed(ActionEvent evt) {
        agg_vuelo = inicio.agg_vuelo;
        String name = NombCiu_fieldl.getText();
        String airport = AeroCiu_field.getText();
        String country = PaisCiu_field.getText();
        Ciudad ciudad = new Ciudad(name, airport, country);
        grafo.addCiudad(ciudad);
        Repositorio repositorio = new Repositorio();
        repositorio.IngresarDatos(name, airport, country);

        defaultTableModel = (DefaultTableModel) tablaCiudades.getModel();
        String [ ] agregar = new String [3];
        agregar[0] = ciudad.getNombre();
        agregar[1] = ciudad.getAeropuerto();
        agregar[2] = ciudad.getPais();
        defaultTableModel.addRow(agregar);
        agg_vuelo.cbox_origen.addItem(agregar[0]);
    }

    private void NombCiu_fieldlActionPerformed(java.awt.event.ActionEvent evt) {                                               


    }

    public JTable getTablaCiudades() {
        return tablaCiudades;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddCiu_lbl;
    private javax.swing.JButton AddListCiu_btn;
    private javax.swing.JTextField AeroCiu_field;
    private javax.swing.JLabel AeroCiu_lbl;
    private javax.swing.JTextField NombCiu_fieldl;
    private javax.swing.JLabel NombCiu_lbl;
    private javax.swing.JTextField PaisCiu_field;
    private javax.swing.JLabel PaisCiu_lbl;
    private javax.swing.JButton ir_inicio_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCiudades;
    // End of variables declaration//GEN-END:variables
}
