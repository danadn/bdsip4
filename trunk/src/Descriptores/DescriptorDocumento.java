/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Descriptores;

import java.util.ArrayList;

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

    public ArrayList<DescriptorCatalogo> getCatalogaciones() {
        return catalogaciones;
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
}
