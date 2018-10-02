/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaDeNegocio;

/**
 *
 * @author MikerJABC
 */
public class UsuarioComprador extends Usuario {
    
    //private MetodoPago metodoPago;
    
    public UsuarioComprador(String usuario, String contrasenna, String nombre, String apellidos, String correoElectronico, String fechaNacimiento, String direccion, String telefonoTrabajo, String celular) {
        super(usuario, contrasenna, nombre, apellidos, correoElectronico, fechaNacimiento, direccion, telefonoTrabajo, celular);
    }
    
}
