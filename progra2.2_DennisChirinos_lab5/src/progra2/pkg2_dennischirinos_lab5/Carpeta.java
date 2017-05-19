/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.pkg2_dennischirinos_lab5;

import java.util.ArrayList;

/**
 *
 * @author denni
 */
public class Carpeta extends Archivo {

    ArrayList<Archivo> listArchivos = new ArrayList();

    public Carpeta(String Nombre, double Tamaño) {
        super(Nombre, Tamaño);
    }

    public ArrayList<Archivo> getListArchivos() {
        return listArchivos;
    }

    public void setListArchivos(ArrayList<Archivo> listArchivos) {
        this.listArchivos = listArchivos;
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
