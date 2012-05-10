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
    private VentanaCrearPj vPj;
    private estados estado;
    private BBDDManager bd;

    // documento sobre el que se trabaja en caso de crear uno:
    private DescriptorDocumento documento;

    public GUIManager() throws SQLException{
        bd = new BBDDManager(this);
        v1 = new Ventana1(this);
        v2 = new Ventana2(this);
        v3 = new Ventana3(this);
        v4 = new Ventana4(this);
        vM = new VentanaMuestra(this);
        vPj = new VentanaCrearPj(this);
        v1.setEnabled(true);
        v1.setVisible(true);
        estado = estados.VENTANA1;
    }

    public void cierraVentanas(){
        v2.dispose();
        v3.dispose();
        v4.dispose();
        vM.dispose();
        vPj.dispose();
        bd.close();
    }

    public estados getEstado(){
        return estado;
    }

    public BBDDManager getBBDDManager(){
        return bd;
    }

    public void cambiaEstado(estados s){
        estado = s;
        switch(estado){
            case VENTANA1:
                v1.setVisible(true);
                v2.setVisible(false);
                v3.setVisible(false);
                v4.setVisible(false);
                vM.setVisible(false);
                vPj.setVisible(false);
                break;
            case VENTANA2:
                v1.setVisible(false);
                v2.mandaEstadoV1(v1.getEstado());
                v2.setVisible(true);
                v3.setVisible(false);
                v4.setVisible(false);
                vM.setVisible(false);
                vPj.setVisible(false);
                break;
            case VENTANA3:
                v1.setVisible(false);
                v2.setVisible(false);
                v3.setVisible(true);
                v4.setVisible(false);
                vM.setVisible(false);
                vPj.setVisible(false);
                break;
            case CREAR_PERSONAJE:
                v1.setVisible(false);
                v2.setVisible(false);
                v3.setVisible(false);
                v4.setVisible(false);
                vM.setVisible(false);
                vPj.setVisible(true);
                break;
            case CREAR_ACONTECIMIENTO:
                v1.setVisible(false);
                v2.setVisible(false);
                v3.setVisible(false);
                v4.setVisible(false);
                vM.setVisible(false);
                vPj.setVisible(false);
                break;
            case CREAR_COLECTIVO:
                v1.setVisible(false);
                v2.setVisible(false);
                v3.setVisible(false);
                v4.setVisible(false);
                vM.setVisible(false);
                vPj.setVisible(false);
                break;
            case BBDD_COLECTIVO:
                v1.setVisible(false);
                v2.setVisible(false);
                v3.setVisible(false);
                v4.setVisible(false);
                vM.mandaEstadoV1(v1.getEstado());
                vM.setVisible(true);
                vPj.setVisible(false);
                break;
            case BBDD_PERSONAJE:
                v1.setVisible(false);
                v2.setVisible(false);
                v3.setVisible(false);
                v4.setVisible(false);
                vM.mandaEstadoV1(v1.getEstado());
                vM.setVisible(true);
                vPj.setVisible(false);
                break;
            case BBDD_ACONTECIMIENTO:
                v1.setVisible(false);
                v2.setVisible(false);
                v3.setVisible(false);
                v4.setVisible(false);
                vM.mandaEstadoV1(v1.getEstado());
                vM.setVisible(true);
                vPj.setVisible(false);
                break;
            case MODIFICAR:
                v1.setVisible(false);
                v2.setVisible(false);
                v3.setVisible(false);
                v4.setVisible(true);
                vM.setVisible(false);
                vPj.setVisible(false);
                break;
            default:
                estado = estados.VENTANA1;
                break;
        }
    }

    public DescriptorDocumento getDocumento() {
        return documento;
    }

    public void setDocumento(DescriptorDocumento documento) {
        this.documento = documento;
    }
}
