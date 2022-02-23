package Personass.Cliente;

import Personass.Cliente.Cliente;

import java.util.Scanner;

public class Privado extends Cliente {

    private Object Libro;

    public Privado(String nombre, String apellido, String dni, String email, int cClinte) {
        super(nombre, apellido, dni, email, cClinte);
        this.Libro = null;
    }

    public  void Alquilar(Object a){
        this.Libro = a;


    }
    public  void kLibroTen(){
        System.out.println(" Tienes este libro" + Libro);

    }
    public  void Devolver(){
        this.Libro = null;


    }








}
