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
        this.setLocation((d.width / 3), (d.height / 3));
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
        tablaDocs.setFocusable(false);
        jScrollPane1.setViewportView(tablaDocs);

        jLabel2.setText("Documentos encontrados");

        jLabel3.setText("Personajes encontrados");

        tablaPj.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaPj.setFocusable(false);
        jScrollPane2.setViewportView(tablaPj);

        tablaAcont.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Acontecimientos"
            }
        ));
        tablaAcont.setFocusable(false);
        jScrollPane3.setViewportView(tablaAcont);

        jLabel4.setText("Acontecimientos encontrados");

        tablaCol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Colectivos"
            }
        ));
        tablaCol.setFocusable(false);
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
            labelGif.setVisible(false);
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
        tablaDocs.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{}, new String[]{"id", "Documentos"}) {

            boolean[] canEdit = new boolean[]{false, false, false, false, false, false};

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        DefaultTableModel m = (DefaultTableModel) tablaDocs.getModel();
        // Cogemos los nombres de las columnas para buscar informacion
        String columnas = "select COLUMN_NAME from information_schema.COLUMNS"
                + " where TABLE_NAME='documento';";
        columnas = manejador.getBBDDManager().consultaPeticion(columnas, "COLUMN_NAME");
        String[] camposBusqueda = columnas.split(",");
        String consulta = "SELECT * FROM documento";
        for (int i = 0; i < camposBusqueda.length; i++) {
            for (int j = 0; j < busqueda.length; j++) {
                String busq = busqueda[j];
                String resultado[] = manejador.getBBDDManager().consultaPeticion(
                        consulta, camposBusqueda[i]).split(",");
                if (resultado.length != 0) {
                    for (int k = 0; k < resultado.length; k++) {
                        String result = resultado[k];
                        if (result.contains(busq)) {
                            result = "'" + result + "'";
                            String[] id = manejador.getBBDDManager().consultaPeticion("SELECT id FROM "
                                    + "documento WHERE " + camposBusqueda[i] + "=" + result + ";", "id").split(",");
                            String[] descripcion = manejador.getBBDDManager().consultaPeticion("SELECT descripcion FROM "
                                    + "documento WHERE " + camposBusqueda[i] + "=" + result + ";", "descripcion").split(",");
                            for (int numElem = 0; numElem < id.length; numElem++) {
                                boolean encontrado = false;
                                for (int fila = 0; fila < tablaDocs.getRowCount(); fila++) {
                                    if (id[numElem].equals(tablaDocs.getValueAt(fila, 0))) {
                                        encontrado = true;
                                        break;
                                    }
                                }
                                if (!encontrado) {
                                    m.addRow(new Object[]{id[numElem], descripcion[numElem]});
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void encuentraPersonajes(String[] busqueda) throws SQLException {
        tablaPj.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{"Nombre", "fechaNac", "lugarNac", "fechaMuerte", "lugarMuerte", "Biografia"}) {

            boolean[] canEdit = new boolean[]{false, false, false, false, false, false};

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        DefaultTableModel m = (DefaultTableModel) tablaPj.getModel();
        // Cogemos los nombres de las columnas para buscar informacion
        String columnas = "select COLUMN_NAME from information_schema.COLUMNS"
                + " where TABLE_NAME='personaje';";
        columnas = manejador.getBBDDManager().consultaPeticion(columnas, "COLUMN_NAME");
        String[] camposBusqueda = columnas.split(",");
        String consulta = "SELECT * FROM personaje";
        for (int i = 0; i < camposBusqueda.length; i++) {
            for (int j = 0; j < busqueda.length; j++) {
                String busq = busqueda[j];
                String resultado[] = manejador.getBBDDManager().consultaPeticion(
                        consulta, camposBusqueda[i]).split(",");
                if (resultado.length != 0) {
                    for (int k = 0; k < resultado.length; k++) {
                        String result = resultado[k];
                        if (result.contains(busq)) {
                            result = "'" + result + "'";
                            // Sacamos todos los datos del personaje
                            String[] nombreYApe = manejador.getBBDDManager().
                                    consultaPeticion("SELECT nombreYApe FROM personaje "
                                    + "WHERE " + camposBusqueda[i] + "=" + result, "nombreYApe").split(",");
                            String[] fechaNac = manejador.getBBDDManager().
                                    consultaPeticion("SELECT fechaNac FROM personaje "
                                    + "WHERE " + camposBusqueda[i] + "=" + result, "fechaNac").split(",");
                            String[] lugarNac = manejador.getBBDDManager().
                                    consultaPeticion("SELECT lugarNac FROM personaje "
                                    + "WHERE " + camposBusqueda[i] + "=" + result, "lugarNac").split(",");
                            String[] fechaMuerte = manejador.getBBDDManager().
                                    consultaPeticion("SELECT fechaMuerte FROM personaje "
                                    + "WHERE " + camposBusqueda[i] + "=" + result, "fechaMuerte").split(",");
                            String[] lugarMuerte = manejador.getBBDDManager().
                                    consultaPeticion("SELECT lugarMuerte FROM personaje "
                                    + "WHERE " + camposBusqueda[i] + "=" + result, "lugarMuerte").split(",");
                            String[] Biografia = manejador.getBBDDManager().
                                    consultaPeticion("SELECT biografia FROM personaje "
                                    + "WHERE " + camposBusqueda[i] + "=" + result, "biografia").split(",");
                            // Buscamos si el elemento ha sido ya añadido:
                            for (int numElem = 0; numElem < nombreYApe.length; numElem++) {
                                boolean encontrado = false;
                                for (int fila = 0; fila < tablaPj.getRowCount(); fila++) {
                                    if (nombreYApe[numElem].equals(tablaPj.getValueAt(fila, 0))) {
                                        encontrado = true;
                                        break;
                                    }
                                }
                                if (!encontrado) {
                                    m.addRow(new Object[]{nombreYApe[numElem],
                                                fechaNac[numElem],
                                                lugarNac[numElem],
                                                fechaMuerte[numElem],
                                                lugarMuerte[numElem],
                                                Biografia[numElem]});
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void encuentraAconts(String[] busqueda) throws SQLException {
        tablaAcont.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{"Acontecimiento", "Descripcion", "Comienzo", "Fin"}) {

            boolean[] canEdit = new boolean[]{false, false, false, false, false, false};

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        DefaultTableModel m = (DefaultTableModel) tablaAcont.getModel();
        // Cogemos los nombres de las columnas para buscar informacion
        String columnas = "select COLUMN_NAME from information_schema.COLUMNS"
                + " where TABLE_NAME='acontecimiento';";
        columnas = manejador.getBBDDManager().consultaPeticion(columnas, "COLUMN_NAME");
        String[] camposBusqueda = columnas.split(",");
        String consulta = "SELECT * FROM acontecimiento";
        for (int i = 0; i < camposBusqueda.length; i++) {
            for (int j = 0; j < busqueda.length; j++) {
                String busq = busqueda[j];
                String resultado[] = manejador.getBBDDManager().consultaPeticion(
                        consulta, camposBusqueda[i]).split(",");
                if (resultado.length != 0) {
                    for (int k = 0; k < resultado.length; k++) {
                        String result = resultado[k];
                        if (result.contains(busq)) {
                            result = "'" + result + "'";
                            // Sacamos todos los datos del personaje
                            String[] nombreAcont = manejador.getBBDDManager().
                                    consultaPeticion("SELECT nombreAcont FROM acontecimiento "
                                    + "WHERE " + camposBusqueda[i] + "=" + result, "nombreAcont").split(",");
                            String[] descrip = manejador.getBBDDManager().
                                    consultaPeticion("SELECT descrip FROM acontecimiento "
                                    + "WHERE " + camposBusqueda[i] + "=" + result, "descrip").split(",");
                            String[] fechaC = manejador.getBBDDManager().
                                    consultaPeticion("SELECT fechaC FROM acontecimiento "
                                    + "WHERE " + camposBusqueda[i] + "=" + result, "fechaC").split(",");
                            String[] fechaF = manejador.getBBDDManager().
                                    consultaPeticion("SELECT fechaF FROM acontecimiento "
                                    + "WHERE " + camposBusqueda[i] + "=" + result, "fechaF").split(",");
                            for (int numElem = 0; numElem < nombreAcont.length; numElem++) {
                                // Buscamos si el elemento ha sido ya añadido:
                                boolean encontrado = false;
                                for (int fila = 0; fila < tablaAcont.getRowCount(); fila++) {
                                    if (nombreAcont[numElem].equals(tablaAcont.getValueAt(fila, 0))) {
                                        encontrado = true;
                                        break;
                                    }
                                }
                                if (!encontrado) {
                                    m.addRow(new Object[]{nombreAcont[numElem],
                                                descrip[numElem],
                                                fechaC[numElem],
                                                fechaF[numElem]});
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void encuentraColect(String[] busqueda) throws SQLException {
        tablaCol.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{"Colectivo", "Descripcion"}) {

            boolean[] canEdit = new boolean[]{false, false, false, false, false, false};

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        DefaultTableModel m = (DefaultTableModel) tablaCol.getModel();
        // Cogemos los nombres de las columnas para buscar informacion
        String columnas = "select COLUMN_NAME from information_schema.COLUMNS"
                + " where TABLE_NAME='colectivo';";
        columnas = manejador.getBBDDManager().consultaPeticion(columnas, "COLUMN_NAME");
        String[] camposBusqueda = columnas.split(",");
        String consulta = "SELECT * FROM colectivo";
        for (int i = 0; i < camposBusqueda.length; i++) {
            for (int j = 0; j < busqueda.length; j++) {
                String busq = busqueda[j];
                String resultado[] = manejador.getBBDDManager().consultaPeticion(
                        consulta, camposBusqueda[i]).split(",");
                if (resultado.length != 0) {
                    for (int k = 0; k < resultado.length; k++) {
                        String result = resultado[k];
                        if (result.contains(busq)) {
                            result = "'" + result + "'";
                            // Sacamos todos los datos del personaje
                            String[] nombre = manejador.getBBDDManager().
                                    consultaPeticion("SELECT nombre FROM colectivo "
                                    + "WHERE " + camposBusqueda[i] + "=" + result, "nombre").split(",");
                            String[] descColec = manejador.getBBDDManager().
                                    consultaPeticion("SELECT descColec FROM colectivo "
                                    + "WHERE " + camposBusqueda[i] + "=" + result, "descColec").split(",");
                            // Buscamos si el elemento ha sido ya añadido:
                            for (int numElem = 0; numElem < nombre.length; numElem++) {
                                boolean encontrado = false;
                                for (int fila = 0; fila < tablaAcont.getRowCount(); fila++) {
                                    if (nombre[numElem].equals(tablaAcont.getValueAt(fila, 0))) {
                                        encontrado = true;
                                        break;
                                    }
                                }
                                if (!encontrado) {
                                    m.addRow(new Object[]{nombre[numElem], descColec[numElem]});
                                }
                            }
                        }
                    }
                }
            }
        }
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
