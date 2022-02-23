package Personass.Trabajador;

import Material.AudioLibro;
import Personass.Cliente.Musico;
import Personass.Trabajador.Trabajador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Administrador extends Trabajador {

    private static ArrayList<String> lBibliote = new ArrayList<String>();

    public Administrador(String nombre, String apellido, String dni, String email, int cTrabajador, String usuario, String contrasena) {
        super(nombre, apellido, dni, email, cTrabajador, usuario, contrasena);
    }

    public void CrearBibliotecario(){

        System.out.println("Introduce el numero de Bibliotecarios que quieras crear: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Scanner sc1 = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Bienvenido al creador de bibliotecarios");
            System.out.println("Por favor introduce el nombre: ");
            String nombre = sc1.nextLine();
            System.out.println("Por favor introduce el apellido: ");
            String apellido = sc1.nextLine();
            System.out.println("Por favor introduzca el dni: ");
            String dni = sc1.nextLine();
            System.out.println("Por favor introduzca el email: ");
            String email = sc1.nextLine();
            System.out.println("Por favor introduzca el codigo del cliente: ");
            int cTrabajador = sc1.nextInt();
            System.out.println("Por favor introduzca el usuario: ");
            String usuario = sc2.nextLine();
            System.out.println("Por favor introduzca la contraseña : ");
            String contraseña = sc2.nextLine();
            Object a1 = dni;
           a1 = new Bibliotecario(nombre, apellido, dni, email, cTrabajador, usuario, contraseña);
            String b1 = apellido + " " + dni + " " + cTrabajador;
            lBibliote.add(b1);

        }
    }

    public void buscarBibliotecarios(){
        System.out.println("Para buscar, dime cualquier informacion que conozcas del bibliotecario (Apellido, DNI o Codigo de trabajador)");
        Scanner  scnew = new Scanner(System.in);
        String codigo = scnew.nextLine();
        for (int i = 0; i < lBibliote.size(); i++) {
            boolean Strcod = lBibliote.get(i).contains(codigo);
            if (Strcod = true){
                System.out.println(lBibliote.get(i));
                break;
            }
        }
    }

    public void eliminarBibliotecario(){
        System.out.println("Para eliminar, dime cualquier informacion que conozcas del bibliotecario (Apellido, DNI o Codigo de trabajador)");
        Scanner  scnew = new Scanner(System.in);
        String codigo = scnew.nextLine();
        for (int i = 0; i < lBibliote.size(); i++) {
            boolean Strcod = lBibliote.get(i).contains(codigo);
            ;
            if (Strcod == true){

                lBibliote.remove(i);
                break;
            }
        }
    }
    public void mostrarBibliotecario(){
        Iterator iterator2 = lBibliote.iterator();
        while (iterator2.hasNext()) {

            System.out.println(iterator2.next());
    }

}
}