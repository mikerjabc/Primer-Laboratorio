/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Interfaz.InterfazAerolinea;
import LogicaDeNegocio.Modelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;

/**
 *
 * @author juanmurillo
 */
public class Control implements MouseListener, KeyListener, ActionListener, MouseMotionListener{
    private final Modelo model;
    private final InterfazAerolinea interfaz;

    public Control(Modelo model, InterfazAerolinea interfaz) {
        this.model = model;
        this.interfaz = interfaz;
        interfaz.setController(this);
        interfaz.setModel(model);
    }

    @Override
    public String toString() {
        return "Control{" + "model=" + model + ", interfaz=" + interfaz + '}';
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        JButton jbtn = (JButton)me.getSource();
        if(jbtn == interfaz.botonUsuario()){
            System.out.println(interfaz.obtenerDatosUsuario());
        }
        if(jbtn == interfaz.botonUsuario1()){
            interfaz.mostrarDatosUsuario();
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    }

    @Override
    public void mouseDragged(MouseEvent me) {
    }

    @Override
    public void mouseMoved(MouseEvent me) {
    }
    
}
