package Ventanas;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.*;

import javax.swing.JFrame;

/**
 *
 * @author Daniel
 */
public final class Ventana1 extends JFrame {
    private estados estado;
    // Paneles
    private JPanel panelVentana1 = null;
    // Botones
    private JButton botonCrear;
    private JButton botonModificar;
    private JButton botonConsultar;
    private JButton botonSalir;
    private GUIManager manejador;
    private JFrame ventanaEleccion;

    public Ventana1(GUIManager m) throws HeadlessException {
        super();
        manejador = m;
        crearInterfaz();
        construyeVentanaEleccion();
    }

    public void crearInterfaz(){
        this.setSize(200, 300);
	this.setContentPane(getPanelPpal());
        this.setLocationRelativeTo(null);
	this.setTitle("Ventana 1");
        this.setDefaultCloseOperation(0);
    }

    private JPanel getPanelPpal() {
        panelVentana1 = new JPanel(new GridLayout(4, 1));
        botonCrear = new JButton("Crear");
        botonModificar = new JButton("Modificar");
        botonConsultar = new JButton("Consultar");
        botonSalir = new JButton("Salir");
        panelVentana1.add(botonCrear);
        panelVentana1.add(botonModificar);
        panelVentana1.add(botonConsultar);
        panelVentana1.add(botonSalir);

        botonCrear.addActionListener(new java.awt.event.ActionListener() {
    	    public void actionPerformed(java.awt.event.ActionEvent evt) {
    	    	botonCrearActionPerformed(evt);
    	    }
        });
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
    	    public void actionPerformed(java.awt.event.ActionEvent evt) {
    	    	botonModificarActionPerformed(evt);
    	    }

        });
        botonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarActionPerformed(evt);
            }


        });
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }

        });

        panelVentana1.validate();
        return panelVentana1;
    }

    private void construyeVentanaEleccion() {
        ventanaEleccion = new JFrame("Elige opción");
        JPanel panel = new JPanel(new GridLayout(2, 1));
        JButton botonSimple = new JButton("Busqueda Simple");
        JButton botonAvanzada = new JButton("Busqueda Avanzada");
        panel.add(botonSimple);
        panel.add(botonAvanzada);
        ventanaEleccion.setContentPane(panel);
        ventanaEleccion.validate();
        ventanaEleccion.setVisible(false);
        ventanaEleccion.setMinimumSize(new Dimension(250,100));
        ventanaEleccion.setLocationRelativeTo(null);
        ventanaEleccion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        botonSimple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manejador.cambiaEstado(estados.BUSQUEDA_SIMPLE);
                ventanaEleccion.dispose();
            }
        });
        botonAvanzada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manejador.cambiaEstado(estados.BUSQUEDA_AVANZADA);
                ventanaEleccion.dispose();
            }
        });
    }

    ///////////////////////////////////////////////////////////////////////////
    ////// Eventos de Boton

    private void botonCrearActionPerformed(ActionEvent evt) {
        this.estado = estados.CREAR;
        manejador.cambiaEstado(estados.VENTANA2);
    }

    private void botonModificarActionPerformed(ActionEvent evt) {
        this.estado = estados.MODIFICAR;
        manejador.cambiaEstado(estados.MODIFICAR);
    }

    private void botonConsultarActionPerformed(ActionEvent evt) {
        ventanaEleccion.setVisible(true);
        this.dispose();
    }

    private void botonSalirActionPerformed(ActionEvent evt) {
        manejador.cierraVentanas();
        this.dispose();
    }

    ///////////////////////////////////////////////////////////////////////////
    ////// Getters & Setters

    public estados getEstado() {
        return this.estado;
    }

    public void setEstado(estados estado) {
        this.estado = estado;
    }
}
