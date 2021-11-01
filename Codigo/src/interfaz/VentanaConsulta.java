package interfaz;

import dominio.*;
import java.util.*;
import javax.swing.*;

public class VentanaConsulta extends javax.swing.JFrame implements Observer {

    public VentanaConsulta(Sistema sistema) {
        initComponents();
        modelo = sistema;
        modelo.addObserver(this);
        cargarListas();
        rellenarMatriz();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstProductos = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstDias = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setMaximumSize(new java.awt.Dimension(2300, 2000));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(300, 300));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(1200, 1000));

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 600));
        jPanel1.setMinimumSize(new java.awt.Dimension(300, 300));
        jPanel1.setLayout(new java.awt.GridLayout(16, 50));
        jScrollPane2.setViewportView(jPanel1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 720, 440));

        jPanel3.setLayout(new java.awt.GridLayout(16, 1));

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("A");
        jLabel1.setOpaque(true);
        jPanel3.add(jLabel1);

        jLabel2.setBackground(new java.awt.Color(255, 153, 153));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("B");
        jLabel2.setOpaque(true);
        jPanel3.add(jLabel2);

        jLabel3.setBackground(new java.awt.Color(255, 153, 153));
        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("C");
        jLabel3.setOpaque(true);
        jPanel3.add(jLabel3);

        jLabel4.setBackground(new java.awt.Color(255, 153, 153));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("D");
        jLabel4.setOpaque(true);
        jPanel3.add(jLabel4);

        jLabel5.setBackground(new java.awt.Color(255, 153, 153));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("E");
        jLabel5.setOpaque(true);
        jPanel3.add(jLabel5);

        jLabel6.setBackground(new java.awt.Color(255, 153, 153));
        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("F");
        jLabel6.setOpaque(true);
        jPanel3.add(jLabel6);

        jLabel7.setBackground(new java.awt.Color(255, 153, 153));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("G");
        jLabel7.setOpaque(true);
        jPanel3.add(jLabel7);

        jLabel8.setBackground(new java.awt.Color(255, 153, 153));
        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("H");
        jLabel8.setOpaque(true);
        jPanel3.add(jLabel8);

        jLabel9.setBackground(new java.awt.Color(255, 153, 153));
        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("I");
        jLabel9.setOpaque(true);
        jPanel3.add(jLabel9);

        jLabel10.setBackground(new java.awt.Color(255, 153, 153));
        jLabel10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("J");
        jLabel10.setOpaque(true);
        jPanel3.add(jLabel10);

        jLabel11.setBackground(new java.awt.Color(255, 153, 153));
        jLabel11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("K");
        jLabel11.setOpaque(true);
        jPanel3.add(jLabel11);

        jLabel12.setBackground(new java.awt.Color(255, 153, 153));
        jLabel12.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("L");
        jLabel12.setOpaque(true);
        jPanel3.add(jLabel12);

        jLabel13.setBackground(new java.awt.Color(255, 153, 153));
        jLabel13.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("M");
        jLabel13.setOpaque(true);
        jPanel3.add(jLabel13);

        jLabel14.setBackground(new java.awt.Color(255, 153, 153));
        jLabel14.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("N");
        jLabel14.setOpaque(true);
        jPanel3.add(jLabel14);

        jLabel15.setBackground(new java.awt.Color(255, 153, 153));
        jLabel15.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("O");
        jLabel15.setOpaque(true);
        jPanel3.add(jLabel15);

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 40, 430));

        btnConsultar.setBackground(new java.awt.Color(255, 51, 51));
        btnConsultar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel2.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, 170, 40));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Dia:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Producto:");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setText("FILTRAR");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, -1, -1));

        lstProductos.setFocusCycleRoot(true);
        jScrollPane4.setViewportView(lstProductos);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 170, 120));

        jScrollPane5.setViewportView(lstDias);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 260, 170, 120));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 980, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String nombreProducto = "";
        int dia = 0;

        if (this.lstProductos.getSelectedIndex() != -1 && !this.lstProductos.getSelectedValue().equals("Todos")) {
            nombreProducto = (String) this.lstProductos.getSelectedValue();
        }
        if (this.lstDias.getSelectedIndex() != -1 && !this.lstDias.getSelectedValue().equals("Todos")) {
            dia = Integer.parseInt(this.lstDias.getSelectedValue().toString());
        }
        if (this.lstProductos.getSelectedIndex() == -1 || this.lstProductos.getSelectedValue().equals("Todos")) {
            nombreProducto = "todos";
        }
        if (this.lstDias.getSelectedIndex() == -1 || this.lstDias.getSelectedValue().equals("Todos")) {
            dia = 0;
        }
        if (nombreProducto.equals("todos") && dia == 0) {
            rellenarMatriz();
        } else {
            cargarFiltro(nombreProducto, dia);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    public void rellenarMatriz() {
        jPanel1.removeAll();
        int[][] mat = modelo.getMatriz();
        int cont = 1;
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 50; j++) {
                if (i == 0) {
                    JLabel label = new JLabel("" + cont);
                    label.setPreferredSize(new java.awt.Dimension(70, 16));
                    label.setBackground(new java.awt.Color(255, 153, 153));
                    label.setFont(new java.awt.Font("Dialog", 0, 12));
                    label.setForeground(new java.awt.Color(0, 0, 0));
                    label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    label.setOpaque(true);
                    jPanel1.add(label);
                    cont++;
                } else {
                    int num = mat[i - 1][j];
                    int color = modelo.color(num);
                    JLabel label = new JLabel("" + num);
                    label.setPreferredSize(new java.awt.Dimension(70, 16));
                    label.setBackground(new java.awt.Color(255, color, color));
                    label.setFont(new java.awt.Font("Dialog", 0, 12));
                    label.setForeground(new java.awt.Color(255, 255, 255));
                    label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    label.setOpaque(true);
                    jPanel1.add(label);
                }
            }
        }
    }
    
    public void cargarListas() {
        ArrayList<String> listaNombresProductos = new ArrayList<>();
        ArrayList<String> listaDiasFumigaciones = new ArrayList<>();
        if (!(listaNombresProductos.contains("Todos") && listaDiasFumigaciones.contains("Todos"))) {
            listaNombresProductos.add("Todos");
            listaDiasFumigaciones.add("Todos");
        }
        //carga los nombre de productos a la lista de filtros
        for (int i = 0; i < modelo.getListaProductos().size(); i++) {
            if (!listaNombresProductos.contains(modelo.getListaProductos().get(i))) {
                listaNombresProductos.add(modelo.getListaProductos().get(i).getNombre());
            }
        }
        // carga los dias a la lista de filtros
        for (int i = 0; i < modelo.getListaFumigaciones().size(); i++) {
            if (!listaDiasFumigaciones.contains("" + modelo.getListaFumigaciones().get(i).getDia())) {
                listaDiasFumigaciones.add("" + modelo.getListaFumigaciones().get(i).getDia());
            }
        }
        this.lstProductos.setListData(listaNombresProductos.toArray());
        this.lstDias.setListData(listaDiasFumigaciones.toArray());
    }

    public void cargarFiltro(String nombreProducto, int dia) {
        jPanel1.removeAll();
        int[][] mat = modelo.getMatrizFiltro(nombreProducto, dia);
        int cont = 1;
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 50; j++) {
                if (i == 0) {
                    JLabel label = new JLabel("" + cont);
                    label.setPreferredSize(new java.awt.Dimension(70, 16));
                    label.setBackground(new java.awt.Color(255, 153, 153));
                    label.setFont(new java.awt.Font("Dialog", 0, 12));
                    label.setForeground(new java.awt.Color(0, 0, 0));
                    label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    label.setOpaque(true);
                    jPanel1.add(label);
                    cont++;
                } else {
                    int num = mat[i - 1][j];
                    int color = modelo.color(num);
                    JLabel label = new JLabel("" + num);
                    label.setPreferredSize(new java.awt.Dimension(70, 16));
                    label.setBackground(new java.awt.Color(255, color, color));
                    label.setFont(new java.awt.Font("Dialog", 0, 12));
                    label.setForeground(new java.awt.Color(255, 255, 255));
                    label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                    label.setOpaque(true);
                    jPanel1.add(label);
                }
            }
        }
        jPanel2.repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList lstDias;
    private javax.swing.JList lstProductos;
    // End of variables declaration//GEN-END:variables
    private Sistema modelo;

    @Override
    public void update(Observable o, Object arg) {
        cargarListas();
        rellenarMatriz();
    }
}
