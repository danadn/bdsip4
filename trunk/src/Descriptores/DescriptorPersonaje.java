package Descriptores;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Daniel
 */
public class DescriptorPersonaje {
    private String nombreYApe;
    private String lugarMuerte;
    private String lugarNacimiento;
    private String biografia;
    private Date fechaNac;
    private Date fechaMuerte;
    private ArrayList<DescriptorCargo> cargos;
    private ArrayList<String> alias;

    public DescriptorPersonaje(String nombreYApe, String lugarMuerte, String biografia, Date fechaNac, Date fechaMuerte, ArrayList<DescriptorCargo> cargos, ArrayList<String> alias) {
        this.nombreYApe = nombreYApe;
        this.lugarMuerte = lugarMuerte;
        this.biografia = biografia;
        this.fechaNac = fechaNac;
        this.fechaMuerte = fechaMuerte;
        this.cargos = cargos;
        this.alias = alias;
    }

    public DescriptorPersonaje() {
        nombreYApe = "";
        lugarMuerte = "";
        lugarNacimiento = "";
        biografia = "";
        cargos = new ArrayList<DescriptorCargo>();
        alias = new ArrayList<String>();
    }

    public ArrayList<String> getAlias() {
        return alias;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public void eliminaAlias(String nombreAlias) {
        Iterator it = alias.iterator();
        int i = 0;
        while (it.hasNext()){
            String a = (String) it.next();
            if (a.equals(nombreAlias)){
                alias.remove(i);
            }
            i++;
        }
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public ArrayList<DescriptorCargo> getCargos() {
        return cargos;
    }

    public void eliminaCargo(String nombreCargo) {
        Iterator it = cargos.iterator();
        int i = 0;
        while (it.hasNext()){
            DescriptorCargo cargo = (DescriptorCargo) it.next();
            if (cargo.getCargo().equals(nombreCargo)){
                cargos.remove(i);
            }
            i++;
        }
    }

    public Date getFechaMuerte() {
        return fechaMuerte;
    }

    public void setFechaMuerte(Date fechaMuerte) {
        this.fechaMuerte = fechaMuerte;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getLugarMuerte() {
        return lugarMuerte;
    }

    public void setLugarMuerte(String lugarMuerte) {
        this.lugarMuerte = lugarMuerte;
    }

    public String getNombreYApe() {
        return nombreYApe;
    }

    public void setNombreYApe(String nombreYApe) {
        this.nombreYApe = nombreYApe;
    }

    public boolean isAlias(String text) {
        Iterator it = alias.iterator();
        while (it.hasNext()){
            String a = (String) it.next();
            if (a.equals(text)){
                return true;
            }
        }
        return false;
    }
    public boolean isCargo(String text) {
        Iterator it = cargos.iterator();
        while (it.hasNext()){
            DescriptorCargo a = (DescriptorCargo) it.next();
            if (a.getCargo().equals(text)){
                return true;
            }
        }
        return false;
    }
}
