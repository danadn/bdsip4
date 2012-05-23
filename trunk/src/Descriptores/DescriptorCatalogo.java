/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Descriptores;

/**
 *
 * @author Daniel
 */
public class DescriptorCatalogo {

    private String nombre;
    private String tipo;
    private String fuente;
    private String formato;
    private String URI;

    public DescriptorCatalogo(String nombre, String tipo, String fuente, String formato, String URI) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fuente = fuente;
        this.formato = formato;
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

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
