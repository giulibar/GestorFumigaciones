package interfaz;

import dominio.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VentanaMenu extends javax.swing.JFrame {

    public VentanaMenu(Sistema sistema) {
        initComponents();
        modelo = sistema;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        btnPiloto = new javax.swing.JButton();
        btnTecnico = new javax.swing.JButton();
        btnProducto = new javax.swing.JButton();
        btnFumArchivo = new javax.swing.JButton();
        btnFumigacion = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPiloto.setBackground(new java.awt.Color(153, 153, 153));
        btnPiloto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPiloto.setForeground(new java.awt.Color(255, 255, 255));
        btnPiloto.setText("Alta Piloto");
        btnPiloto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilotoActionPerformed(evt);
            }
        });
        jPanel1.add(btnPiloto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, 50));

        btnTecnico.setBackground(new java.awt.Color(153, 153, 153));
        btnTecnico.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnTecnico.setForeground(new java.awt.Color(255, 255, 255));
        btnTecnico.setText("Alta Técnico");
        btnTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTecnicoActionPerformed(evt);
            }
        });
        jPanel1.add(btnTecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 120, 50));

        btnProducto.setBackground(new java.awt.Color(153, 153, 153));
        btnProducto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnProducto.setText("Alta Producto");
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 130, 50));

        btnFumArchivo.setBackground(new java.awt.Color(153, 153, 153));
        btnFumArchivo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnFumArchivo.setForeground(new java.awt.Color(255, 255, 255));
        btnFumArchivo.setText("Cargar fumigaciones desde archivo");
        btnFumArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFumacionArchivoActionPerformed(evt);
            }
        });
        jPanel1.add(btnFumArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 400, 50));

        btnFumigacion.setBackground(new java.awt.Color(153, 153, 153));
        btnFumigacion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnFumigacion.setForeground(new java.awt.Color(255, 255, 255));
        btnFumigacion.setText("Cargar fumigación individual");
        btnFumigacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFumigacionIndividualActionPerformed(evt);
            }
        });
        jPanel1.add(btnFumigacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 400, 50));

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 130, 50));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Consulta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 250, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 350));
        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTecnicoActionPerformed
        VentanaTecnico vent = new VentanaTecnico(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_btnTecnicoActionPerformed

    private void btnFumacionArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFumacionArchivoActionPerformed
        VentanaArchivo vent = new VentanaArchivo(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_btnFumacionArchivoActionPerformed

    private void btnPilotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilotoActionPerformed
        VentanaPiloto vent = new VentanaPiloto(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_btnPilotoActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        VentanaProducto vent = new VentanaProducto(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnFumigacionIndividualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFumigacionIndividualActionPerformed
        if (modelo.getListaPilotos().size() > 0 && modelo.getListaTecnicos().size() > 0 && modelo.getListaProductos().size() > 0) {
            VentanaFumigacion vent = new VentanaFumigacion(modelo);
            vent.setVisible(true);
        } else {
            if (!(modelo.getListaPilotos().size() > 0)) {
                JOptionPane.showMessageDialog(this, "No se creo un piloto todavia!", "No ha sido posible!", JOptionPane.ERROR_MESSAGE);
            }
            if (!(modelo.getListaTecnicos().size() > 0)) {
                JOptionPane.showMessageDialog(this, "No se creo un tecnico todavia!", "No ha sido posible!", JOptionPane.ERROR_MESSAGE);
            }
            if (!(modelo.getListaProductos().size() > 0)) {
                JOptionPane.showMessageDialog(this, "No se creo un producto todavia!", "No ha sido posible!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnFumigacionIndividualActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        try {
            grabar();
        } catch (IOException ex) {
            Logger.getLogger(VentanaMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    public void grabar() throws IOException {
        FileOutputStream archivo = new FileOutputStream("Datos");
        ObjectOutputStream datos = new ObjectOutputStream(archivo);
        datos.writeObject(modelo);

        datos.close();
        
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentanaConsulta vent = new VentanaConsulta(modelo);
        vent.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFumArchivo;
    private javax.swing.JButton btnFumigacion;
    private javax.swing.JButton btnPiloto;
    private javax.swing.JButton btnProducto;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTecnico;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
}
