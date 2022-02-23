package Personass.Cliente;

import Personass.Persona;

abstract public class Cliente extends Persona {

    protected int cClinte;

    public Cliente(String nombre, String apellido, String dni, String email, int cClinte) {
        super(nombre, apellido, dni, email);
        this.cClinte = cClinte;
    }

    public int getcClinte() {
        return cClinte;
    }

    public void setcClinte(int cClinte) {
        this.cClinte = cClinte;
    }
}
