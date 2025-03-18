package ej1;

import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
    //Atributos
    Scanner scanner= new Scanner(System.in);
    private ArrayList<String> menu= new ArrayList<>();

    //Métodos
    public void crearOpcion(String op){
        menu.add(op);
    }

    public void mostrarMenu(){
        for (String i : menu) {
            System.out.println(i);
        }
    }

    public void capturaOpcion(int p){
        System.out.println("Elige una opción del 1 al "+menu.size()+".");
        int op= scanner.nextInt();
        System.out.println("Has elegido la opción "+op+"."); 
        System.out.println(menu.get(op-1));
    }

}
