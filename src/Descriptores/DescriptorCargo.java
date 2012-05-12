/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Descriptores;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class DescriptorCargo {
    private String cargo;
    private String descCargo;
    private Date FechaIni;
    private Date FechaFin;
    private ArrayList<DescriptorFichero> fichero;

    public DescriptorCargo(String cargo, String descCargo, Date FechaIni, Date FechaFin,ArrayList<DescriptorFichero> fichero) {
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

    public void addFichero(DescriptorFichero f){
        if (this.fichero.contains(f))
            this.fichero.add(f);
    }
}
