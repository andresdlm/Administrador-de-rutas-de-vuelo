package tatteo.view;

import tatteo.Ciudad;
import tatteo.Repositorio;
import tatteo.Vuelo;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.IOException;

public class Inicio extends javax.swing.JFrame {

    
    Agg_archivo agg_archivo = new Agg_archivo(this);
    Lista_ciudades lista_ciudades = new Lista_ciudades(this);
    Agg_vuelo agg_vuelo = new Agg_vuelo(this, lista_ciudades.getGrafo());
    public DefaultTableModel defaultTableModel = new DefaultTableModel();
    Generar_plan generar_plan = new Generar_plan(this, lista_ciudades.getGrafo());

    Lista_vuelos lista_vuelos = new Lista_vuelos(this, agg_vuelo, lista_ciudades);

    public Inicio() {
        initComponents();
        setLocationRelativeTo(this);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaInicio = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        vuelos_btn = new javax.swing.JButton();
        ciudades_btn = new javax.swing.JButton();
        generarPlan_btn = new javax.swing.JButton();
        cargarArch_btn = new javax.swing.JButton();
        MenuInicio = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Swis721 Lt BT", 1, 18)); // NOI18N
        jLabel1.setText("Lista de Rutas Disponibles");

        tablaInicio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Origen", "Destino", "N de Vuelo", "Duracion"
            }
        ));
        jScrollPane1.setViewportView(tablaInicio);

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
        cargarArch_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarArch_btnActionPerformed(evt);
            }
        });
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

    private void vuelos_btnActionPerformed(java.awt.event.ActionEvent evt) {
        if(Repositorio.getUbicacionRepoCiudad() == null || Repositorio.getUbicacionRepoRutas() == null || Repositorio.getUbicacionRepoVuelos() == null){
            JOptionPane.showMessageDialog(null, "Debe indicar la direccion de los repositorios");
        }else{
            lista_vuelos.setVisible(true);
            this.setVisible(false);
        }
    }

    private void ciudades_btnActionPerformed(java.awt.event.ActionEvent evt)  {
        if(Repositorio.getUbicacionRepoCiudad() == null || Repositorio.getUbicacionRepoRutas() == null || Repositorio.getUbicacionRepoVuelos() == null){
            JOptionPane.showMessageDialog(null, "Debe indicar la direccion de los repositorios");
        }else{
            lista_ciudades.setVisible(true);
            this.setVisible(false);
        }
    }

    public void cargar_ciudades() throws IOException {

        Repositorio repositorio = new Repositorio();

        for(int i = 0; i < repositorio.lineas_sin_null(repositorio.getRepo_ciudad()); i++){
            repositorio.leerRepositorio(repositorio.getRepo_ciudad(), repositorio.getLineaCiudad());
            Ciudad ciudad = new Ciudad(repositorio.getCiudad(i),repositorio.getAeropuerto(i),repositorio.getPais(i));
            lista_ciudades.grafo.addCiudad(ciudad);
            lista_ciudades.defaultTableModel = (DefaultTableModel) lista_ciudades.getTablaCiudades().getModel();
            String [ ] agregar = new String [3];
            agregar[0] = ciudad.getNombre();
            agregar[1] = ciudad.getAeropuerto();
            agregar[2] = ciudad.getPais();
            lista_ciudades.defaultTableModel.addRow(agregar);
        }
    }

    public void cargar_vuelos() throws IOException {
        Repositorio repositorio = new Repositorio();
        repositorio.leerRepositorio(repositorio.getRepo_vuelos(), repositorio.getLineaVuelo());
        repositorio.leerRepositorio(repositorio.getRepo_rutas(),repositorio.getLineaRuta());
        lista_vuelos.defaultTableModel = (DefaultTableModel) lista_vuelos.getTablaVuelos().getModel();
        this.defaultTableModel = (DefaultTableModel) this.tablaInicio.getModel();
        int aux1, aux2;
        Vuelo vuelo;
        Ciudad ciudadOrigen = null, ciudadDestino = null;

        for(int i = 0; i < repositorio.lineas_sin_null(repositorio.getRepo_vuelos()); i++) {
            String[] agregar = new String[4];
            agregar[0] = repositorio.getOrigen(i);
            agregar[1] = repositorio.getDestino(i);
            agregar[2] = String.valueOf(repositorio.getNumeroVuelo(i));
            agregar[3] = String.valueOf(repositorio.getDuracionVuelo(i));
            this.defaultTableModel.addRow(agregar);
            String[] agregar2 = new String[6];
            agregar2[0] = repositorio.getOrigen(i);
            agregar2[1] = repositorio.getDestino(i);
            agregar2[2] = String.valueOf(repositorio.getDuracionVuelo(i));
            agregar2[3] = String.valueOf(repositorio.getNumeroVuelo(i));
            agregar2[4] = repositorio.getAerolinea(i);
            agregar2[5] = String.valueOf(repositorio.getCostoVuelo(i));
            int k;
            String auxNombre;
            lista_vuelos.defaultTableModel.addRow(agregar2);
            for(int j = 0; j<lista_ciudades.grafo.getCiudades().size();j++){
                auxNombre = lista_ciudades.grafo.ciudades.get(j).getNombre();

                if(auxNombre.equals(agregar[0])){
                    ciudadOrigen = lista_ciudades.grafo.ciudades.get(j);
                }
                if(auxNombre.equals(agregar[1])) {
                    ciudadDestino = lista_ciudades.grafo.ciudades.get(j);
                }
            }
            vuelo = new Vuelo(ciudadOrigen,ciudadDestino,repositorio.getDuracionVuelo(i),repositorio.getCostoVuelo(i),agregar[2],agregar2[4]);
            if(lista_ciudades.grafo.getCiudades().get(0) != null){
                lista_ciudades.grafo.getCiudades().get(0).addVuelo(vuelo);
            }
        }
    }


    private void generarPlan_btnActionPerformed(java.awt.event.ActionEvent evt) {
        
        generar_plan.setVisible(true);
        this.setVisible(false);
    }

    private void cargarArch_btnActionPerformed(java.awt.event.ActionEvent evt) {
        agg_archivo.setVisible(true);
        this.setVisible(false);
    }


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
                Inicio inicio = new Inicio();
                inicio.setVisible(true);

            }
        });
    }

    private javax.swing.JMenuBar MenuInicio;
    private javax.swing.JButton cargarArch_btn;
    private javax.swing.JButton ciudades_btn;
    private javax.swing.JButton generarPlan_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablaInicio;
    private javax.swing.JButton vuelos_btn;

}
