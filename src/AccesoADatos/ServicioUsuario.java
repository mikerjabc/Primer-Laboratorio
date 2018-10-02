/*
 * Serviciocontacto.java
 *
 * Created on 27 de abril de 2007, 10:41 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package AccesoADatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Collection;
import LogicaDeNegocio.Usuario;
import oracle.jdbc.OracleTypes;
/**
 *
 * @author Estudiante
 */
public class ServicioUsuario extends Servicio {
     
     private static final String insertarUsuario = "{call insertarUsuario(?,?,?,?,?,?,?,?,?,?)}";
     private static final String buscarUsuario = "{?=call buscarUsuario(?)}";
          private static final String listarUsuarios = "{?=call listarUsuario()}";
     private static final String eliminarUsuario = "{?=call eliminarUsuario(?)}";
     private static final String actualizarUsuario ="{call modificarUsuario(?,?,?,?,?,?,?,?,?,?,?)}";
     
    /**
     * Creates a new instance of Serviciocontacto
     */
    public ServicioUsuario() {
    }
    
   
    public boolean insertarUsuarios(Usuario usuario) throws GlobalException, NoDataException  	{
        boolean resp=true;
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            resp=false;
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            resp=false;
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
         CallableStatement pstmt=null;  
                                
        try {
            pstmt = conexion.prepareCall(insertarUsuario);
            pstmt.setString(1,String.valueOf(obtenerUsuarios().size() + 1));
            pstmt.setString(2,usuario.getNombreUsuario());
            pstmt.setString(3,usuario.getContrasenna());
            pstmt.setString(4,usuario.getNombre());
            pstmt.setString(5,usuario.getApellidos());
            pstmt.setString(6,usuario.getCorreoElectronico());
            pstmt.setString(7,usuario.getFechaNacimiento());
            pstmt.setString(8,usuario.getDireccion());
            pstmt.setString(9,usuario.getTelefonoTrabajo());
            pstmt.setString(10,usuario.getCelular());
            
            
            boolean resultado = pstmt.execute();
            if (resultado == true) {
                resp=false;
                throw new NoDataException ("No se realizo la inserci�n");
            } 
            
        } catch (SQLException e) {
            e.printStackTrace();
            resp=false;
            throw new GlobalException("Llave duplicada");
        } 
         finally {
            try {
                if (pstmt != null) {
                    pstmt.close();                    
                }
                desconectar();
            } catch (SQLException e) {
                resp=false;
                throw new GlobalException("Estatutos invalidos o nulos");
            }
        }
        System.out.print("Usuario ingresado" + usuario);
         return resp;
    }
    
    public void actualizarUsuarios(Usuario usuario ) throws GlobalException, NoDataException  {
        try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        PreparedStatement pstmt = null;
        try {
            pstmt = conexion.prepareStatement(actualizarUsuario);
            pstmt.setString(1,usuario.getNombreUsuario());
            pstmt.setString(2,usuario.getContrasenna());
            pstmt.setString(3,usuario.getNombre());
            pstmt.setString(4,usuario.getApellidos());
            pstmt.setString(5,usuario.getCorreoElectronico());
            pstmt.setString(6,usuario.getFechaNacimiento());
            pstmt.setString(7,usuario.getDireccion());
            pstmt.setString(8,usuario.getTelefonoTrabajo());
            pstmt.setString(9,usuario.getCelular());
            
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
    
    public Usuario buscarUsuario(String id ) throws GlobalException, NoDataException  {
     
    try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        ResultSet rs = null;
        ArrayList coleccion = new ArrayList();
        Usuario usuario = null;
        CallableStatement pstmt=null;  
        try {            
            pstmt = conexion.prepareCall(buscarUsuario);            
            pstmt.registerOutParameter(1, OracleTypes.CURSOR);            
            pstmt.setString(2,id);            
            pstmt.execute();
            rs = (ResultSet)pstmt.getObject(1); 
            while (rs.next()) {
                usuario = new Usuario(rs.getString("nombreUsuario"),
                                       rs.getString("contrasenna"),
                                       rs.getString("nombre"),
                                       rs.getString("apellidos"),
                                       rs.getString("correoElectronico"),
                                       rs.getString("fechaNacimiento"),
                                       rs.getString("direccion"),
                                       rs.getString("telefonoTrabajo"),
						   rs.getString("celular")
						   );
                coleccion.add(usuario);
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
        return usuario;
 }
    public ArrayList<Usuario> obtenerUsuarios() throws GlobalException, NoDataException  {
     
    try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        ResultSet rs = null;
        ArrayList coleccion = new ArrayList();
        Usuario usuario = null;
        CallableStatement pstmt=null;  
        try {            
            pstmt = conexion.prepareCall(listarUsuarios);            
            pstmt.registerOutParameter(1, OracleTypes.CURSOR);
            pstmt.execute();
            rs = (ResultSet)pstmt.getObject(1); 
            while (rs.next()) {
                usuario = new Usuario(rs.getString("nombreUsuario"),
                                       rs.getString("contrasenna"),
                                       rs.getString("nombre"),
                                       rs.getString("apellidos"),
                                       rs.getString("correoElectronico"),
                                       rs.getString("fechaNacimiento"),
                                       rs.getString("direccion"),
                                       rs.getString("telefonoTrabajo"),
						   rs.getString("celular")
						   );
                coleccion.add(usuario);
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
        return coleccion;
 }
  public Usuario eliminarUsuario(String id ) throws GlobalException, NoDataException  {
     
    try {
            conectar();
        } catch (ClassNotFoundException e) {
            throw new GlobalException("No se ha localizado el driver");
        } catch (SQLException e) {
            throw new NoDataException("La base de datos no se encuentra disponible");
        }
        ResultSet rs = null;     
        ArrayList coleccion = new ArrayList();
        Usuario usuario = null;
        CallableStatement pstmt=null;  
        try {            
            pstmt = conexion.prepareCall(eliminarUsuario);            
            pstmt.registerOutParameter(1, OracleTypes.CURSOR);            
            pstmt.setString(2,id);            
            pstmt.execute();
          
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
        return usuario;
 }

}
