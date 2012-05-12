/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Descriptores;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Daniel
 */
enum tipoCat{lista_valores, taxonomia, tesauro}

public class DescriptorDocumento {

    private String titulo;
    private String descContenido;
    private ArrayList<DescriptorCatalogo> catalogaciones;
    private ArrayList<DescriptorPersonaje> personajes;
    private ArrayList<DescriptorFichero> ficheros;

    public DescriptorDocumento(){
        titulo = "";
        descContenido = "";
        catalogaciones = new ArrayList<DescriptorCatalogo>();
        personajes = new ArrayList<DescriptorPersonaje>();
        ficheros = new ArrayList<DescriptorFichero>();
    }

    public ArrayList<DescriptorCatalogo> getCatalogaciones() {
        return catalogaciones;
    }

    public ArrayList<DescriptorFichero> getFicheros() {
        return ficheros;
    }

    public void setCatalogaciones(ArrayList<DescriptorCatalogo> catalogaciones) {
        this.catalogaciones = catalogaciones;
    }

    public String getDescContenido() {
        return descContenido;
    }

    public void setDescContenido(String descContenido) {
        this.descContenido = descContenido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<DescriptorPersonaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(ArrayList<DescriptorPersonaje> personajes) {
        this.personajes = personajes;
    }

    public void addPersonaje(DescriptorPersonaje personaje) {
        if (!personajes.contains(personaje)){
            this.personajes.add(personaje);
        }
    }
    public void addFichero(DescriptorFichero fich) {
        if (!ficheros.contains(fich)){
            this.ficheros.add(fich);
        }
    }
    public void addCatalogo(DescriptorCatalogo cat) {
        if (!catalogaciones.contains(cat)){
            this.catalogaciones.add(cat);
        }
    }
}
