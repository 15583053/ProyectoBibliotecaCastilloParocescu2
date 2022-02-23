package Material;

import Material.aMaterial;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Libro extends aMaterial {
    private int dImpresio;
    private int paginas;
    private String privado;

    private ArrayList PropietarioLibr;

    public Libro(String titulo, String codigo, String Autor, int cantidad, int dImpresio, int paginas){
        super(titulo, codigo, Autor, cantidad);
        this.dImpresio =  dImpresio;
        this.paginas = paginas;
        this.privado = privado;
    }



    public boolean setPripietario(Object a){
        int i = cantidad;
        if(i >= 1) {

            PropietarioLibr.add(a);
            cantidad--;
            return  true;
        }else{

            System.out.println("Ya no quedan mas existencias del libro, espera a que se devuelva algun ejemplar.");
            return false;
        }





    }

    public void QuitarPripietario(Object a){
        PropietarioLibr.remove(a);
        cantidad++;


    }

    public void NumProp(){
        for(int i = 0; i < PropietarioLibr.size(); i++) {
            System.out.println(PropietarioLibr.getClass());
        }


    }






    public int getdImpresio() {
        return dImpresio;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setdImpresio(int dImpresio) {
        this.dImpresio = dImpresio;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
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
