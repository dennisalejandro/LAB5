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
public class Proyecto extends Carpeta {

    ArrayList<Usuario> colaboradores = new ArrayList();
    int commits;

    public Proyecto(int commits, String Nombre, double Tamaño) {
        super(Nombre, Tamaño);
        this.commits = commits;
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

    public ArrayList<Usuario> getColaboradores() {
        return colaboradores;
    }

    public void setColaboradores(ArrayList<Usuario> colaboradores) {
        this.colaboradores = colaboradores;
    }

    public int getCommits() {
        return commits;
    }

    public void setCommits(int commits) {
        this.commits = commits;
    }

}
