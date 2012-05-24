/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaBusqSimple.java
 *
 * Created on 24-may-2012, 10:14:05
 */

package Ventanas;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daniel
 */
public class VentanaBusqSimple extends javax.swing.JFrame {
    GUIManager manejador;
    private Icon loading;
    /** Creates new form VentanaBusqSimple */

    VentanaBusqSimple(GUIManager m) {
        manejador = m;
        loading = new ImageIcon("./img/loading.gif");
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((d.width/3), (d.height/3));
        initComponents();
        this.setTitle("Buscar en la Base de Datos");
        this.setDefaultCloseOperation(0);
        labelGif.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textBusqueda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        labelGif = new javax.swing.JLabel(loading);
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDocs = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPj = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaAcont = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaCol = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Introduce palabras delimitadas por comas:");

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        tablaDocs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documentos"
            }
        ));
        jScrollPane1.setViewportView(tablaDocs);

        jLabel2.setText("Documentos encontrados");

        jLabel3.setText("Personajes encontrados");

        tablaPj.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Personajes"
            }
        ));
        jScrollPane2.setViewportView(tablaPj);

        tablaAcont.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Acontecimientos"
            }
        ));
        jScrollPane3.setViewportView(tablaAcont);

        jLabel4.setText("Acontecimientos encontrados");

        tablaCol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Colectivos"
            }
        ));
        jScrollPane4.setViewportView(tablaCol);

        jLabel5.setText("Colectivos encontrados");

        jButton1.setText("Terminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelGif, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 361, Short.MAX_VALUE)
                                .addComponent(botonBuscar))
                            .addComponent(textBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(397, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(textBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBuscar)
                    .addComponent(labelGif, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        try {
            labelGif.setVisible(true);
            String[] busqueda = textBusqueda.getText().split(",");
            encuentraDocumentos(busqueda);
            encuentraPersonajes(busqueda);
            encuentraAconts(busqueda);
            encuentraColect(busqueda);
            labelGif.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaBusqSimple.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tablaCol.removeAll();
        tablaAcont.removeAll();
        tablaDocs.removeAll();
        tablaPj.removeAll();
        textBusqueda.setText("");
        manejador.cambiaEstado(estados.VENTANA1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void encuentraDocumentos(String[] busqueda) throws SQLException {
        // Cogemos los nombres de las columnas para buscar informacion
        String columnas = "select COLUMN_NAME from information_schema.COLUMNS"
                            + " where TABLE_NAME='documento';";
        columnas = manejador.getBBDDManager().consultaPeticion(columnas, "COLUMN_NAME");
        String[] camposBusqueda = columnas.split(",");
        for (int i=0;i<camposBusqueda.length;i++){
            for (int j = 0; j < busqueda.length; j++){
                String busq = busqueda[j];
                String consulta = "SELECT * FROM documento";
                String resultado[] = manejador.getBBDDManager().consultaPeticion(consulta, camposBusqueda[i]).split(",");
                if (resultado.length != 0){
                    for (int k = 0; k<resultado.length; k++){
                        String result = resultado[k];
                        if (result.contains(busq)){
                            if (camposBusqueda[i].equals("id")){
                                result = manejador.getBBDDManager().consultaPeticion("SELECT * FROM "
                                        + "documento WHERE id="+result+";", "descripcion");
                            }
                            imprimeResultado(tablaDocs,result);
                        }
                    }
                }
            }
        }
    }

    private void encuentraPersonajes(String[] busqueda) {
    }

    private void encuentraAconts(String[] busqueda) {
    }

    private void encuentraColect(String[] busqueda) {
    }

    private void imprimeResultado(JTable tabla, String resultado){
        DefaultTableModel m = (DefaultTableModel) tabla.getModel();
        //m = new DefaultTableModel(new Object[]{"Elementos encontrados"}, 0);
        //for (int i = 0; i < res.length; i++) {
            m.addRow(new Object[]{resultado});
        //}
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VentanaBusqSimple(new GUIManager()).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaBusqSimple.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelGif;
    private javax.swing.JTable tablaAcont;
    private javax.swing.JTable tablaCol;
    private javax.swing.JTable tablaDocs;
    private javax.swing.JTable tablaPj;
    private javax.swing.JTextField textBusqueda;
    // End of variables declaration//GEN-END:variables
}
