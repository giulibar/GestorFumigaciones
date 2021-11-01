package interfaz;

import dominio.*;
import java.util.*;
import javax.swing.*;

public class VentanaProducto extends javax.swing.JFrame implements Observer {

    public VentanaProducto(Sistema sistema) {
        initComponents();
        modelo = sistema;
        sistema.addObserver(this);
        this.lstProductos.setListData(modelo.getListaProductos().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstProductos = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        optNacional = new javax.swing.JRadioButton();
        optImportado = new javax.swing.JRadioButton();
        spnCosto = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("NOMBRE");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 70, 30));

        btnRegistrar.setBackground(new java.awt.Color(255, 51, 51));
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setBorder(null);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 250, 40));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 250, 10));

        txtNombre.setBorder(null);
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 250, 30));

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("COSTO");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 70, 30));

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("ORIGEN");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 70, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("ALTA DE PRODUCTO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, -1));

        lstProductos.setBackground(new java.awt.Color(242, 242, 242));
        jScrollPane1.setViewportView(lstProductos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 360, 340));

        jLabel1.setBackground(new java.awt.Color(244, 244, 244));
        jLabel1.setForeground(new java.awt.Color(181, 181, 181));
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 420, 460));

        buttonGroup1.add(optNacional);
        optNacional.setSelected(true);
        optNacional.setText("Nacional");
        jPanel2.add(optNacional, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 90, -1));

        buttonGroup1.add(optImportado);
        optImportado.setText("Importado");
        jPanel2.add(optImportado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 80, -1));
        jPanel2.add(spnCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 170, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String nombre = this.txtNombre.getText();
        int costo = (Integer) this.spnCosto.getValue();
        int origen = 0;
        if (optNacional.isSelected()) {
            origen = 1;
        } else if (optImportado.isSelected()) {
            origen = 2;
        }
        if (nombre.equals("") || costo < 0 || origen == 0) {
            if (nombre.equals("")) {
                JOptionPane.showMessageDialog(this, "No ingresaste el nombre del producto.", "No ha sido posible!", JOptionPane.ERROR_MESSAGE);
            }
            if(costo < 0){
                this.spnCosto.setValue(0);
                JOptionPane.showMessageDialog(this, "No existe costo negativo de un producto.", "No ha sido posible!", JOptionPane.ERROR_MESSAGE);
            }
            if (origen == 0) {
                JOptionPane.showMessageDialog(this, "No elegiste opcion de origen.", "No ha sido posible!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            Producto producto = new Producto(nombre, costo, origen);
            modelo.agregarProducto(producto);
            modelo.ordenarListaProductos();
            cargarListaProductos();
            this.txtNombre.setText(null);
            this.spnCosto.setValue(0);
            this.optNacional.setSelected(false);
            this.optImportado.setSelected(false);
        }


    }//GEN-LAST:event_btnRegistrarActionPerformed

    public void cargarListaProductos() {
        this.lstProductos.setListData(modelo.getListaProductos().toArray());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList lstProductos;
    private javax.swing.JRadioButton optImportado;
    private javax.swing.JRadioButton optNacional;
    private javax.swing.JSpinner spnCosto;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;

    @Override
    public void update(Observable o, Object arg) {
        modelo.ordenarListaProductos();
        cargarListaProductos();
    }

}
