package ej5;

public class PruebaEJ5 {
    public static void main(String[] args) {
        Pedido pedido1=new Pedido(TipoComida.PIZZA);
        pedido1.agregarIngrediente("Pepperonni");
        pedido1.agregarIngrediente("Champiñones");
        pedido1.mostrarPedido();

        Pedido pedido2=new Pedido(TipoComida.HAMBURGUESA);
        pedido2.agregarIngrediente("Queso");
        pedido2.mostrarPedido();
        System.out.println();

        Pedido pedido3=new Pedido(TipoComida.ENSALADA);
        pedido3.mostrarPedido();
        System.out.println();

        Pedido pedido4=new Pedido(TipoComida.PASTA);
        pedido4.agregarIngrediente("Albahaca");
        pedido4.mostrarPedido();
        System.out.println();

        System.out.println("Cantidad de pedidos: "+Pedido.getPedidos());
    }
}
