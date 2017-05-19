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
public class Texto extends Archivo {

    String Contenido;

    public Texto(String Nombre, double Tamaño) {
        super(Nombre, Tamaño);
    }

    public String getTexto() {
        return Contenido;
    }

    public void setTexto(String Texto) {
        this.Contenido = Texto;
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
