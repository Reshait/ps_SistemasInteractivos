/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import javax.swing.JFrame;

/**
 *
 * @author teo
 */
public class VentanaTipica extends JFrame{
    public VentanaTipica( int alto, int ancho, String titulo){
        super(titulo);
        setSize(alto, ancho);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}