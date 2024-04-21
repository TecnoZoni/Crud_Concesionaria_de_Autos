package com.mycompany.autovilescrud.igu;

import com.mycompany.autovilescrud.logica.Controladora;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class DashBoard extends javax.swing.JFrame {

    Controladora control = new Controladora();
    Mensaje mensaje = new Mensaje();

    public DashBoard() {
        initComponents();

        AltaVehiculo panel = new AltaVehiculo(control, mensaje);
        pintarPanel(panel);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFondo = new javax.swing.JPanel();
        pMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAlta = new javax.swing.JButton();
        btnModificacion = new javax.swing.JButton();
        btnEliminacion = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        pPaneles = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setResizable(false);

        pFondo.setBackground(new java.awt.Color(255, 255, 255));
        pFondo.setMinimumSize(new java.awt.Dimension(1000, 650));

        pMenu.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Concesionaria Nitsuga");

        btnAlta.setBackground(new java.awt.Color(255, 255, 254));
        btnAlta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAlta.setText("Alta de Vehiculo");
        btnAlta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        btnModificacion.setBackground(new java.awt.Color(255, 255, 254));
        btnModificacion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnModificacion.setText("Modificacion de Vehiculos");
        btnModificacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificacionActionPerformed(evt);
            }
        });

        btnEliminacion.setBackground(new java.awt.Color(255, 255, 254));
        btnEliminacion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminacion.setText("Eliminacion de Vehiculos");
        btnEliminacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminacionActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 255, 254));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pMenuLayout = new javax.swing.GroupLayout(pMenu);
        pMenu.setLayout(pMenuLayout);
        pMenuLayout.setHorizontalGroup(
            pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMenuLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(23, 23, 23))
            .addGroup(pMenuLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btnModificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnEliminacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pMenuLayout.setVerticalGroup(
            pMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(42, 42, 42)
                .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminacion, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        pPaneles.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pPanelesLayout = new javax.swing.GroupLayout(pPaneles);
        pPaneles.setLayout(pPanelesLayout);
        pPanelesLayout.setHorizontalGroup(
            pPanelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 686, Short.MAX_VALUE)
        );
        pPanelesLayout.setVerticalGroup(
            pPanelesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pFondoLayout = new javax.swing.GroupLayout(pFondo);
        pFondo.setLayout(pFondoLayout);
        pFondoLayout.setHorizontalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pFondoLayout.createSequentialGroup()
                .addComponent(pMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pPaneles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pFondoLayout.setVerticalGroup(
            pFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pPaneles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
        AltaVehiculo panel = new AltaVehiculo(control, mensaje);
        pintarPanel(panel);
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificacionActionPerformed
        ModiVehiculo panel = new ModiVehiculo(control, mensaje);
        pintarPanel(panel);
    }//GEN-LAST:event_btnModificacionActionPerformed

    private void btnEliminacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminacionActionPerformed
        EliminarVehiculo panel = new EliminarVehiculo(control, mensaje);
        pintarPanel(panel);
    }//GEN-LAST:event_btnEliminacionActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnEliminacion;
    private javax.swing.JButton btnModificacion;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pFondo;
    private javax.swing.JPanel pMenu;
    private javax.swing.JPanel pPaneles;
    // End of variables declaration//GEN-END:variables

    private void pintarPanel(JPanel p) {
        p.setSize(694, 666);
        p.setLocation(0, 0);

        pPaneles.removeAll();
        pPaneles.add(p, BorderLayout.CENTER);
        pPaneles.revalidate();
        pPaneles.repaint();
    }
}
