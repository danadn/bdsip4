/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Descriptores;

/**
 *
 * @author Daniel
 */
public class DescriptorFichero {
    private String nombre;
    private String formato;
    private String fuente;
    private String URI;

    public DescriptorFichero(String nombre, String formato, String fuente, String URI) {
        this.nombre = nombre;
        this.formato = formato;
        this.fuente = fuente;
        this.URI = URI;
    }

    public String getURI() {
        return URI;
    }

    public void setURI(String URI) {
        this.URI = URI;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
