/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.pkg2_dennischirinos_lab5;

/**
 *
 * @author denni
 */
public class Archivo {
     String Nombre; 
     double Tamaño;

    @Override
    public String toString() {
        return Nombre;
    }

    public Archivo(String Nombre, double Tamaño) {
        this.Nombre = Nombre;
        this.Tamaño = Tamaño;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getTamaño() {
        return Tamaño;
    }

    public void setTamaño(double Tamaño) {
        this.Tamaño = Tamaño;
    }
     
}
