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
public class Usuario {
    private String nombreUsuario;
    private String contrasenna;
    private String nombre;
    private String apellidos;
    private String correoElectronico;
    private String fechaNacimiento;
    private String direccion;
    private String telefonoTrabajo;
    private String celular;

    public Usuario(String nombreUsuario, String contrasenna, String nombre, String apellidos, String correoElectronico, String fechaNacimiento, String direccion, String telefonoTrabajo, String celular) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenna = contrasenna;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefonoTrabajo = telefonoTrabajo;
        this.celular = celular;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonoTrabajo() {
        return telefonoTrabajo;
    }

    public void setTelefonoTrabajo(String telefonoTrabajo) {
        this.telefonoTrabajo = telefonoTrabajo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + nombreUsuario + ", contrasenna=" + contrasenna + ", nombre=" + nombre + ", apellidos=" + apellidos + ", correoElectronico=" + correoElectronico + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion + ", telefonoTrabajo=" + telefonoTrabajo + ", celular=" + celular + '}';
    }
                
          
}
