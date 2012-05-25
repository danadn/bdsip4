package Ventanas;

import BBDD.BBDDManager;
import java.sql.SQLException;

enum estados{CREAR,MODIFICAR,CONSULTAR,VENTANA1,VENTANA2,VENTANA3,
            CREAR_PERSONAJE,CREAR_ACONTECIMIENTO,CREAR_COLECTIVO,BBDD_PERSONAJE,
            BBDD_COLECTIVO,BBDD_ACONTECIMIENTO,BBDD_DOCUMENTO,
            BUSQUEDA_SIMPLE,BUSQUEDA_AVANZADA,CONSULTA_DOC};
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
    private VentanaCrearCol vCrearCol;
    private VentanaCrearAcont vCrearAcont;
    private VentanaBusqSimple vBusqSimple;
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
        vCrearCol = new VentanaCrearCol(this);
        vCrearAcont = new VentanaCrearAcont(this);
        vBusqSimple = new VentanaBusqSimple(this);
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
        vCrearCol.dispose();
        vCrearAcont.dispose();
        vBusqSimple.dispose();
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
    
    public VentanaCrearAcont getVentanaAcont(){
        return vCrearAcont;
    };
    
    public VentanaCrearCol getVentanaCol(){
        return vCrearCol;
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
                vCrearCol.setVisible(false);
                vCrearAcont.setVisible(false);
                vBusqSimple.setVisible(false);
                mod=false;
                break;
            case VENTANA2:
                v1.setVisible(false);
                v2.cambiaEstados(estadosDoc.CREAR);
                v2.setVisible(true);
                v3.setVisible(false);
                v4.setVisible(false);
                vM.setVisible(false);
                vCrearPj.setVisible(false);
                vCrearCol.setVisible(false);
                vCrearAcont.setVisible(false);
                vBusqSimple.setVisible(false);
                mod=false;
                break;
            case VENTANA3:
                v1.setVisible(false);
                v2.setVisible(false);
                v3.setVisible(true);
                v4.setVisible(false);
                vM.setVisible(false);
                vCrearPj.setVisible(false);
                vCrearCol.setVisible(false);
                vCrearAcont.setVisible(false);
                vBusqSimple.setVisible(false);
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
                vCrearCol.setVisible(false);
                vCrearAcont.setVisible(false);
                vBusqSimple.setVisible(false);
                mod=false;
                break;
            case CREAR_ACONTECIMIENTO:
                v1.setVisible(false);
                v2.setVisible(false);
                v3.setVisible(false);
                v4.setVisible(false);
                vM.setVisible(false);
                vCrearPj.setVisible(false);
                vCrearCol.setVisible(false);
                vCrearAcont.mandaEstadoV1(v1.getEstado());
                vCrearAcont.setVisible(true);
                vBusqSimple.setVisible(false);
                mod=false;
                break;
            case CREAR_COLECTIVO:
                v1.setVisible(false);
                v2.setVisible(false);
                v3.setVisible(false);
                v4.setVisible(false);
                vM.setVisible(false);
                vCrearPj.setVisible(false);
                vCrearCol.setVisible(true);
                vCrearAcont.setVisible(false);
                vBusqSimple.setVisible(false);
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
                vCrearCol.setVisible(false);
                vCrearAcont.setVisible(false);
                vBusqSimple.setVisible(false);
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
                vCrearCol.setVisible(false);
                vCrearAcont.setVisible(false);
                vBusqSimple.setVisible(false);
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
                vCrearCol.setVisible(false);
                vCrearAcont.setVisible(false);
                vBusqSimple.setVisible(false);
                break;
            case MODIFICAR:
                v1.setVisible(false);
                v2.setVisible(false);
                v3.setVisible(false);
                v4.setVisible(true);
                vM.setVisible(false);
                vCrearPj.setVisible(false);
                vCrearCol.setVisible(false);
                vCrearAcont.setVisible(false);
                vBusqSimple.setVisible(false);
                mod=true;
                break;
            case BUSQUEDA_SIMPLE:
                v1.setVisible(false);
                v2.setVisible(false);
                v3.setVisible(false);
                v4.setVisible(false);
                vM.setVisible(false);
                vCrearPj.setVisible(false);
                vCrearCol.setVisible(false);
                vCrearAcont.setVisible(false);
                vBusqSimple.setVisible(true);
                break;
            case BUSQUEDA_AVANZADA:
                break;
            case CONSULTA_DOC:
                v1.setVisible(false);
                v2.cambiaEstados(estadosDoc.CONSULTA);
                v2.setVisible(true);
                v3.setVisible(false);
                v4.setVisible(false);
                vM.setVisible(false);
                vCrearPj.setVisible(false);
                vCrearCol.setVisible(false);
                vCrearAcont.setVisible(false);
                vBusqSimple.setVisible(false);
                mod=false;
                break;
            default:
                estado = estados.VENTANA1;
                break;
        }
    }

    public BBDDManager getBd() {
        return bd;
    }

    public boolean isMod() {
        return mod;
    }

    public Ventana1 getV1() {
        return v1;
    }

    public Ventana2 getV2() {
        return v2;
    }

    public Ventana3 getV3() {
        return v3;
    }

    public Ventana4 getV4() {
        return v4;
    }

    public VentanaBusqSimple getvBusqSimple() {
        return vBusqSimple;
    }

    public VentanaCrearAcont getvCrearAcont() {
        return vCrearAcont;
    }

    public VentanaCrearCol getvCrearCol() {
        return vCrearCol;
    }

    public VentanaCrearPj getvCrearPj() {
        return vCrearPj;
    }

    public VentanaMuestra getvM() {
        return vM;
    }
}
