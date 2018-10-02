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
public class MetodoPago {
    
    private  double cantidad;

    public MetodoPago(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "MetodoPago{" + "cantidad=" + cantidad + '}';
    }
    public double ConvertirAColones(){
        return 0;
    }
    
    
    
}
