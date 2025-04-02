package ej5;

public class Pedido {
    static private int numPedido;
    TipoComida comida;

    public Pedido(TipoComida vcomida){
        this.comida=vcomida;
        numPedido++;
    }

    public void agregarIngrediente(String vIngrediente){
        ingredientes.add(vIngrediente);
    }

    public void mostrarPedido(){
        System.out.println("Pedido : "+comida);
        System.out.println("ID-Pedido: "+numPedido);
        System.out.println("Ingredientes extras: "+ingredientes);
    }
    
    public static int getPedidos(){
        return numPedido;
    }
}
