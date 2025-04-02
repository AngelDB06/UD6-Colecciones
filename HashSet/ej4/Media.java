package ej4;

import java.util.HashSet;

public class Media {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();
        int suma=0;

        numeros.add(4);
        numeros.add(7);
        numeros.add(10);
        numeros.add(9);
        numeros.add(1);

        for (Integer integer : numeros) {
            suma= suma+integer;
        }

        System.out.println(suma);
    }
}
