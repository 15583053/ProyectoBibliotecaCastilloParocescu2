package Material;

abstract public class aMaterial {
    protected String titulo;
    protected String codigo;
    protected String Autor;
    protected int cantidad;

    public aMaterial() {
    }

    public aMaterial(String titulo, String codigo, String Autor, int cantidad) {
    this.titulo = titulo;
    this.codigo = Autor;
    this.Autor = Autor;
    this.cantidad = cantidad;

    }






    public String getTitulo() {
        return titulo;
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
