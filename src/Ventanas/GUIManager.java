package Ventanas;

import BBDD.BBDDManager;
import Descriptores.DescriptorDocumento;
import java.sql.SQLException;

enum estados{CREAR,MODIFICAR,CONSULTAR,VENTANA1,VENTANA2,VENTANA3,
            CREAR_PERSONAJE,CREAR_ACONTECIMIENTO,CREAR_COLECTIVO,BBDD_PERSONAJE,
             BBDD_COLECTIVO,BBDD_ACONTECIMIENTO,BBDD_DOCUMENTO};
/**
 *
 * @author Daniel
 */
public class GUIManager {
    private Ventana1 v1;
    private Ventana2 v2;
    private Ventana3 v3;
    private Ventana4 v4;
    private VentanaMuestra vM;
    private VentanaCrearPj vCrearPj;
    private VentanaCrearCol vCearCol;
    private VentanaCrearAcont vCrearAcont;
    private estados estado;
    private BBDDManager bd;
    
    private boolean mod;

    public GUIManager() throws SQLException{
        bd = new BBDDManager(this);
        v1 = new Ventana1(this);
        v2 = new Ventana2(this);
        v3 = new Ventana3(this);
        v4 = new Ventana4(this);
        vM = new VentanaMuestra(this);
        vCrearPj = new VentanaCrearPj(this);
        vCearCol = new VentanaCrearCol(this);
        vCrearAcont = new VentanaCrearAcont(this);
        v1.setEnabled(true);
        v1.setVisible(true);
        estado = estados.VENTANA1;
        
        mod=false;
    }

    public void cierraVentanas(){
        v2.dispose();
        v3.dispose();
        v4.dispose();
        vM.dispose();
        vCrearPj.dispose();
        vCearCol.dispose();
        bd.close();
    }

    public estados getEstado(){
        return estado;
    }

    public BBDDManager getBBDDManager(){
        return bd;
    }
    
    public VentanaCrearPj getVentanaPj(){
        return vCrearPj;
    };

    public void cambiaEstado(estados s){
        estado = s;
        switch(estado){
            case VENTANA1:
                v1.setVisible(true);
                v2.setVisible(false);
                v3.setVisible(false);
                v4.setVisible(false);
                vM.setVisible(false);
                vCrearPj.setVisible(false);
                vCearCol.setVisible(false);
                vCrearAcont.setVisible(false);
                mod=false;
                break;
            case VENTANA2:
                v1.setVisible(false);
                v2.setVisible(true);
                v3.setVisible(false);
                v4.setVisible(false);
                vM.setVisible(false);
                vCrearPj.setVisible(false);
                vCearCol.setVisible(false);
                vCrearAcont.setVisible(false);
                mod=false;
                break;
            case VENTANA3:
                v1.setVisible(false);
                v2.setVisible(false);
                v3.setVisible(true);
                v4.setVisible(false);
                vM.setVisible(false);
                vCrearPj.setVisible(false);
                vCearCol.setVisible(false);
                vCrearAcont.setVisible(false);
                mod=false;
                break;
            case CREAR_PERSONAJE:
                v1.setVisible(false);
                v2.setVisible(false);
                v3.setVisible(false);
                v4.setVisible(false);
                vM.setVisible(false);
                vCrearPj.mandaEstadoV1(v1.getEstado());
                vCrearPj.setVisible(true);
                vCearCol.setVisible(false);
                vCrearAcont.setVisible(false);
                mod=false;
                break;
            case CREAR_ACONTECIMIENTO:
                v1.setVisible(false);
                v2.setVisible(false);
                v3.setVisible(false);
                v4.setVisible(false);
                vM.setVisible(false);
                vCrearPj.setVisible(false);
                vCearCol.setVisible(false);
                vCrearAcont.setVisible(true);
                mod=false;
                break;
            case CREAR_COLECTIVO:
                v1.setVisible(false);
                v2.setVisible(false);
                v3.setVisible(false);
                v4.setVisible(false);
                vM.setVisible(false);
                vCrearPj.setVisible(false);
                vCearCol.setVisible(true);
                vCrearAcont.setVisible(false);
                mod=false;
                break;
            case BBDD_COLECTIVO:
                v1.setVisible(false);
                v2.setVisible(false);
                v3.setVisible(false);
                v4.setVisible(false);
                vM.setMod(mod);
                vM.mandaEstadoV1(v1.getEstado());
                vM.setVisible(true);
                vCrearPj.setVisible(false);
                vCearCol.setVisible(false);
                vCrearAcont.setVisible(false);
                break;
            case BBDD_PERSONAJE:
                v1.setVisible(false);
                v2.setVisible(false);
                v3.setVisible(false);
                v4.setVisible(false);
                vM.setMod(mod);
                vM.mandaEstadoV1(v1.getEstado());
                vM.setVisible(true);
                vCrearPj.setVisible(false);
                vCearCol.setVisible(false);
                vCrearAcont.setVisible(false);
                break;
            case BBDD_ACONTECIMIENTO:
                v1.setVisible(false);
                v2.setVisible(false);
                v3.setVisible(false);
                v4.setVisible(false);
                vM.setMod(mod);
                vM.mandaEstadoV1(v1.getEstado());
                vM.setVisible(true);
                vCrearPj.setVisible(false);
                vCearCol.setVisible(false);
                vCrearAcont.setVisible(false);
                break;
            case MODIFICAR:
                v1.setVisible(false);
                v2.setVisible(false);
                v3.setVisible(false);
                v4.setVisible(true);
                vM.setVisible(false);
                vCrearPj.setVisible(false);
                vCearCol.setVisible(false);
                vCrearAcont.setVisible(false);
                mod=true;
                break;
            default:
                estado = estados.VENTANA1;
                break;
        }
    }
}
