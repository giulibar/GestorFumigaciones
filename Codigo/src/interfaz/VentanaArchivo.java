package interfaz;

import dominio.*;
import javax.swing.JOptionPane;
import obligatorio2.*;

public class VentanaArchivo extends javax.swing.JFrame {

    public VentanaArchivo(Sistema sistema) {
        initComponents();
        modelo = sistema;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();
        btnCargar = new javax.swing.JButton();
        spnDia = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Dia:");

        jFileChooser1.setForeground(new java.awt.Color(255, 255, 255));
        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        btnCargar.setBackground(new java.awt.Color(255, 51, 51));
        btnCargar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCargar.setText("Cargar ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addComponent(jFileChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCargar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(spnDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        // leer el txt e ir leyendo los archivos
        // las q estan bien las carga
        String nombreArchivo = jFileChooser1.getSelectedFile().getAbsolutePath();
        ArchivoLectura archL = new ArchivoLectura(nombreArchivo);
        ArchivoGrabacion archG = new ArchivoGrabacion("errores.txt");
        archL.hayMasLineas();
        int dia = (int) spnDia.getValue();
        String primerLinea = archL.linea();
        boolean primeraLineaBien = true;
        Piloto pilotoDeLaFum = null;
        Tecnico tecnicoDeLaFum = null;
        Producto productoDeLaFum = null;
        String datosIniciales[] = primerLinea.split("#");
        if (datosIniciales.length == 3 && (dia >= 1 && dia <= 31)) {
            for (int i = 0; i < datosIniciales.length; i++) {
                if (datosIniciales[i].equals("")) {
                    primeraLineaBien = false;
                }
            }
            if (primeraLineaBien) {
                for (Piloto unPiloto : modelo.getListaPilotos()) {
                    if (unPiloto.getCedula().equals(datosIniciales[0])) {
                        pilotoDeLaFum = unPiloto;
                    }
                }
                for (Tecnico unTecnico : modelo.getListaTecnicos()) {
                    if (unTecnico.getCedula().equals(datosIniciales[1])) {
                        tecnicoDeLaFum = unTecnico;
                    }
                }
                for (Producto unProducto : modelo.getListaProductos()) {
                    if (unProducto.getNombre().equals(datosIniciales[2])) {
                        productoDeLaFum = unProducto;
                    }
                }
                if (pilotoDeLaFum == null || tecnicoDeLaFum == null || productoDeLaFum == null) {
                    JOptionPane.showMessageDialog(this, "No se encontro alguno de los datos en las listas", "No ha sido posible!", JOptionPane.ERROR_MESSAGE);
                } else {
                    while (archL.hayMasLineas()) {
                        String zona = archL.linea();
                        if (modelo.verificarZonaYAgregarFumigacion(pilotoDeLaFum, tecnicoDeLaFum, productoDeLaFum, zona, dia)) {
                            // se verifica la zona y se agrega a la consulta
                        } else {
                            // la zona esta mal, la grabo en el archivo arrores.txt
                            archG.grabarLinea(zona);
                        }
                    }
                    Fumigacion fumigacion = new Fumigacion();
                    fumigacion.setPiloto(pilotoDeLaFum);
                    fumigacion.setTecnico(tecnicoDeLaFum);
                    fumigacion.setProducto(productoDeLaFum);
                    fumigacion.setDia(dia);
                    fumigacion.setZona(ERROR, ERROR, ERROR, ERROR);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La primera linea esta mal", "No ha sido posible!", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            if (datosIniciales.length != 3) {
                JOptionPane.showMessageDialog(this, "La primera linea esta mal", "No ha sido posible!", JOptionPane.ERROR_MESSAGE);
            }
            if (dia >= 1 && dia <= 31) {
                JOptionPane.showMessageDialog(this, "Dia fuera de rango", "No ha sido posible!", JOptionPane.ERROR_MESSAGE);
            }
        }
        archL.cerrar();
        archG.cerrar();
        // las q estan mal las grabo en otro txt errores.txt
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner spnDia;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;
}
