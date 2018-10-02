/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaDeNegocio;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 *
 * @author Estudiante
 */
public class Vuelo {
private String id;
private String Origen;
private String Destino;
private String FechaIda;
private String FechaRegreso;
private int CantidadPasajeros;

/*Ruta ruta
Avion avion
Horario horario
Tiquete[] tiquetes*/

    public Vuelo(String id, String Origen, String Destino, String FechaIda, String FechaRegreso, int CantidadPasajeros) {
        this.id = id;
        this.Origen = Origen;
        this.Destino = Destino;
        this.FechaIda = FechaIda;
        this.FechaRegreso = FechaRegreso;
        this.CantidadPasajeros = CantidadPasajeros;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public String getFechaIda() {
        return FechaIda;
    }

    public void setFechaIda(String FechaIda) {
        this.FechaIda = FechaIda;
    }

    public String getFechaRegreso() {
        return FechaRegreso;
    }

    public void setFechaRegreso(String FechaRegreso) {
        this.FechaRegreso = FechaRegreso;
    }

    public int getCantidadPasajeros() {
        return CantidadPasajeros;
    }

    public void setCantidadPasajeros(int CantidadPasajeros) {
        this.CantidadPasajeros = CantidadPasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "id=" + id + ", Origen=" + Origen + ", Destino=" + Destino + ", FechaIda=" + FechaIda + ", FechaRegreso=" + FechaRegreso + ", CantidadPasajeros=" + CantidadPasajeros + '}';
    }

    public Bool venderTiquetes(){return null;
    }
    
}
