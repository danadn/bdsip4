package BBDD;

import Ventanas.GUIManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Daniel
 */
public class BBDDManager {

    private GUIManager manejador;
    private Connection conexion;
    ////////////////////////////////////////////////////////////////////////////
    ////// Constructora
    public BBDDManager(GUIManager m) throws SQLException{
        manejador = m;
        // Se utiliza un try para capturar los posibles errores de MySQL
        try {
        // Se registra el Driver de MySQL
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            /*Se crea una conexión a la base de datos indicando la dirección de la base de datos, el usuario y el
            password*/
            conexion = DriverManager.getConnection("jdbc:mysql://localhost", "root", "");
            try {
                //Se crea un objeto de la clase Statement para poder enviar comandos SQL a la base de datos
                Statement st = null;
                // Creamos la base dochistoria
                creaTablas(st,conexion);
                // Seleccionamos la base de datos creada
                conexion.setCatalog("dochistoria");
                // Rellenamos la BBDD
                rellenaTablas(st,conexion);
                //Realizamos las consultas
                //consultaTablas(st,conexion);
                System.out.println("BBDD cargada con exito.");
            } finally {
               //conexion.close();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
            conexion.close();
        }
    }

    ////////////////////////////////////////////////////////////////////////////
    ////// Consultas
    public String consultaPeticion(String consulta, String campo) throws SQLException {
        Statement st = null;
        String resultado = "";
        st = conexion.createStatement();
        ResultSet rs = st.executeQuery(consulta);
        //resultado = (String) rs.getString(campo);
        while(rs.next()){
            resultado += rs.getString(campo) + ",";
        }
        resultado = resultado.substring(0, resultado.length()-1);
        rs.close();
        st.close();
        System.out.println("Respuesta a "+campo+": "+resultado);
        return resultado;
    }

    public void consultaInsetar(String consulta) throws SQLException {
        Statement st = conexion.createStatement();
        String[] consultas = consulta.split(";");
        for (int i=0; i<consultas.length; i++)
            st.executeUpdate(consultas[i]+";");
        st.close();
    }
    
    public void creaDescripcion(String titulo, String descCont) throws SQLException{
        Statement st = conexion.createStatement();
        String consulta = "INSERT INTO descripcion (titulo,descContenido) VALUES "
                + "('"+titulo+"','"+descCont+"');";
        st.executeUpdate(consulta);
        st.close();       
    }  
    
    public void creaCatalogacion(String nombre, String tipo, String fuente,
                                        String formato, String URI) throws SQLException{
        Statement st = conexion.createStatement();
        String consulta = "INSERT INTO catalogacion (nombreCat,tipo,fuente,formato,uri) VALUES" +
                "('"+nombre+"','"+tipo+"','"+fuente+"','"+formato+"','"+URI+"');";
        st.executeUpdate(consulta);
        st.close();       
    }

    public void creaDocumento(String titulo) throws SQLException {
        int id = Integer.parseInt(consultaPeticion("SELECT max(id) as id FROM documento;", "id"));
        id++;
        Statement st = conexion.createStatement();
        String consulta = "INSERT INTO documento (id,descripcion) VALUES" +
                "('"+id+"','"+titulo+"');";
        st.executeUpdate(consulta);
        st.close();  
    }
    
    public void creaFicheroDesc(String nombre, String formato, String URI) throws SQLException {
        String consulta = "INSERT INTO fichero_descripcion (nombreFichDoc,formatoFichDoc,uriFichDoc)" +
                 " VALUES ('"+nombre+"','"+formato+"','"+URI+"');";
        Statement st = conexion.createStatement();
        st.executeUpdate(consulta);
        st.close();  
    }
    public void creaFicheroCol(String nombre, String formato, String URI) throws SQLException {
        String consulta = "INSERT INTO fichero_colectivo (nombreFichCol,formatoFichCol,uriFichCol)" +
                 " VALUES ('"+nombre+"','"+formato+"','"+URI+"');";
        Statement st = conexion.createStatement();
        st.executeUpdate(consulta);
        st.close();  
    }
    public void creaFicheroAcont(String nombre, String formato, String URI) throws SQLException {
        String consulta = "INSERT INTO fichero_acontecimiento (nombreFichAcont,formatoFichAcont,uriFichAcont)" +
                 " VALUES ('"+nombre+"','"+formato+"','"+URI+"');";
        Statement st = conexion.createStatement();
        st.executeUpdate(consulta);
        st.close();  
    }
    public void creaFicheroCargo(String nombre, String formato, String URI) throws SQLException {
        String consulta = "INSERT INTO fichero_cargo (nombreFichCargo,formatoFichCargo,uriFichCargo)" +
                 " VALUES ('"+nombre+"','"+formato+"','"+URI+"');";
        Statement st = conexion.createStatement();
        st.executeUpdate(consulta);
        st.close();  
    }

    ////////////////////////////////////////////////////////////////////////////
    ////// Funciones de fichero y carga de la BBDD
    private void creaTablas(Statement st, Connection conexion) throws SQLException {
        String consulta = leeFichero("./ScriptsSQL/crearBBDD.sql");
        st = conexion.createStatement();
        String[] consultas = consulta.split(";");
        for (int i=0; i<consultas.length; i++)
            st.executeUpdate(consultas[i]+";");
        st.close();
    }

    private void rellenaTablas(Statement st, Connection conexion) throws SQLException {
        //Se abre un nuevo statement para enviar commandos SQL a la nueva base de datos
        String consulta = leeFichero("./ScriptsSQL/rellenarBBDD.sql");
        st = conexion.createStatement();
        String[] consultas = consulta.split(";");
        for (int i=0; i<consultas.length; i++)
            st.executeUpdate(consultas[i]+";");
        st.close();
    }

    private String leeFichero(String url){
        String consulta = "";
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File (url);
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);
            // Lectura del fichero
            String linea;
            while((linea=br.readLine())!=null){
                consulta += ' '+linea;
            }
        }
        catch(Exception e){
            System.out.println(e.toString());
        }finally{
            try{
                if( null != fr ){
                fr.close();
            }
            }catch (Exception e2){
            System.out.println(e2.toString());
            }
        }
        return consulta;
    }   
    
    public void close() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
