/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaDeNegocio;

/**
 *
 * @author juanmurillo
 */
public class Tiquete {
    private String id;
    private Avion vuelo;
    
    /*
    private Asiento[] asientos;
    private Horario horario;
    private UsuarioComprador usuario;
    */

    public Tiquete(String id, Avion vuelo) {
        this.id = id;
        this.vuelo = vuelo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Avion getVuelo() {
        return vuelo;
    }

    public void setVuelo(Avion vuelo) {
        this.vuelo = vuelo;
    }

    @Override
    public String toString() {
        return "Tiquete{" + "id=" + id + ", vuelo=" + vuelo + '}';
    }
    
}
