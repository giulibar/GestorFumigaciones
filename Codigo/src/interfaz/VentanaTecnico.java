package interfaz;

import dominio.*;
import java.util.*;
import javax.swing.*;

public class VentanaTecnico extends javax.swing.JFrame implements Observer {

    public VentanaTecnico(Sistema sistema) {
        initComponents();
        modelo = sistema;
        sistema.addObserver(this);
        this.lstTecnicos.setListData(modelo.getListaTecnicos().toArray());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtMail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTecnicos = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
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
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 280, 40));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 280, 10));

        txtNombre.setBorder(null);
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 280, 30));

        txtCedula.setBorder(null);
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 280, 30));

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("CÉDULA");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 70, 30));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 280, 10));

        txtMail.setBorder(null);
        jPanel2.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 280, 30));

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("DIRECCIÓN");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 70, 30));

        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 280, 10));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("ALTA DE TÉCNICO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, -1));

        lstTecnicos.setBackground(new java.awt.Color(242, 242, 242));
        jScrollPane1.setViewportView(lstTecnicos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 37, 360, 390));

        jLabel1.setBackground(new java.awt.Color(244, 244, 244));
        jLabel1.setForeground(new java.awt.Color(181, 181, 181));
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 420, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        String cedula = this.txtCedula.getText();
        String mail = this.txtMail.getText();
        if (nombre.equals("") || mail.equals("") || cedula.equals("")) {
            if (nombre.equals("")) {
                JOptionPane.showMessageDialog(this, "No ingresaste el nombre del tecnico.", "No ha sido posible!", JOptionPane.ERROR_MESSAGE);
            }
            if (cedula.equals("")) {
                JOptionPane.showMessageDialog(this, "No ingresaste cedula del piloto.", "No ha sido posible!", JOptionPane.ERROR_MESSAGE);
            }
            if (mail.equals("")){
                JOptionPane.showMessageDialog(this, "No ingresaste la direccion del tecnico.", "No ha sido posible!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            if (modelo.seRepiteCedula(cedula)) {
                JOptionPane.showMessageDialog(this, "Esa cádula ya está en uso.", "No ha sido posible!", JOptionPane.ERROR_MESSAGE);
                this.txtCedula.setText(null);
            } else {
                Tecnico tecnico = new Tecnico(nombre, cedula, mail);
                modelo.agregarTecnico(tecnico);
                modelo.ordenarListaTecnicos();
                cargarListaTecnicos();
                //JOptionPane.showMessageDialog(this, "El tecnico se agregó correctamente.", "Ha sido posible!", JOptionPane.INFORMATION_MESSAGE);
                this.txtNombre.setText(null);
                this.txtCedula.setText(null);
                this.txtMail.setText(null);
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    public void cargarListaTecnicos() {
        this.lstTecnicos.setListData(modelo.getListaTecnicos().toArray());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JList lstTecnicos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;

    @Override
    public void update(Observable o, Object arg) {
        modelo.ordenarListaTecnicos();
        cargarListaTecnicos();
    }
}
