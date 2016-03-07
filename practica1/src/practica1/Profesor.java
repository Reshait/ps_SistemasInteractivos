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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/
public class Profesor extends Persona {
    private String universidad_;
    private int idProfesor_;

   
    public Profesor(String universidad_, int idProfesor_, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.universidad_ = universidad_;
        this.idProfesor_ = idProfesor_;
    }



    public String getUniversidad_() {
        return universidad_;
    }

    public int getIdProfesor_() {
        return idProfesor_;
    }

    public void setUniversidad_(String universidad_) {
        this.universidad_ = universidad_;
    }

    public void setIdProfesor_(int idProfesor_) {
        this.idProfesor_ = idProfesor_;
    }
    public static void main( String args[] ){
        Profesor p = new Profesor("Universidad de Córdoba", 1, "David", "Guijo", 33);
        System.out.println( "El profesor " + p.getNombre() + " " + p.getApellidos() + "; mi id es " + p.getIdProfesor_() + ", mi universidad..; " + p.getUniversidad_());
    }
    
}
