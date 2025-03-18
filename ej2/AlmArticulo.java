package ej2;

import java.util.ArrayList;

public class AlmArticulo {
    ArrayList<Object> articulos=new ArrayList<>();

    public void almacena(Articulo art){
        articulos.add(art);
    }

    @Override
    public String toString(){
        String articulos="";
        for (Object object : this.articulos) {
            articulos=object+"/n";
        }
        return articulos;
    }
}
