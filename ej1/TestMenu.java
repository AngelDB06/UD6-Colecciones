package ej1;

public class TestMenu {
    public static void main(String[] args) {
        Menu menu=new Menu();

        menu.crearOpcion("Opción 1");
        menu.crearOpcion("Opción 2");
        menu.crearOpcion("Opción 3");

        menu.mostrarMenu();

        menu.capturaOpcion(0);
    }
}
