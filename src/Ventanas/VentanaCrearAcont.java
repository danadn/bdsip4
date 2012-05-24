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
public class VentanaCrearAcont extends javax.swing.JFrame {
    private GUIManager manejador;
    private ArrayList<DescriptorFichero> ficheros;
    private boolean mod;
    private String acontBase;
    /** Creates new form VentanaCrearAcont */
    public VentanaCrearAcont(GUIManager m) {
        manejador = m;
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(d.width/4, 20);
        initComponents();
        this.setTitle("Crear Personaje");
        this.setDefaultCloseOperation(0);
        ficheros = new ArrayList<DescriptorFichero>();
    }

    private void actualizaTablaFicheros() {
        DefaultTableModel m;
        m = new DefaultTableModel(new Object[] {"Catalogaciones"}, 0);
        Iterator<DescriptorFichero> it = ficheros.iterator();
        while (it.hasNext()) {
            DescriptorFichero fich = (DescriptorFichero)it.next();
            m.addRow(new Object[]{fich.getNombre()});
        }
        tablaFicheros.setModel(m);
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
        jPanel1 = new javax.swing.JPanel();
        labelTitulo2 = new javax.swing.JLabel();
        textFormato = new javax.swing.JTextField();
        labelTitulo3 = new javax.swing.JLabel();
        textURIFich = new javax.swing.JTextField();
        botonAddFich = new javax.swing.JButton();
        labelTitulo4 = new javax.swing.JLabel();
        textNomFich = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFicheros = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        botonAceptar = new javax.swing.JButton();
        labelDescripcion1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        AnoIni = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        MesIni = new javax.swing.JTextField();
        DiaIni = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        DiaFin = new javax.swing.JTextField();
        MesFin = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        AnoFin = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 0, 12));
        labelTitulo.setText("Acontecimiento:");

        textNombre.setText("Elec. California");
        textNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNombreActionPerformed(evt);
            }
        });

        textDescripcion.setColumns(20);
        textDescripcion.setRows(5);
        textDescripcion.setText("Elecciones que gano\nArnold Swardschneger");
        scrollDescripcion.setViewportView(textDescripcion);

        labelDescripcion.setFont(new java.awt.Font("Tahoma", 0, 12));
        labelDescripcion.setText("Descripcion:");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        jButton6.setText("Desligar");

        jButton7.setText("Eliminar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTitulo4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelTitulo2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFormato, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelTitulo3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textURIFich, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                            .addComponent(textNomFich, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(botonAddFich)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTitulo4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNomFich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTitulo2)
                            .addComponent(textFormato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTitulo3)
                            .addComponent(textURIFich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAddFich)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap())
        );

        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        labelDescripcion1.setFont(new java.awt.Font("Tahoma", 0, 12));
        labelDescripcion1.setText("Ficheros:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel12.setText("Fecha de inicio:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel17.setText("Año");

        AnoIni.setText("2004");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel16.setText("Mes");

        MesIni.setText("04");
        MesIni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesIniActionPerformed(evt);
            }
        });

        DiaIni.setText("23");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel14.setText("Dia");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel15.setText("Dia");

        DiaFin.setText("23");
        DiaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaFinActionPerformed(evt);
            }
        });

        MesFin.setText("04");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel11.setText("Mes");

        AnoFin.setText("2004");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel10.setText("Año");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel13.setText("Fecha de fin:");

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

        jButton3.setText("Cambiar...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cambiar...");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                                .addComponent(botonAceptar))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(scrollDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
                            .addComponent(labelDescripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(textNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AnoFin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(MesFin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(DiaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(AnoIni, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel16)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(MesIni, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(DiaIni, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addComponent(jButton4))
                                .addGap(10, 10, 10)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitulo)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDescripcion)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(AnoIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(MesIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(DiaIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(AnoFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(MesFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(DiaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelDescripcion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAceptar)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNombreActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_textNombreActionPerformed

    private void textFormatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFormatoActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_textFormatoActionPerformed

    private void textURIFichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textURIFichActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_textURIFichActionPerformed

    private void botonAddFichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAddFichActionPerformed
        if (mod) {
            
        } else {
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

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        if (mod) {
            manejador.cambiaEstado(estados.MODIFICAR);
        } else {

            if (camposRellenos()) {
                try {
                    // Introducimos el Acontecimiento en la BBDD
                    manejador.getBBDDManager().consultaInsetar("INSERT INTO acontecimiento "
                            + "(nombreAcont,descrip,fechaC,fechaF) VALUES"
                            + "('" + textNombre.getText() + "','" + textDescripcion.getText() + "',"
                            + "'" + AnoIni.getText() + "-" + MesIni.getText() + "-" + DiaIni.getText() + "'"
                            + ",'" + AnoFin.getText() + "-" + MesFin.getText() + "-" + DiaFin.getText() + "');");
                    // Asociamos el Acontecimiento al Documento
                    int idDocumento = Integer.parseInt(manejador.getBBDDManager().consultaPeticion(
                            "SELECT max(id) as id FROM documento;", "id"));
                    manejador.getBBDDManager().consultaInsetar("INSERT INTO acontecimientosDocumento"
                            + " (idDocumento,acontecimiento) VALUES"
                            + "(" + idDocumento + ",'" + textNombre.getText() + "');");
                    // Creamos y asociamos sus ficheros
                    Iterator<DescriptorFichero> itF = ficheros.iterator();
                    while (itF.hasNext()) {
                        // Creamos el fichero en la BBDD
                        DescriptorFichero f = itF.next();
                        manejador.getBBDDManager().creaFicheroAcont(f.getNombre(),
                                f.getFormato(), f.getURI());
                        // Lo relacionamos con el documento
                        manejador.getBBDDManager().consultaInsetar("INSERT INTO "
                                + "acontsFichero(acontecimiento,ficheroAcont) VALUES "
                                + "('" + textNombre.getText() + "','" + f.getNombre() + "');");
                    }
                    // Introducidos los ficheros, los borramos de memoria
                    ficheros.clear();
                    actualizaTablaFicheros();
                    textNombre.setText("");
                    textDescripcion.setText("");
                    textFormato.setText("");
                    textNomFich.setText("");
                    textURIFich.setText("");
                    AnoIni.setText("");
                    MesIni.setText("");
                    DiaIni.setText("");
                    AnoFin.setText("");
                    MesFin.setText("");
                    DiaFin.setText("");
                    manejador.cambiaEstado(estados.VENTANA3);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex, "Aviso", 2);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos", "Aviso", 2);
            }
        }
}//GEN-LAST:event_botonAceptarActionPerformed

    private void MesIniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesIniActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_MesIniActionPerformed

    private void DiaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiaFinActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
    try {
        manejador.getBBDDManager().consultaInsetar("UPDATE `dochistoria`.`acontecimiento` SET `descrip` = '" + textDescripcion.getText() + "' WHERE `acontecimiento`.`nombreAcont` = '" + acontBase + "';");
        // TODO add your handling code here:
    } catch (SQLException ex) {
        Logger.getLogger(VentanaCrearPj.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
    try {
        String fecha = AnoIni.getText() + "-" + MesIni.getText() + "-" + DiaIni.getText();
        manejador.getBBDDManager().consultaInsetar("UPDATE `dochistoria`.`acontecimiento` SET `FechaC` = '" + fecha + "' WHERE `acontecimiento`.`nombreAcont` = '" + acontBase + "';");
    } catch (SQLException ex) {
        Logger.getLogger(VentanaCrearPj.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// TODO add your handling code here:
    try {
        String fecha = AnoFin.getText() + "-" + MesFin.getText() + "-" + DiaFin.getText();
        manejador.getBBDDManager().consultaInsetar("UPDATE `dochistoria`.`acontecimiento` SET `FechaF` = '" + fecha + "' WHERE `acontecimiento`.`nombreAcont` = '" + acontBase + "';");
    } catch (SQLException ex) {
        Logger.getLogger(VentanaCrearPj.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_jButton4ActionPerformed

private void tablaFicherosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFicherosMouseClicked
// TODO add your handling code here:
    String fichero = tablaFicheros.getValueAt(tablaFicheros.getSelectedRow(), 0).toString();
    try {
        rellenaDatosFichero(fichero);
    } catch (SQLException ex) {
        Logger.getLogger(VentanaCrearPj.class.getName()).log(Level.SEVERE, null, ex);
    }
}//GEN-LAST:event_tablaFicherosMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VentanaCrearAcont(new GUIManager()).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaCrearAcont.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AnoFin;
    private javax.swing.JTextField AnoIni;
    private javax.swing.JTextField DiaFin;
    private javax.swing.JTextField DiaIni;
    private javax.swing.JTextField MesFin;
    private javax.swing.JTextField MesIni;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonAddFich;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JLabel labelDescripcion1;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTitulo2;
    private javax.swing.JLabel labelTitulo3;
    private javax.swing.JLabel labelTitulo4;
    private javax.swing.JScrollPane scrollDescripcion;
    private javax.swing.JTable tablaFicheros;
    private javax.swing.JTextArea textDescripcion;
    private javax.swing.JTextField textFormato;
    private javax.swing.JTextField textNomFich;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textURIFich;
    // End of variables declaration//GEN-END:variables

    private boolean camposRellenos() {
        return (textNombre.getText().length()>0 &&
                textDescripcion.getText().length()>0 &&
                AnoIni.getText().length()>0 &&
                MesIni.getText().length()>0 &&
                DiaIni.getText().length()>0 &&
                AnoFin.getText().length()>0 &&
                MesFin.getText().length()>0 &&
                DiaFin.getText().length()>0 &&
                !ficheros.isEmpty());
    }
    
    public void mandaEstadoV1(estados s) {
        if (s == estados.CREAR) {
            jButton1.setVisible(false);
            jButton2.setVisible(false);
            jButton3.setVisible(false);
            jButton4.setVisible(false);
            jButton5.setVisible(false);
            jButton6.setVisible(false);
            jButton7.setVisible(false);
            mod = false;
        } else if (s == estados.MODIFICAR) {
            jButton1.setVisible(false);
            jButton2.setVisible(true);
            jButton3.setVisible(true);
            jButton4.setVisible(true);
            jButton5.setVisible(true);
            jButton6.setVisible(true);
            jButton7.setVisible(true);
            mod = true;
        }
    }
    
    public void cargaAcontecimiento(String acontecimiento){
        try {
            acontBase=acontecimiento;
            textNombre.setText(acontecimiento);
            String consulta = manejador.getBBDDManager().consultaPeticion("SELECT * FROM acontecimiento WHERE `acontecimiento`.`nombreAcont` = '" + acontecimiento + "'", "descrip");
            textDescripcion.setText(consulta);
            consulta = manejador.getBBDDManager().consultaPeticion("SELECT * FROM acontecimiento WHERE `acontecimiento`.`nombreAcont` = '" + acontecimiento + "'", "fechaC");
            String[] fecha = consulta.split("-");
            AnoIni.setText(fecha[0]);
            MesIni.setText(fecha[1]);
            DiaIni.setText(fecha[2]);
            consulta = manejador.getBBDDManager().consultaPeticion("SELECT * FROM acontecimiento WHERE `acontecimiento`.`nombreAcont` = '" + acontecimiento + "'", "fechaF");
            fecha = consulta.split("-");
            AnoFin.setText(fecha[0]);
            MesFin.setText(fecha[1]);
            DiaFin.setText(fecha[2]);
            cargaTablaFicheros(acontecimiento);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaCrearAcont.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void cargaTablaFicheros(String acontecimiento) throws SQLException{
        String consulta = manejador.getBBDDManager().consultaPeticion("SELECT * FROM acontsfichero WHERE `acontsfichero`.`acontecimiento`='" + acontecimiento + "';", "ficheroAcont");
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
        if(mod){
        textNomFich.setText(fichero);
        String consulta = manejador.getBBDDManager().consultaPeticion("SELECT * FROM `dochistoria`.`fichero_acontecimiento` WHERE `fichero_acontecimiento`.`nombreFichAcont`='" + fichero + "';", "formatoFichAcont");
        textFormato.setText(consulta);
        consulta = manejador.getBBDDManager().consultaPeticion("SELECT * FROM `dochistoria`.`fichero_acontecimiento` WHERE `fichero_acontecimiento`.`nombreFichAcont`='" + fichero + "';", "uriFichAcont");
        textURIFich.setText(consulta);
        }
    }

}
