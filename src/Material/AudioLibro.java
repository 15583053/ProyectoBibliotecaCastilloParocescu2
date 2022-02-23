package Material;

import Material.aMaterial;

import java.util.ArrayList;

public class AudioLibro extends aMaterial {
    private int duracion;
    private String privado;
    private ArrayList PropietarioALibro;


    public  AudioLibro(String titulo, String codigo, String Autor, int cantidad, int duracion){
        super(titulo, codigo, Autor, cantidad);
        this.duracion=duracion;

    }
public AudioLibro(){

}

    @Override
    public String toString() {
        return titulo  +" "+  codigo +" " + Autor  ;
    }

    public boolean setPripietario(Object a){
        int i = cantidad;
        if(i >= 1) {

            PropietarioALibro.add(a);
            cantidad--;
            return  true;
        }else{

            System.out.println("Ya no quedan mas existencias del libro, espera a que se devuelva algun ejemplar.");
            return false;
        }





    }

    public void QuitarPripietario(Object a){
        PropietarioALibro.remove(a);
        cantidad++;


    }

    public void NumProp(){
        for(int i = 0; i < PropietarioALibro.size(); i++) {
            System.out.println(PropietarioALibro.getClass());
        }


    }









    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTitulo()  {
        return titulo;
    //return "hola";
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

