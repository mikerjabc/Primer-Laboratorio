package AccesoADatos;

import LogicaDeNegocio.Perfil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Collection;
import oracle.jdbc.OracleTypes;
/**
 *
 * @author Estudiante
 */
public class ServicioPerfil extends Servicio {
     
     private static final String insertarPerfil = "{call insertarPerfil (?,?,?,?,?)}";
     private static final String listarPerfiles = "{?=call listarPerfil()}";
     private static final String buscarPerfil = "{?=call buscarPerfil(?)}";
     private static final String actualizarPerfil ="{call modificarPerfil (?,?,?,?,?)}";
     private static final String eliminarPerfil  = "{call eliminarPerfil(?)}";
    
    
    public ServicioPerfil() {
    }
    
    public Collection listar() throws GlobalException, NoDataException
    {      
        try {
            conectar();      
        }
        catch(ClassNotFoundException ex)
        {
            throw new GlobalException("No se ha localizado el Driver");
        }
        
        catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }      
        
        ResultSet rs=null;
        ArrayList coleccion= new ArrayList();
        Perfil elPerfil = null;
        CallableStatement pstmt=null;
        try{
            pstmt = conexion.prepareCall(listarPerfiles);          
            pstmt.registerOutParameter(1,OracleTypes.CURSOR);
            pstmt.execute();
            rs = (ResultSet)pstmt.getObject(1); 
             while (rs.next()) {
                elPerfil = new Perfil(rs.getString("nombre"),
                                      rs.getString("apellidos"),
                                      rs.getString("nombreUsuario"));      
                coleccion.add(elPerfil);
            }
        } catch (SQLException e) {
          e.printStackTrace();
          
       throw new GlobalException("Sentencia no valida");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
        if (coleccion == null || coleccion.size() == 0) {
            throw new NoDataException("No hay datos");
        }
        return coleccion;
    }
    
    public void insertarPerfil(Perfil elPerfil) throws GlobalException, NoDataException  	{
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
         CallableStatement pstmt=null;  
                                
        try {
            pstmt = conexion.prepareCall(insertarPerfil);                                    
            pstmt.setString(1,elPerfil.getNombre());
            pstmt.setString(2,elPerfil.getApellidos());
            pstmt.setString(3,elPerfil.getNombreUsuario());
            
            boolean resultado = pstmt.execute();
            if (resultado == true) {
                throw new NoDataException ("No se realizo la inserci�n");
            } 
            
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException("Llave duplicada");
        } 
         finally {
            try {
                if (pstmt != null) {
                    pstmt.close();                    
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
    }
    
    public void actualizarPerfil(Perfil elPerfil) throws GlobalException, NoDataException  {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        PreparedStatement pstmt = null;
        try {
            pstmt = conexion.prepareCall(actualizarPerfil);                                    
            pstmt.setString(1,elPerfil.getNombre());
            pstmt.setString(2,elPerfil.getApellidos());
            pstmt.setString(3,elPerfil.getNombreUsuario());
           
            int resultado = pstmt.executeUpdate();
            
            //si es diferente de 0 es porq si afecto un registro o mas
            if (resultado != 0) {
                throw new NoDataException ("No se realizo la actualizaci�n");
            }
            else{
               System.out.println("\nModificaci�n Satisfactoria!");
            }
        } catch (SQLException e) {
            throw new GlobalException("Sentencia no valida");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
    }     
    
    public void eliminarPerfil(String id ) throws GlobalException, NoDataException  {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        PreparedStatement pstmt = null;
        try {
            pstmt = conexion.prepareStatement(eliminarPerfil);
            pstmt.setString(1,"id");

            int resultado = pstmt.executeUpdate();
            
            if (resultado != 0) {
                throw new NoDataException ("No se realizo el borrado");
            }
            else{
               System.out.println("\nEliminaci�n Satisfactoria!");
            }
        } catch (SQLException e) {
            throw new GlobalException("Sentencia no valida");
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
    }       
    
    public Perfil buscarPerfil(String id ) throws GlobalException, NoDataException  {
     
    try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        ResultSet rs = null;
        ArrayList coleccion = new ArrayList();
        Perfil elPerfil = null;
        CallableStatement pstmt=null;  
        try {            
            pstmt = conexion.prepareCall(buscarPerfil);            
            pstmt.registerOutParameter(1, OracleTypes.CURSOR);            
            pstmt.setString(2,"id");            
            pstmt.execute();
            rs = (ResultSet)pstmt.getObject(1); 
            while (rs.next()) {
                elPerfil = new Perfil(rs.getString("nombre"),
                                      rs.getString("apellidos"),
                                      rs.getString("nombreUsuario"));
                coleccion.add(elPerfil);
            }
        } catch (SQLException e) {
          e.printStackTrace();
            
            throw new GlobalException("Sentencia no valida");
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                desconectar();
            } catch (SQLException e) {
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
        if (coleccion == null || coleccion.size() == 0) {
            throw new NoDataException("No hay datos");
        }
        return elPerfil;
 }
    
}
