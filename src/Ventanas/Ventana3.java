/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author Daniel
 */
public final class Ventana3 extends JFrame {

    private int botonPulsado;
    // Paneles
    private JPanel panelVentana1 = null;
    private JFrame ventanaEleccion;
    // Botones
    private JButton botonPersonaje;
    private JButton botonColectivo;
    private JButton botonAcont;
    private JButton botonTerminar;
    private GUIManager manejador;
    private estados estado;

    public Ventana3(GUIManager m) {
        super();
        manejador = m;
        crearInterfaz();
    }

    public void crearInterfaz() {
        botonPulsado = 0;
        this.setSize(200, 300);
        this.setContentPane(getPanelPpal());
        this.setLocationRelativeTo(null);
        this.setTitle("Ventana 3");
        this.setDefaultCloseOperation(0);
        construyeVentanaEleccion();
    }

    private JPanel getPanelPpal() {
        if (estado == estado.MODIFICAR) {
            panelVentana1 = new JPanel(new GridLayout(4, 1));
            botonPersonaje = new JButton("Añadir/Modificar Personaje");
            botonColectivo = new JButton("Añadir/Modificar Colectivo");
            botonAcont = new JButton("Añadir/Modificar Acontecimiento");
            botonTerminar = new JButton("Terminar");
            panelVentana1.add(botonPersonaje);
            panelVentana1.add(botonColectivo);
            panelVentana1.add(botonAcont);
            panelVentana1.add(botonTerminar);

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
            botonTerminar.addActionListener(new java.awt.event.ActionListener() {

                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonTerminarActionPerformed(evt);
                }
            });

            panelVentana1.validate();
            return panelVentana1;
        } else {
            panelVentana1 = new JPanel(new GridLayout(4, 1));
            botonPersonaje = new JButton("Añadir Personaje");
            botonColectivo = new JButton("Añadir Colectivo");
            botonAcont = new JButton("Añadir Acontecimiento");
            botonTerminar = new JButton("Terminar");
            panelVentana1.add(botonPersonaje);
            panelVentana1.add(botonColectivo);
            panelVentana1.add(botonAcont);
            panelVentana1.add(botonTerminar);

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
            botonTerminar.addActionListener(new java.awt.event.ActionListener() {

                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonTerminarActionPerformed(evt);
                }
            });

            panelVentana1.validate();
            return panelVentana1;
        }
    }

    ;

    ///////////////////////////////////////////////////////////////////////////
    ////// Eventos de Boton
    private void botonPersonajeActionPerformed(ActionEvent evt) {
        botonPulsado = 1;
        ventanaEleccion.setVisible(true);
        this.setVisible(false);
    }

    private void botonColectivoActionPerformed(ActionEvent evt) {
        botonPulsado = 2;
        ventanaEleccion.setVisible(true);
        this.setVisible(false);
    }

    private void botonAcontActionPerformed(ActionEvent evt) {
        botonPulsado = 3;
        ventanaEleccion.setVisible(true);
        this.setVisible(false);
    }

    private void botonTerminarActionPerformed(ActionEvent evt) {
        manejador.setId(null);
        manejador.cambiaEstado(estados.VENTANA1);
    }

    private void botonCrearNuevoActionPerformed(ActionEvent evt) {
        if(manejador.getId()!=null)
            manejador.getV1().setEstado(estados.CREAR);
        switch (botonPulsado) {
            case 1:
                manejador.cambiaEstado(estados.CREAR_PERSONAJE);
                break;
            case 2:
                manejador.cambiaEstado(estados.CREAR_COLECTIVO);
                break;
            case 3:
                manejador.cambiaEstado(estados.CREAR_ACONTECIMIENTO);
                break;
            default:
                break;
        }
        botonPulsado = 0;
        ventanaEleccion.setVisible(false);
    }
    
    private void botonAddDeBBDDActionPerformed(ActionEvent evt) {
         if(manejador.getId()!=null)
            manejador.getV1().setEstado(estados.CREAR);
        switch (botonPulsado) {
            case 1:
                manejador.cambiaEstado(estados.BBDD_PERSONAJE);
                break;
            case 2:
                manejador.cambiaEstado(estados.BBDD_COLECTIVO);
                break;
            case 3:
                manejador.cambiaEstado(estados.BBDD_ACONTECIMIENTO);
                break;
            default:
                break;
        }
        botonPulsado = 0;
        ventanaEleccion.setVisible(false);
    }

    private void botonModificaActionPerformed(ActionEvent evt) {
        if(manejador.getId()!=null)
            manejador.getV1().setEstado(estados.MODIFICAR);
        switch (botonPulsado) {
            case 1:
                manejador.cambiaEstado(estados.BBDD_PERSONAJE);
                break;
            case 2:
                manejador.cambiaEstado(estados.BBDD_COLECTIVO);
                break;
            case 3:
                manejador.cambiaEstado(estados.BBDD_ACONTECIMIENTO);
                break;
            default:
                break;
        }
        botonPulsado = 0;
        ventanaEleccion.setVisible(false);
    }

    private void construyeVentanaEleccion() {
        if (estado == estado.MODIFICAR) {
            ventanaEleccion = new JFrame("Elige opción");
            JPanel panel = new JPanel(new GridLayout(3, 1));
            JButton botonCrearNuevo = new JButton("Crear Nuevo");
            JButton botonAddDeBBDD = new JButton("Añadir de la BBDD");
            JButton botonModifica = new JButton("Modificar de la BBDD");
            panel.add(botonCrearNuevo);
            panel.add(botonAddDeBBDD);
            panel.add(botonModifica);
            ventanaEleccion.setContentPane(panel);
            ventanaEleccion.validate();
            ventanaEleccion.setVisible(false);
            ventanaEleccion.setMinimumSize(new Dimension(250, 200));
            ventanaEleccion.setLocationRelativeTo(null);
            ventanaEleccion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            botonModifica.addActionListener(new java.awt.event.ActionListener() {

                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonModificaActionPerformed(evt);
                    ventanaEleccion.dispose();
                }
            });
            botonAddDeBBDD.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonAddDeBBDDActionPerformed(evt);
                    ventanaEleccion.dispose();
                }
            });
            botonCrearNuevo.addActionListener(new java.awt.event.ActionListener() {

                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonCrearNuevoActionPerformed(evt);
                    ventanaEleccion.dispose();
                }
            });
        } else {
            ventanaEleccion = new JFrame("Elige opción");
            JPanel panel = new JPanel(new GridLayout(2, 1));
            JButton botonCrearNuevo = new JButton("Crear Nuevo");
            JButton botonAddDeBBDD = new JButton("Añadir de la BBDD");
            panel.add(botonCrearNuevo);
            panel.add(botonAddDeBBDD);
            ventanaEleccion.setContentPane(panel);
            ventanaEleccion.validate();
            ventanaEleccion.setVisible(false);
            ventanaEleccion.setMinimumSize(new Dimension(250, 100));
            ventanaEleccion.setLocationRelativeTo(null);
            ventanaEleccion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            botonAddDeBBDD.addActionListener(new java.awt.event.ActionListener() {

                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonAddDeBBDDActionPerformed(evt);
                    ventanaEleccion.dispose();
                }
            });
            botonCrearNuevo.addActionListener(new java.awt.event.ActionListener() {

                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    botonCrearNuevoActionPerformed(evt);
                    ventanaEleccion.dispose();
                }
            });
        }
    }

    void mandaEstadoV1(estados s) {
        estado = s;
        if(s==estados.MODIFICAR){
            botonPersonaje.setText("Modificar Personaje");
            botonColectivo.setText("Modificar Colectivo");
            botonAcont.setText("Modificar Acontecimiento");
            construyeVentanaEleccion();
        }else if(s==estados.CREAR){
            botonPersonaje.setText("Añadir Personaje");
            botonColectivo.setText("Añadir Colectivo");
            botonAcont.setText("Añadir Acontecimiento");
            construyeVentanaEleccion();
        }
    }
}
