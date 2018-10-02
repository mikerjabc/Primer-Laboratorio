/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Interfaz.InterfazAerolinea;
import LogicaDeNegocio.Modelo;
import javax.xml.transform.TransformerException;

/**
 *
 * @author MikerJABC
 */
public class main {
    public static void main(String[] args) throws TransformerException {
        
        Modelo model = new Modelo();
        InterfazAerolinea interfaz = new InterfazAerolinea();
        Control control = new Control(model,interfaz);
        
        
        interfaz.setVisible(true);
    }
}
