/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaDeNegocio;

/**
 *
 * @author Estudiante
 */
public class Empresa {
    private String nombre;
//    Vuelo[] viajes;
//    Avion[] flotilla;
//    

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + '}';
    }
    
    public void AgregarAvion(){}
    public void AgregarViaje(){}
    
    
}
