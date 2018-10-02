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
public class Ruta {
    
    private String id;
    private String ruta;
    private int hora;
    private int minutos;

    public Ruta(String id, String ruta, int hora, int minutos) {
        this.id = id;
        this.ruta = ruta;
        this.hora = hora;
        this.minutos = minutos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    @Override
    public String toString() {
        return "Ruta{" + "id=" + id + ", ruta=" + ruta + ", hora=" + hora + ", minutos=" + minutos + '}';
    }
    
    
}
