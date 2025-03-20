package EjerciciosArrayList;

import java.util.Scanner;

import ej1.Menu;

public class TestGestSimAlm {
    public static void main(String[] args) {
    Menu arraylist= new Menu();
    int op=0;
    GetSimAlm alm= new GetSimAlm();
    Articulo art= new Articulo(2, "Collares");
    arraylist.crearOpcion("0. Entrada automatizada (Creará 4 artículos de prueba del programa)");
    arraylist.crearOpcion("1. Listado (Mostrará todos los datos de los artículos del almacén)");
    arraylist.crearOpcion("2. Alta (Creará un nuevo artículo en el almacén)");
    arraylist.crearOpcion("3. Baja (Dará de baja un artículo en el almacén)");
    arraylist.crearOpcion("4. Entrada de mercancía (Aumentará el stock de un determinado artículo)");
    arraylist.crearOpcion("5. Salida de mercancía (Disminuirá el stock de un determinado artículo)");
    arraylist.crearOpcion("6. Salir");

    do {
        Scanner scanner= new Scanner(System.in);
       arraylist.mostrarMenu();
       op = scanner.nextInt();
       switch (op) {
        case 0:
            System.out.println("Introduciendo 4 artículos de prueba");
            alm.entradaAutomatizada();
            break;
        
        case 1:
            alm.lista();
            break;
       
        case 2:
            alm.alta();
            break;
       
        case 3:
            alm.baja(art);
            break;
       
        case 4:
            
            break;
       
        case 5:
            
            break;
       
        case 6:
            System.out.println("Saliendo...");
            break;
       
        default:
            break;
       } 
    } while (op!=6);
    }
}
