package com.mrojas.serpientes_escaleras.ventanas;

import com.mrojas.serpientes_escaleras.jugador.VectorJugador;

/**
 *
 * @author Manu
 */
public class VentanaReportes extends javax.swing.JFrame {

    private VectorJugador jugadores;
    public VentanaReportes(VectorJugador jugadores) {
        initComponents();
        this.jugadores = jugadores;
        setVisible(true);
        setLocationRelativeTo(null);
        actualizarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableJugador = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        botonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reportes");

        jPanel1.setPreferredSize(new java.awt.Dimension(530, 300));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jTableJugador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre y Apellido", "Partidas Jugadas", "Ganadas", "Perdidas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableJugador.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jScrollPane1.setViewportView(jTableJugador);
        if (jTableJugador.getColumnModel().getColumnCount() > 0) {
            jTableJugador.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableJugador.getColumnModel().getColumn(1).setPreferredWidth(220);
            jTableJugador.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTableJugador.getColumnModel().getColumn(3).setPreferredWidth(80);
            jTableJugador.getColumnModel().getColumn(4).setPreferredWidth(80);
        }

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel2.setPreferredSize(new java.awt.Dimension(200, 300));

        botonVolver.setFont(new java.awt.Font("Poppins Black", 0, 14)); // NOI18N
        botonVolver.setText("VOLVER");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(botonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.EAST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonVolverActionPerformed

    public void actualizarTabla() {
        Object[][] datos = new Object[jugadores.getSize()][5];

        for (int i = 0; i < jugadores.getSize(); i++) {
            datos[i][0] = jugadores.getJugador(i).getId();
            datos[i][1] = jugadores.getJugador(i);
            datos[i][2] = jugadores.getJugador(i).getPartiTotal();
            datos[i][3] = jugadores.getJugador(i).getPartiGanadas();
            datos[i][4] = jugadores.getJugador(i).getPartiPerdidas();
        }

        jTableJugador.setModel(new javax.swing.table.DefaultTableModel(
                datos,
                new String[]{
                    "ID", "Nombre y Apellido", "Partidas Jugadas", "Ganadas", "Perdidas"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonVolver;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableJugador;
    // End of variables declaration//GEN-END:variables
}
