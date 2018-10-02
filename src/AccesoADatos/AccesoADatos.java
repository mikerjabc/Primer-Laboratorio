/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import LogicaDeNegocio.Usuario;
import java.util.ArrayList;

/**
 *
 * @author juanmurillo
 */
public class AccesoADatos {
    
    
    
    
    public static void insertarUsuario(Usuario usu){
        try{
            ServicioUsuario servicio = new ServicioUsuario();
            servicio.insertarUsuarios(usu);
        }
        catch(Exception ex){} 
    }
    
    public static ArrayList<Usuario> buscarUsuarios(){
        ArrayList coleccion = new ArrayList<>();
        try{
            ServicioUsuario servicio = new ServicioUsuario();
            coleccion = servicio.obtenerUsuarios();
        }
        catch(Exception ex){}
        return coleccion;
    }
}
