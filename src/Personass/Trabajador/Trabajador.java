package Personass.Trabajador;

import Personass.Persona;

abstract public class Trabajador extends Persona {
    protected int cTrabajador;
    protected String usuario;
    protected String contrasena;

    public Trabajador(String nombre, String apellido, String dni, String email, int cTrabajador, String usuario, String contrasena) {
        super(nombre, apellido, dni, email);
        this.cTrabajador = cTrabajador;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public int getcTrabajador() {
        return cTrabajador;
    }

    public void setcTrabajador(int cTrabajador) {
        this.cTrabajador = cTrabajador;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
