package Personass.Trabajador;

import Material.AudioLibro;
import Material.Libro;
import Material.Vinilo;
import Material.Web;
import Personass.Cliente.Cliente;
import Personass.Cliente.Musico;
import Personass.Cliente.Privado;
import Personass.Trabajador.Trabajador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Bibliotecario extends Trabajador {

    private  ArrayList<String> vinilos = new ArrayList<String>();
    private  ArrayList<String> libros = new ArrayList<String>();
    private  ArrayList<String> cmusico = new ArrayList<String>();
    private  ArrayList<String> cprivado = new ArrayList<String>();
    private  ArrayList<String> AlquileresLibro = new ArrayList<String>();
    private  ArrayList<String> AlquileresVinillo = new ArrayList<String>();

    public Bibliotecario(String nombre, String apellido, String dni, String email, int cTrabajador, String usuario, String contrasena) {
        super(nombre, apellido, dni, email, cTrabajador, usuario, contrasena);
    }


    public void Alquilar(Web w1, Bibliotecario b1){
        String sc7er = null;
        String sc9er = null;
        String adasd1232 = null;
        String asdfsadf= null;
        System.out.println("El usuario que quiere alquilar es:\n 1)Pirivado\n 2)Musico");
        Scanner sc1er = new Scanner(System.in);
        int sc2er = sc1er.nextInt();
        if (sc2er == 1){
            System.out.println("Quieres reservar\n 1)Libro\n2)AudioLibro");
            Scanner sc3er = new Scanner(System.in);
            int sc4er = sc1er.nextInt();
            if (sc4er == 1){
                System.out.println("Que libro quieres alquilar?(IMEI)");
                Scanner sc6er = new Scanner(System.in);
                 sc7er = sc6er.nextLine();
                boolean afafa = ImeiLibro(sc7er);
                if (afafa == true){
                    System.out.println("Que Persona quiere alquilar?(DNI)");
                    Scanner sc8er = new Scanner(System.in);
                     sc9er = sc6er.nextLine();
                    boolean afafa1 = DNIpersonasPrivado(sc9er);
                    if (afafa1 == true){
                        AlquileresLibro.add(sc9er +  " " + sc7er);}
                    if (afafa1 == false){
                        System.out.println("NO SE HA ENCONTRADO");
                    }
                }if (afafa == false){

                    System.out.println("NO SE HA ENCONTRADO");
                }

            }
            if (sc4er == 2){
            w1.AlquilerLaudio(b1);
            }
        }
        if (sc2er == 2){

            System.out.println("Que Vinillo quieres alquilar?(Id Vinillo)");
            Scanner adasd12 = new Scanner(System.in);
             adasd1232 = adasd12.nextLine();
            boolean afafa45 = IdVinillo(adasd1232);
            if (afafa45 == true){

                System.out.println("Que Persona quiere alquilar?(DNI)");
                Scanner adasd12qwer = new Scanner(System.in);
                 asdfsadf = adasd12qwer.nextLine();
                boolean afaf123a45 = DNIpersonasMusico(asdfsadf);
                if(afaf123a45 == true){
                    AlquileresVinillo.add(asdfsadf + " "+ adasd1232);

                }if (afafa45 == false) {
                    System.out.println("NO SE HA ENCONTRADO");
                }
            }if (afafa45 == false){
                System.out.println("NO SE HA ENCONTRADO");

            }
        }
    }


    public boolean ImeiLibro(String a){
        for (int i = 0; i < libros.size(); i++) {
            boolean Strcod = libros.get(i).contains(a);
            if (Strcod == true){
                return true;
            }

        }
        return false;
    }
    public boolean DNIpersonasPrivado(String a){
        for (int i = 0; i < cprivado.size(); i++) {
            boolean Strcod = cprivado.get(i).contains(a);
            if (Strcod == true){
                return true;
            }

        }
        return false;
    }
    public boolean DNIpersonasMusico(String a){
        for (int i = 0; i < cmusico.size(); i++) {
            boolean Strcod = cmusico.get(i).contains(a);
            if (Strcod == true){
                return true;
            }

        }
        return false;
    }
    public boolean IdVinillo(String a){
        for (int i = 0; i < vinilos.size(); i++) {
            boolean Strcod = vinilos.get(i).contains(a);
            if (Strcod == true){
                return true;
            }

        }
        return false;
    }

    public void GestionAlquilerVinillo(){
        System.out.println("Quieres\n 1)buscar un alquiler\n2)Eliminar Alquiler\n3)Mostrar Alquleres");
        Scanner sc12 = new Scanner(System.in);
        int scanerresp =sc12.nextInt();
        if (scanerresp == 1 ){
            System.out.println("Dime cualquier informacion que conozcas del libro(DNI o IMEI)");
            Scanner  scnew = new Scanner(System.in);
            String codigo = scnew.nextLine();
            for (int i = 0; i < AlquileresVinillo.size(); i++) {
                boolean Strcod = AlquileresVinillo.get(i).contains(codigo);
                if (Strcod = true){
                    System.out.println(AlquileresVinillo.get(i));
                    break;
                }
            }

        }
        if (scanerresp == 2 ) {
            System.out.println("Dime cualquier informacion que conozcas del libro(DNI o IMEI)");
            Scanner  scnew = new Scanner(System.in);
            String codigo = scnew.nextLine();
            for (int i = 0; i < AlquileresVinillo.size(); i++) {
                boolean Strcod = AlquileresVinillo.get(i).contains(codigo);
                if (Strcod = true){
                    AlquileresVinillo.remove(i);
                    break;
                }
            }

        }
        if (scanerresp == 3 ){
            Iterator iterator2 = AlquileresVinillo.iterator();
            while (iterator2.hasNext()) {

                System.out.println(iterator2.next());


            }

        }
    }

    public void GestionAlquilerLibro(){
        System.out.println("Quieres\n 1)buscar un alquiler\n2)Eliminar Alquiler\n3)Mostrar Alquleres");
        Scanner sc12 = new Scanner(System.in);
        int scanerresp =sc12.nextInt();
        if (scanerresp == 1 ){
            System.out.println("Dime cualquier informacion que conozcas del libro(DNI o IMEI)");
            Scanner  scnew = new Scanner(System.in);
            String codigo = scnew.nextLine();
            for (int i = 0; i < AlquileresLibro.size(); i++) {
                boolean Strcod = AlquileresLibro.get(i).contains(codigo);
                if (Strcod = true){
                    System.out.println(AlquileresLibro.get(i));
                    break;
                }
            }

        }
        if (scanerresp == 2 ) {
            System.out.println("Dime cualquier informacion que conozcas del libro(DNI o IMEI)");
            Scanner  scnew = new Scanner(System.in);
            String codigo = scnew.nextLine();
            for (int i = 0; i < AlquileresLibro.size(); i++) {
                boolean Strcod = AlquileresLibro.get(i).contains(codigo);
                if (Strcod = true){
                    AlquileresLibro.remove(i);
                    break;
                }
            }

        }
        if (scanerresp == 3 ){
            Iterator iterator2 = AlquileresLibro.iterator();
            while (iterator2.hasNext()) {

                System.out.println(iterator2.next());


            }

        }
    }

    public  void CreadPredETC(){
        Privado ppred1 = new Privado("llamazares","higueras","435","llamazares@gmail.com",101);
        Privado ppred2 = new Privado("pol","bove","578","polbove@gmail.com",232);
        Privado ppred3 = new Privado("pablo","sanz","758","pablito@gmail.com",238);
        String n2 = "higueras " + "435 " + 101;
        String n3 = "bove " + "578 " + 232;
        String n4 = "sanz " + "758 " + 238;
        cprivado.add(n2);
        cprivado.add(n3);
        cprivado.add(n4);
        Musico mpred1 = new Musico("fito","cabrales","98362","fitofiti@gmail.com",343);
        Musico mpred2 = new Musico("melendi","espina","763454","melendiesp@gmail.com",454);
        String m2 = "cabrales " + "98362 " + 343;
        String m3 = "espina " + "763454 " + 454;
        cmusico.add(m2);
        cmusico.add(m3);
        Libro lpred1 = new Libro("peter pan", "14235", "james", 2, 22022022, 200);
        Libro lpred2 = new Libro("nacidos de la bruma", "3214", "sanderson", 3, 20042021, 600);
        Libro lpred3 = new Libro("pilotes", "7968", "dale", 5, 26042021, 400);
        String t2 = "peter pan " + "14235 " + "james";
        String t3 = "nacidos de la bruma " + "3214 " + "sanderson";
        String t4 = "pilotes " + "7968 " + "dale";
        libros.add(t2);
        libros.add(t3);
        libros.add(t4);
        Vinilo vpred1 = new Vinilo("back in black", "5687", "ACDC", 40, "rock");
        Vinilo vpred2 = new Vinilo("candy shop", "9857", "50cent", 50, "rap");
        String z2 = "back in black " + "5687 " + "ACDC";
        String z3 = "candy shop " + "9857 " + "50cent";
        vinilos.add(z2);
        vinilos.add(z3);
    }

    public void GestionPrivado(){
        System.out.println("Quieres\n 1)buscar un Privado\n2)Eliminar Privado\n3)Mostrar Privado");
        Scanner sc12 = new Scanner(System.in);
        int scanerresp =sc12.nextInt();
        if (scanerresp == 1 ){
            System.out.println("Para buscar, dime cualquier informacion que conozcas del cliente privado (Apellido, DNI o Codigo de trabajador)");
            Scanner  scnew = new Scanner(System.in);
            String codigo = scnew.nextLine();
            for (int i = 0; i < cprivado.size(); i++) {
                boolean Strcod = cprivado.get(i).contains(codigo);
                if (Strcod == true){
                    System.out.println(cprivado.get(i));
                    break;
                }
            }

        }
        if (scanerresp == 2 ) {
            System.out.println("Para eliminar, dime cualquier informacion que conozcas del cliente privado (Apellido, DNI o Codigo de trabajador)");
            Scanner  scnew = new Scanner(System.in);
            String codigo = scnew.nextLine();
            for (int i = 0; i < cprivado.size(); i++) {
                boolean Strcod = cprivado.get(i).contains(codigo);
                if (Strcod == true){
                    cprivado.remove(i);
                    break;
                }
            }


        }
        if (scanerresp == 3 ){
            Iterator iterator2 = cprivado.iterator();
            while (iterator2.hasNext()) {

                System.out.println(iterator2.next());

            }

        }
    }

    public void CrearPrivado(){

        System.out.println("Introduce el numero de clientes privados que quieras crear: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Bienvenido al creador de clientes privados");
            System.out.println("Por favor introduce el nombre: ");
            String nombre = sc1.nextLine();
            System.out.println("Por favor introduce el apellido: ");
            String apellido = sc1.nextLine();
            System.out.println("Por favor introduzca el dni: ");
            String dni = sc1.nextLine();
            System.out.println("Por favor introduzca el email : ");
            String email = sc1.nextLine();
            System.out.println("Por favor introduzca el codigo del cliente: ");
            int cCliente = sc1.nextInt();


            Object p1 = dni;
            System.out.println("El titulo es " + p1);
            p1 = new Privado(nombre, apellido, dni, email, cCliente);
            String n1 = apellido + " " + dni + " " + cCliente;
            cprivado.add(n1);
        }
    }

    public void GestionMusico(){
        System.out.println("Quieres\n 1)buscar un Musico\n2)Eliminar Musico\n3)Mostrar Musico");
        Scanner sc12 = new Scanner(System.in);
        int scanerresp =sc12.nextInt();
        if (scanerresp == 1 ){
            System.out.println("Para buscar, dime cualquier informacion que conozcas del musico (Apellido, DNI o Codigo de cliente)");
            Scanner  scnew = new Scanner(System.in);
            String codigo = scnew.nextLine();
            for (int i = 0; i < cmusico.size(); i++) {
                boolean Strcod = cmusico.get(i).contains(codigo);
                if (Strcod == true){
                    System.out.println(cmusico.get(i));
                    break;
                }
            }
        }
        if (scanerresp == 2 ) {
            System.out.println("Para eliminar, dime cualquier informacion que conozcas del musico (Apellido, DNI o Codigo de cliente)");
            Scanner  scnew = new Scanner(System.in);
            String codigo = scnew.nextLine();
            for (int i = 0; i < cmusico.size(); i++) {
                boolean Strcod = cmusico.get(i).contains(codigo);
                if (Strcod == true){
                    cmusico.remove(i);
                    break;
                }
            }
        }
        if (scanerresp == 3 ){
            Iterator iterator2 = cmusico.iterator();
            while (iterator2.hasNext()) {

                System.out.println(iterator2.next());
            }
        }
    }

    public void CrearMusico(){

        System.out.println("Introduce el numero de clientes musicos que quieras crear: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Bienvenido al creador de clientes musicos");
            System.out.println("Por favor introduce el nombre: ");
            String nombre = sc1.nextLine();
            System.out.println("Por favor introduce el apellido: ");
            String apellido = sc1.nextLine();
            System.out.println("Por favor introduzca el dni: ");
            String dni = sc1.nextLine();
            System.out.println("Por favor introduzca el email : ");
            String email = sc1.nextLine();
            System.out.println("Por favor introduzca el codigo del cliente: ");
            int cCliente = sc1.nextInt();
            Object m1 = dni;
            System.out.println("El titulo es " + m1);
            m1 = new Musico(nombre, apellido, dni, email, cCliente);
            String u1 = apellido + " " + dni + " " + cCliente;
            cprivado.add(u1);
        }
    }

    public void CrearLibro(){
        //objetos a introducir
        System.out.println("Introduce el numero de libros que quieras crear: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Scanner sc1 = new Scanner(System.in);
            //lectura de datos
            System.out.println("Bienvenido al creador de Libros");
            System.out.println("Por favor introduce el titulo: ");
            String titulo = sc1.nextLine();
            System.out.println("Por favor introduce el código: ");
            String codigo = sc1.nextLine();
            System.out.println("Por favor introduzca el autor: ");
            String Autor = sc1.nextLine();
            System.out.println("Por favor introduzca la cantidad: ");
            int cantidad = sc1.nextInt();
            System.out.println("Por favor introduzca la data de Impresion: ");
            int dImpresio = sc1.nextInt();
            System.out.println("Por favor introduzca la duracion: ");
            int Paginas = sc1.nextInt();
            Object l1 = codigo;
            System.out.println("El titulo es " + l1);
            l1 = new Libro(titulo, codigo, Autor, cantidad, dImpresio, Paginas);
            String t1 = titulo + " " + codigo + " " + Autor;
            libros.add(t1);
        }
    }

    public void buscarlibroCodigo(){
        System.out.println("Para buscar, dime cualquier informacion que conozcas del libro (Autor, Titulo o Codigo)");
        Scanner  scnew = new Scanner(System.in);
        String codigo = scnew.nextLine();
        for (int i = 0; i < libros.size(); i++) {
            boolean Strcod = libros.get(i).contains(codigo);
            if (Strcod == true){
                System.out.println(libros.get(i));
                break;
            }
        }
    }

    public void eliminarlibro(){
        System.out.println("Para eliminar, dime cualquier informacion que conozcas del libro (Autor, Titulo o Codigo)");
        Scanner  scnew = new Scanner(System.in);
        String codigo = scnew.nextLine();
        for (int i = 0; i < libros.size(); i++) {
            boolean Strcod = libros.get(i).contains(codigo);
            if (Strcod == true){
                libros.remove(i);
                break;
            }
        }
    }
    public void mostrarLibros() {
        Iterator iterator2 = libros.iterator();
        while (iterator2.hasNext()) {

            System.out.println(iterator2.next());
        }
    }

        public void CrearVinilos () {

            System.out.println("Introduce el numero de vinilos que quieras crear: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                Scanner sc1 = new Scanner(System.in);

                System.out.println("Bienvenido al creador de vinilos");
                System.out.println("Por favor introduce el titulo: ");
                String titulo = sc1.nextLine();
                System.out.println("Por favor introduce el código: ");
                String codigo = sc1.nextLine();
                System.out.println("Por favor introduzca el autor: ");
                String Autor = sc1.nextLine();
                System.out.println("Por favor introduzca la cantidad: ");
                int cantidad = sc1.nextInt();
                System.out.println("Por favor introduzca el tipo de musica: ");
                String tipo = sc1.nextLine();
                Object v1 = codigo;
                System.out.println("El titulo es " + v1);
                v1 = new Vinilo(titulo, codigo, Autor, cantidad, tipo);
                String z1 = titulo + " " + codigo + " " + Autor;
                vinilos.add(z1);
            }
        }

        public void buscarviniloCodigo(){
            System.out.println("Para buscar, Dime cualquier informacion que conozcas del vinilo(Autor, Titulo o Codigo)");
            Scanner scnew = new Scanner(System.in);
            String codigo1 = scnew.nextLine();
            for (int i = 0; i < vinilos.size(); i++) {
                boolean Strcod1 = vinilos.get(i).contains(codigo1);
                if (Strcod1 == true) {
                    System.out.println(vinilos.get(i));
                    break;
                }
            }
        }

        public void eliminarvinilo(){
            System.out.println("Para eliminar, Dime cualquier informacion que conozcas del libro(Autor, Titulo o Codigo)");
            Scanner scnew = new Scanner(System.in);
            String codigo1 = scnew.nextLine();
            for (int i = 0; i < vinilos.size(); i++) {
                boolean Strcod1 = vinilos.get(i).contains(codigo1);
                if (Strcod1 == true) {
                    vinilos.remove(i);
                    break;
                }
            }
        }
    public void mostrarVinilo() {

        Iterator iterator2 = vinilos.iterator();
        while (iterator2.hasNext()) {

            System.out.println(iterator2.next());
        }
    }
    }
