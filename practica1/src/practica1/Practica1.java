/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author teo
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesor p = new Profesor("Universidad de Córdoba", 1, "David", "Guijo", 33);
        System.out.println( "El profesor " + p.getNombre() + " " + p.getApellidos() + "; mi id es " + p.getIdProfesor_() + ", mi universidad..; " + p.getUniversidad_());
    }
    
}
