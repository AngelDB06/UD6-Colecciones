package EjerciciosArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GetSimAlm {
ArrayList<Object> articulos = new ArrayList<>();

    public void entradaAutomatizada(){
        Articulo art1= new Articulo(0, null);
        articulos.add(art1);
        Articulo art2= new Articulo(0, null);
        articulos.add(art2);
        Articulo art3= new Articulo(0, null);
        articulos.add(art3);
        Articulo art4= new Articulo(0, null);
        articulos.add(art4);
    }

    public void lista(){
        for (Object object : articulos) {
            System.out.println(object);
        }
    }

    public void alta(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce el código del nuevo artíuclo: ");
        int codigo=scanner.nextInt();
        System.out.println();
        System.out.println("Introduce la descrición del nuevo artículo: ");
        String descripcion=scanner.nextLine();
        Articulo art= new Articulo(codigo, descripcion);
        articulos.add(art);
        scanner.close();
    }
    
    public void baja(Articulo art){
        articulos.remove(art);
    }

    public void entradaMercancia(Articulo art, int stock){
        art.setStock(stock);
    }

    public void salidaMercancia(Articulo art, int stock){
        art.setStock(stock);
    }

    
}
