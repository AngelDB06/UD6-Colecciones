package EjerciciosArrayList;

public class Articulo {
    private int codigo, precioc, preciov, stock;
    private String descripcion;

    public Articulo(int codigo, String descripcion){
        this.codigo=codigo;
        this.descripcion=descripcion;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public int getPrecioc(){
        return this.precioc;
    }

    public int getPreciov(){
        return this.preciov;
    }

    public int getStock(){
        return this.stock;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public void setCodigo(int codigo){
        this.codigo=codigo;
    }

    public void setPrecioc(int precioc){
        this.precioc=precioc;
    }

    public void setPreciov(int preciov){
        this.preciov=preciov;
    }

    public void setStock(int stock){
        this.stock=stock;
    }

    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
}
