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
    class Avion {
        private String id;
        private int anio;
        private String modelo;
        private String marca;
        private int cantidadPasajeros;
        private int cantidadFilas;
        private int cantidadAsientosFilas;

    public Avion(String id, int anio, String modelo, String marca, int cantidadPasajeros, int cantidadFilas, int cantidadAsientosFilas) {
        this.id = id;
        this.anio = anio;
        this.modelo = modelo;
        this.marca = marca;
        this.cantidadPasajeros = cantidadPasajeros;
        this.cantidadFilas = cantidadFilas;
        this.cantidadAsientosFilas = cantidadAsientosFilas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadFilas() {
        return cantidadFilas;
    }

    public void setCantidadFilas(int cantidadFilas) {
        this.cantidadFilas = cantidadFilas;
    }

    public int getCantidadAsientosFilas() {
        return cantidadAsientosFilas;
    }

    public void setCantidadAsientosFilas(int cantidadAsientosFilas) {
        this.cantidadAsientosFilas = cantidadAsientosFilas;
    }

    @Override
    public String toString() {
        return "Avion{" + "id=" + id + ", anio=" + anio + ", modelo=" + modelo + ", marca=" + marca + ", cantidadPasajeros=" + cantidadPasajeros + ", cantidadFilas=" + cantidadFilas + ", cantidadAsientosFilas=" + cantidadAsientosFilas + '}';
    }


    }
