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
public class Asiento {
   private int numero;
   private char estado;
   
    public Asiento(int numero, char estado)
    {
        this.numero = numero;
        this.estado = estado;
    }
      public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Asiento{" + "numero=" + numero + ", estado=" + estado + '}';
    }

    
}
