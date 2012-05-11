/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaCrearCol.java
 *
 * Created on 11-may-2012, 16:00:32
 */

package Ventanas;
import Descriptores.DescriptorCatalogo;
import Descriptores.DescriptorDocumento;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario_local
 */
public class VentanaCrearCol extends javax.swing.JFrame {

    private GUIManager manejador;
    /** Creates new form VentanaCrearCol */
    public VentanaCrearCol(GUIManager m) {
        manejador = m;
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(d.width/3, 20);
        initComponents();
        this.setTitle("Crear Colectivo");
        this.setDefaultCloseOperation(0);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        textNombre = new javax.swing.JTextField();
        scrollDescripcion = new javax.swing.JScrollPane();
        textDescripcion = new javax.swing.JTextArea();
        labelDescripcion = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();
        labelDescripcion1 = new javax.swing.JLabel();
        panelFicheros = new javax.swing.JPanel();
        textFuente = new javax.swing.JTextField();
        labelTitulo1 = new javax.swing.JLabel();
        labelTitulo2 = new javax.swing.JLabel();
        textFormato = new javax.swing.JTextField();
        labelTitulo3 = new javax.swing.JLabel();
        textURIFich = new javax.swing.JTextField();
        botonAddFich = new javax.swing.JButton();
        labelTitulo4 = new javax.swing.JLabel();
        textNomFich = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFicheros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 12));
        labelTitulo.setText("Nombre:");

        textNombre.setText("Historiadores Republicanos");
        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });

        textDescripcion.setColumns(20);
        textDescripcion.setRows(5);
        textDescripcion.setText("Historiadores votantes del\npartido republicano.");
        scrollDescripcion.setViewportView(textDescripcion);

        labelDescripcion.setFont(new java.awt.Font("Tahoma", 0, 12));
        labelDescripcion.setText("Descripcion:");

        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        labelDescripcion1.setFont(new java.awt.Font("Tahoma", 0, 12));
        labelDescripcion1.setText("Ficheros:");

        panelFicheros.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        textFuente.setText("Arial Black");
        textFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFuenteActionPerformed(evt);
            }
        });

        labelTitulo1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelTitulo1.setText("Fuente:");

        labelTitulo2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelTitulo2.setText("Formato:");

        textFormato.setText("pdf");
        textFormato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFormatoActionPerformed(evt);
            }
        });

        labelTitulo3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelTitulo3.setText("URI Fichero");

        textURIFich.setText("/eleccionesEEUU/");
        textURIFich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textURIFichActionPerformed(evt);
            }
        });

        botonAddFich.setText("Añadir fichero");
        botonAddFich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAddFichActionPerformed(evt);
            }
        });

        labelTitulo4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelTitulo4.setText("Nombre:");

        textNomFich.setText("estadoCalifornia");
        textNomFich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomFichActionPerformed(evt);
            }
        });

        tablaFicheros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ficheros"
            }
        ));
        jScrollPane1.setViewportView(tablaFicheros);

        javax.swing.GroupLayout panelFicherosLayout = new javax.swing.GroupLayout(panelFicheros);
        panelFicheros.setLayout(panelFicherosLayout);
        panelFicherosLayout.setHorizontalGroup(
            panelFicherosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFicherosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFicherosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitulo3)
                    .addGroup(panelFicherosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFicherosLayout.createSequentialGroup()
                            .addGroup(panelFicherosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(labelTitulo4)
                                .addGroup(panelFicherosLayout.createSequentialGroup()
                                    .addComponent(labelTitulo2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textFormato))
                                .addGroup(panelFicherosLayout.createSequentialGroup()
                                    .addComponent(labelTitulo1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textFuente, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                                .addGroup(panelFicherosLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(textNomFich, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFicherosLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(textURIFich, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botonAddFich))))
                .addGap(15, 15, 15))
        );
        panelFicherosLayout.setVerticalGroup(
            panelFicherosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFicherosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFicherosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFicherosLayout.createSequentialGroup()
                        .addComponent(labelTitulo4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNomFich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFicherosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTitulo1)
                            .addComponent(textFuente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFicherosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTitulo2)
                            .addComponent(textFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTitulo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFicherosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textURIFich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAddFich))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelFicheros, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelTitulo)
                            .addComponent(labelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDescripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(scrollDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addComponent(botonAceptar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDescripcion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelFicheros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonAceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_textNombreActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
            manejador.cambiaEstado(estados.VENTANA3);
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void textFuenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFuenteActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_textFuenteActionPerformed

    private void textFormatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFormatoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_textFormatoActionPerformed

    private void textURIFichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textURIFichActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_textURIFichActionPerformed

    private void botonAddFichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAddFichActionPerformed

}//GEN-LAST:event_botonAddFichActionPerformed

    private void textNomFichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomFichActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_textNomFichActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VentanaCrearCol(new GUIManager()).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaCrearCol.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonAddFich;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelDescripcion1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTitulo1;
    private javax.swing.JLabel labelTitulo2;
    private javax.swing.JLabel labelTitulo3;
    private javax.swing.JLabel labelTitulo4;
    private javax.swing.JPanel panelFicheros;
    private javax.swing.JScrollPane scrollDescripcion;
    private javax.swing.JTable tablaFicheros;
    private javax.swing.JTextArea textDescripcion;
    private javax.swing.JTextField textFormato;
    private javax.swing.JTextField textFuente;
    private javax.swing.JTextField textNomFich;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textURIFich;
    // End of variables declaration//GEN-END:variables

}
