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
public class Usuario {

    String Nombre;
    int Edad;
    String Profesión;
    String Username;
    String password;

    public Usuario(String Nombre, int Edad, String Profesión, String Username, String password) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Profesión = Profesión;
        this.Username = Username;
        this.password = password;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getProfesión() {
        return Profesión;
    }

    public void setProfesión(String Profesión) {
        this.Profesión = Profesión;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
