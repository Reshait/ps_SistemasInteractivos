/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author teo
 */
public class Persona {
    private String nombre_;
    private String apellidos_;
    private int edad_;
    
    public Persona(String nombre, String apellidos, int edad){
            setNombre(nombre);
            setApellidos(apellidos);
            setEdad(edad);
        }
    public void setNombre(String nombre){ nombre_ = nombre; }
    public void setApellidos(String apellidos){ apellidos_ = apellidos; }
    public void setEdad(int edad){ edad_ = edad; }
    public String getNombre(){return nombre_; }
    public String getApellidos(){ return apellidos_; }
    public int getEdad(){ return edad_; }   
}
