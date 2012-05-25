package Ventanas;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Daniel
 */
public class VentanaMuestra extends javax.swing.JFrame {
    GUIManager manejador;
    private Icon loading;
    private estados estado;
    /** Creates new form VentanaMuestra */
    public VentanaMuestra(GUIManager m) {
        manejador = m;
        loading = new ImageIcon("./img/loading.gif");
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation((d.width/3), (d.height/3));
        initComponents();
        this.setTitle("Buscar en la Base de Datos");
        this.setDefaultCloseOperation(0);
        labelGif.setVisible(false);
        labelTitulo.setVisible(false);
        comboEleccion.setVisible(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEncontrados = new javax.swing.JTable();
        botonTerminar = new javax.swing.JButton();
        labelTitulo1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        botonAccion = new javax.swing.JButton();
        labelGif = new javax.swing.JLabel(loading);
        comboEleccion = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 12));
        labelTitulo.setText("Elige un elemento:");

        tablaEncontrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaEncontrados);

        botonTerminar.setText("Terminar");
        botonTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTerminarActionPerformed(evt);
            }
        });

        labelTitulo1.setFont(new java.awt.Font("Tahoma", 0, 12));
        labelTitulo1.setText("Elementos encontrados:");

        botonAccion.setText("Guardar cambios");
        botonAccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAccionActionPerformed(evt);
            }
        });

        comboEleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEleccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(comboEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(labelTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(labelGif, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                                            .addComponent(botonAccion))
                                        .addComponent(botonTerminar)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE))))
                            .addGap(20, 20, 20))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelTitulo1)
                            .addContainerGap(296, Short.MAX_VALUE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(labelTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonAccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelGif, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 5, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonTerminar)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTerminarActionPerformed
        if(estado==estados.MODIFICAR)
            manejador.cambiaEstado(estados.MODIFICAR);
        else if(estado==estados.CREAR)
            manejador.cambiaEstado(estados.VENTANA3);
        else
            manejador.cambiaEstado(estados.VENTANA1);
    }//GEN-LAST:event_botonTerminarActionPerformed

    private void comboEleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEleccionActionPerformed
        labelGif.setVisible(true);
         try {
            String eleccion;
            if(comboEleccion.getItemCount()!=0)
                eleccion = comboEleccion.getSelectedItem().toString() ;
            String consulta = "SELECT * FROM ";
            String columnas = "";
            switch (manejador.getEstado()) {
                case BBDD_PERSONAJE:
                    consulta += "personaje;";
                    // Cogemos los nombres de las columnas para buscar informacion
                    columnas = "select COLUMN_NAME from information_schema.COLUMNS"
                            + " where TABLE_NAME='personaje';";
                    columnas = manejador.getBBDDManager().consultaPeticion(columnas, "COLUMN_NAME");
                    String[] camposBusqueda = columnas.split(",");
                    // Sacamos el texto introducido por el usuario para la busqueda
                    // Procedemos a buscar:
                    break;
                case BBDD_ACONTECIMIENTO:
                    consulta += "acontecimiento";
                    break;
                case BBDD_COLECTIVO:
                    consulta += "colectivo";
                    break;
                case BBDD_DOCUMENTO:
                    consulta += "documento";
                    break;
                default:
                    break;
            }
        } catch (SQLException ex) {
            System.out.print(ex);
        }
        labelGif.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_comboEleccionActionPerformed

    private void botonAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAccionActionPerformed
        try {
            if(estado==estados.MODIFICAR)
                switch (manejador.getEstado()) {
                    case BBDD_PERSONAJE:
                        manejador.cambiaEstado(estados.CREAR_PERSONAJE);
                        //manejador.getVentanaPj().cargaPersonaje(comboEleccion.getSelectedItem().toString());
                        int row = tablaEncontrados.getSelectedRow();
                        manejador.getVentanaPj().cargaPersonaje(tablaEncontrados.getValueAt(row, 0).toString());
                        break;
                    case BBDD_ACONTECIMIENTO:
                        manejador.cambiaEstado(estados.CREAR_ACONTECIMIENTO);
                        row = tablaEncontrados.getSelectedRow();
                        String acontecimiento=tablaEncontrados.getValueAt(row, 0).toString();
                        manejador.getVentanaAcont().cargaAcontecimiento(acontecimiento);
                        //manejador.getVentanaAcon().
                        break;
                    case BBDD_COLECTIVO:
                        manejador.cambiaEstado(estados.CREAR_COLECTIVO);
                        row = tablaEncontrados.getSelectedRow();
                        String colectivo=tablaEncontrados.getValueAt(row, 0).toString();
                        //manejador.getVentanaCol().cargaColectivo(colectivo);
                        break;
                    case BBDD_DOCUMENTO:
                        manejador.cambiaEstado(estados.CREAR);
                        break;
                    default:
                        break;
                }
            else if(estado==estados.CREAR){
                int row = tablaEncontrados.getSelectedRow();
                String elemento = tablaEncontrados.getValueAt(row, 0).toString();
                int idDocumento = Integer.parseInt(manejador.getBBDDManager().consultaPeticion(
                        "SELECT max(id) as id FROM documento;", "id"));
                switch (manejador.getEstado()) {
                    case BBDD_PERSONAJE:
                        // Asociamos el Personaje al Documento
                        manejador.getBBDDManager().consultaInsetar("INSERT "
                                + "INTO personajesDocumento (idDocumento,personaje) "
                                + "VALUES("+idDocumento+",'"+elemento+"');");
                        manejador.cambiaEstado(estados.VENTANA3);
                        break;
                    case BBDD_ACONTECIMIENTO:
                        // Asociamos el Personaje al Documento
                        manejador.getBBDDManager().consultaInsetar("INSERT "
                                + "INTO acontecimientosDocumento (idDocumento,acontecimiento) "
                                + "VALUES("+idDocumento+",'"+elemento+"');");
                        manejador.cambiaEstado(estados.VENTANA3);
                        break;
                    case BBDD_COLECTIVO:
                        // Asociamos el Colectivo al Documento
                        manejador.getBBDDManager().consultaInsetar("INSERT "
                                + "INTO colectivosDocumento (idDocumento,colectivo) "
                                + "VALUES("+idDocumento+",'"+elemento+"');");
                        manejador.cambiaEstado(estados.VENTANA3);
                        break;
                    default:
                        break;
                }
                System.out.print(elemento+" añadido con exito al documento con id "+idDocumento+"\n");
            }else{}
            
            //this.setVisible(false);
            this.dispose();
        } catch (SQLException ex) {
            System.out.print(ex);
        }
    }//GEN-LAST:event_botonAccionActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VentanaMuestra(new GUIManager()).setVisible(true);
                } catch (SQLException ex) {
                    System.out.println(ex.toString());
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAccion;
    private javax.swing.JButton botonTerminar;
    private javax.swing.JComboBox comboEleccion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelGif;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTitulo1;
    private javax.swing.JTable tablaEncontrados;
    // End of variables declaration//GEN-END:variables

    void mandaEstadoV1(estados s) {
        estado=s;
        try {
            rellenaComboEleccion(s);
            if (s == estados.CREAR) {
                botonAccion.setText("Añadir");
                botonAccion.setVisible(true);
            } else if(s == estados.MODIFICAR) {
                botonAccion.setText("Modificar");
                botonAccion.setVisible(true);
            }
        } catch (SQLException ex) {
            System.out.print(ex);
        }
    }
    
    private void rellenaComboEleccion(estados s) throws SQLException {
        if (s == estados.CREAR || s == estados.MODIFICAR){
            String consulta = "SELECT * FROM ";
            String campo = "";
            switch (manejador.getEstado()) {
                case BBDD_PERSONAJE:
                    labelTitulo.setText("Elija un personaje de la lista:");
                    consulta += "personaje;";
                    campo = "nombreYApe";
                    break;
                case BBDD_ACONTECIMIENTO:
                    labelTitulo.setText("Elija un acontecimiento de la lista:");
                    consulta += "acontecimiento";
                    campo = "nombreAcont";
                    break;
                case BBDD_COLECTIVO:
                    labelTitulo.setText("Elija un colectivo de la lista:");
                    consulta += "colectivo";
                    campo = "nombre";
                    break;
                case BBDD_DOCUMENTO:
                    labelTitulo.setText("Elija un documento de la lista:");
                    consulta += "descripcion";
                    consulta += "titulo";
                    break;
                default:
                    break;
            }
            comboEleccion.removeAllItems();
            // Cogemos los nombres de las columnas para buscar informacion
            String resultado = manejador.getBBDDManager().consultaPeticion(consulta, campo);
            String[] res = resultado.split(",");
            DefaultTableModel m;
            m = new DefaultTableModel(new Object[]{"Elementos encontrados"}, 0);
            for (int i = 0; i < res.length; i++)
                m.addRow(new Object[]{res[i]});
            tablaEncontrados.setModel(m);
            /*for (int i = 0; i < res.length; i++)
                comboEleccion.addItem(res[i]);*/
        }
    }
}
