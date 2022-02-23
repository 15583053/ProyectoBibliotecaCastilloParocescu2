import Material.Web;
import Personass.Cliente.Musico;
import Personass.Cliente.Privado;
import Personass.Trabajador.Administrador;
import Personass.Trabajador.Bibliotecario;


import java.util.Scanner;

public class main {


    public static void main(String[] args) {



        int ac1 = 0;
        int ac2 = 0;
        int ac3 = 0;
        int ac4 = 0;
        int ac5 = 0;
        int ac6 = 0;
        int oportvuel1 = 3;

        System.out.println("Bienvenido, que quieres hacer");
        Administrador a1 = new Administrador("Administrador", "Administrador", "43589330y", "Administrador@gmail.com", 5053, "admin", "admin");
        Bibliotecario b1 = new Bibliotecario("Bibliotecario", "Bibliotecario", "1212112z", "Bibliotecario@gmail.com", 5050, "bibl", "bibl");
        Web w1 = new Web("Web", "Web", 123123, "Avenida meridiana", 633470574);
        b1.CreadPredETC();
        w1.Crearalibropred();
        while (ac1 <= 20) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Bienvenido, 1 para Admins, 2 para Bibliotecarios, 3 para web");
            int opor1 = sc1.nextInt();
            if (opor1 == 1) {

                Scanner sc2 = new Scanner(System.in);
                System.out.println("Dime el nombre de tu usuario de administrador");
                String ad1 = sc2.nextLine();
                if (ad1.equals("admin")) {
                    System.out.println("Dime la Psw de admin");
                    String psw1 = sc2.nextLine();
                    if (ad1.equals("admin")) {
                        System.out.println("Bienvenido admin");
                        ac3 = 0;
                        int intent2 = 3;
                        while (ac3 <= 20) {
                            System.out.println("Que quieres hacer?\n1) Crear Bibliotecario\n2)Mostrar Bibliotecarios\n3)Despedir un Bibliotecario\n4)Buscar Bibliotecario 5)Cerrar sesion");
                            int adb1 = sc2.nextInt();
                            if (adb1 == 1) {
                                a1.CrearBibliotecario();

                            }
                            if (adb1 == 2) {
                                a1.mostrarBibliotecario();

                            }
                            if (adb1 == 3) {
                                a1.eliminarBibliotecario();

                            }
                            if (adb1 == 4) {
                                a1.buscarBibliotecarios();
                            }
                            if (adb1 == 5) {
                                System.out.println("cerrando sesion");
                                break;
                            }
                            if (adb1 >= 6) {
                                intent2--;
                                System.out.println("No te he entendido, te quedan " + intent2 + " oportunidades o se cerrar el usuario.");
                                if (intent2 == 0) {
                                    ac3 = 21;
                                }

                            }

                        }

                    }
                }

            }
            if (opor1 == 2) {
                Scanner sc3 = new Scanner(System.in);
                System.out.println("Dime el nombre de tu usuario de Bibliotecario");
                String rb1 = sc3.nextLine();
                if (rb1.equals("Bibl")) {
                    System.out.println("Dime la Psw de admin");
                    String rb2 = sc3.nextLine();
                    if (rb2.equals("pasw")) {
                        System.out.println("Bienvenido trabajador");
                        Scanner sc5 = new Scanner(System.in);

                        ac4 = 0;
                        int intent3 = 3;
                        while (ac3 <= 20) {
                            System.out.println("Que quieres hacer\n1)Crear Vinillo\n2)Mostrar vinilo\n3)Crear Libro\n4)Mostrar vinilo\n5)Crear Usuarios\n6)Alquilar\n7)Gestion Usuarios\n8)Gestion Material\n9)Salir");
                            int adb2 = sc5.nextInt();
                            if (adb2 == 1) {
                            b1.CrearVinilos();

                            }
                            if (adb2 == 2) {

                                b1.mostrarVinilo();
                            }
                            if (adb2 == 3) {
                            b1.CrearLibro();

                            }
                            if (adb2 == 4) {

                                b1.mostrarLibros();
                            }
                            if (adb2 == 5) {
                                System.out.println("Quieres crear, 1) Privado o 2) Musico");
                                Scanner scUsdth = new Scanner(System.in);
                                int scUsdth12 = scUsdth.nextInt();
                                if (scUsdth12 == 1){
                                    b1.CrearPrivado();
                                }
                                if (scUsdth12 == 2){
                                    b1.CrearMusico();
                                }

                            }
                            if (adb2 == 6) {

                                b1.Alquilar(w1,b1);
                            }
                            if (adb2 == 7) {
                                System.out.println("Quieres gestioanr, 1) Privado o 2) Musico");
                                Scanner scUsdth = new Scanner(System.in);
                                int scUsdth12 = scUsdth.nextInt();
                                if (scUsdth12 == 1){
                                    b1.GestionPrivado();
                                }
                                if (scUsdth12 == 2){
                                    b1.GestionMusico();
                                }
                            }
                            if (adb2 == 8) {
                                System.out.println("Quieres gestioanr, 1) Libro , 2) Vinillo  3) AudioLibro");
                                Scanner scUsdth = new Scanner(System.in);
                                int scUsdth12 = scUsdth.nextInt();
                                if (scUsdth12 == 1){
                                    b1.GestionAlquilerLibro();
                                }
                                if (scUsdth12 == 2){
                                    b1.GestionAlquilerVinillo();
                                }
                                if (scUsdth12 == 3){
                                    w1.GestionAlquilerAALibro();
                                }
                            }
                            if (adb2 == 9) {
                                System.out.println("saliendo");
                                break;
                            }
                            if (adb2 >= 10) {
                                intent3--;
                                System.out.println("No te he entendido, te quedan " + intent3 + " oportunidades o se cerrar el usuario.");
                                if (intent3 == 0) {
                                    ac3 = 21;
                                }
                            }
                        }
                    }
                }


                }
                        if (opor1 >= 4) {
                            oportvuel1--;
                            System.out.println("No te he entendido, te quedan " + oportvuel1 + " oportunidades o se cerrar el programa.");
                            if (oportvuel1 == 0) {
                                ac1 = 21;
                            }
                        }
            if (opor1 == 3) {

                Scanner sc4 = new Scanner(System.in);
                System.out.println("Dime el nombre de tu web");
                String ad1 = sc4.nextLine();
                if (ad1.equals("flex")) {
                    System.out.println("Dime la Psw de admin");
                    String psw3 = sc4.nextLine();
                    if (ad1.equals("flex")) {
                        System.out.println("Bienvenido web");
                        ac3 = 0;
                        int intent4 = 3;
                        while (ac3 <= 20) {
                            System.out.println("Que quieres hacer?\n1) Crear audiolibro\n2)Eliminar audiolibro\n3)Mostrar audiolibros\n4)salir");
                            int adb3 = sc4.nextInt();
                            if (adb3 == 1) {
                                w1.CrearAlibro();

                            }
                            if (adb3 == 2) {
                                w1.eliminarAudiolibro();

                            }
                            if (adb3 == 3) {
                                w1.mostraraudiolibros();
                            }
                            if (adb3 == 4) {
                                System.out.println("saliendo");
                                break;
                            }
                                if (adb3 >= 10) {
                                    intent4--;
                                    System.out.println("No te he entendido, te quedan " + intent4 + " oportunidades o se cerrar el usuario.");
                                    if (intent4 == 0) {
                                        ac3 = 21;
                                    }
                                }


                        }
                    }

                }
            }


                    }

    }
}

