package ej2;

import java.util.ArrayList;

public class GetSimAlm {
ArrayList<Object> articulos = new ArrayList<>();

    public void entradaAutomatizada(){
        Articulo art1= new Articulo(0, null);
        Articulo art2= new Articulo(0, null);
        Articulo art3= new Articulo(0, null);
        Articulo art4= new Articulo(0, null);
    }

    public void lista(){
        for (Object object : articulos) {
            System.out.println(object);
        }
    }

    public void alta(Articulo art){
        articulos.add(art);
    }
    
    public void baja(Articulo art){
        articulos.remove(art);
    }

    public void entradaMercancia(Articulo art1, int stock){
        art1.setStock(stock);
    }

    public void salidaMercancia(Articulo art1, int stock){
        art1.setStock(stock);
    }

    
}
