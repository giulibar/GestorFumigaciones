package interfaz;

import dominio.*;
import java.util.*;
import javax.swing.*;

public class VentanaFumigacion extends javax.swing.JFrame implements Observer {

    public VentanaFumigacion(Sistema sistema) {
        initComponents();
        modelo = sistema;
        modelo.addObserver(this);
        this.lstPilotos.setListData(modelo.getListaPilotos().toArray());
        this.lstTecnicos.setListData(modelo.getListaTecnicos().toArray());
        this.lstProductos.setListData(modelo.getListaProductos().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        spnDia = new javax.swing.JSpinner();
        btnRegistrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtZona = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstPilotos = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstProductos = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstTecnicos = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("DÍA ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 30, 30));

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("ZONA FUMIGADA");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 120, 30));
        jPanel2.add(spnDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 430, 80, 30));

        btnRegistrar.setBackground(new java.awt.Color(255, 51, 51));
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setBorder(null);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 170, 40));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, 170, 10));

        txtZona.setBorder(null);
        jPanel2.add(txtZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 430, 170, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("REGISTRO DE FUMIGACION INDIVIDUAL");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 290, -1));

        lstPilotos.setBackground(new java.awt.Color(242, 242, 242));
        jScrollPane3.setViewportView(lstPilotos);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, 290));

        lstProductos.setBackground(new java.awt.Color(242, 242, 242));
        jScrollPane4.setViewportView(lstProductos);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, 250, 290));

        lstTecnicos.setBackground(new java.awt.Color(242, 242, 242));
        jScrollPane5.setViewportView(lstTecnicos);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 250, 290));

        jLabel3.setText("Lista de productos:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, -1, -1));

        jLabel4.setText("Lista de pilotos:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel7.setText("Lista de tecnicos:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jLabel1.setBackground(new java.awt.Color(244, 244, 244));
        jLabel1.setForeground(new java.awt.Color(181, 181, 181));
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 830, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        int dia = (Integer) this.spnDia.getValue();
        Piloto piloto = (Piloto) this.lstPilotos.getSelectedValue();
        Tecnico tecnico = (Tecnico) this.lstTecnicos.getSelectedValue();
        Producto producto = (Producto) this.lstProductos.getSelectedValue();
        this.lstPilotos.setSelectedValue(piloto, true);
        this.lstTecnicos.setSelectedValue(tecnico, true);
        this.lstProductos.setSelectedValue(producto, true);
        if (this.lstPilotos.getSelectedIndex() >= 0 && this.lstTecnicos.getSelectedIndex() >= 0 && this.lstProductos.getSelectedIndex() >= 0) {
            String datos = txtZona.getText();
            modelo.verificarZonaYAgregarFumigacion(piloto, tecnico, producto, datos, dia);
            txtZona.setText("");
        } else {
            if (!(this.lstPilotos.getSelectedIndex() >= 0)) {
                JOptionPane.showMessageDialog(this, "No se selecciono ningun piloto!", "No ha sido posible!", JOptionPane.ERROR_MESSAGE);
            }
            if (!(this.lstTecnicos.getSelectedIndex() >= 0)) {
                JOptionPane.showMessageDialog(this, "No se selecciono ningun tecnico!", "No ha sido posible!", JOptionPane.ERROR_MESSAGE);
            }
            if (!(this.lstProductos.getSelectedIndex() >= 0)) {
                JOptionPane.showMessageDialog(this, "No se selecciono ningun producto!", "No ha sido posible!", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    public void cargarListas() {
        this.lstPilotos.setListData(modelo.getListaPilotos().toArray());
        this.lstTecnicos.setListData(modelo.getListaTecnicos().toArray());
        this.lstProductos.setListData(modelo.getListaProductos().toArray());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList lstPilotos;
    private javax.swing.JList lstProductos;
    private javax.swing.JList lstTecnicos;
    private javax.swing.JSpinner spnDia;
    private javax.swing.JTextField txtZona;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;

    @Override
    public void update(Observable o, Object arg) {
        cargarListas();
    }
}
