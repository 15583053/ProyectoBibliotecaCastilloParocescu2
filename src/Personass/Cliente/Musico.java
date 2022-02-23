package Personass.Cliente;

import Personass.Cliente.Cliente;

import java.util.Scanner;

public class Musico extends Cliente {
    public Object Vinillo;

    public Musico(String nombre, String apellido, String dni, String email, int cClinte) {
        super(nombre, apellido, dni, email, cClinte);
        this.Vinillo = null;
    }


    public  void Alquilar(Object a){
        this.Vinillo = a;


    }
    public  void kLibroTen(){
        System.out.println(" Tienes este libro" + Vinillo);

    }
    public  void Devolver(){
        this.Vinillo = null;


    }


}
