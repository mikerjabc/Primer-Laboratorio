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
public class Horario {
 
    private String diaSemana;
    private int hora;
    private int minutos;

    public Horario(String diaSemana, int hora, int minutos) {
        this.diaSemana = diaSemana;
        this.hora = hora;
        this.minutos = minutos;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
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
        return "Horario{" + "diaSemana=" + diaSemana + ", hora=" + hora + ", minutos=" + minutos + '}';
    }
    
    
    //metodos extra

    /**
     *
     * @return
     */
    public String HoraLlegada(){return null;
    }
    
    public double precioTiquete(){ return 0;
    }
    
    
}
