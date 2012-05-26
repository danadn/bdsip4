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

import Descriptores.DescriptorFichero;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario_local
 */
public class VentanaCrearCol extends javax.swing.JFrame {

    private GUIManager manejador;
    private ArrayList<DescriptorFichero> ficheros;
    private estados estado;
    private String colBase;

    /** Creates new form VentanaCrearCol */
    public VentanaCrearCol(GUIManager m) {
        manejador = m;
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(d.width / 3, 20);
        initComponents();
        this.setTitle("Crear Colectivo");
        this.setDefaultCloseOperation(0);
        ficheros = new ArrayList<DescriptorFichero>();
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
        labelTitulo2 = new javax.swing.JLabel();
        textFormato = new javax.swing.JTextField();
        labelTitulo3 = new javax.swing.JLabel();
        textURIFich = new javax.swing.JTextField();
        botonAddFich = new javax.swing.JButton();
        labelTitulo4 = new javax.swing.JLabel();
        textNomFich = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFicheros = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 12));
        labelTitulo.setText("Nombre:");

        textNombre.setText("Grupo Republicano");
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

        labelTitulo2.setFont(new java.awt.Font("Tahoma", 0, 12));
        labelTitulo2.setText("Formato:");

        textFormato.setText("pdf");
        textFormato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFormatoActionPerformed(evt);
            }
        });

        labelTitulo3.setFont(new java.awt.Font("Tahoma", 0, 12));
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

        labelTitulo4.setFont(new java.awt.Font("Tahoma", 0, 12));
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
        tablaFicheros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaFicherosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaFicheros);

        jButton4.setText("Desligar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Eliminar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFicherosLayout = new javax.swing.GroupLayout(panelFicheros);
        panelFicheros.setLayout(panelFicherosLayout);
        panelFicherosLayout.setHorizontalGroup(
            panelFicherosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFicherosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFicherosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFicherosLayout.createSequentialGroup()
                        .addGroup(panelFicherosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTitulo4)
                            .addGroup(panelFicherosLayout.createSequentialGroup()
                                .addComponent(labelTitulo2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFormato, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                            .addGroup(panelFicherosLayout.createSequentialGroup()
                                .addComponent(labelTitulo3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textURIFich, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                            .addComponent(textNomFich, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addGap(11, 11, 11)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFicherosLayout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(botonAddFich)))
                .addContainerGap())
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
                            .addComponent(labelTitulo2)
                            .addComponent(textFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFicherosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTitulo3)
                            .addComponent(textURIFich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addGroup(panelFicherosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAddFich)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        jButton1.setText("Cambiar...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cambiar...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addComponent(scrollDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(labelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(labelDescripcion1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                        .addComponent(botonAceptar))
                    .addComponent(panelFicheros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitulo)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDescripcion)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDescripcion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelFicheros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAceptar)
                    .addComponent(jButton3))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_textNombreActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        if (estado == estado.MODIFICAR) {
             if(manejador.getId()!=null)
                manejador.cambiaEstado(estados.VENTANA3);
            else
                manejador.cambiaEstado(estados.MODIFICAR);
        } else if (estado == estados.CREAR) {
            if (camposRellenos()) {
                try {
                    // Creamos el colectivo
                    manejador.getBBDDManager().consultaInsetar("INSERT INTO colectivo "
                            + "(nombre ,descColec) VALUES('" + textNombre.getText() + "',"
                            + "'" + textDescripcion.getText() + "');");
                    // Asociamos el Colectivo al Documento
                    int idDocumento = Integer.parseInt(manejador.getBBDDManager().consultaPeticion(
                            "SELECT max(id) as id FROM documento;", "id"));
                    if(manejador.getId()!=null)
                        idDocumento=(int)Integer.valueOf(manejador.getId());
                    manejador.getBBDDManager().consultaInsetar("INSERT INTO "
                            + "colectivosDocumento (idDocumento,colectivo) VALUES"
                            + "(" + idDocumento + ",'" + textNombre.getText() + "');");
                    // Creamos y asociamos sus ficheros
                    Iterator<DescriptorFichero> itF = ficheros.iterator();
                    while (itF.hasNext()) {
                        // Creamos el fichero en la BBDD
                        DescriptorFichero f = itF.next();
                        manejador.getBBDDManager().creaFicheroCol(f.getNombre(),
                                f.getFormato(), f.getURI());
                        // Lo relacionamos con el documento
                        manejador.getBBDDManager().consultaInsetar("INSERT INTO "
                                + "colectivosFichero(colectivo,ficheroCol) VALUES "
                                + "('" + textNombre.getText() + "','" + f.getNombre() + "');");
                    }
                    // Introducidos los ficheros, los borramos de memoria
                    textDescripcion.setText("");
                    textFormato.setText("");
                    textNomFich.setText("");
                    textNombre.setText("");
                    textURIFich.setText("");
                    ficheros.clear();
                    actualizaTablaFicheros();
                    if(manejador.getId()!=null)
                        manejador.getV1().setEstado(estados.MODIFICAR);
                    manejador.cambiaEstado(estados.VENTANA3);
                } catch (SQLException ex) {
                    System.out.print(ex);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos", "Aviso", 2);
            }
        }
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void textFormatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFormatoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_textFormatoActionPerformed

    private void textURIFichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textURIFichActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_textURIFichActionPerformed

    private void botonAddFichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAddFichActionPerformed
        if (estado == estado.MODIFICAR) {
            try {
                String consulta;
                consulta = manejador.getBBDDManager().consultaPeticion("SELECT * FROM fichero_colectivo WHERE `fichero_colectivo`.`nombreFichCol`='" + textNomFich.getText() + "';", "nombreFichCol");
                if (consulta == null) {
                    if (textNomFich.getText().length() > 0 && textFormato.getText().length() > 0 && textURIFich.getText().length() > 0) {
                        manejador.getBBDDManager().consultaInsetar("INSERT INTO `dochistoria`.`fichero_colectivo` (`nombreFichCol`,`formatoFichCol`,`uriFichCol`) VALUES ('" + textNomFich.getText() + "','" + textFormato.getText() + "','" + textURIFich.getText() + "');");
                        manejador.getBBDDManager().consultaInsetar("INSERT INTO `dochistoria`.`colectivosfichero` (`colectivo`,`ficheroCol`) VALUES ('" + colBase + "','" + textNomFich.getText() + "');");
                    } else {
                        JOptionPane.showMessageDialog(null, "Si el fichero no existe en la base de datos, se deben rellenar todos los campos.", "Aviso", 2);
                    }
                } else {
                    manejador.getBBDDManager().consultaInsetar("INSERT INTO `dochistoria`.`colectivosfichero` (`colectivo`,`ficheroCol`) VALUES ('" + colBase + "','" + textNomFich.getText() + "');");
                }
                cargaTablaFicheros(colBase);
            } catch (SQLException ex) {
                Logger.getLogger(VentanaCrearPj.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (estado == estados.CREAR) {
            DescriptorFichero f = new DescriptorFichero(textNomFich.getText(),
                    textFormato.getText(),
                    textURIFich.getText());
            if (textNomFich.getText().length() > 0 && textFormato.getText().length() > 0
                    && textURIFich.getText().length() > 0) {
                if (!ficheros.contains(f)) {
                    ficheros.add(f);
                }
                textNomFich.setText("");
                textFormato.setText("");
                textURIFich.setText("");
                actualizaTablaFicheros();
            } else {
                JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos del fichero", "Aviso", 2);
            }
        }
}//GEN-LAST:event_botonAddFichActionPerformed

    private void textNomFichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomFichActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_textNomFichActionPerformed

private void tablaFicherosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFicherosMouseClicked
// TODO add your handling code here:
    String fichero = tablaFicheros.getValueAt(tablaFicheros.getSelectedRow(), 0).toString();
    try {
        rellenaDatosFichero(fichero);
    } catch (SQLException ex) {
        Logger.getLogger(VentanaCrearPj.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_tablaFicherosMouseClicked

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// TODO add your handling code here:
    try {
        manejador.getBBDDManager().consultaInsetar("DELETE FROM `dochistoria`.`colectivosfichero` WHERE `colectivosfichero`.`colectivo`='" + colBase + "' AND `colectivosfichero`.`ficheroCol`='" + textNomFich.getText() + "';");
        cargaTablaFicheros(colBase);
        vaciaDatosFichero();
    } catch (SQLException ex) {
        Logger.getLogger(VentanaCrearAcont.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_jButton4ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    try {
        if (textNombre.getText().length() > 0) {
            manejador.getBBDDManager().consultaInsetar("UPDATE `dochistoria`.`colectivo` SET `nombre` = '" + textNombre.getText() + "' WHERE `colectivo`.`nombre` = '" + colBase + "';");
            colBase = textNombre.getText();
        } else {
            JOptionPane.showMessageDialog(null, "No puede modificarse si el campo está en blanco.", "Aviso", 2);
            textNombre.setText(colBase);
        }
        // TODO add your handling code here:
    } catch (SQLException ex) {
        Logger.getLogger(VentanaCrearPj.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
    try {
        manejador.getBBDDManager().consultaInsetar("UPDATE `dochistoria`.`colectivo` SET `descColec` = '" + textDescripcion.getText() + "' WHERE `colectivo`.`nombre` = '" + colBase + "';");
        // TODO add your handling code here:
    } catch (SQLException ex) {
        Logger.getLogger(VentanaCrearPj.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
    try {
                if(manejador.getId()!=null){
            manejador.getBBDDManager().consultaInsetar("DELETE FROM `dochistoria`.`colectivosdocumento` WHERE `colectivosdocumento`.`idDocumento`="+(int)Integer.valueOf(manejador.getId())+" AND `colectivosdocumento`.`colectivo`='"+ colBase + "';");
            manejador.cambiaEstado(estados.VENTANA3);
        }else{
        
        
        manejador.getBBDDManager().consultaInsetar("DELETE FROM `dochistoria`.`colectivo` WHERE `colectivo`.`nombre`='" + colBase + "';");
        manejador.cambiaEstado(estados.MODIFICAR);}
    } catch (SQLException ex) {
        Logger.getLogger(VentanaCrearAcont.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
// TODO add your handling code here:
    try {
        manejador.getBBDDManager().consultaInsetar("DELETE FROM `dochistoria`.`fichero_colectivo` WHERE `fichero_colectivo`.`nombreFichCol`='" + textNomFich.getText() + "';");
        cargaTablaFicheros(colBase);
    } catch (SQLException ex) {
        Logger.getLogger(VentanaCrearAcont.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_jButton5ActionPerformed

    private void actualizaTablaFicheros() {
        DefaultTableModel m;
        m = new DefaultTableModel(new Object[]{"Catalogaciones"}, 0);
        Iterator<DescriptorFichero> it = ficheros.iterator();
        while (it.hasNext()) {
            DescriptorFichero fich = (DescriptorFichero) it.next();
            m.addRow(new Object[]{fich.getNombre()});
        }
        tablaFicheros.setModel(m);
    }

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelDescripcion1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTitulo2;
    private javax.swing.JLabel labelTitulo3;
    private javax.swing.JLabel labelTitulo4;
    private javax.swing.JPanel panelFicheros;
    private javax.swing.JScrollPane scrollDescripcion;
    private javax.swing.JTable tablaFicheros;
    private javax.swing.JTextArea textDescripcion;
    private javax.swing.JTextField textFormato;
    private javax.swing.JTextField textNomFich;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textURIFich;
    // End of variables declaration//GEN-END:variables

    private boolean camposRellenos() {
        return (textDescripcion.getText().length() > 0
                && textDescripcion.getText().length() > 0
                && !ficheros.isEmpty());
    }

    public void mandaEstadoV1(estados s) {
        estado = s;
        if (s == estados.CREAR) {
            jButton1.setVisible(false);
            jButton2.setVisible(false);
            jButton3.setVisible(false);
            jButton4.setVisible(false);
            jButton5.setVisible(false);
            //mod = false;
        } else if (s == estados.MODIFICAR) {
            jButton1.setVisible(true);
            jButton2.setVisible(true);
            jButton3.setVisible(true);
            if(manejador.getId()==null)
                jButton3.setText("Eliminar");
            else
                jButton3.setText("Desligar");
            jButton4.setVisible(true);
            jButton5.setVisible(true);
            //mod = true;
        }
    }

    public void cargaColectivo(String colectivo) {
        try {
            colBase = colectivo;
            textNombre.setText(colectivo);
            String consulta = manejador.getBBDDManager().consultaPeticion("SELECT * FROM colectivo WHERE `colectivo`.`nombre` = '" + colectivo + "'", "descColec");
            textDescripcion.setText(consulta);
            cargaTablaFicheros(colectivo);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaCrearAcont.class.getName()).log(Level.SEVERE, null, ex);
        }
    };
    
    private void cargaTablaFicheros(String colectivo) throws SQLException {
        String consulta = manejador.getBBDDManager().consultaPeticion("SELECT * FROM colectivosfichero WHERE `colectivosfichero`.`colectivo`='" + colectivo + "';", "ficheroCol");
        tablaFicheros.removeAll();
        if (consulta != null) {
            DefaultTableModel m;
            m = new DefaultTableModel(new Object[]{"Ficheros"}, 0);
            String[] ficheros = consulta.split(",");
            System.out.println(ficheros);

            for (int k = 0; k < ficheros.length; k++) {
                m.addRow(new Object[]{ficheros[k]});
            }
            tablaFicheros.setModel(m);
        } else {
            DefaultTableModel m = new DefaultTableModel(new Object[]{"Ficheros"}, 0);
            tablaFicheros.setModel(m);
        }
    };
    
    private void rellenaDatosFichero(String fichero) throws SQLException {
        textNomFich.setText(fichero);
        String consulta = manejador.getBBDDManager().consultaPeticion("SELECT * FROM `dochistoria`.`fichero_colectivo` WHERE `fichero_colectivo`.`nombreFichCol`='" + fichero + "';", "formatoFichCol");
        textFormato.setText(consulta);
        consulta = manejador.getBBDDManager().consultaPeticion("SELECT * FROM `dochistoria`.`fichero_colectivo` WHERE `fichero_colectivo`.`nombreFichCol`='" + fichero + "';", "uriFichCol");
        textURIFich.setText(consulta);
    }

    private void vaciaDatosFichero() {
        textNomFich.setText("");
        textFormato.setText("");
        textURIFich.setText("");
    }
}
