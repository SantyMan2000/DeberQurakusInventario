package com.pro.uce.edu.negocio;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--- Sistema de Pedidos UCE ---");
        
        PedidosService service = new PedidosService();

        // CASO 1: Pedido mayor a $100 -> Debería enviar MAIL
        System.out.println("\n[Escenario 1]");
        Pedido pedidoCaro = new Pedido("Laptop Gaming", 1, 120);
        service.procesarPedido(pedidoCaro);

        // CASO 2: Pedido entre $51 y $100 -> Debería enviar SMS
        System.out.println("\n[Escenario 2]");
        Pedido pedidoMedio = new Pedido("Teclado Mecánico", 1, 75.00);
        service.procesarPedido(pedidoMedio);

        // CASO 3: Pedido menor o igual a $50 -> Debería enviar WHATSAPP
        System.out.println("\n[Escenario 3]");
        Pedido pedidoBarato = new Pedido("Mouse Pad", 1, 20.00);
        service.procesarPedido(pedidoBarato);
    }
}