/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Descriptores;

import java.sql.Date;

/**
 *
 * @author Daniel
 */
public class DescriptorCargo {
    private String cargo;
    private String descCargo;
    private Date FechaIni;
    private Date FechaFin;
    private DescriptorFichero fichero;

    public DescriptorCargo(String cargo, String descCargo, Date FechaIni, Date FechaFin, DescriptorFichero fichero) {
        this.cargo = cargo;
        this.descCargo = descCargo;
        this.FechaIni = FechaIni;
        this.FechaFin = FechaFin;
        this.fichero = fichero;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }

    public Date getFechaIni() {
        return FechaIni;
    }

    public void setFechaIni(Date FechaIni) {
        this.FechaIni = FechaIni;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescCargo() {
        return descCargo;
    }

    public void setDescCargo(String descCargo) {
        this.descCargo = descCargo;
    }

    public DescriptorFichero getFichero() {
        return fichero;
    }

    public void setFichero(DescriptorFichero fichero) {
        this.fichero = fichero;
    }

}
