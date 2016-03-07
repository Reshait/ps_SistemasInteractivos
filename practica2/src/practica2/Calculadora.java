/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author teo
 */
public class Calculadora extends VentanaTipica{
    
    public Calculadora(int alto, int ancho, String titulo) {
        super(alto, ancho, titulo);
        Container cp = getContentPane();
        GridLayout gl = new GridLayout(5,3);
        gl.setHgap(5);
        gl.setVgap(5);
        cp.setLayout(gl);
        JTextField texto = new JTextField(50);
        //cp.add(texto);
        for(int i = 1; i <= 9; i++){
            cp.add(new JButton(String.valueOf(i)));
        }
        cp.add(new JButton("*"));
        cp.add(new JButton("0"));
        cp.add(new JButton("#"));
    }
    public static void main(String[] args){
        Calculadora prueba = new Calculadora(500, 500, "Calculadora by Teo");
    }
}