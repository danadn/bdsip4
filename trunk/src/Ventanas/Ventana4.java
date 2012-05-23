package Ventanas;

/**
 *
 * @author Daniel
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author Daniel
 */
public final class Ventana4 extends JFrame {
    private estados estado;
    private int botonPulsado;
    // Paneles
    private JPanel panelVentana1 = null;
    private JFrame ventanaEleccion;
    // Botones
    private JButton botonPersonaje;
    private JButton botonColectivo;
    private JButton botonAcont;
    private JButton botonDocumento;
    private GUIManager manejador;

    public Ventana4(GUIManager m){
        super();
        manejador = m;
        crearInterfaz();
    }

    public void crearInterfaz(){
        botonPulsado = 0;
        this.setSize(200, 300);
	this.setContentPane(getPanelPpal());
        this.setLocationRelativeTo(null);
	this.setTitle("Ventana 4");
        this.setDefaultCloseOperation(0);
    }

    private JPanel getPanelPpal() {
        panelVentana1 = new JPanel(new GridLayout(5, 1));
        botonPersonaje = new JButton("Personaje");
        botonColectivo = new JButton("Colectivo");
        botonAcont = new JButton("Acontecimiento");
        botonDocumento = new JButton("Documento");
        JButton volver  = new JButton("Volver");
        panelVentana1.add(botonDocumento);
        panelVentana1.add(botonAcont);
        panelVentana1.add(botonPersonaje);
        panelVentana1.add(botonColectivo);
        panelVentana1.add(volver);

        volver.addActionListener(new java.awt.event.ActionListener() {
    	    public void actionPerformed(java.awt.event.ActionEvent evt) {
    	    	manejador.cambiaEstado(estados.VENTANA1);
    	    }
        });

        botonPersonaje.addActionListener(new java.awt.event.ActionListener() {
    	    public void actionPerformed(java.awt.event.ActionEvent evt) {
    	    	botonPersonajeActionPerformed(evt);
    	    }
        });
        botonColectivo.addActionListener(new java.awt.event.ActionListener() {
    	    public void actionPerformed(java.awt.event.ActionEvent evt) {
    	    	botonColectivoActionPerformed(evt);
    	    }
        });
        botonAcont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAcontActionPerformed(evt);
            }
        });
        botonDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDocumentoActionPerformed(evt);
            }
        });

        panelVentana1.validate();
        return panelVentana1;
    }

    ///////////////////////////////////////////////////////////////////////////
    ////// Eventos de Boton

    private void botonPersonajeActionPerformed(ActionEvent evt) {
        botonPulsado = 3;
        this.estado=estados.BBDD_PERSONAJE;
        manejador.cambiaEstado(estados.BBDD_PERSONAJE);
        this.dispose();
    }

    private void botonColectivoActionPerformed(ActionEvent evt) {
        botonPulsado = 4;
        this.estado=estados.BBDD_COLECTIVO;
        manejador.cambiaEstado(estados.BBDD_COLECTIVO);
        this.dispose();
    }

    private void botonAcontActionPerformed(ActionEvent evt) {
        botonPulsado = 2;
        this.estado=estados.BBDD_ACONTECIMIENTO;
        manejador.cambiaEstado(estados.BBDD_ACONTECIMIENTO);
        this.dispose();
    }

    private void botonDocumentoActionPerformed(ActionEvent evt) {
        botonPulsado = 1;
        this.estado=estados.BBDD_DOCUMENTO;
        manejador.cambiaEstado(estados.BBDD_DOCUMENTO);
        this.dispose();
    }
    
    public estados getEstado() {
        return this.estado;
    }

    public void setEstado(estados estado) {
        this.estado = estado;
    }
    
}
