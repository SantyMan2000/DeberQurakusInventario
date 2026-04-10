package com.pro.uce.edu.negocio;
public class App {
    public static void main(String[] args) throws Exception {
        Pedido pedido = new Pedido("Laptop", 1);

        PedidosService service = new PedidosService();
        service.procesarPedido(pedido);
    }
}
