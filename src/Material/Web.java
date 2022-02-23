package Material;
import Material.AudioLibro;
import Material.Libro;
import Personass.Trabajador.Bibliotecario;

import java.util.*;


public class Web {
    private String NombreWeb;
    private String nEmpresa;
    private int IdWeb;
    private String Domicilio;
    private int telefono;
    private ArrayList<String> lAudio = new ArrayList<String>();
    private ArrayList<String> AlquilerAlibro = new ArrayList<String>();
    private Object lAudio1;


    public Web(){
    super();
    }

    public Web(String nombreWeb, String nEmpresa, int idWeb, String domicilio, int telefono) {
        this.NombreWeb = nombreWeb;
        this.nEmpresa = nEmpresa;
        this.IdWeb = idWeb;
        this.Domicilio = domicilio;
        this.telefono = telefono;


    }

    public void Crearalibropred(){
        AudioLibro alpred1 = new AudioLibro("campanilla","1111","marta",8,20);
        AudioLibro alpred2 = new AudioLibro("blancanieves", "2222", "neus",5, 54);
        String b2 = "campanilla " + "1111 " + "marta";
        String b3 = "blancanieves " + "2222 " + "neus";
        lAudio.add(b2);
        lAudio.add(b3);
    }

    public void CrearAlibro(){
        //objetos a introducir
        System.out.println("Introduce el numero de audiolibros que quieras crear: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //creacion del array de passwords i de boleanos
        AudioLibro[] laudio = new AudioLibro[n];

        for (int i = 0; i < n; i++) {
            Scanner sc1 = new Scanner(System.in);
            //lectura de datos
            System.out.println ("Bienvenido al creador de AudioLibros");
            System.out.println ("Por favor introduce el titulo: ");
            String titulo = sc1.nextLine();
            System.out.println ("Por favor introduce el código: ");
            String codigo = sc1.nextLine();
            System.out.println ("Por favor introduzca el autor: ");
            String Autor = sc1.nextLine();
            System.out.println ("Por favor introduzca la cantidad: ");
            int cantidad = Integer.parseInt(sc1.nextLine());
            System.out.println ("Por favor introduzca la duracion: ");
            int duracion = Integer.parseInt(sc1.nextLine());
            //creacion de cada uno de los objetos

            Object a1 = codigo;
            System.out.println("El titulo es " + a1);
            a1 = new AudioLibro(titulo,codigo,Autor,cantidad,duracion);
            String b1 = titulo + " " + codigo + " " + Autor;
            lAudio.add(b1);
        }
    }

    public void buscarAlibroCodigo(){
        System.out.println("Para buscar, dime cualquier informacion que conozcas del audiolibro(Autor, Titulo o Codigo)");
        Scanner  scnew = new Scanner(System.in);
        String codigo = scnew.nextLine();
        for (int i = 0; i < lAudio.size(); i++) {
            boolean Strcod = lAudio.get(i).contains(codigo);
            if (Strcod == true){
                System.out.println(lAudio.get(i));
                break;
            }
        }
    }

    public void eliminarAudiolibro(){
        System.out.println("Para eliminar, dime cualquier informacion que conozcas del audiolibro(Autor, Titulo o Codigo)");
        Scanner  scnew = new Scanner(System.in);
        String codigo = scnew.nextLine();
        for (int i = 0; i < lAudio.size(); i++) {
            boolean Strcod = lAudio.get(i).contains(codigo);
            if (Strcod == true){
                lAudio.remove(i);
                break;
            }
        }
    }
    public void mostraraudiolibros() {
        Iterator iterator2 = lAudio.iterator();
        while (iterator2.hasNext()) {

            System.out.println(iterator2.next());

        }
    }

    public void AlquilerLaudio(Bibliotecario b1){

        System.out.println("Que audiolibro quieres alquilar?(codigo del audiolibro)");
        Scanner adasd12 = new Scanner(System.in);
        String adasd1232 = adasd12.nextLine();
        boolean afafa45 = IdAudioLibro(adasd1232);
        if (afafa45 == true){

            System.out.println("Que Persona quiere alquilar?(DNI)");
            Scanner adasd12qwer = new Scanner(System.in);
            String asdfsadf = adasd12qwer.nextLine();
            boolean afaf123a45 = b1.DNIpersonasPrivado(asdfsadf);
            if(afaf123a45 == true){
                AlquilerAlibro.add(asdfsadf + " "+ adasd1232);

            }if (afafa45 == false) {
                System.out.println("NO SE HA ENCONTRADO");
            }
        }if (afafa45 == false){
            System.out.println("NO SE HA ENCONTRADO");
        }
    }

    public boolean IdAudioLibro(String a){
        for (int i = 0; i < lAudio.size(); i++) {
            boolean Strcod = lAudio.get(i).contains(a);
            if (Strcod == true){
                return true;
            }

        }
        return false;
    }

    public void GestionAlquilerAALibro(){
        System.out.println("Quieres\n 1)buscar un alquiler\n2)Eliminar Alquiler\n3)Mostrar Alquleres");
        Scanner sc12 = new Scanner(System.in);
        int scanerresp =sc12.nextInt();
        if (scanerresp == 1 ){
            System.out.println("Dime cualquier informacion que conozcas del libro(DNI o IMEI)");
            Scanner  scnew = new Scanner(System.in);
            String codigo = scnew.nextLine();
            for (int i = 0; i < AlquilerAlibro.size(); i++) {
                boolean Strcod = AlquilerAlibro.get(i).contains(codigo);
                if (Strcod = true){
                    System.out.println(AlquilerAlibro.get(i));
                    break;
                }
            }

        }
        if (scanerresp == 2 ) {
            System.out.println("Dime cualquier informacion que conozcas del libro(DNI o IMEI)");
            Scanner  scnew = new Scanner(System.in);
            String codigo = scnew.nextLine();
            for (int i = 0; i < AlquilerAlibro.size(); i++) {
                boolean Strcod = AlquilerAlibro.get(i).contains(codigo);
                if (Strcod = true){
                    AlquilerAlibro.remove(i);
                    break;
                }
            }

        }
        if (scanerresp == 3 ){
            Iterator iterator2 = AlquilerAlibro.iterator();
            while (iterator2.hasNext()) {

                System.out.println(iterator2.next());


            }
        }
    }



















    public String getNombreWeb() {
        return NombreWeb;
    }

    public void setNombreWeb(String nombreWeb) {
        NombreWeb = nombreWeb;
    }

    public String getnEmpresa() {
        return nEmpresa;
    }

    public void setnEmpresa(String nEmpresa) {
        this.nEmpresa = nEmpresa;
    }

    public int getIdWeb() {
        return IdWeb;
    }

    public void setIdWeb(int idWeb) {
        IdWeb = idWeb;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ArrayList getlAudio() {
        return lAudio;
    }

    public void setlAudio(ArrayList lAudio) {
        this.lAudio = lAudio;
    }
}


