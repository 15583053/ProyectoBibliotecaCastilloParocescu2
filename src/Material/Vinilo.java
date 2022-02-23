package Material;

import Material.aMaterial;

import java.util.ArrayList;

public class Vinilo extends aMaterial {


    private String tipo;
    private String musico;
    private ArrayList PropietarioVinilo;

    public Vinilo(String titulo, String codigo, String Autor, int cantidad, String tipo){


        super(titulo, codigo, Autor, cantidad);

        this.tipo = tipo;
    }



    public boolean setPripietario(Object a){
        int i = cantidad;
        if(i >= 1) {

            PropietarioVinilo.add(a);
            cantidad--;
            return  true;
        }else{

            System.out.println("Ya no quedan mas existencias del libro, espera a que se devuelva algun ejemplar.");
            return false;
        }





    }

    public void QuitarPripietario(Object a){
        PropietarioVinilo.remove(a);
        cantidad++;


    }

    public void NumProp(){
        for(int i = 0; i < PropietarioVinilo.size(); i++) {
            System.out.println(PropietarioVinilo.getClass());
        }


    }









    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMusico() {
        return musico;
    }

    public void setMusico(String musico) {
        this.musico = musico;
    }

    public ArrayList getPropietarioVinillo() {
        return PropietarioVinilo;
    }

    public void setPropietarioVinillo(ArrayList propietarioVinillo) {
        PropietarioVinilo = propietarioVinillo;
    }
}
